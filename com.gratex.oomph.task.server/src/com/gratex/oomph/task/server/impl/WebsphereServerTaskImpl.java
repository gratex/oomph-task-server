/**
 */
package com.gratex.oomph.task.server.impl;

import org.eclipse.oomph.setup.SetupTaskContext;
import org.eclipse.oomph.setup.impl.SetupTaskImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.gratex.oomph.task.server.ServerPackage;
import com.gratex.oomph.task.server.WebsphereServerTask;
import com.gratex.oomph.task.server.creator.impl.WebsphereServerCreator;
import com.gratex.oomph.task.server.exception.ServerTaskException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Websphere Server Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.gratex.oomph.task.server.impl.WebsphereServerTaskImpl#getServerName <em>Server Name</em>}</li>
 *   <li>{@link com.gratex.oomph.task.server.impl.WebsphereServerTaskImpl#getBaseServerName <em>Base Server Name</em>}</li>
 *   <li>{@link com.gratex.oomph.task.server.impl.WebsphereServerTaskImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link com.gratex.oomph.task.server.impl.WebsphereServerTaskImpl#getProfilePath <em>Profile Path</em>}</li>
 *   <li>{@link com.gratex.oomph.task.server.impl.WebsphereServerTaskImpl#getRuntimeName <em>Runtime Name</em>}</li>
 *   <li>{@link com.gratex.oomph.task.server.impl.WebsphereServerTaskImpl#getHostname <em>Hostname</em>}</li>
 *   <li>{@link com.gratex.oomph.task.server.impl.WebsphereServerTaskImpl#getBootstrapPort <em>Bootstrap Port</em>}</li>
 *   <li>{@link com.gratex.oomph.task.server.impl.WebsphereServerTaskImpl#getIcpPort <em>Icp Port</em>}</li>
 *   <li>{@link com.gratex.oomph.task.server.impl.WebsphereServerTaskImpl#getSoapPort <em>Soap Port</em>}</li>
 *   <li>{@link com.gratex.oomph.task.server.impl.WebsphereServerTaskImpl#getRemoteOsUser <em>Remote Os User</em>}</li>
 *   <li>{@link com.gratex.oomph.task.server.impl.WebsphereServerTaskImpl#getRemoteOsPassword <em>Remote Os Password</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WebsphereServerTaskImpl extends SetupTaskImpl implements WebsphereServerTask
{
  /**
   * The default value of the '{@link #getServerName() <em>Server Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServerName()
   * @generated
   * @ordered
   */
  protected static final String SERVER_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getServerName() <em>Server Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServerName()
   * @generated
   * @ordered
   */
  protected String serverName = SERVER_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getBaseServerName() <em>Base Server Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBaseServerName()
   * @generated
   * @ordered
   */
  protected static final String BASE_SERVER_NAME_EDEFAULT = "server1";

  /**
   * The cached value of the '{@link #getBaseServerName() <em>Base Server Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBaseServerName()
   * @generated
   * @ordered
   */
  protected String baseServerName = BASE_SERVER_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocation()
   * @generated
   * @ordered
   */
  protected static final String LOCATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocation()
   * @generated
   * @ordered
   */
  protected String location = LOCATION_EDEFAULT;

  /**
   * The default value of the '{@link #getProfilePath() <em>Profile Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProfilePath()
   * @generated
   * @ordered
   */
  protected static final String PROFILE_PATH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getProfilePath() <em>Profile Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProfilePath()
   * @generated
   * @ordered
   */
  protected String profilePath = PROFILE_PATH_EDEFAULT;

  /**
   * The default value of the '{@link #getRuntimeName() <em>Runtime Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRuntimeName()
   * @generated
   * @ordered
   */
  protected static final String RUNTIME_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRuntimeName() <em>Runtime Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRuntimeName()
   * @generated
   * @ordered
   */
  protected String runtimeName = RUNTIME_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getHostname() <em>Hostname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHostname()
   * @generated
   * @ordered
   */
  protected static final String HOSTNAME_EDEFAULT = "localhost";

  /**
   * The cached value of the '{@link #getHostname() <em>Hostname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHostname()
   * @generated
   * @ordered
   */
  protected String hostname = HOSTNAME_EDEFAULT;

  /**
   * The default value of the '{@link #getBootstrapPort() <em>Bootstrap Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBootstrapPort()
   * @generated
   * @ordered
   */
  protected static final String BOOTSTRAP_PORT_EDEFAULT = "2806";

  /**
   * The cached value of the '{@link #getBootstrapPort() <em>Bootstrap Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBootstrapPort()
   * @generated
   * @ordered
   */
  protected String bootstrapPort = BOOTSTRAP_PORT_EDEFAULT;

  /**
   * The default value of the '{@link #getIcpPort() <em>Icp Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIcpPort()
   * @generated
   * @ordered
   */
  protected static final String ICP_PORT_EDEFAULT = "9633";

  /**
   * The cached value of the '{@link #getIcpPort() <em>Icp Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIcpPort()
   * @generated
   * @ordered
   */
  protected String icpPort = ICP_PORT_EDEFAULT;

  /**
   * The default value of the '{@link #getSoapPort() <em>Soap Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSoapPort()
   * @generated
   * @ordered
   */
  protected static final String SOAP_PORT_EDEFAULT = "8880";

  /**
   * The cached value of the '{@link #getSoapPort() <em>Soap Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSoapPort()
   * @generated
   * @ordered
   */
  protected String soapPort = SOAP_PORT_EDEFAULT;

  /**
   * The default value of the '{@link #getRemoteOsUser() <em>Remote Os User</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRemoteOsUser()
   * @generated
   * @ordered
   */
  protected static final String REMOTE_OS_USER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRemoteOsUser() <em>Remote Os User</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRemoteOsUser()
   * @generated
   * @ordered
   */
  protected String remoteOsUser = REMOTE_OS_USER_EDEFAULT;

  /**
   * The default value of the '{@link #getRemoteOsPassword() <em>Remote Os Password</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRemoteOsPassword()
   * @generated
   * @ordered
   */
  protected static final String REMOTE_OS_PASSWORD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRemoteOsPassword() <em>Remote Os Password</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRemoteOsPassword()
   * @generated
   * @ordered
   */
  protected String remoteOsPassword = REMOTE_OS_PASSWORD_EDEFAULT;

  private WebsphereServerCreator serverCreator;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WebsphereServerTaskImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ServerPackage.Literals.WEBSPHERE_SERVER_TASK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getServerName()
  {
    return serverName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setServerName(String newServerName)
  {
    String oldServerName = serverName;
    serverName = newServerName;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.WEBSPHERE_SERVER_TASK__SERVER_NAME, oldServerName, serverName));
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getBaseServerName()
  {
    return baseServerName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setBaseServerName(String newBaseServerName)
  {
    String oldBaseServerName = baseServerName;
    baseServerName = newBaseServerName;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.WEBSPHERE_SERVER_TASK__BASE_SERVER_NAME, oldBaseServerName, baseServerName));
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLocation()
  {
    return location;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLocation(String newLocation)
  {
    String oldLocation = location;
    location = newLocation;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.WEBSPHERE_SERVER_TASK__LOCATION, oldLocation, location));
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getProfilePath()
  {
    return profilePath;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setProfilePath(String newProfilePath)
  {
    String oldProfilePath = profilePath;
    profilePath = newProfilePath;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.WEBSPHERE_SERVER_TASK__PROFILE_PATH, oldProfilePath, profilePath));
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getRuntimeName()
  {
    return runtimeName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRuntimeName(String newRuntimeName)
  {
    String oldRuntimeName = runtimeName;
    runtimeName = newRuntimeName;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.WEBSPHERE_SERVER_TASK__RUNTIME_NAME, oldRuntimeName, runtimeName));
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getHostname()
  {
    return hostname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setHostname(String newHostname)
  {
    String oldHostname = hostname;
    hostname = newHostname;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.WEBSPHERE_SERVER_TASK__HOSTNAME, oldHostname, hostname));
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getBootstrapPort()
  {
    return bootstrapPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setBootstrapPort(String newBootstrapPort)
  {
    String oldBootstrapPort = bootstrapPort;
    bootstrapPort = newBootstrapPort;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.WEBSPHERE_SERVER_TASK__BOOTSTRAP_PORT, oldBootstrapPort, bootstrapPort));
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getIcpPort()
  {
    return icpPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setIcpPort(String newIcpPort)
  {
    String oldIcpPort = icpPort;
    icpPort = newIcpPort;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.WEBSPHERE_SERVER_TASK__ICP_PORT, oldIcpPort, icpPort));
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getSoapPort()
  {
    return soapPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSoapPort(String newSoapPort)
  {
    String oldSoapPort = soapPort;
    soapPort = newSoapPort;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.WEBSPHERE_SERVER_TASK__SOAP_PORT, oldSoapPort, soapPort));
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getRemoteOsUser()
  {
    return remoteOsUser;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRemoteOsUser(String newRemoteOsUser)
  {
    String oldRemoteOsUser = remoteOsUser;
    remoteOsUser = newRemoteOsUser;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.WEBSPHERE_SERVER_TASK__REMOTE_OS_USER, oldRemoteOsUser, remoteOsUser));
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getRemoteOsPassword()
  {
    return remoteOsPassword;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRemoteOsPassword(String newRemoteOsPassword)
  {
    String oldRemoteOsPassword = remoteOsPassword;
    remoteOsPassword = newRemoteOsPassword;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.WEBSPHERE_SERVER_TASK__REMOTE_OS_PASSWORD, oldRemoteOsPassword, remoteOsPassword));
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
    case ServerPackage.WEBSPHERE_SERVER_TASK__SERVER_NAME:
      return getServerName();
    case ServerPackage.WEBSPHERE_SERVER_TASK__BASE_SERVER_NAME:
      return getBaseServerName();
    case ServerPackage.WEBSPHERE_SERVER_TASK__LOCATION:
      return getLocation();
    case ServerPackage.WEBSPHERE_SERVER_TASK__PROFILE_PATH:
      return getProfilePath();
    case ServerPackage.WEBSPHERE_SERVER_TASK__RUNTIME_NAME:
      return getRuntimeName();
    case ServerPackage.WEBSPHERE_SERVER_TASK__HOSTNAME:
      return getHostname();
    case ServerPackage.WEBSPHERE_SERVER_TASK__BOOTSTRAP_PORT:
      return getBootstrapPort();
    case ServerPackage.WEBSPHERE_SERVER_TASK__ICP_PORT:
      return getIcpPort();
    case ServerPackage.WEBSPHERE_SERVER_TASK__SOAP_PORT:
      return getSoapPort();
    case ServerPackage.WEBSPHERE_SERVER_TASK__REMOTE_OS_USER:
      return getRemoteOsUser();
    case ServerPackage.WEBSPHERE_SERVER_TASK__REMOTE_OS_PASSWORD:
      return getRemoteOsPassword();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
    case ServerPackage.WEBSPHERE_SERVER_TASK__SERVER_NAME:
      setServerName((String)newValue);
      return;
    case ServerPackage.WEBSPHERE_SERVER_TASK__BASE_SERVER_NAME:
      setBaseServerName((String)newValue);
      return;
    case ServerPackage.WEBSPHERE_SERVER_TASK__LOCATION:
      setLocation((String)newValue);
      return;
    case ServerPackage.WEBSPHERE_SERVER_TASK__PROFILE_PATH:
      setProfilePath((String)newValue);
      return;
    case ServerPackage.WEBSPHERE_SERVER_TASK__RUNTIME_NAME:
      setRuntimeName((String)newValue);
      return;
    case ServerPackage.WEBSPHERE_SERVER_TASK__HOSTNAME:
      setHostname((String)newValue);
      return;
    case ServerPackage.WEBSPHERE_SERVER_TASK__BOOTSTRAP_PORT:
      setBootstrapPort((String)newValue);
      return;
    case ServerPackage.WEBSPHERE_SERVER_TASK__ICP_PORT:
      setIcpPort((String)newValue);
      return;
    case ServerPackage.WEBSPHERE_SERVER_TASK__SOAP_PORT:
      setSoapPort((String)newValue);
      return;
    case ServerPackage.WEBSPHERE_SERVER_TASK__REMOTE_OS_USER:
      setRemoteOsUser((String)newValue);
      return;
    case ServerPackage.WEBSPHERE_SERVER_TASK__REMOTE_OS_PASSWORD:
      setRemoteOsPassword((String)newValue);
      return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
    case ServerPackage.WEBSPHERE_SERVER_TASK__SERVER_NAME:
      setServerName(SERVER_NAME_EDEFAULT);
      return;
    case ServerPackage.WEBSPHERE_SERVER_TASK__BASE_SERVER_NAME:
      setBaseServerName(BASE_SERVER_NAME_EDEFAULT);
      return;
    case ServerPackage.WEBSPHERE_SERVER_TASK__LOCATION:
      setLocation(LOCATION_EDEFAULT);
      return;
    case ServerPackage.WEBSPHERE_SERVER_TASK__PROFILE_PATH:
      setProfilePath(PROFILE_PATH_EDEFAULT);
      return;
    case ServerPackage.WEBSPHERE_SERVER_TASK__RUNTIME_NAME:
      setRuntimeName(RUNTIME_NAME_EDEFAULT);
      return;
    case ServerPackage.WEBSPHERE_SERVER_TASK__HOSTNAME:
      setHostname(HOSTNAME_EDEFAULT);
      return;
    case ServerPackage.WEBSPHERE_SERVER_TASK__BOOTSTRAP_PORT:
      setBootstrapPort(BOOTSTRAP_PORT_EDEFAULT);
      return;
    case ServerPackage.WEBSPHERE_SERVER_TASK__ICP_PORT:
      setIcpPort(ICP_PORT_EDEFAULT);
      return;
    case ServerPackage.WEBSPHERE_SERVER_TASK__SOAP_PORT:
      setSoapPort(SOAP_PORT_EDEFAULT);
      return;
    case ServerPackage.WEBSPHERE_SERVER_TASK__REMOTE_OS_USER:
      setRemoteOsUser(REMOTE_OS_USER_EDEFAULT);
      return;
    case ServerPackage.WEBSPHERE_SERVER_TASK__REMOTE_OS_PASSWORD:
      setRemoteOsPassword(REMOTE_OS_PASSWORD_EDEFAULT);
      return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
    case ServerPackage.WEBSPHERE_SERVER_TASK__SERVER_NAME:
      return SERVER_NAME_EDEFAULT == null ? serverName != null : !SERVER_NAME_EDEFAULT.equals(serverName);
    case ServerPackage.WEBSPHERE_SERVER_TASK__BASE_SERVER_NAME:
      return BASE_SERVER_NAME_EDEFAULT == null ? baseServerName != null : !BASE_SERVER_NAME_EDEFAULT.equals(baseServerName);
    case ServerPackage.WEBSPHERE_SERVER_TASK__LOCATION:
      return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
    case ServerPackage.WEBSPHERE_SERVER_TASK__PROFILE_PATH:
      return PROFILE_PATH_EDEFAULT == null ? profilePath != null : !PROFILE_PATH_EDEFAULT.equals(profilePath);
    case ServerPackage.WEBSPHERE_SERVER_TASK__RUNTIME_NAME:
      return RUNTIME_NAME_EDEFAULT == null ? runtimeName != null : !RUNTIME_NAME_EDEFAULT.equals(runtimeName);
    case ServerPackage.WEBSPHERE_SERVER_TASK__HOSTNAME:
      return HOSTNAME_EDEFAULT == null ? hostname != null : !HOSTNAME_EDEFAULT.equals(hostname);
    case ServerPackage.WEBSPHERE_SERVER_TASK__BOOTSTRAP_PORT:
      return BOOTSTRAP_PORT_EDEFAULT == null ? bootstrapPort != null : !BOOTSTRAP_PORT_EDEFAULT.equals(bootstrapPort);
    case ServerPackage.WEBSPHERE_SERVER_TASK__ICP_PORT:
      return ICP_PORT_EDEFAULT == null ? icpPort != null : !ICP_PORT_EDEFAULT.equals(icpPort);
    case ServerPackage.WEBSPHERE_SERVER_TASK__SOAP_PORT:
      return SOAP_PORT_EDEFAULT == null ? soapPort != null : !SOAP_PORT_EDEFAULT.equals(soapPort);
    case ServerPackage.WEBSPHERE_SERVER_TASK__REMOTE_OS_USER:
      return REMOTE_OS_USER_EDEFAULT == null ? remoteOsUser != null : !REMOTE_OS_USER_EDEFAULT.equals(remoteOsUser);
    case ServerPackage.WEBSPHERE_SERVER_TASK__REMOTE_OS_PASSWORD:
      return REMOTE_OS_PASSWORD_EDEFAULT == null ? remoteOsPassword != null : !REMOTE_OS_PASSWORD_EDEFAULT.equals(remoteOsPassword);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy())
    {
      return super.toString();
    }

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (serverName: ");
    result.append(serverName);
    result.append(", baseServerName: ");
    result.append(baseServerName);
    result.append(", location: ");
    result.append(location);
    result.append(", profilePath: ");
    result.append(profilePath);
    result.append(", runtimeName: ");
    result.append(runtimeName);
    result.append(", hostname: ");
    result.append(hostname);
    result.append(", bootstrapPort: ");
    result.append(bootstrapPort);
    result.append(", icpPort: ");
    result.append(icpPort);
    result.append(", soapPort: ");
    result.append(soapPort);
    result.append(", remoteOsUser: ");
    result.append(remoteOsUser);
    result.append(", remoteOsPassword: ");
    result.append(remoteOsPassword);
    result.append(')');
    return result.toString();
  }

  @Override
  public boolean isNeeded(SetupTaskContext context) throws Exception
  {
    serverCreator = new WebsphereServerCreator(context, this);
    return !serverCreator.exists();
  }

  @Override
  public void perform(SetupTaskContext context) throws Exception
  {
    serverCreator.createServerInstance();
  }

  @Override
  public void dispose()
  {
  }

  /*
   * (non-Javadoc)
   * @see com.gratex.oomph.task.server.WebsphereServerTask#bootstrapPort()
   */
  @Override
  public Integer bootstrapPort() throws ServerTaskException
  {
    try
    {
      return Integer.parseInt(bootstrapPort);
    }
    catch (NumberFormatException e)
    {
      throw new ServerTaskException("Unable to parse bootstrapPort number.", e);
    }
  }

  /*
   * (non-Javadoc)
   * @see com.gratex.oomph.task.server.WebsphereServerTask#icpPort()
   */
  @Override
  public Integer icpPort() throws ServerTaskException
  {
    try
    {
      return Integer.parseInt(icpPort);
    }
    catch (NumberFormatException e)
    {
      throw new ServerTaskException("Unable to parse icpPort number.", e);
    }
  }

  /*
   * (non-Javadoc)
   * @see com.gratex.oomph.task.server.WebsphereServerTask#soapPort()
   */
  @Override
  public Integer soapPort() throws ServerTaskException
  {
    try
    {
      return Integer.parseInt(soapPort);
    }
    catch (NumberFormatException e)
    {
      throw new ServerTaskException("Unable to parse soapPort number.", e);
    }
  }

} // WebsphereServerTaskImpl
