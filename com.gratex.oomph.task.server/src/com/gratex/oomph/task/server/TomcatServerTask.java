/**
 */
package com.gratex.oomph.task.server;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tomcat Server Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.gratex.oomph.task.server.TomcatServerTask#getJreVersion <em>Jre Version</em>}</li>
 *   <li>{@link com.gratex.oomph.task.server.TomcatServerTask#getPort <em>Port</em>}</li>
 *   <li>{@link com.gratex.oomph.task.server.TomcatServerTask#getHttpsPort <em>Https Port</em>}</li>
 *   <li>{@link com.gratex.oomph.task.server.TomcatServerTask#getServerVersion <em>Server Version</em>}</li>
 *   <li>{@link com.gratex.oomph.task.server.TomcatServerTask#getLaunchProgramArgs <em>Launch Program Args</em>}</li>
 *   <li>{@link com.gratex.oomph.task.server.TomcatServerTask#getLaunchVmArgs <em>Launch Vm Args</em>}</li>
 * </ul>
 *
 * @see com.gratex.oomph.task.server.ServerPackage#getTomcatServerTask()
 * @model annotation="http://www.eclipse.org/oomph/setup/Enablement variableName='p2.server' repository='https://gratex.github.io/oomph-task-server/repository/' installableUnits='com.gratex.oomph.task.server.feature.feature.group'"
 *        annotation="http://www.eclipse.org/oomph/setup/ValidTriggers triggers='BOOTSTRAP STARTUP MANUAL'"
 * @generated
 */
public interface TomcatServerTask extends Server
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
   * @see com.gratex.oomph.task.server.ServerPackage#getTomcatServerTask_JreVersion()
   * @model required="true"
   * @generated
   */
  String getJreVersion();

  /**
   * Sets the value of the '{@link com.gratex.oomph.task.server.TomcatServerTask#getJreVersion <em>Jre Version</em>}' attribute.
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
   * @see #setPort(Integer)
   * @see com.gratex.oomph.task.server.ServerPackage#getTomcatServerTask_Port()
   * @model default="8080" required="true"
   * @generated
   */
  Integer getPort();

  /**
   * Sets the value of the '{@link com.gratex.oomph.task.server.TomcatServerTask#getPort <em>Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Port</em>' attribute.
   * @see #getPort()
   * @generated
   */
  void setPort(Integer value);

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
  	 * @see #setHttpsPort(Integer)
  	 * @see com.gratex.oomph.task.server.ServerPackage#getTomcatServerTask_HttpsPort()
  	 * @model default="8443" required="true"
  	 * @generated
  	 */
  Integer getHttpsPort();

  /**
   * Sets the value of the '{@link com.gratex.oomph.task.server.TomcatServerTask#getHttpsPort <em>Https Port</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Https Port</em>' attribute.
   * @see #getHttpsPort()
   * @generated
   */
  void setHttpsPort(Integer value);

  /**
  	 * Returns the value of the '<em><b>Server Version</b></em>' attribute.
  	 * The literals are from the enumeration {@link com.gratex.oomph.task.server.TomcatServerVersion}.
  	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Server Version</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
  	 * @return the value of the '<em>Server Version</em>' attribute.
  	 * @see com.gratex.oomph.task.server.TomcatServerVersion
  	 * @see #setServerVersion(TomcatServerVersion)
  	 * @see com.gratex.oomph.task.server.ServerPackage#getTomcatServerTask_ServerVersion()
  	 * @model required="true"
  	 * @generated
  	 */
  TomcatServerVersion getServerVersion();

  /**
   * Sets the value of the '{@link com.gratex.oomph.task.server.TomcatServerTask#getServerVersion <em>Server Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Server Version</em>' attribute.
   * @see com.gratex.oomph.task.server.TomcatServerVersion
   * @see #getServerVersion()
   * @generated
   */
  void setServerVersion(TomcatServerVersion value);

  /**
   * Returns the value of the '<em><b>Launch Program Args</b></em>' attribute.
   * The default value is <code>""</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Launch Program Args</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Launch Program Args</em>' attribute.
   * @see #setLaunchProgramArgs(String)
   * @see com.gratex.oomph.task.server.ServerPackage#getTomcatServerTask_LaunchProgramArgs()
   * @model default=""
   * @generated
   */
  String getLaunchProgramArgs();

  /**
   * Sets the value of the '{@link com.gratex.oomph.task.server.TomcatServerTask#getLaunchProgramArgs <em>Launch Program Args</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Launch Program Args</em>' attribute.
   * @see #getLaunchProgramArgs()
   * @generated
   */
  void setLaunchProgramArgs(String value);

  /**
   * Returns the value of the '<em><b>Launch Vm Args</b></em>' attribute.
   * The default value is <code>""</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Launch Vm Args</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Launch Vm Args</em>' attribute.
   * @see #setLaunchVmArgs(String)
   * @see com.gratex.oomph.task.server.ServerPackage#getTomcatServerTask_LaunchVmArgs()
   * @model default=""
   * @generated
   */
  String getLaunchVmArgs();

  /**
   * Sets the value of the '{@link com.gratex.oomph.task.server.TomcatServerTask#getLaunchVmArgs <em>Launch Vm Args</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Launch Vm Args</em>' attribute.
   * @see #getLaunchVmArgs()
   * @generated
   */
  void setLaunchVmArgs(String value);

} // TomcatServerTask
