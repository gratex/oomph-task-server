/**
 *
 */
package com.gratex.oomph.task.server.creator.impl;

import org.eclipse.oomph.setup.SetupTaskContext;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.wst.server.core.IRuntime;
import org.eclipse.wst.server.core.IRuntimeType;
import org.eclipse.wst.server.core.IRuntimeWorkingCopy;
import org.eclipse.wst.server.core.IServerType;
import org.eclipse.wst.server.core.IServerWorkingCopy;
import org.eclipse.wst.server.core.ServerCore;

import com.gratex.oomph.task.server.WebsphereServerTask;
import com.gratex.oomph.task.server.creator.ServerCreator;
import com.gratex.oomph.task.server.exception.ServerTaskException;
import com.ibm.ws.ast.st.v7.core.internal.WASServer;

/**
 * @author jkovalux
 *
 */
@SuppressWarnings("restriction")
public class WebsphereServerCreator extends ServerCreator
{

  public enum ConnectionType
  {
    RMI, SOAP, JSR160RMI
  }

  public enum ServerOs
  {
    Windows(0), Linux(1);

    int id;

    ServerOs(int id)
    {
      this.id = id;
    }

  }

  private static final String WAS_V7_SERVER_RUNTIME_ID = "com.ibm.ws.ast.st.runtime.v70";

  public static final String WAS_V7_SERVER_ID = "com.ibm.ws.ast.st.v7.server.base";

  private WebsphereServerTask serverTask;

  public WebsphereServerCreator(SetupTaskContext context, WebsphereServerTask serverTask)
  {
    super(context, serverTask.getRuntimeName(), serverTask.getServerName());
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

    IRuntimeType runtimeType = ServerCore.findRuntimeType(WAS_V7_SERVER_RUNTIME_ID);
    IRuntimeWorkingCopy rwc = runtimeType.createRuntime(serverTask.getRuntimeName(), monitor);

    rwc.setLocation(Path.fromOSString(serverTask.getLocation()));
    rwc.setName(serverTask.getRuntimeName());

    IStatus status = rwc.validate(monitor);
    if (!status.isOK())
    {
      throw new ServerTaskException("Error creating server runtime: " + status.getMessage());
    }
    IRuntime runtime = rwc.save(false, monitor);

    cleanPreviousServer(serverTask.getServerName());

    IServerType serverType = ServerCore.findServerType(WAS_V7_SERVER_ID);
    IServerWorkingCopy swc = serverType.createServer(serverTask.getServerName(), null, runtime, monitor);
    swc.setHost(serverTask.getHostname());

    WASServer wasServer = (WASServer)swc.loadAdapter(WASServer.class, null);
    wasServer.setBaseServerName(serverTask.getBaseServerName()); // baseServerName
    wasServer.setIsRemoteServerStartEnabled(true);
    wasServer.setRemoteServerStartPlatform(ServerOs.Linux.id);
    wasServer.setRemoteServerStartProfilePath(serverTask.getProfilePath()); // profilePath
    wasServer.setRemoteServerStartOSId(serverTask.getRemoteOsUser()); // remoteUser
    wasServer.setRemoteServerStartOSPassword(serverTask.getRemoteOsPassword()); // remotePassword
    wasServer.setIsQuickBatchServerStart(true);
    wasServer.setOrbBootstrapPortNum(serverTask.getBootstrapPort()); // bootstrapPort
    wasServer.setIPCConnectorPortNum(serverTask.getIcpPort()); // icpPort
    wasServer.setSoapConnectorPortNum(serverTask.getSoapPort()); // soapPort
    wasServer.setServerConnectionType(ConnectionType.SOAP.name());
    wasServer.setIsRunServerWithWorkspaceResources(false);
    wasServer.setIsAutoConnectionTypeEnabled(false);
    wasServer.setIsUTCEnabled(true);
    wasServer.setIsOptimizedForDevelopmentEnv(true);
    wasServer.setIsHotMethodReplace(true);
    wasServer.setIsZeroBinaryEnabled(false);
    wasServer.updateServerSelectedConnectionTypes(ConnectionType.SOAP.name(), true);
    wasServer.updateServerSelectedConnectionTypes(ConnectionType.JSR160RMI.name(), true);
    wasServer.updateServerSelectedConnectionTypes(ConnectionType.RMI.name(), true);

    wasServer.saveConfiguration(monitor);
    swc.save(false, monitor);
    monitor.worked(1);

  }

}
