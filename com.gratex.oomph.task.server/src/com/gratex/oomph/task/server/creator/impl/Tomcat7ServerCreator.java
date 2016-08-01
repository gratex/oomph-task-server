/**
 *
 */
package com.gratex.oomph.task.server.creator.impl;

import org.eclipse.oomph.setup.SetupTaskContext;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.launching.IVMInstall;
import org.eclipse.jst.server.core.IJavaRuntimeWorkingCopy;
import org.eclipse.jst.server.tomcat.core.internal.TomcatConfiguration;
import org.eclipse.jst.server.tomcat.core.internal.TomcatServer;
import org.eclipse.wst.server.core.IRuntime;
import org.eclipse.wst.server.core.IRuntimeType;
import org.eclipse.wst.server.core.IRuntimeWorkingCopy;
import org.eclipse.wst.server.core.IServer;
import org.eclipse.wst.server.core.IServerType;
import org.eclipse.wst.server.core.IServerWorkingCopy;
import org.eclipse.wst.server.core.ServerCore;
import org.eclipse.wst.server.core.ServerPort;

import com.gratex.oomph.task.server.ServerTask;
import com.gratex.oomph.task.server.creator.ServerCreator;
import com.gratex.oomph.task.server.exception.ServerTaskException;

/**
 * @author jkovalux
 *
 */
@SuppressWarnings("restriction")
public class Tomcat7ServerCreator extends ServerCreator
{
  public static final String SERVER_RUNTIME_ID = "org.eclipse.jst.server.tomcat.runtime.70";

  public static final String SERVER_ID = "org.eclipse.jst.server.tomcat.70";

  private ServerTask serverTask;

  public Tomcat7ServerCreator(SetupTaskContext context, ServerTask serverTask)
  {
    super(context, serverTask.getRuntimeName(), serverTask.getServerName(), serverTask.getJreVersion());
    this.serverTask = serverTask;
  }

  /*
   * (non-Javadoc)
   * @see com.gratex.oomph.task.server.impl.ServerCreator#createServerInstance()
   */
  @Override
  public void createServerInstanceInternal(IProgressMonitor monitor) throws Exception
  {

    cleanPreviousRuntime(serverTask.getRuntimeName());

    IRuntimeType runtimeType = ServerCore.findRuntimeType(SERVER_RUNTIME_ID);
    IRuntimeWorkingCopy rwc = runtimeType.createRuntime(serverTask.getRuntimeName(), monitor);

    rwc.setLocation(Path.fromOSString(serverTask.getLocation()));
    rwc.setName(serverTask.getRuntimeName());

    IVMInstall vmInstall = getVMInstall();
    IJavaRuntimeWorkingCopy jwc = (IJavaRuntimeWorkingCopy)rwc.loadAdapter(IJavaRuntimeWorkingCopy.class, null);
    jwc.setVMInstall(vmInstall);

    IStatus status = rwc.validate(monitor);
    if (!status.isOK())
    {
      throw new ServerTaskException("Error creating server runtime: " + status.getMessage());
    }
    IRuntime runtime = rwc.save(false, monitor);

    cleanPreviousServer(serverTask.getServerName());

    IServerType serverType = ServerCore.findServerType(SERVER_ID);
    IServerWorkingCopy swc = serverType.createServer(serverTask.getServerName(), null, runtime, monitor);
    swc.setHost(serverTask.getHostname());

    IServer server = swc.save(false, monitor);
    TomcatServer tServer = (TomcatServer)server.loadAdapter(TomcatServer.class, monitor);
    TomcatConfiguration tConfig = tServer.getTomcatConfiguration();
    for (ServerPort port : swc.getServerPorts(monitor))
    {
      if (port.getProtocol().toLowerCase().equals("http") && port.getId().indexOf('/') < 0)
      {
        tConfig.modifyServerPort(port.getId(), serverTask.getPort());
      }
      if (port.getProtocol().toLowerCase().equals("ssl") && port.getId().indexOf('/') < 0)
      {
        tConfig.modifyServerPort(port.getId(), serverTask.getHttpsPort());
      }
    }
    tServer.saveConfiguration(monitor);

    monitor.worked(1);
  }

}
