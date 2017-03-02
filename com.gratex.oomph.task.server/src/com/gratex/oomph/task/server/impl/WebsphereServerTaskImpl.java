/**
 */
package com.gratex.oomph.task.server.impl;

import org.eclipse.oomph.setup.SetupTaskContext;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.gratex.oomph.task.server.ServerPackage;
import com.gratex.oomph.task.server.WebsphereServerTask;
import com.gratex.oomph.task.server.creator.impl.WebsphereServerCreator;

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
 *   <li>{@link com.gratex.oomph.task.server.impl.WebsphereServerTaskImpl#getBootstrapPort <em>Bootstrap Port</em>}</li>
 *   <li>{@link com.gratex.oomph.task.server.impl.WebsphereServerTaskImpl#getIcpPort <em>Icp Port</em>}</li>
 *   <li>{@link com.gratex.oomph.task.server.impl.WebsphereServerTaskImpl#getSoapPort <em>Soap Port</em>}</li>
 *   <li>{@link com.gratex.oomph.task.server.impl.WebsphereServerTaskImpl#getRemoteOsUser <em>Remote Os User</em>}</li>
 *   <li>{@link com.gratex.oomph.task.server.impl.WebsphereServerTaskImpl#getRemoteOsPassword <em>Remote Os Password</em>}</li>
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
   * The default value of the '{@link #getBootstrapPort() <em>Bootstrap Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBootstrapPort()
   * @generated
   * @ordered
   */
  protected static final Integer BOOTSTRAP_PORT_EDEFAULT = new Integer(2806);

  /**
   * The cached value of the '{@link #getBootstrapPort() <em>Bootstrap Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBootstrapPort()
   * @generated
   * @ordered
   */
  protected Integer bootstrapPort = BOOTSTRAP_PORT_EDEFAULT;

  /**
   * The default value of the '{@link #getIcpPort() <em>Icp Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIcpPort()
   * @generated
   * @ordered
   */
  protected static final Integer ICP_PORT_EDEFAULT = new Integer(9633);

  /**
   * The cached value of the '{@link #getIcpPort() <em>Icp Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIcpPort()
   * @generated
   * @ordered
   */
  protected Integer icpPort = ICP_PORT_EDEFAULT;

  /**
   * The default value of the '{@link #getSoapPort() <em>Soap Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSoapPort()
   * @generated
   * @ordered
   */
  protected static final Integer SOAP_PORT_EDEFAULT = new Integer(8880);

  /**
   * The cached value of the '{@link #getSoapPort() <em>Soap Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSoapPort()
   * @generated
   * @ordered
   */
  protected Integer soapPort = SOAP_PORT_EDEFAULT;

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
  public Integer getBootstrapPort()
  {
    return bootstrapPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setBootstrapPort(Integer newBootstrapPort)
  {
    Integer oldBootstrapPort = bootstrapPort;
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
  public Integer getIcpPort()
  {
    return icpPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setIcpPort(Integer newIcpPort)
  {
    Integer oldIcpPort = icpPort;
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
  public Integer getSoapPort()
  {
    return soapPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSoapPort(Integer newSoapPort)
  {
    Integer oldSoapPort = soapPort;
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
    case ServerPackage.WEBSPHERE_SERVER_TASK__BASE_SERVER_NAME:
      return getBaseServerName();
    case ServerPackage.WEBSPHERE_SERVER_TASK__PROFILE_PATH:
      return getProfilePath();
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
    case ServerPackage.WEBSPHERE_SERVER_TASK__BASE_SERVER_NAME:
      setBaseServerName((String)newValue);
      return;
    case ServerPackage.WEBSPHERE_SERVER_TASK__PROFILE_PATH:
      setProfilePath((String)newValue);
      return;
    case ServerPackage.WEBSPHERE_SERVER_TASK__BOOTSTRAP_PORT:
      setBootstrapPort((Integer)newValue);
      return;
    case ServerPackage.WEBSPHERE_SERVER_TASK__ICP_PORT:
      setIcpPort((Integer)newValue);
      return;
    case ServerPackage.WEBSPHERE_SERVER_TASK__SOAP_PORT:
      setSoapPort((Integer)newValue);
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
    case ServerPackage.WEBSPHERE_SERVER_TASK__BASE_SERVER_NAME:
      setBaseServerName(BASE_SERVER_NAME_EDEFAULT);
      return;
    case ServerPackage.WEBSPHERE_SERVER_TASK__PROFILE_PATH:
      setProfilePath(PROFILE_PATH_EDEFAULT);
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
    case ServerPackage.WEBSPHERE_SERVER_TASK__BASE_SERVER_NAME:
      return BASE_SERVER_NAME_EDEFAULT == null ? baseServerName != null : !BASE_SERVER_NAME_EDEFAULT.equals(baseServerName);
    case ServerPackage.WEBSPHERE_SERVER_TASK__PROFILE_PATH:
      return PROFILE_PATH_EDEFAULT == null ? profilePath != null : !PROFILE_PATH_EDEFAULT.equals(profilePath);
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
    result.append(" (baseServerName: ");
    result.append(baseServerName);
    result.append(", profilePath: ");
    result.append(profilePath);
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

} // WebsphereServerTaskImpl
