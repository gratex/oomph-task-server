/**
 *
 */
package com.gratex.oomph.task.server.creator;

import org.eclipse.oomph.setup.SetupTaskContext;
import org.eclipse.oomph.setup.log.ProgressLog.Severity;
import org.eclipse.oomph.util.SubMonitor;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.internal.launching.StandardVMType;
import org.eclipse.jdt.launching.IVMInstall;
import org.eclipse.jdt.launching.IVMInstallType;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.wst.server.core.IRuntime;
import org.eclipse.wst.server.core.IServer;
import org.eclipse.wst.server.core.ServerCore;
import org.eclipse.wst.server.core.internal.ServerWorkingCopy;

import com.gratex.oomph.task.server.Server;
import com.gratex.oomph.task.server.exception.ServerTaskException;

/**
 * @author jkovalux
 *
 */
@SuppressWarnings("restriction")
public abstract class ServerCreator
{

  protected SetupTaskContext context;

  protected String runtimeName;

  protected String serverName;

  protected String jreVersion;

  public ServerCreator(SetupTaskContext context, String runtimeName, String serverName)
  {
    this.context = context;
    this.runtimeName = runtimeName;
    this.serverName = serverName;
    jreVersion = null;
  }

  public ServerCreator(SetupTaskContext context, String runtimeName, String serverName, String jreVersion)
  {
    this.context = context;
    this.runtimeName = runtimeName;
    this.serverName = serverName;
    this.jreVersion = "JRE for " + jreVersion;
  }

  public void createServerInstance() throws ServerTaskException
  {
    SubMonitor monitor = SubMonitor.convert(context.getProgressMonitor(true), "Server setup", 1);
    try
    {
      createServerInstanceInternal(monitor);
    }
    catch (Exception e)
    {
      throw new ServerTaskException("Error during server setup", e);
    }
    finally
    {
      monitor.done();
    }
  }

  protected abstract void createServerInstanceInternal(IProgressMonitor monitor) throws Exception;

  public boolean exists()
  {
    IRuntime runtime = ServerCore.findRuntime(runtimeName);
    IServer server = ServerCore.findServer(serverName);

    return runtime != null && server != null;
  }

  protected IVMInstall getVMInstall() throws ServerTaskException
  {
    if (jreVersion == null)
    {
      throw new ServerTaskException("No JRE version provided ");
    }

    IVMInstallType vmInstallType = JavaRuntime.getVMInstallType(StandardVMType.ID_STANDARD_VM_TYPE);
    if (vmInstallType == null)
    {
      throw new ServerTaskException("Unable to locate JRE at " + jreVersion);
    }

    IVMInstall vmInstall = vmInstallType.findVMInstallByName(jreVersion);
    if (vmInstall == null)
    {
      throw new ServerTaskException("Unable to locate JRE at " + jreVersion);
    }

    return vmInstall;
  }

  protected void cleanPreviousRuntime(String runtimeId) throws CoreException
  {
    IRuntime runtime = ServerCore.findRuntime(runtimeId);
    if (runtime != null)
    {
      context.log("Removing existing runtime " + runtime.getName(), Severity.INFO);
      for (IServer server : ServerCore.getServers())
      {
        if (server.getRuntime().equals(runtime))
        {
          context.log("Removing existing server " + server.getName() + " which referenced runtime " + runtime.getName(), Severity.INFO);
          server.delete();
        }
      }
      runtime.delete();
    }
  }

  protected void cleanPreviousServer(String serverId) throws CoreException
  {
    IServer server = ServerCore.findServer(serverId);
    if (server != null)
    {
      context.log("Removing existing server " + server.getName(), Severity.INFO);
      server.delete();
    }
  }

  protected void cleanAllRuntimes() throws CoreException
  {
    IRuntime[] runtimeList = ServerCore.getRuntimes();
    if (runtimeList != null && runtimeList.length > 0)
    {
      for (IRuntime runtime : runtimeList)
      {
        context.log("Removing existing runtime " + runtime.getName(), Severity.INFO);
        runtime.delete();
      }
    }

  }

  protected void cleanAllServers() throws CoreException
  {
    IServer[] serverList = ServerCore.getServers();
    if (serverList != null && serverList.length > 0)
    {
      for (IServer server : serverList)
      {
        context.log("Removing existing server " + server.getName(), Severity.INFO);
        server.delete();
      }
    }
  }

  protected void setCommon(ServerWorkingCopy cswc, Server serverTask)
  {
    cswc.setAutoPublishSetting(org.eclipse.wst.server.core.internal.Server.AUTO_PUBLISH_DISABLE);

    Integer startTimeout = serverTask.getStartTimeout();
    if (startTimeout != null)
    {
      cswc.setStartTimeout(startTimeout);
    }
    Integer stopTimeout = serverTask.getStopTimeout();
    if (stopTimeout != null)
    {
      cswc.setStopTimeout(startTimeout);
    }
  }

}
