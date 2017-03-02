/**
 *
 */
package com.gratex.oomph.task.server.creator.impl;

import org.eclipse.oomph.setup.SetupTaskContext;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.jdt.launching.IJavaLaunchConfigurationConstants;
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
import org.eclipse.wst.server.core.internal.ServerWorkingCopy;

import com.gratex.oomph.task.server.TomcatServerTask;
import com.gratex.oomph.task.server.creator.ServerCreator;
import com.gratex.oomph.task.server.exception.ServerTaskException;
import com.gratex.oomph.task.utils.VMArgs;

/**
 * @author jkovalux
 *
 */
@SuppressWarnings("restriction")
public class TomcatServerCreator extends ServerCreator
{
  public static final String SERVER_RUNTIME_ID_70 = "org.eclipse.jst.server.tomcat.runtime.70";

  public static final String SERVER_RUNTIME_ID_80 = "org.eclipse.jst.server.tomcat.runtime.80";

  public static final String SERVER_RUNTIME_ID_85 = "org.eclipse.jst.server.tomcat.runtime.85";

  public static final String SERVER_ID_70 = "org.eclipse.jst.server.tomcat.70";

  public static final String SERVER_ID_80 = "org.eclipse.jst.server.tomcat.80";

  public static final String SERVER_ID_85 = "org.eclipse.jst.server.tomcat.85";

  private TomcatServerTask serverTask;

  public TomcatServerCreator(SetupTaskContext context, TomcatServerTask serverTask)
  {
    super(context, serverTask.getRuntimeName(), serverTask.getServerName(), serverTask.getJreVersion());
    this.serverTask = serverTask;
  }

  private String serverRuntimeId() throws ServerTaskException
  {
    switch (serverTask.getServerVersion())
    {
    case TOMCAT70:
      return SERVER_RUNTIME_ID_70;
    case TOMCAT80:
      return SERVER_RUNTIME_ID_80;
    case TOMCAT85:
      return SERVER_RUNTIME_ID_85;
    default:
      throw new ServerTaskException("Unsupported tomcat server type" + serverTask.getServerVersion().getName());

    }
  }

  private String serverId() throws ServerTaskException
  {
    switch (serverTask.getServerVersion())
    {
    case TOMCAT70:
      return SERVER_ID_70;
    case TOMCAT80:
      return SERVER_ID_80;
    case TOMCAT85:
      return SERVER_ID_85;
    default:
      throw new ServerTaskException("Unsupported tomcat server type" + serverTask.getServerVersion().getName());

    }
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

    IRuntimeType runtimeType = ServerCore.findRuntimeType(serverRuntimeId());
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

    if (serverTask.isCleanPreviousRuntimes())
    {
      cleanAllServers();
    }
    else
    {
      cleanPreviousServer(serverTask.getServerName());
    }

    IServerType serverType = ServerCore.findServerType(serverId());
    IServerWorkingCopy swc = serverType.createServer(serverTask.getServerName(), null, runtime, monitor);
    swc.setHost(serverTask.getHostname());
    swc.setName(serverTask.getServerName());

    setCommon((ServerWorkingCopy)swc.loadAdapter(ServerWorkingCopy.class, monitor), serverTask);
    IServer server = swc.save(false, monitor);

    String confVmArgs = serverTask.getLaunchVmArgs();
    if (confVmArgs != null)
    {

      ILaunchConfiguration lc = server.getLaunchConfiguration(true, monitor);
      String vmArgs = lc.getAttribute(IJavaLaunchConfigurationConstants.ATTR_VM_ARGUMENTS, (String)null);
      VMArgs vmArgsMap = new VMArgs(vmArgs);
      vmArgsMap.put(confVmArgs);

      ILaunchConfigurationWorkingCopy lcw = lc.getWorkingCopy();
      lcw.setAttribute(IJavaLaunchConfigurationConstants.ATTR_VM_ARGUMENTS, vmArgsMap.toString());
      lcw.doSave();
    }

    TomcatServer tServer = (TomcatServer)server.loadAdapter(TomcatServer.class, monitor);
    TomcatConfiguration tConfig = tServer.getTomcatConfiguration();
    for (ServerPort port : swc.getServerPorts(monitor))
    {
      if (port.getProtocol().equalsIgnoreCase("http") && port.getId().indexOf('/') < 0)
      {
        tConfig.modifyServerPort(port.getId(), serverTask.getPort());
      }
      if (port.getProtocol().equalsIgnoreCase("ssl") && port.getId().indexOf('/') < 0)
      {
        tConfig.modifyServerPort(port.getId(), serverTask.getHttpsPort());
      }
    }
    tServer.saveConfiguration(monitor);

    monitor.worked(1);
  }

}
