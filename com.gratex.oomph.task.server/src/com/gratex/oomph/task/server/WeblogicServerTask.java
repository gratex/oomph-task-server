/**
 */
package com.gratex.oomph.task.server;

import org.eclipse.oomph.setup.SetupTask;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Weblogic Server Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.gratex.oomph.task.server.WeblogicServerTask#getServerName <em>Server Name</em>}</li>
 *   <li>{@link com.gratex.oomph.task.server.WeblogicServerTask#getLocation <em>Location</em>}</li>
 *   <li>{@link com.gratex.oomph.task.server.WeblogicServerTask#getRuntimeName <em>Runtime Name</em>}</li>
 *   <li>{@link com.gratex.oomph.task.server.WeblogicServerTask#getJreVersion <em>Jre Version</em>}</li>
 *   <li>{@link com.gratex.oomph.task.server.WeblogicServerTask#getHostname <em>Hostname</em>}</li>
 *   <li>{@link com.gratex.oomph.task.server.WeblogicServerTask#getPort <em>Port</em>}</li>
 *   <li>{@link com.gratex.oomph.task.server.WeblogicServerTask#getHttpsPort <em>Https Port</em>}</li>
 *   <li>{@link com.gratex.oomph.task.server.WeblogicServerTask#getDebugPort <em>Debug Port</em>}</li>
 *   <li>{@link com.gratex.oomph.task.server.WeblogicServerTask#getUsername <em>Username</em>}</li>
 *   <li>{@link com.gratex.oomph.task.server.WeblogicServerTask#getPassword <em>Password</em>}</li>
 * </ul>
 *
 * @see com.gratex.oomph.task.server.ServerPackage#getWeblogicServerTask()
 * @model annotation="http://www.eclipse.org/oomph/setup/Enablement variableName='p2.server' repository='https://github.com/gratex/oomph-task-server/releases/download/v1.0.0/com.gratex.oomph.task.server.site-1.0.0-SNAPSHOT.zip' installableUnits='com.gratex.oomph.task.server.feature.group'"
 *        annotation="http://www.eclipse.org/oomph/setup/ValidTriggers triggers='BOOTSTRAP STARTUP MANUAL'"
 * @generated
 */
public interface WeblogicServerTask extends SetupTask
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
   * @see com.gratex.oomph.task.server.ServerPackage#getWeblogicServerTask_ServerName()
   * @model required="true"
   * @generated
   */
  String getServerName();

  /**
   * Sets the value of the '{@link com.gratex.oomph.task.server.WeblogicServerTask#getServerName <em>Server Name</em>}' attribute.
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
   * @see com.gratex.oomph.task.server.ServerPackage#getWeblogicServerTask_Location()
   * @model required="true"
   * @generated
   */
  String getLocation();

  /**
   * Sets the value of the '{@link com.gratex.oomph.task.server.WeblogicServerTask#getLocation <em>Location</em>}' attribute.
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
   * @see com.gratex.oomph.task.server.ServerPackage#getWeblogicServerTask_RuntimeName()
   * @model required="true"
   * @generated
   */
  String getRuntimeName();

  /**
   * Sets the value of the '{@link com.gratex.oomph.task.server.WeblogicServerTask#getRuntimeName <em>Runtime Name</em>}' attribute.
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
   * @see com.gratex.oomph.task.server.ServerPackage#getWeblogicServerTask_JreVersion()
   * @model required="true"
   * @generated
   */
  String getJreVersion();

  /**
   * Sets the value of the '{@link com.gratex.oomph.task.server.WeblogicServerTask#getJreVersion <em>Jre Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Jre Version</em>' attribute.
   * @see #getJreVersion()
   * @generated
   */
  void setJreVersion(String value);

  /**
   * Returns the value of the '<em><b>Port</b></em>' attribute.
   * The default value is <code>"7001"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Port</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Port</em>' attribute.
   * @see #setPort(int)
   * @see com.gratex.oomph.task.server.ServerPackage#getWeblogicServerTask_Port()
   * @model default="7001" required="true"
   * @generated
   */
  int getPort();

  /**
   * Sets the value of the '{@link com.gratex.oomph.task.server.WeblogicServerTask#getPort <em>Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Port</em>' attribute.
   * @see #getPort()
   * @generated
   */
  void setPort(int value);

  /**
   * Returns the value of the '<em><b>Https Port</b></em>' attribute.
   * The default value is <code>"7002"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Https Port</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Https Port</em>' attribute.
   * @see #setHttpsPort(int)
   * @see com.gratex.oomph.task.server.ServerPackage#getWeblogicServerTask_HttpsPort()
   * @model default="7002" required="true"
   * @generated
   */
  int getHttpsPort();

  /**
   * Sets the value of the '{@link com.gratex.oomph.task.server.WeblogicServerTask#getHttpsPort <em>Https Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Https Port</em>' attribute.
   * @see #getHttpsPort()
   * @generated
   */
  void setHttpsPort(int value);

  /**
   * Returns the value of the '<em><b>Debug Port</b></em>' attribute.
   * The default value is <code>"8453"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Debug Port</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Debug Port</em>' attribute.
   * @see #setDebugPort(int)
   * @see com.gratex.oomph.task.server.ServerPackage#getWeblogicServerTask_DebugPort()
   * @model default="8453"
   * @generated
   */
  int getDebugPort();

  /**
   * Sets the value of the '{@link com.gratex.oomph.task.server.WeblogicServerTask#getDebugPort <em>Debug Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Debug Port</em>' attribute.
   * @see #getDebugPort()
   * @generated
   */
  void setDebugPort(int value);

  /**
   * Returns the value of the '<em><b>Username</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Username</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Username</em>' attribute.
   * @see #setUsername(String)
   * @see com.gratex.oomph.task.server.ServerPackage#getWeblogicServerTask_Username()
   * @model
   * @generated
   */
  String getUsername();

  /**
   * Sets the value of the '{@link com.gratex.oomph.task.server.WeblogicServerTask#getUsername <em>Username</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Username</em>' attribute.
   * @see #getUsername()
   * @generated
   */
  void setUsername(String value);

  /**
   * Returns the value of the '<em><b>Password</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Password</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Password</em>' attribute.
   * @see #setPassword(String)
   * @see com.gratex.oomph.task.server.ServerPackage#getWeblogicServerTask_Password()
   * @model
   * @generated
   */
  String getPassword();

  /**
   * Sets the value of the '{@link com.gratex.oomph.task.server.WeblogicServerTask#getPassword <em>Password</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Password</em>' attribute.
   * @see #getPassword()
   * @generated
   */
  void setPassword(String value);

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
   * @see com.gratex.oomph.task.server.ServerPackage#getWeblogicServerTask_Hostname()
   * @model default="localhost" required="true"
   * @generated
   */
  String getHostname();

  /**
   * Sets the value of the '{@link com.gratex.oomph.task.server.WeblogicServerTask#getHostname <em>Hostname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hostname</em>' attribute.
   * @see #getHostname()
   * @generated
   */
  void setHostname(String value);

} // WeblogicServerTask
