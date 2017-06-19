/**
 */
package com.gratex.oomph.task.server.impl;

import org.eclipse.oomph.setup.SetupTaskContext;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.google.common.base.Strings;
import com.gratex.oomph.task.server.ServerPackage;
import com.gratex.oomph.task.server.WebsphereServerTask;
import com.gratex.oomph.task.server.WebsphereServerVersion;
import com.gratex.oomph.task.server.creator.impl.WebsphereServerCreator;
import com.gratex.oomph.task.utils.Convert;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Websphere Server Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.gratex.oomph.task.server.impl.WebsphereServerTaskImpl#getBaseServerName <em>Base Server Name</em>}</li>
 *   <li>{@link com.gratex.oomph.task.server.impl.WebsphereServerTaskImpl#getProfilePath <em>Profile Path</em>}</li>
 *   <li>{@link com.gratex.oomph.task.server.impl.WebsphereServerTaskImpl#getProfileName <em>Profile Name</em>}</li>
 *   <li>{@link com.gratex.oomph.task.server.impl.WebsphereServerTaskImpl#getBootstrapPort <em>Bootstrap Port</em>}</li>
 *   <li>{@link com.gratex.oomph.task.server.impl.WebsphereServerTaskImpl#getIcpPort <em>Icp Port</em>}</li>
 *   <li>{@link com.gratex.oomph.task.server.impl.WebsphereServerTaskImpl#getSoapPort <em>Soap Port</em>}</li>
 *   <li>{@link com.gratex.oomph.task.server.impl.WebsphereServerTaskImpl#getRemoteOsUser <em>Remote Os User</em>}</li>
 *   <li>{@link com.gratex.oomph.task.server.impl.WebsphereServerTaskImpl#getRemoteOsPassword <em>Remote Os Password</em>}</li>
 *   <li>{@link com.gratex.oomph.task.server.impl.WebsphereServerTaskImpl#getServerVersion <em>Server Version</em>}</li>
 *   <li>{@link com.gratex.oomph.task.server.impl.WebsphereServerTaskImpl#getSecurityUserId <em>Security User Id</em>}</li>
 *   <li>{@link com.gratex.oomph.task.server.impl.WebsphereServerTaskImpl#getSecurityUserPassword <em>Security User Password</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WebsphereServerTaskImpl extends ServerImpl implements WebsphereServerTask
{
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
   * The default value of the '{@link #getProfileName() <em>Profile Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProfileName()
   * @generated
   * @ordered
   */
  protected static final String PROFILE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getProfileName() <em>Profile Name</em>}' attribute.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @see #getProfileName()
   * @generated
   * @ordered
   */
  protected String profileName = PROFILE_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getBootstrapPort() <em>Bootstrap Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBootstrapPort()
   * @generated
   * @ordered
   */
  protected static final String BOOTSTRAP_PORT_EDEFAULT = null;

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
  protected static final String ICP_PORT_EDEFAULT = null;

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
  protected static final String SOAP_PORT_EDEFAULT = null;

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

  /**
   * The default value of the '{@link #getServerVersion() <em>Server Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServerVersion()
   * @generated
   * @ordered
   */
  protected static final WebsphereServerVersion SERVER_VERSION_EDEFAULT = WebsphereServerVersion.WAS70;

  /**
   * The cached value of the '{@link #getServerVersion() <em>Server Version</em>}' attribute.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @see #getServerVersion()
   * @generated
   * @ordered
   */
  protected WebsphereServerVersion serverVersion = SERVER_VERSION_EDEFAULT;

  /**
   * The default value of the '{@link #getSecurityUserId() <em>Security User Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecurityUserId()
   * @generated
   * @ordered
   */
  protected static final String SECURITY_USER_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSecurityUserId() <em>Security User Id</em>}' attribute.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @see #getSecurityUserId()
   * @generated
   * @ordered
   */
  protected String securityUserId = SECURITY_USER_ID_EDEFAULT;

  /**
   * The default value of the '{@link #getSecurityUserPassword() <em>Security User Password</em>}' attribute.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @see #getSecurityUserPassword()
   * @generated
   * @ordered
   */
  protected static final String SECURITY_USER_PASSWORD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSecurityUserPassword() <em>Security User Password</em>}' attribute.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @see #getSecurityUserPassword()
   * @generated
   * @ordered
   */
  protected String securityUserPassword = SECURITY_USER_PASSWORD_EDEFAULT;

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
  public String getProfileName()
  {
    return profileName;
  }

  /*
   * (non-Javadoc)
   * @see com.gratex.oomph.task.server.WebsphereServerTask#hasProfileName()
   */
  @Override
  public boolean hasProfileName()
  {
    return !Strings.isNullOrEmpty(profileName);
  }

  /**
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setProfileName(String newProfileName)
  {
    String oldProfileName = profileName;
    profileName = newProfileName;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.WEBSPHERE_SERVER_TASK__PROFILE_NAME, oldProfileName, profileName));
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

  /*
   * (non-Javadoc)
   * @see com.gratex.oomph.task.server.WebsphereServerTask#bootstrapPort()
   */
  @Override
  public Integer bootstrapPort()
  {
    return Convert.toInteger(getBootstrapPort());
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

  /*
   * (non-Javadoc)
   * @see com.gratex.oomph.task.server.WebsphereServerTask#icpPort()
   */
  @Override
  public Integer icpPort()
  {
    return Convert.toInteger(getIcpPort());
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

  /*
   * (non-Javadoc)
   * @see com.gratex.oomph.task.server.WebsphereServerTask#soapPort()
   */
  @Override
  public Integer soapPort()
  {
    return Convert.toInteger(getSoapPort());
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

  /*
   * (non-Javadoc)
   * @see com.gratex.oomph.task.server.WebsphereServerTask#hasRemoteOsUser()
   */
  @Override
  public boolean hasRemoteOsUser()
  {
    return !Strings.isNullOrEmpty(remoteOsUser);
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

  /*
   * (non-Javadoc)
   * @see com.gratex.oomph.task.server.WebsphereServerTask#hasRemoteOsPassword()
   */
  @Override
  public boolean hasRemoteOsPassword()
  {
    return !Strings.isNullOrEmpty(remoteOsPassword);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public WebsphereServerVersion getServerVersion()
  {
    return serverVersion;
  }

  /**
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setServerVersion(WebsphereServerVersion newServerVersion)
  {
    WebsphereServerVersion oldServerVersion = serverVersion;
    serverVersion = newServerVersion == null ? SERVER_VERSION_EDEFAULT : newServerVersion;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.WEBSPHERE_SERVER_TASK__SERVER_VERSION, oldServerVersion, serverVersion));
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getSecurityUserId()
  {
    return securityUserId;
  }

  /*
   * (non-Javadoc)
   * @see com.gratex.oomph.task.server.WebsphereServerTask#hasSecurityUserId()
   */
  @Override
  public boolean hasSecurityUserId()
  {
    return !Strings.isNullOrEmpty(securityUserId);
  }

  /**
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSecurityUserId(String newSecurityUserId)
  {
    String oldSecurityUserId = securityUserId;
    securityUserId = newSecurityUserId;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.WEBSPHERE_SERVER_TASK__SECURITY_USER_ID, oldSecurityUserId, securityUserId));
    }
  }

  /**
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getSecurityUserPassword()
  {
    return securityUserPassword;
  }

  /*
   * (non-Javadoc)
   * @see com.gratex.oomph.task.server.WebsphereServerTask#hasSecurityUserPassword()
   */
  @Override
  public boolean hasSecurityUserPassword()
  {
    return !Strings.isNullOrEmpty(securityUserPassword);
  }

  /**
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSecurityUserPassword(String newSecurityUserPassword)
  {
    String oldSecurityUserPassword = securityUserPassword;
    securityUserPassword = newSecurityUserPassword;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.WEBSPHERE_SERVER_TASK__SECURITY_USER_PASSWORD, oldSecurityUserPassword,
          securityUserPassword));
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
    case ServerPackage.WEBSPHERE_SERVER_TASK__BASE_SERVER_NAME:
      return getBaseServerName();
    case ServerPackage.WEBSPHERE_SERVER_TASK__PROFILE_PATH:
      return getProfilePath();
    case ServerPackage.WEBSPHERE_SERVER_TASK__PROFILE_NAME:
      return getProfileName();
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
    case ServerPackage.WEBSPHERE_SERVER_TASK__SERVER_VERSION:
      return getServerVersion();
    case ServerPackage.WEBSPHERE_SERVER_TASK__SECURITY_USER_ID:
      return getSecurityUserId();
    case ServerPackage.WEBSPHERE_SERVER_TASK__SECURITY_USER_PASSWORD:
      return getSecurityUserPassword();
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
    case ServerPackage.WEBSPHERE_SERVER_TASK__BASE_SERVER_NAME:
      setBaseServerName((String)newValue);
      return;
    case ServerPackage.WEBSPHERE_SERVER_TASK__PROFILE_PATH:
      setProfilePath((String)newValue);
      return;
    case ServerPackage.WEBSPHERE_SERVER_TASK__PROFILE_NAME:
      setProfileName((String)newValue);
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
    case ServerPackage.WEBSPHERE_SERVER_TASK__SERVER_VERSION:
      setServerVersion((WebsphereServerVersion)newValue);
      return;
    case ServerPackage.WEBSPHERE_SERVER_TASK__SECURITY_USER_ID:
      setSecurityUserId((String)newValue);
      return;
    case ServerPackage.WEBSPHERE_SERVER_TASK__SECURITY_USER_PASSWORD:
      setSecurityUserPassword((String)newValue);
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
    case ServerPackage.WEBSPHERE_SERVER_TASK__BASE_SERVER_NAME:
      setBaseServerName(BASE_SERVER_NAME_EDEFAULT);
      return;
    case ServerPackage.WEBSPHERE_SERVER_TASK__PROFILE_PATH:
      setProfilePath(PROFILE_PATH_EDEFAULT);
      return;
    case ServerPackage.WEBSPHERE_SERVER_TASK__PROFILE_NAME:
      setProfileName(PROFILE_NAME_EDEFAULT);
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
    case ServerPackage.WEBSPHERE_SERVER_TASK__SERVER_VERSION:
      setServerVersion(SERVER_VERSION_EDEFAULT);
      return;
    case ServerPackage.WEBSPHERE_SERVER_TASK__SECURITY_USER_ID:
      setSecurityUserId(SECURITY_USER_ID_EDEFAULT);
      return;
    case ServerPackage.WEBSPHERE_SERVER_TASK__SECURITY_USER_PASSWORD:
      setSecurityUserPassword(SECURITY_USER_PASSWORD_EDEFAULT);
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
    case ServerPackage.WEBSPHERE_SERVER_TASK__BASE_SERVER_NAME:
      return BASE_SERVER_NAME_EDEFAULT == null ? baseServerName != null : !BASE_SERVER_NAME_EDEFAULT.equals(baseServerName);
    case ServerPackage.WEBSPHERE_SERVER_TASK__PROFILE_PATH:
      return PROFILE_PATH_EDEFAULT == null ? profilePath != null : !PROFILE_PATH_EDEFAULT.equals(profilePath);
    case ServerPackage.WEBSPHERE_SERVER_TASK__PROFILE_NAME:
      return PROFILE_NAME_EDEFAULT == null ? profileName != null : !PROFILE_NAME_EDEFAULT.equals(profileName);
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
    case ServerPackage.WEBSPHERE_SERVER_TASK__SERVER_VERSION:
      return serverVersion != SERVER_VERSION_EDEFAULT;
    case ServerPackage.WEBSPHERE_SERVER_TASK__SECURITY_USER_ID:
      return SECURITY_USER_ID_EDEFAULT == null ? securityUserId != null : !SECURITY_USER_ID_EDEFAULT.equals(securityUserId);
    case ServerPackage.WEBSPHERE_SERVER_TASK__SECURITY_USER_PASSWORD:
      return SECURITY_USER_PASSWORD_EDEFAULT == null ? securityUserPassword != null : !SECURITY_USER_PASSWORD_EDEFAULT.equals(securityUserPassword);
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
    result.append(" (baseServerName: ");
    result.append(baseServerName);
    result.append(", profilePath: ");
    result.append(profilePath);
    result.append(", profileName: ");
    result.append(profileName);
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
    result.append(", serverVersion: ");
    result.append(serverVersion);
    result.append(", securityUserId: ");
    result.append(securityUserId);
    result.append(", securityUserPassword: ");
    result.append(securityUserPassword);
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

} // WebsphereServerTaskImpl
