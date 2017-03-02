/**
 */
package com.gratex.oomph.task.server.impl;

import org.eclipse.oomph.setup.impl.SetupTaskImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.gratex.oomph.task.server.Server;
import com.gratex.oomph.task.server.ServerPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Server</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.gratex.oomph.task.server.impl.ServerImpl#getServerName <em>Server Name</em>}</li>
 *   <li>{@link com.gratex.oomph.task.server.impl.ServerImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link com.gratex.oomph.task.server.impl.ServerImpl#getRuntimeName <em>Runtime Name</em>}</li>
 *   <li>{@link com.gratex.oomph.task.server.impl.ServerImpl#getHostname <em>Hostname</em>}</li>
 *   <li>{@link com.gratex.oomph.task.server.impl.ServerImpl#isCleanPreviousRuntimes <em>Clean Previous Runtimes</em>}</li>
 *   <li>{@link com.gratex.oomph.task.server.impl.ServerImpl#getStartTimeout <em>Start Timeout</em>}</li>
 *   <li>{@link com.gratex.oomph.task.server.impl.ServerImpl#getStopTimeout <em>Stop Timeout</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ServerImpl extends SetupTaskImpl implements Server
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
   * The default value of the '{@link #isCleanPreviousRuntimes() <em>Clean Previous Runtimes</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCleanPreviousRuntimes()
   * @generated
   * @ordered
   */
  protected static final boolean CLEAN_PREVIOUS_RUNTIMES_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isCleanPreviousRuntimes() <em>Clean Previous Runtimes</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCleanPreviousRuntimes()
   * @generated
   * @ordered
   */
  protected boolean cleanPreviousRuntimes = CLEAN_PREVIOUS_RUNTIMES_EDEFAULT;

  /**
   * The default value of the '{@link #getStartTimeout() <em>Start Timeout</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStartTimeout()
   * @generated
   * @ordered
   */
  protected static final Integer START_TIMEOUT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStartTimeout() <em>Start Timeout</em>}' attribute.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @see #getStartTimeout()
   * @generated
   * @ordered
   */
  protected Integer startTimeout = START_TIMEOUT_EDEFAULT;

  /**
   * The default value of the '{@link #getStopTimeout() <em>Stop Timeout</em>}' attribute.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @see #getStopTimeout()
   * @generated
   * @ordered
   */
  protected static final Integer STOP_TIMEOUT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStopTimeout() <em>Stop Timeout</em>}' attribute.
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @see #getStopTimeout()
   * @generated
   * @ordered
   */
  protected Integer stopTimeout = STOP_TIMEOUT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ServerImpl()
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
    return ServerPackage.Literals.SERVER;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.SERVER__SERVER_NAME, oldServerName, serverName));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.SERVER__LOCATION, oldLocation, location));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.SERVER__RUNTIME_NAME, oldRuntimeName, runtimeName));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.SERVER__HOSTNAME, oldHostname, hostname));
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isCleanPreviousRuntimes()
  {
    return cleanPreviousRuntimes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCleanPreviousRuntimes(boolean newCleanPreviousRuntimes)
  {
    boolean oldCleanPreviousRuntimes = cleanPreviousRuntimes;
    cleanPreviousRuntimes = newCleanPreviousRuntimes;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.SERVER__CLEAN_PREVIOUS_RUNTIMES, oldCleanPreviousRuntimes, cleanPreviousRuntimes));
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Integer getStartTimeout()
  {
    return startTimeout;
  }

  /**
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setStartTimeout(Integer newStartTimeout)
  {
    Integer oldStartTimeout = startTimeout;
    startTimeout = newStartTimeout;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.SERVER__START_TIMEOUT, oldStartTimeout, startTimeout));
    }
  }

  /**
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Integer getStopTimeout()
  {
    return stopTimeout;
  }

  /**
   * <!-- begin-user-doc -->
  	 * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setStopTimeout(Integer newStopTimeout)
  {
    Integer oldStopTimeout = stopTimeout;
    stopTimeout = newStopTimeout;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.SERVER__STOP_TIMEOUT, oldStopTimeout, stopTimeout));
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
    case ServerPackage.SERVER__SERVER_NAME:
      return getServerName();
    case ServerPackage.SERVER__LOCATION:
      return getLocation();
    case ServerPackage.SERVER__RUNTIME_NAME:
      return getRuntimeName();
    case ServerPackage.SERVER__HOSTNAME:
      return getHostname();
    case ServerPackage.SERVER__CLEAN_PREVIOUS_RUNTIMES:
      return isCleanPreviousRuntimes();
    case ServerPackage.SERVER__START_TIMEOUT:
      return getStartTimeout();
    case ServerPackage.SERVER__STOP_TIMEOUT:
      return getStopTimeout();
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
    case ServerPackage.SERVER__SERVER_NAME:
      setServerName((String)newValue);
      return;
    case ServerPackage.SERVER__LOCATION:
      setLocation((String)newValue);
      return;
    case ServerPackage.SERVER__RUNTIME_NAME:
      setRuntimeName((String)newValue);
      return;
    case ServerPackage.SERVER__HOSTNAME:
      setHostname((String)newValue);
      return;
    case ServerPackage.SERVER__CLEAN_PREVIOUS_RUNTIMES:
      setCleanPreviousRuntimes((Boolean)newValue);
      return;
    case ServerPackage.SERVER__START_TIMEOUT:
      setStartTimeout((Integer)newValue);
      return;
    case ServerPackage.SERVER__STOP_TIMEOUT:
      setStopTimeout((Integer)newValue);
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
    case ServerPackage.SERVER__SERVER_NAME:
      setServerName(SERVER_NAME_EDEFAULT);
      return;
    case ServerPackage.SERVER__LOCATION:
      setLocation(LOCATION_EDEFAULT);
      return;
    case ServerPackage.SERVER__RUNTIME_NAME:
      setRuntimeName(RUNTIME_NAME_EDEFAULT);
      return;
    case ServerPackage.SERVER__HOSTNAME:
      setHostname(HOSTNAME_EDEFAULT);
      return;
    case ServerPackage.SERVER__CLEAN_PREVIOUS_RUNTIMES:
      setCleanPreviousRuntimes(CLEAN_PREVIOUS_RUNTIMES_EDEFAULT);
      return;
    case ServerPackage.SERVER__START_TIMEOUT:
      setStartTimeout(START_TIMEOUT_EDEFAULT);
      return;
    case ServerPackage.SERVER__STOP_TIMEOUT:
      setStopTimeout(STOP_TIMEOUT_EDEFAULT);
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
    case ServerPackage.SERVER__SERVER_NAME:
      return SERVER_NAME_EDEFAULT == null ? serverName != null : !SERVER_NAME_EDEFAULT.equals(serverName);
    case ServerPackage.SERVER__LOCATION:
      return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
    case ServerPackage.SERVER__RUNTIME_NAME:
      return RUNTIME_NAME_EDEFAULT == null ? runtimeName != null : !RUNTIME_NAME_EDEFAULT.equals(runtimeName);
    case ServerPackage.SERVER__HOSTNAME:
      return HOSTNAME_EDEFAULT == null ? hostname != null : !HOSTNAME_EDEFAULT.equals(hostname);
    case ServerPackage.SERVER__CLEAN_PREVIOUS_RUNTIMES:
      return cleanPreviousRuntimes != CLEAN_PREVIOUS_RUNTIMES_EDEFAULT;
    case ServerPackage.SERVER__START_TIMEOUT:
      return START_TIMEOUT_EDEFAULT == null ? startTimeout != null : !START_TIMEOUT_EDEFAULT.equals(startTimeout);
    case ServerPackage.SERVER__STOP_TIMEOUT:
      return STOP_TIMEOUT_EDEFAULT == null ? stopTimeout != null : !STOP_TIMEOUT_EDEFAULT.equals(stopTimeout);
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
    result.append(", location: ");
    result.append(location);
    result.append(", runtimeName: ");
    result.append(runtimeName);
    result.append(", hostname: ");
    result.append(hostname);
    result.append(", cleanPreviousRuntimes: ");
    result.append(cleanPreviousRuntimes);
    result.append(", startTimeout: ");
    result.append(startTimeout);
    result.append(", stopTimeout: ");
    result.append(stopTimeout);
    result.append(')');
    return result.toString();
  }

} // ServerImpl
