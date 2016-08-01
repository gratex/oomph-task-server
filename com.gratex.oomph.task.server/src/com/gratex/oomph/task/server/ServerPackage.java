/**
 */
package com.gratex.oomph.task.server;

import org.eclipse.oomph.setup.SetupPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.gratex.oomph.task.server.ServerFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore schemaLocation='http://www.gratex.com/oomph/task/server/schemas/Server-1.0.ecore'"
 * @generated
 */
public interface ServerPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "server";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.gratex.com/oomph/task/server/1.0";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "server";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ServerPackage eINSTANCE = com.gratex.oomph.task.server.impl.ServerPackageImpl.init();

  /**
   * The meta object id for the '{@link com.gratex.oomph.task.server.impl.ServerTaskImpl <em>Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.gratex.oomph.task.server.impl.ServerTaskImpl
   * @see com.gratex.oomph.task.server.impl.ServerPackageImpl#getServerTask()
   * @generated
   */
  int SERVER_TASK = 0;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER_TASK__ANNOTATIONS = SetupPackage.SETUP_TASK__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER_TASK__ID = SetupPackage.SETUP_TASK__ID;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER_TASK__DESCRIPTION = SetupPackage.SETUP_TASK__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Scope Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER_TASK__SCOPE_TYPE = SetupPackage.SETUP_TASK__SCOPE_TYPE;

  /**
   * The feature id for the '<em><b>Excluded Triggers</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER_TASK__EXCLUDED_TRIGGERS = SetupPackage.SETUP_TASK__EXCLUDED_TRIGGERS;

  /**
   * The feature id for the '<em><b>Disabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER_TASK__DISABLED = SetupPackage.SETUP_TASK__DISABLED;

  /**
   * The feature id for the '<em><b>Predecessors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER_TASK__PREDECESSORS = SetupPackage.SETUP_TASK__PREDECESSORS;

  /**
   * The feature id for the '<em><b>Successors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER_TASK__SUCCESSORS = SetupPackage.SETUP_TASK__SUCCESSORS;

  /**
   * The feature id for the '<em><b>Restrictions</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER_TASK__RESTRICTIONS = SetupPackage.SETUP_TASK__RESTRICTIONS;

  /**
   * The feature id for the '<em><b>Filter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER_TASK__FILTER = SetupPackage.SETUP_TASK__FILTER;

  /**
   * The feature id for the '<em><b>Server Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER_TASK__SERVER_NAME = SetupPackage.SETUP_TASK_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER_TASK__LOCATION = SetupPackage.SETUP_TASK_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Runtime Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER_TASK__RUNTIME_NAME = SetupPackage.SETUP_TASK_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Jre Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER_TASK__JRE_VERSION = SetupPackage.SETUP_TASK_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Hostname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER_TASK__HOSTNAME = SetupPackage.SETUP_TASK_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Port</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER_TASK__PORT = SetupPackage.SETUP_TASK_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Https Port</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER_TASK__HTTPS_PORT = SetupPackage.SETUP_TASK_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Task</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER_TASK_FEATURE_COUNT = SetupPackage.SETUP_TASK_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link com.gratex.oomph.task.server.impl.WeblogicServerTaskImpl <em>Weblogic Server Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.gratex.oomph.task.server.impl.WeblogicServerTaskImpl
   * @see com.gratex.oomph.task.server.impl.ServerPackageImpl#getWeblogicServerTask()
   * @generated
   */
  int WEBLOGIC_SERVER_TASK = 1;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEBLOGIC_SERVER_TASK__ANNOTATIONS = SetupPackage.SETUP_TASK__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEBLOGIC_SERVER_TASK__ID = SetupPackage.SETUP_TASK__ID;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEBLOGIC_SERVER_TASK__DESCRIPTION = SetupPackage.SETUP_TASK__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Scope Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEBLOGIC_SERVER_TASK__SCOPE_TYPE = SetupPackage.SETUP_TASK__SCOPE_TYPE;

  /**
   * The feature id for the '<em><b>Excluded Triggers</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEBLOGIC_SERVER_TASK__EXCLUDED_TRIGGERS = SetupPackage.SETUP_TASK__EXCLUDED_TRIGGERS;

  /**
   * The feature id for the '<em><b>Disabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEBLOGIC_SERVER_TASK__DISABLED = SetupPackage.SETUP_TASK__DISABLED;

  /**
   * The feature id for the '<em><b>Predecessors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEBLOGIC_SERVER_TASK__PREDECESSORS = SetupPackage.SETUP_TASK__PREDECESSORS;

  /**
   * The feature id for the '<em><b>Successors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEBLOGIC_SERVER_TASK__SUCCESSORS = SetupPackage.SETUP_TASK__SUCCESSORS;

  /**
   * The feature id for the '<em><b>Restrictions</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEBLOGIC_SERVER_TASK__RESTRICTIONS = SetupPackage.SETUP_TASK__RESTRICTIONS;

  /**
   * The feature id for the '<em><b>Filter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEBLOGIC_SERVER_TASK__FILTER = SetupPackage.SETUP_TASK__FILTER;

  /**
   * The feature id for the '<em><b>Server Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEBLOGIC_SERVER_TASK__SERVER_NAME = SetupPackage.SETUP_TASK_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEBLOGIC_SERVER_TASK__LOCATION = SetupPackage.SETUP_TASK_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Runtime Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEBLOGIC_SERVER_TASK__RUNTIME_NAME = SetupPackage.SETUP_TASK_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Jre Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEBLOGIC_SERVER_TASK__JRE_VERSION = SetupPackage.SETUP_TASK_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Hostname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEBLOGIC_SERVER_TASK__HOSTNAME = SetupPackage.SETUP_TASK_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Port</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEBLOGIC_SERVER_TASK__PORT = SetupPackage.SETUP_TASK_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Https Port</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEBLOGIC_SERVER_TASK__HTTPS_PORT = SetupPackage.SETUP_TASK_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Debug Port</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEBLOGIC_SERVER_TASK__DEBUG_PORT = SetupPackage.SETUP_TASK_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Username</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEBLOGIC_SERVER_TASK__USERNAME = SetupPackage.SETUP_TASK_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Password</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEBLOGIC_SERVER_TASK__PASSWORD = SetupPackage.SETUP_TASK_FEATURE_COUNT + 9;

  /**
   * The number of structural features of the '<em>Weblogic Server Task</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEBLOGIC_SERVER_TASK_FEATURE_COUNT = SetupPackage.SETUP_TASK_FEATURE_COUNT + 10;

  /**
   * Returns the meta object for class '{@link com.gratex.oomph.task.server.ServerTask <em>Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Task</em>'.
   * @see com.gratex.oomph.task.server.ServerTask
   * @generated
   */
  EClass getServerTask();

  /**
   * Returns the meta object for the attribute '{@link com.gratex.oomph.task.server.ServerTask#getServerName <em>Server Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Server Name</em>'.
   * @see com.gratex.oomph.task.server.ServerTask#getServerName()
   * @see #getServerTask()
   * @generated
   */
  EAttribute getServerTask_ServerName();

  /**
   * Returns the meta object for the attribute '{@link com.gratex.oomph.task.server.ServerTask#getLocation <em>Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Location</em>'.
   * @see com.gratex.oomph.task.server.ServerTask#getLocation()
   * @see #getServerTask()
   * @generated
   */
  EAttribute getServerTask_Location();

  /**
   * Returns the meta object for the attribute '{@link com.gratex.oomph.task.server.ServerTask#getRuntimeName <em>Runtime Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Runtime Name</em>'.
   * @see com.gratex.oomph.task.server.ServerTask#getRuntimeName()
   * @see #getServerTask()
   * @generated
   */
  EAttribute getServerTask_RuntimeName();

  /**
   * Returns the meta object for the attribute '{@link com.gratex.oomph.task.server.ServerTask#getJreVersion <em>Jre Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Jre Version</em>'.
   * @see com.gratex.oomph.task.server.ServerTask#getJreVersion()
   * @see #getServerTask()
   * @generated
   */
  EAttribute getServerTask_JreVersion();

  /**
   * Returns the meta object for the attribute '{@link com.gratex.oomph.task.server.ServerTask#getPort <em>Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Port</em>'.
   * @see com.gratex.oomph.task.server.ServerTask#getPort()
   * @see #getServerTask()
   * @generated
   */
  EAttribute getServerTask_Port();

  /**
   * Returns the meta object for the attribute '{@link com.gratex.oomph.task.server.ServerTask#getHttpsPort <em>Https Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Https Port</em>'.
   * @see com.gratex.oomph.task.server.ServerTask#getHttpsPort()
   * @see #getServerTask()
   * @generated
   */
  EAttribute getServerTask_HttpsPort();

  /**
   * Returns the meta object for the attribute '{@link com.gratex.oomph.task.server.ServerTask#getHostname <em>Hostname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hostname</em>'.
   * @see com.gratex.oomph.task.server.ServerTask#getHostname()
   * @see #getServerTask()
   * @generated
   */
  EAttribute getServerTask_Hostname();

  /**
   * Returns the meta object for class '{@link com.gratex.oomph.task.server.WeblogicServerTask <em>Weblogic Server Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Weblogic Server Task</em>'.
   * @see com.gratex.oomph.task.server.WeblogicServerTask
   * @generated
   */
  EClass getWeblogicServerTask();

  /**
   * Returns the meta object for the attribute '{@link com.gratex.oomph.task.server.WeblogicServerTask#getServerName <em>Server Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Server Name</em>'.
   * @see com.gratex.oomph.task.server.WeblogicServerTask#getServerName()
   * @see #getWeblogicServerTask()
   * @generated
   */
  EAttribute getWeblogicServerTask_ServerName();

  /**
   * Returns the meta object for the attribute '{@link com.gratex.oomph.task.server.WeblogicServerTask#getLocation <em>Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Location</em>'.
   * @see com.gratex.oomph.task.server.WeblogicServerTask#getLocation()
   * @see #getWeblogicServerTask()
   * @generated
   */
  EAttribute getWeblogicServerTask_Location();

  /**
   * Returns the meta object for the attribute '{@link com.gratex.oomph.task.server.WeblogicServerTask#getRuntimeName <em>Runtime Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Runtime Name</em>'.
   * @see com.gratex.oomph.task.server.WeblogicServerTask#getRuntimeName()
   * @see #getWeblogicServerTask()
   * @generated
   */
  EAttribute getWeblogicServerTask_RuntimeName();

  /**
   * Returns the meta object for the attribute '{@link com.gratex.oomph.task.server.WeblogicServerTask#getJreVersion <em>Jre Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Jre Version</em>'.
   * @see com.gratex.oomph.task.server.WeblogicServerTask#getJreVersion()
   * @see #getWeblogicServerTask()
   * @generated
   */
  EAttribute getWeblogicServerTask_JreVersion();

  /**
   * Returns the meta object for the attribute '{@link com.gratex.oomph.task.server.WeblogicServerTask#getPort <em>Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Port</em>'.
   * @see com.gratex.oomph.task.server.WeblogicServerTask#getPort()
   * @see #getWeblogicServerTask()
   * @generated
   */
  EAttribute getWeblogicServerTask_Port();

  /**
   * Returns the meta object for the attribute '{@link com.gratex.oomph.task.server.WeblogicServerTask#getHttpsPort <em>Https Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Https Port</em>'.
   * @see com.gratex.oomph.task.server.WeblogicServerTask#getHttpsPort()
   * @see #getWeblogicServerTask()
   * @generated
   */
  EAttribute getWeblogicServerTask_HttpsPort();

  /**
   * Returns the meta object for the attribute '{@link com.gratex.oomph.task.server.WeblogicServerTask#getDebugPort <em>Debug Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Debug Port</em>'.
   * @see com.gratex.oomph.task.server.WeblogicServerTask#getDebugPort()
   * @see #getWeblogicServerTask()
   * @generated
   */
  EAttribute getWeblogicServerTask_DebugPort();

  /**
   * Returns the meta object for the attribute '{@link com.gratex.oomph.task.server.WeblogicServerTask#getUsername <em>Username</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Username</em>'.
   * @see com.gratex.oomph.task.server.WeblogicServerTask#getUsername()
   * @see #getWeblogicServerTask()
   * @generated
   */
  EAttribute getWeblogicServerTask_Username();

  /**
   * Returns the meta object for the attribute '{@link com.gratex.oomph.task.server.WeblogicServerTask#getPassword <em>Password</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Password</em>'.
   * @see com.gratex.oomph.task.server.WeblogicServerTask#getPassword()
   * @see #getWeblogicServerTask()
   * @generated
   */
  EAttribute getWeblogicServerTask_Password();

  /**
   * Returns the meta object for the attribute '{@link com.gratex.oomph.task.server.WeblogicServerTask#getHostname <em>Hostname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hostname</em>'.
   * @see com.gratex.oomph.task.server.WeblogicServerTask#getHostname()
   * @see #getWeblogicServerTask()
   * @generated
   */
  EAttribute getWeblogicServerTask_Hostname();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ServerFactory getServerFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.gratex.oomph.task.server.impl.ServerTaskImpl <em>Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.gratex.oomph.task.server.impl.ServerTaskImpl
     * @see com.gratex.oomph.task.server.impl.ServerPackageImpl#getServerTask()
     * @generated
     */
    EClass SERVER_TASK = eINSTANCE.getServerTask();

    /**
     * The meta object literal for the '<em><b>Server Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVER_TASK__SERVER_NAME = eINSTANCE.getServerTask_ServerName();

    /**
     * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVER_TASK__LOCATION = eINSTANCE.getServerTask_Location();

    /**
     * The meta object literal for the '<em><b>Runtime Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVER_TASK__RUNTIME_NAME = eINSTANCE.getServerTask_RuntimeName();

    /**
     * The meta object literal for the '<em><b>Jre Version</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVER_TASK__JRE_VERSION = eINSTANCE.getServerTask_JreVersion();

    /**
     * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVER_TASK__PORT = eINSTANCE.getServerTask_Port();

    /**
     * The meta object literal for the '<em><b>Https Port</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVER_TASK__HTTPS_PORT = eINSTANCE.getServerTask_HttpsPort();

    /**
     * The meta object literal for the '<em><b>Hostname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVER_TASK__HOSTNAME = eINSTANCE.getServerTask_Hostname();

    /**
     * The meta object literal for the '{@link com.gratex.oomph.task.server.impl.WeblogicServerTaskImpl <em>Weblogic Server Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.gratex.oomph.task.server.impl.WeblogicServerTaskImpl
     * @see com.gratex.oomph.task.server.impl.ServerPackageImpl#getWeblogicServerTask()
     * @generated
     */
    EClass WEBLOGIC_SERVER_TASK = eINSTANCE.getWeblogicServerTask();

    /**
     * The meta object literal for the '<em><b>Server Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WEBLOGIC_SERVER_TASK__SERVER_NAME = eINSTANCE.getWeblogicServerTask_ServerName();

    /**
     * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WEBLOGIC_SERVER_TASK__LOCATION = eINSTANCE.getWeblogicServerTask_Location();

    /**
     * The meta object literal for the '<em><b>Runtime Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WEBLOGIC_SERVER_TASK__RUNTIME_NAME = eINSTANCE.getWeblogicServerTask_RuntimeName();

    /**
     * The meta object literal for the '<em><b>Jre Version</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WEBLOGIC_SERVER_TASK__JRE_VERSION = eINSTANCE.getWeblogicServerTask_JreVersion();

    /**
     * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WEBLOGIC_SERVER_TASK__PORT = eINSTANCE.getWeblogicServerTask_Port();

    /**
     * The meta object literal for the '<em><b>Https Port</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WEBLOGIC_SERVER_TASK__HTTPS_PORT = eINSTANCE.getWeblogicServerTask_HttpsPort();

    /**
     * The meta object literal for the '<em><b>Debug Port</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WEBLOGIC_SERVER_TASK__DEBUG_PORT = eINSTANCE.getWeblogicServerTask_DebugPort();

    /**
     * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WEBLOGIC_SERVER_TASK__USERNAME = eINSTANCE.getWeblogicServerTask_Username();

    /**
     * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WEBLOGIC_SERVER_TASK__PASSWORD = eINSTANCE.getWeblogicServerTask_Password();

    /**
     * The meta object literal for the '<em><b>Hostname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WEBLOGIC_SERVER_TASK__HOSTNAME = eINSTANCE.getWeblogicServerTask_Hostname();

  }

} // ServerPackage
