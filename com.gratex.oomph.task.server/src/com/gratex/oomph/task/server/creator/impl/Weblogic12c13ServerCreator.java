/**
 *
 */
package com.gratex.oomph.task.server.creator.impl;

import org.eclipse.oomph.setup.SetupTaskContext;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.launching.IVMInstall;
import org.eclipse.wst.server.core.IRuntime;
import org.eclipse.wst.server.core.IRuntimeType;
import org.eclipse.wst.server.core.IRuntimeWorkingCopy;
import org.eclipse.wst.server.core.IServerType;
import org.eclipse.wst.server.core.IServerWorkingCopy;
import org.eclipse.wst.server.core.ServerCore;
import org.eclipse.wst.server.core.internal.ServerWorkingCopy;

import com.gratex.oomph.task.server.WeblogicServerTask;
import com.gratex.oomph.task.server.creator.ServerCreator;
import com.gratex.oomph.task.server.exception.ServerTaskException;

import oracle.eclipse.tools.weblogic.server.IWeblogicServerRuntimeWorkingCopy;
import oracle.eclipse.tools.weblogic.server.internal.WeblogicServer;

/**
 * @author jkovalux
 *
 */
public class Weblogic12c13ServerCreator extends ServerCreator
{

  private static final String WEBLOGIC_RUNTIME_TYPE_ID = "weblogic";

  private static final String WEBLOGIC_SERVER_TYPE_ID = "weblogic.server";

  private WeblogicServerTask serverTask;

  public Weblogic12c13ServerCreator(SetupTaskContext context, WeblogicServerTask serverTask)
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
    if (serverTask.isCleanPreviousRuntimes())
    {
      cleanAllRuntimes();
    }
    else
    {
      cleanPreviousRuntime(serverTask.getRuntimeName());
    }

    IRuntimeType runtimeType = ServerCore.findRuntimeType(WEBLOGIC_RUNTIME_TYPE_ID);
    IRuntimeWorkingCopy rwc = runtimeType.createRuntime(serverTask.getRuntimeName(), monitor);

    rwc.setLocation(Path.fromOSString(serverTask.getLocation()));
    rwc.setName(serverTask.getRuntimeName());

    IVMInstall vmInstall = getVMInstall();
    IWeblogicServerRuntimeWorkingCopy wsrwc = (IWeblogicServerRuntimeWorkingCopy)rwc.loadAdapter(IWeblogicServerRuntimeWorkingCopy.class, null);
    wsrwc.setJavaVmLocation(Path.fromOSString(vmInstall.getInstallLocation().getAbsolutePath()));

    IStatus status = rwc.validate(monitor);
    if (!status.isOK())
    {
      throw new ServerTaskException("Error creating server runtime: " + status.getMessage());
    }
    IRuntime runtime = rwc.save(false, monitor);

    if (serverTask.isCleanPreviousRuntimes())
    {
      cleanAllServers();
    }
    else
    {
      cleanPreviousServer(serverTask.getServerName());
    }

    IServerType serverType = ServerCore.findServerType(WEBLOGIC_SERVER_TYPE_ID);

    IServerWorkingCopy swc = serverType.createServer(serverTask.getServerName(), null, runtime, monitor);
    swc.setHost(serverTask.getHostname());
    swc.setName(serverTask.getServerName());

    setCommon((ServerWorkingCopy)swc.loadAdapter(ServerWorkingCopy.class, monitor), serverTask);

    WeblogicServer wlServerWC = (WeblogicServer)swc.loadAdapter(WeblogicServer.class, null);
    wlServerWC.setHostname(serverTask.getHostname());
    wlServerWC.setRemote(true);
    wlServerWC.setPort(serverTask.getPort());
    wlServerWC.setHttpsPort(serverTask.getHttpsPort());
    int debugPort = serverTask.getDebugPort();
    if (debugPort > 0)
    {
      wlServerWC.setDebugPort(debugPort);
    }

    String username = serverTask.getUsername();
    if (username != null && !username.isEmpty())
    {
      wlServerWC.setUsername(username);
    }
    String password = serverTask.getPassword();
    if (password != null && !password.isEmpty())
    {
      wlServerWC.setPassword(password);
    }

    swc.save(false, monitor);
    monitor.worked(1);

  }

}
