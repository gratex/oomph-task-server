/*
 * Copyright (c) 2014 Eike Stepper (Berlin, Germany) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Eike Stepper - initial API and implementation
 */
package com.gratex.oomph.task.server.impl;

import org.eclipse.oomph.setup.SetupTaskContext;
import org.eclipse.oomph.setup.impl.SetupTaskImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.gratex.oomph.task.server.ServerPackage;
import com.gratex.oomph.task.server.ServerTask;
import com.gratex.oomph.task.server.creator.ServerCreator;
import com.gratex.oomph.task.server.creator.impl.Tomcat7ServerCreator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Server Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.gratex.oomph.task.server.impl.ServerTaskImpl#getServerName <em>Server Name</em>}</li>
 *   <li>{@link com.gratex.oomph.task.server.impl.ServerTaskImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link com.gratex.oomph.task.server.impl.ServerTaskImpl#getRuntimeName <em>Runtime Name</em>}</li>
 *   <li>{@link com.gratex.oomph.task.server.impl.ServerTaskImpl#getJreVersion <em>Jre Version</em>}</li>
 *   <li>{@link com.gratex.oomph.task.server.impl.ServerTaskImpl#getHostname <em>Hostname</em>}</li>
 *   <li>{@link com.gratex.oomph.task.server.impl.ServerTaskImpl#getPort <em>Port</em>}</li>
 *   <li>{@link com.gratex.oomph.task.server.impl.ServerTaskImpl#getHttpsPort <em>Https Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServerTaskImpl extends SetupTaskImpl implements ServerTask
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
   * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPort()
   * @generated
   * @ordered
   */
  protected static final int PORT_EDEFAULT = 8080;

  /**
   * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPort()
   * @generated
   * @ordered
   */
  protected int port = PORT_EDEFAULT;

  /**
   * The default value of the '{@link #getHttpsPort() <em>Https Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHttpsPort()
   * @generated
   * @ordered
   */
  protected static final int HTTPS_PORT_EDEFAULT = 8443;

  /**
   * The cached value of the '{@link #getHttpsPort() <em>Https Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHttpsPort()
   * @generated
   * @ordered
   */
  protected int httpsPort = HTTPS_PORT_EDEFAULT;

  private static final int PRIORITY = PRIORITY_DEFAULT;

  private ServerCreator serverCreator;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ServerTaskImpl()
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
    return ServerPackage.Literals.SERVER_TASK;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.SERVER_TASK__SERVER_NAME, oldServerName, serverName));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.SERVER_TASK__LOCATION, oldLocation, location));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.SERVER_TASK__RUNTIME_NAME, oldRuntimeName, runtimeName));
    }
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
      eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.SERVER_TASK__JRE_VERSION, oldJreVersion, jreVersion));
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getPort()
  {
    return port;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPort(int newPort)
  {
    int oldPort = port;
    port = newPort;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.SERVER_TASK__PORT, oldPort, port));
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getHttpsPort()
  {
    return httpsPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setHttpsPort(int newHttpsPort)
  {
    int oldHttpsPort = httpsPort;
    httpsPort = newHttpsPort;
    if (eNotificationRequired())
    {
      eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.SERVER_TASK__HTTPS_PORT, oldHttpsPort, httpsPort));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.SERVER_TASK__HOSTNAME, oldHostname, hostname));
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
    case ServerPackage.SERVER_TASK__SERVER_NAME:
      return getServerName();
    case ServerPackage.SERVER_TASK__LOCATION:
      return getLocation();
    case ServerPackage.SERVER_TASK__RUNTIME_NAME:
      return getRuntimeName();
    case ServerPackage.SERVER_TASK__JRE_VERSION:
      return getJreVersion();
    case ServerPackage.SERVER_TASK__HOSTNAME:
      return getHostname();
    case ServerPackage.SERVER_TASK__PORT:
      return getPort();
    case ServerPackage.SERVER_TASK__HTTPS_PORT:
      return getHttpsPort();
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
    case ServerPackage.SERVER_TASK__SERVER_NAME:
      setServerName((String)newValue);
      return;
    case ServerPackage.SERVER_TASK__LOCATION:
      setLocation((String)newValue);
      return;
    case ServerPackage.SERVER_TASK__RUNTIME_NAME:
      setRuntimeName((String)newValue);
      return;
    case ServerPackage.SERVER_TASK__JRE_VERSION:
      setJreVersion((String)newValue);
      return;
    case ServerPackage.SERVER_TASK__HOSTNAME:
      setHostname((String)newValue);
      return;
    case ServerPackage.SERVER_TASK__PORT:
      setPort((Integer)newValue);
      return;
    case ServerPackage.SERVER_TASK__HTTPS_PORT:
      setHttpsPort((Integer)newValue);
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
    case ServerPackage.SERVER_TASK__SERVER_NAME:
      setServerName(SERVER_NAME_EDEFAULT);
      return;
    case ServerPackage.SERVER_TASK__LOCATION:
      setLocation(LOCATION_EDEFAULT);
      return;
    case ServerPackage.SERVER_TASK__RUNTIME_NAME:
      setRuntimeName(RUNTIME_NAME_EDEFAULT);
      return;
    case ServerPackage.SERVER_TASK__JRE_VERSION:
      setJreVersion(JRE_VERSION_EDEFAULT);
      return;
    case ServerPackage.SERVER_TASK__HOSTNAME:
      setHostname(HOSTNAME_EDEFAULT);
      return;
    case ServerPackage.SERVER_TASK__PORT:
      setPort(PORT_EDEFAULT);
      return;
    case ServerPackage.SERVER_TASK__HTTPS_PORT:
      setHttpsPort(HTTPS_PORT_EDEFAULT);
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
    case ServerPackage.SERVER_TASK__SERVER_NAME:
      return SERVER_NAME_EDEFAULT == null ? serverName != null : !SERVER_NAME_EDEFAULT.equals(serverName);
    case ServerPackage.SERVER_TASK__LOCATION:
      return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
    case ServerPackage.SERVER_TASK__RUNTIME_NAME:
      return RUNTIME_NAME_EDEFAULT == null ? runtimeName != null : !RUNTIME_NAME_EDEFAULT.equals(runtimeName);
    case ServerPackage.SERVER_TASK__JRE_VERSION:
      return JRE_VERSION_EDEFAULT == null ? jreVersion != null : !JRE_VERSION_EDEFAULT.equals(jreVersion);
    case ServerPackage.SERVER_TASK__HOSTNAME:
      return HOSTNAME_EDEFAULT == null ? hostname != null : !HOSTNAME_EDEFAULT.equals(hostname);
    case ServerPackage.SERVER_TASK__PORT:
      return port != PORT_EDEFAULT;
    case ServerPackage.SERVER_TASK__HTTPS_PORT:
      return httpsPort != HTTPS_PORT_EDEFAULT;
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
    result.append(", jreVersion: ");
    result.append(jreVersion);
    result.append(", hostname: ");
    result.append(hostname);
    result.append(", port: ");
    result.append(port);
    result.append(", httpsPort: ");
    result.append(httpsPort);
    result.append(')');
    return result.toString();
  }

  @Override
  public int getPriority()
  {
    return PRIORITY;
  }

  @Override
  public boolean isNeeded(SetupTaskContext context) throws Exception
  {
    serverCreator = new Tomcat7ServerCreator(context, this);
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

} // ServerTaskImpl
