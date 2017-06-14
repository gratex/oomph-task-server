/**
 *
 */
package com.gratex.oomph.task.server.creator.impl;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.oomph.setup.SetupTaskContext;
import org.eclipse.wst.server.core.IRuntime;
import org.eclipse.wst.server.core.IRuntimeType;
import org.eclipse.wst.server.core.IRuntimeWorkingCopy;
import org.eclipse.wst.server.core.IServerType;
import org.eclipse.wst.server.core.IServerWorkingCopy;
import org.eclipse.wst.server.core.ServerCore;
import org.eclipse.wst.server.core.internal.ServerWorkingCopy;

import com.gratex.oomph.task.server.WebsphereServerTask;
import com.gratex.oomph.task.server.WebsphereServerVersion;
import com.gratex.oomph.task.server.creator.ServerCreator;
import com.gratex.oomph.task.server.exception.ServerTaskException;
import com.ibm.ws.ast.st.common.core.internal.AbstractWASServer;

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

  private static final String WAS_V8_SERVER_RUNTIME_ID = "com.ibm.ws.ast.st.runtime.v8";

  public static final String WAS_V8_SERVER_ID = "com.ibm.ws.ast.st.v8.server.base";

  private static final String WAS_V85_SERVER_RUNTIME_ID = "com.ibm.ws.ast.st.runtime.v85";

  public static final String WAS_V85_SERVER_ID = "com.ibm.ws.ast.st.v85.server.base";

  private WebsphereServerTask serverTask;

  public WebsphereServerCreator(SetupTaskContext context, WebsphereServerTask serverTask)
  {
    super(context, serverTask.getRuntimeName(), serverTask.getServerName());
    this.serverTask = serverTask;
  }

  private String serverRuntimeId() throws ServerTaskException
  {
    switch (serverTask.getServerVersion())
    {
    case WAS70:
      return WAS_V7_SERVER_RUNTIME_ID;
    case WAS80:
      return WAS_V8_SERVER_RUNTIME_ID;
    case WAS85:
      return WAS_V85_SERVER_RUNTIME_ID;
    default:
      throw new ServerTaskException("Unsupported server type " + serverTask.getServerVersion().getName());
    }
  }

  private String serverId() throws ServerTaskException
  {
    switch (serverTask.getServerVersion())
    {
    case WAS70:
      return WAS_V7_SERVER_ID;
    case WAS80:
      return WAS_V8_SERVER_ID;
    case WAS85:
      return WAS_V85_SERVER_ID;
    default:
      throw new ServerTaskException("Unsupported server type " + serverTask.getServerVersion().getName());
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

    if (serverTask.getServerVersion() == WebsphereServerVersion.WAS70)
    {
      configureWas70(swc, monitor);
    }
    else if (serverTask.getServerVersion() == WebsphereServerVersion.WAS80)
    {
      configureWas80(swc, monitor);
    }
    else if (serverTask.getServerVersion() == WebsphereServerVersion.WAS85)
    {
      configureWas85(swc, monitor);
    }

    swc.save(false, monitor);
    monitor.worked(1);
  }

  private void configureWas70(IServerWorkingCopy swc, IProgressMonitor monitor) throws CoreException
  {
    AbstractWASServer wasServer = (AbstractWASServer)swc.loadAdapter(com.ibm.ws.ast.st.v7.core.internal.WASServer.class, null);
    
    setCommonWasConfig(wasServer);
    
    // No WAS 7.0 specific config as of yet

    ((com.ibm.ws.ast.st.v7.core.internal.WASServer)wasServer).saveConfiguration(monitor);
  }

  private void configureWas80(IServerWorkingCopy swc, IProgressMonitor monitor) throws CoreException
  {
    AbstractWASServer wasServer = (AbstractWASServer)swc.loadAdapter(com.ibm.ws.ast.st.v8.core.internal.WASServer.class, null);
    
    setCommonWasConfig(wasServer);
    
    // No WAS 8.0 specific config as of yet

    ((com.ibm.ws.ast.st.v8.core.internal.WASServer)wasServer).saveConfiguration(monitor);
  }

  private void configureWas85(IServerWorkingCopy swc, IProgressMonitor monitor) throws CoreException
  {
    AbstractWASServer wasServer = (AbstractWASServer)swc.loadAdapter(com.ibm.ws.ast.st.v85.core.internal.WASServer.class, null);
    
    setCommonWasConfig(wasServer);
    
    // No WAS 8.5 specific config as of yet
    
    ((com.ibm.ws.ast.st.v85.core.internal.WASServer)wasServer).saveConfiguration(monitor);
  }

  private void setCommonWasConfig(AbstractWASServer wasServer)
  {
    wasServer.setBaseServerName(serverTask.getBaseServerName()); // baseServerName
    if (serverTask.getRemoteOsUser() != null || serverTask.getRemoteOsPassword() != null)
    {
      wasServer.setIsRemoteServerStartEnabled(true);
      wasServer.setRemoteServerStartPlatform(ServerOs.Linux.id);
      wasServer.setRemoteServerStartProfilePath(serverTask.getProfilePath()); // profilePath
      wasServer.setRemoteServerStartOSId(serverTask.getRemoteOsUser()); // remoteUser
      wasServer.setRemoteServerStartOSPassword(serverTask.getRemoteOsPassword()); // remotePassword
    }
    else
    {
      wasServer.setIsRemoteServerStartEnabled(false);
    }
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
  }
}
