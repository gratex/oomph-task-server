/**
 */
package com.gratex.oomph.task.server;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Weblogic Server Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.gratex.oomph.task.server.WeblogicServerTask#getJreVersion <em>Jre Version</em>}</li>
 *   <li>{@link com.gratex.oomph.task.server.WeblogicServerTask#getPort <em>Port</em>}</li>
 *   <li>{@link com.gratex.oomph.task.server.WeblogicServerTask#getHttpsPort <em>Https Port</em>}</li>
 *   <li>{@link com.gratex.oomph.task.server.WeblogicServerTask#getDebugPort <em>Debug Port</em>}</li>
 *   <li>{@link com.gratex.oomph.task.server.WeblogicServerTask#getUsername <em>Username</em>}</li>
 *   <li>{@link com.gratex.oomph.task.server.WeblogicServerTask#getPassword <em>Password</em>}</li>
 * </ul>
 *
 * @see com.gratex.oomph.task.server.ServerPackage#getWeblogicServerTask()
 * @model annotation="http://www.eclipse.org/oomph/setup/Enablement variableName='p2.server' repository='https://gratex.github.io/oomph-task-server/repository/' installableUnits='com.gratex.oomph.task.server.feature.feature.group'"
 *        annotation="http://www.eclipse.org/oomph/setup/ValidTriggers triggers='BOOTSTRAP STARTUP MANUAL'"
 * @generated
 */
public interface WeblogicServerTask extends Server
{
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
   * @see #setPort(Integer)
   * @see com.gratex.oomph.task.server.ServerPackage#getWeblogicServerTask_Port()
   * @model default="7001" required="true"
   * @generated
   */
  Integer getPort();

  /**
   * Sets the value of the '{@link com.gratex.oomph.task.server.WeblogicServerTask#getPort <em>Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Port</em>' attribute.
   * @see #getPort()
   * @generated
   */
  void setPort(Integer value);

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
  	 * @see #setHttpsPort(Integer)
  	 * @see com.gratex.oomph.task.server.ServerPackage#getWeblogicServerTask_HttpsPort()
  	 * @model default="7002" required="true"
  	 * @generated
  	 */
  Integer getHttpsPort();

  /**
   * Sets the value of the '{@link com.gratex.oomph.task.server.WeblogicServerTask#getHttpsPort <em>Https Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Https Port</em>' attribute.
   * @see #getHttpsPort()
   * @generated
   */
  void setHttpsPort(Integer value);

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
  	 * @see #setDebugPort(Integer)
  	 * @see com.gratex.oomph.task.server.ServerPackage#getWeblogicServerTask_DebugPort()
  	 * @model default="8453"
  	 * @generated
  	 */
  Integer getDebugPort();

  /**
   * Sets the value of the '{@link com.gratex.oomph.task.server.WeblogicServerTask#getDebugPort <em>Debug Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Debug Port</em>' attribute.
   * @see #getDebugPort()
   * @generated
   */
  void setDebugPort(Integer value);

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

} // WeblogicServerTask
