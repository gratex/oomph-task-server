/**
 */
package com.gratex.oomph.task.server.impl;

import org.eclipse.oomph.setup.SetupTaskContext;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.gratex.oomph.task.server.ServerPackage;
import com.gratex.oomph.task.server.WeblogicServerTask;
import com.gratex.oomph.task.server.creator.impl.Weblogic12c13ServerCreator;
import com.gratex.oomph.task.utils.Convert;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Weblogic Server Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.gratex.oomph.task.server.impl.WeblogicServerTaskImpl#getJreVersion <em>Jre Version</em>}</li>
 *   <li>{@link com.gratex.oomph.task.server.impl.WeblogicServerTaskImpl#getPort <em>Port</em>}</li>
 *   <li>{@link com.gratex.oomph.task.server.impl.WeblogicServerTaskImpl#getHttpsPort <em>Https Port</em>}</li>
 *   <li>{@link com.gratex.oomph.task.server.impl.WeblogicServerTaskImpl#getDebugPort <em>Debug Port</em>}</li>
 *   <li>{@link com.gratex.oomph.task.server.impl.WeblogicServerTaskImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link com.gratex.oomph.task.server.impl.WeblogicServerTaskImpl#getPassword <em>Password</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WeblogicServerTaskImpl extends ServerImpl implements WeblogicServerTask
{
  /**
   * The default value of the '{@link #getJreVersion() <em>Jre Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJreVersion()
   * @generated
   * @ordered
   */
  protected static final String JRE_VERSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getJreVersion() <em>Jre Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJreVersion()
   * @generated
   * @ordered
   */
  protected String jreVersion = JRE_VERSION_EDEFAULT;

  /**
   * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPort()
   * @generated
   * @ordered
   */
  protected static final String PORT_EDEFAULT = "7001";

  /**
   * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPort()
   * @generated
   * @ordered
   */
  protected String port = PORT_EDEFAULT;

  /**
   * The default value of the '{@link #getHttpsPort() <em>Https Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHttpsPort()
   * @generated
   * @ordered
   */
  protected static final String HTTPS_PORT_EDEFAULT = "7002";

  /**
   * The cached value of the '{@link #getHttpsPort() <em>Https Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHttpsPort()
   * @generated
   * @ordered
   */
  protected String httpsPort = HTTPS_PORT_EDEFAULT;

  /**
   * The default value of the '{@link #getDebugPort() <em>Debug Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDebugPort()
   * @generated
   * @ordered
   */
  protected static final String DEBUG_PORT_EDEFAULT = "8453";

  /**
   * The cached value of the '{@link #getDebugPort() <em>Debug Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDebugPort()
   * @generated
   * @ordered
   */
  protected String debugPort = DEBUG_PORT_EDEFAULT;

  /**
   * The default value of the '{@link #getUsername() <em>Username</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUsername()
   * @generated
   * @ordered
   */
  protected static final String USERNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUsername() <em>Username</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUsername()
   * @generated
   * @ordered
   */
  protected String username = USERNAME_EDEFAULT;

  /**
   * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPassword()
   * @generated
   * @ordered
   */
  protected static final String PASSWORD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPassword()
   * @generated
   * @ordered
   */
  protected String password = PASSWORD_EDEFAULT;

  private Weblogic12c13ServerCreator serverCreator;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WeblogicServerTaskImpl()
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
    return ServerPackage.Literals.WEBLOGIC_SERVER_TASK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getJreVersion()
  {
    return jreVersion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setJreVersion(String newJreVersion)
  {
    String oldJreVersion = jreVersion;
    jreVersion = newJreVersion;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.WEBLOGIC_SERVER_TASK__JRE_VERSION, oldJreVersion, jreVersion));
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getPort()
  {
    return port;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPort(String newPort)
  {
    String oldPort = port;
    port = newPort;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.WEBLOGIC_SERVER_TASK__PORT, oldPort, port));
    }
  }

  /*
   * (non-Javadoc)
   * @see com.gratex.oomph.task.server.WeblogicServerTask#port()
   */
  @Override
  public Integer port()
  {
    return Convert.toInteger(getPort());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getHttpsPort()
  {
    return httpsPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setHttpsPort(String newHttpsPort)
  {
    String oldHttpsPort = httpsPort;
    httpsPort = newHttpsPort;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.WEBLOGIC_SERVER_TASK__HTTPS_PORT, oldHttpsPort, httpsPort));
    }
  }

  /*
   * (non-Javadoc)
   * @see com.gratex.oomph.task.server.WeblogicServerTask#httpsPort()
   */
  @Override
  public Integer httpsPort()
  {
    return Convert.toInteger(getHttpsPort());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getDebugPort()
  {
    return debugPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDebugPort(String newDebugPort)
  {
    String oldDebugPort = debugPort;
    debugPort = newDebugPort;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.WEBLOGIC_SERVER_TASK__DEBUG_PORT, oldDebugPort, debugPort));
    }
  }

  /*
   * (non-Javadoc)
   * @see com.gratex.oomph.task.server.WeblogicServerTask#debugPort()
   */
  @Override
  public Integer debugPort()
  {
    return Convert.toInteger(getDebugPort());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getUsername()
  {
    return username;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setUsername(String newUsername)
  {
    String oldUsername = username;
    username = newUsername;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.WEBLOGIC_SERVER_TASK__USERNAME, oldUsername, username));
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getPassword()
  {
    return password;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPassword(String newPassword)
  {
    String oldPassword = password;
    password = newPassword;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.WEBLOGIC_SERVER_TASK__PASSWORD, oldPassword, password));
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
    case ServerPackage.WEBLOGIC_SERVER_TASK__JRE_VERSION:
      return getJreVersion();
    case ServerPackage.WEBLOGIC_SERVER_TASK__PORT:
      return getPort();
    case ServerPackage.WEBLOGIC_SERVER_TASK__HTTPS_PORT:
      return getHttpsPort();
    case ServerPackage.WEBLOGIC_SERVER_TASK__DEBUG_PORT:
      return getDebugPort();
    case ServerPackage.WEBLOGIC_SERVER_TASK__USERNAME:
      return getUsername();
    case ServerPackage.WEBLOGIC_SERVER_TASK__PASSWORD:
      return getPassword();
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
    case ServerPackage.WEBLOGIC_SERVER_TASK__JRE_VERSION:
      setJreVersion((String)newValue);
      return;
    case ServerPackage.WEBLOGIC_SERVER_TASK__PORT:
      setPort((String)newValue);
      return;
    case ServerPackage.WEBLOGIC_SERVER_TASK__HTTPS_PORT:
      setHttpsPort((String)newValue);
      return;
    case ServerPackage.WEBLOGIC_SERVER_TASK__DEBUG_PORT:
      setDebugPort((String)newValue);
      return;
    case ServerPackage.WEBLOGIC_SERVER_TASK__USERNAME:
      setUsername((String)newValue);
      return;
    case ServerPackage.WEBLOGIC_SERVER_TASK__PASSWORD:
      setPassword((String)newValue);
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
    case ServerPackage.WEBLOGIC_SERVER_TASK__JRE_VERSION:
      setJreVersion(JRE_VERSION_EDEFAULT);
      return;
    case ServerPackage.WEBLOGIC_SERVER_TASK__PORT:
      setPort(PORT_EDEFAULT);
      return;
    case ServerPackage.WEBLOGIC_SERVER_TASK__HTTPS_PORT:
      setHttpsPort(HTTPS_PORT_EDEFAULT);
      return;
    case ServerPackage.WEBLOGIC_SERVER_TASK__DEBUG_PORT:
      setDebugPort(DEBUG_PORT_EDEFAULT);
      return;
    case ServerPackage.WEBLOGIC_SERVER_TASK__USERNAME:
      setUsername(USERNAME_EDEFAULT);
      return;
    case ServerPackage.WEBLOGIC_SERVER_TASK__PASSWORD:
      setPassword(PASSWORD_EDEFAULT);
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
    case ServerPackage.WEBLOGIC_SERVER_TASK__JRE_VERSION:
      return JRE_VERSION_EDEFAULT == null ? jreVersion != null : !JRE_VERSION_EDEFAULT.equals(jreVersion);
    case ServerPackage.WEBLOGIC_SERVER_TASK__PORT:
      return PORT_EDEFAULT == null ? port != null : !PORT_EDEFAULT.equals(port);
    case ServerPackage.WEBLOGIC_SERVER_TASK__HTTPS_PORT:
      return HTTPS_PORT_EDEFAULT == null ? httpsPort != null : !HTTPS_PORT_EDEFAULT.equals(httpsPort);
    case ServerPackage.WEBLOGIC_SERVER_TASK__DEBUG_PORT:
      return DEBUG_PORT_EDEFAULT == null ? debugPort != null : !DEBUG_PORT_EDEFAULT.equals(debugPort);
    case ServerPackage.WEBLOGIC_SERVER_TASK__USERNAME:
      return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
    case ServerPackage.WEBLOGIC_SERVER_TASK__PASSWORD:
      return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (jreVersion: ");
    result.append(jreVersion);
    result.append(", port: ");
    result.append(port);
    result.append(", httpsPort: ");
    result.append(httpsPort);
    result.append(", debugPort: ");
    result.append(debugPort);
    result.append(", username: ");
    result.append(username);
    result.append(", password: ");
    result.append(password);
    result.append(')');
    return result.toString();
  }

  @Override
  public boolean isNeeded(SetupTaskContext context) throws Exception
  {
    serverCreator = new Weblogic12c13ServerCreator(context, this);
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

} // WeblogicServerTaskImpl
