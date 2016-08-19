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
package com.gratex.oomph.task.server;

import org.eclipse.oomph.setup.SetupTask;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Server Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.gratex.oomph.task.server.ServerTask#getServerName <em>Server Name</em>}</li>
 *   <li>{@link com.gratex.oomph.task.server.ServerTask#getLocation <em>Location</em>}</li>
 *   <li>{@link com.gratex.oomph.task.server.ServerTask#getRuntimeName <em>Runtime Name</em>}</li>
 *   <li>{@link com.gratex.oomph.task.server.ServerTask#getJreVersion <em>Jre Version</em>}</li>
 *   <li>{@link com.gratex.oomph.task.server.ServerTask#getHostname <em>Hostname</em>}</li>
 *   <li>{@link com.gratex.oomph.task.server.ServerTask#getPort <em>Port</em>}</li>
 *   <li>{@link com.gratex.oomph.task.server.ServerTask#getHttpsPort <em>Https Port</em>}</li>
 * </ul>
 *
 * @see com.gratex.oomph.task.server.ServerPackage#getServerTask()
 * @model annotation="http://www.eclipse.org/oomph/setup/Enablement variableName='p2.server' repository='https://gratex.github.io/oomph-task-server/repository/' installableUnits='com.gratex.oomph.task.server.feature.feature.group'"
 *        annotation="http://www.eclipse.org/oomph/setup/ValidTriggers triggers='BOOTSTRAP STARTUP MANUAL'"
 * @generated
 */
public interface ServerTask extends SetupTask
{

  /**
   * Returns the value of the '<em><b>Server Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Server Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Server Name</em>' attribute.
   * @see #setServerName(String)
   * @see com.gratex.oomph.task.server.ServerPackage#getServerTask_ServerName()
   * @model required="true"
   * @generated
   */
  String getServerName();

  /**
   * Sets the value of the '{@link com.gratex.oomph.task.server.ServerTask#getServerName <em>Server Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Server Name</em>' attribute.
   * @see #getServerName()
   * @generated
   */
  void setServerName(String value);

  /**
   * Returns the value of the '<em><b>Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Location</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Location</em>' attribute.
   * @see #setLocation(String)
   * @see com.gratex.oomph.task.server.ServerPackage#getServerTask_Location()
   * @model required="true"
   * @generated
   */
  String getLocation();

  /**
   * Sets the value of the '{@link com.gratex.oomph.task.server.ServerTask#getLocation <em>Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Location</em>' attribute.
   * @see #getLocation()
   * @generated
   */
  void setLocation(String value);

  /**
   * Returns the value of the '<em><b>Runtime Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Runtime Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Runtime Name</em>' attribute.
   * @see #setRuntimeName(String)
   * @see com.gratex.oomph.task.server.ServerPackage#getServerTask_RuntimeName()
   * @model required="true"
   * @generated
   */
  String getRuntimeName();

  /**
   * Sets the value of the '{@link com.gratex.oomph.task.server.ServerTask#getRuntimeName <em>Runtime Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Runtime Name</em>' attribute.
   * @see #getRuntimeName()
   * @generated
   */
  void setRuntimeName(String value);

  /**
   * Returns the value of the '<em><b>Jre Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Jre Version</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Jre Version</em>' attribute.
   * @see #setJreVersion(String)
   * @see com.gratex.oomph.task.server.ServerPackage#getServerTask_JreVersion()
   * @model required="true"
   * @generated
   */
  String getJreVersion();

  /**
   * Sets the value of the '{@link com.gratex.oomph.task.server.ServerTask#getJreVersion <em>Jre Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Jre Version</em>' attribute.
   * @see #getJreVersion()
   * @generated
   */
  void setJreVersion(String value);

  /**
   * Returns the value of the '<em><b>Port</b></em>' attribute.
   * The default value is <code>"8080"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Port</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Port</em>' attribute.
   * @see #setPort(int)
   * @see com.gratex.oomph.task.server.ServerPackage#getServerTask_Port()
   * @model default="8080" required="true"
   * @generated
   */
  int getPort();

  /**
   * Sets the value of the '{@link com.gratex.oomph.task.server.ServerTask#getPort <em>Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Port</em>' attribute.
   * @see #getPort()
   * @generated
   */
  void setPort(int value);

  /**
   * Returns the value of the '<em><b>Https Port</b></em>' attribute.
   * The default value is <code>"8443"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Https Port</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Https Port</em>' attribute.
   * @see #setHttpsPort(int)
   * @see com.gratex.oomph.task.server.ServerPackage#getServerTask_HttpsPort()
   * @model default="8443" required="true"
   * @generated
   */
  int getHttpsPort();

  /**
   * Sets the value of the '{@link com.gratex.oomph.task.server.ServerTask#getHttpsPort <em>Https Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Https Port</em>' attribute.
   * @see #getHttpsPort()
   * @generated
   */
  void setHttpsPort(int value);

  /**
   * Returns the value of the '<em><b>Hostname</b></em>' attribute.
   * The default value is <code>"localhost"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hostname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hostname</em>' attribute.
   * @see #setHostname(String)
   * @see com.gratex.oomph.task.server.ServerPackage#getServerTask_Hostname()
   * @model default="localhost" required="true"
   * @generated
   */
  String getHostname();

  /**
   * Sets the value of the '{@link com.gratex.oomph.task.server.ServerTask#getHostname <em>Hostname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hostname</em>' attribute.
   * @see #getHostname()
   * @generated
   */
  void setHostname(String value);

} // ServerTask
