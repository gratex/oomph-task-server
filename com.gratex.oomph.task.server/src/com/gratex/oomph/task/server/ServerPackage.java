/**
 */
package com.gratex.oomph.task.server;

import org.eclipse.oomph.setup.SetupPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 *        annotation="http://www.eclipse.org/emf/2002/Ecore schemaLocation='https://raw.githubusercontent.com/gratex/oomph-task-server/master/com.gratex.oomph.task.server/model/Server-1.0.ecore'"
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
   * The meta object id for the '{@link com.gratex.oomph.task.server.impl.ServerImpl <em>Server</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.gratex.oomph.task.server.impl.ServerImpl
   * @see com.gratex.oomph.task.server.impl.ServerPackageImpl#getServer()
   * @generated
   */
  int SERVER = 3;

  /**
   * The meta object id for the '{@link com.gratex.oomph.task.server.impl.TomcatServerTaskImpl <em>Tomcat Server Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.gratex.oomph.task.server.impl.TomcatServerTaskImpl
   * @see com.gratex.oomph.task.server.impl.ServerPackageImpl#getTomcatServerTask()
   * @generated
   */
  int TOMCAT_SERVER_TASK = 0;

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
   * The meta object id for the '{@link com.gratex.oomph.task.server.impl.WebsphereServerTaskImpl <em>Websphere Server Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.gratex.oomph.task.server.impl.WebsphereServerTaskImpl
   * @see com.gratex.oomph.task.server.impl.ServerPackageImpl#getWebsphereServerTask()
   * @generated
   */
  int WEBSPHERE_SERVER_TASK = 2;

  /**
   * The meta object id for the '{@link com.gratex.oomph.task.server.impl.ServerTaskContainerImpl <em>Task Container</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.gratex.oomph.task.server.impl.ServerTaskContainerImpl
   * @see com.gratex.oomph.task.server.impl.ServerPackageImpl#getServerTaskContainer()
   * @generated
   */
  int SERVER_TASK_CONTAINER = 4;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER_TASK_CONTAINER__ANNOTATIONS = SetupPackage.SETUP_TASK__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER_TASK_CONTAINER__ID = SetupPackage.SETUP_TASK__ID;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER_TASK_CONTAINER__DESCRIPTION = SetupPackage.SETUP_TASK__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Scope Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER_TASK_CONTAINER__SCOPE_TYPE = SetupPackage.SETUP_TASK__SCOPE_TYPE;

  /**
   * The feature id for the '<em><b>Excluded Triggers</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER_TASK_CONTAINER__EXCLUDED_TRIGGERS = SetupPackage.SETUP_TASK__EXCLUDED_TRIGGERS;

  /**
   * The feature id for the '<em><b>Disabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER_TASK_CONTAINER__DISABLED = SetupPackage.SETUP_TASK__DISABLED;

  /**
   * The feature id for the '<em><b>Predecessors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER_TASK_CONTAINER__PREDECESSORS = SetupPackage.SETUP_TASK__PREDECESSORS;

  /**
   * The feature id for the '<em><b>Successors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER_TASK_CONTAINER__SUCCESSORS = SetupPackage.SETUP_TASK__SUCCESSORS;

  /**
   * The feature id for the '<em><b>Restrictions</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER_TASK_CONTAINER__RESTRICTIONS = SetupPackage.SETUP_TASK__RESTRICTIONS;

  /**
   * The feature id for the '<em><b>Filter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER_TASK_CONTAINER__FILTER = SetupPackage.SETUP_TASK__FILTER;

  /**
   * The feature id for the '<em><b>Servers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER_TASK_CONTAINER__SERVERS = SetupPackage.SETUP_TASK_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Clean Previous Runtimes</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER_TASK_CONTAINER__CLEAN_PREVIOUS_RUNTIMES = SetupPackage.SETUP_TASK_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Task Container</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER_TASK_CONTAINER_FEATURE_COUNT = SetupPackage.SETUP_TASK_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER__ANNOTATIONS = SERVER_TASK_CONTAINER__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER__ID = SERVER_TASK_CONTAINER__ID;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER__DESCRIPTION = SERVER_TASK_CONTAINER__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Scope Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER__SCOPE_TYPE = SERVER_TASK_CONTAINER__SCOPE_TYPE;

  /**
   * The feature id for the '<em><b>Excluded Triggers</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER__EXCLUDED_TRIGGERS = SERVER_TASK_CONTAINER__EXCLUDED_TRIGGERS;

  /**
   * The feature id for the '<em><b>Disabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER__DISABLED = SERVER_TASK_CONTAINER__DISABLED;

  /**
   * The feature id for the '<em><b>Predecessors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER__PREDECESSORS = SERVER_TASK_CONTAINER__PREDECESSORS;

  /**
   * The feature id for the '<em><b>Successors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER__SUCCESSORS = SERVER_TASK_CONTAINER__SUCCESSORS;

  /**
   * The feature id for the '<em><b>Restrictions</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER__RESTRICTIONS = SERVER_TASK_CONTAINER__RESTRICTIONS;

  /**
   * The feature id for the '<em><b>Filter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER__FILTER = SERVER_TASK_CONTAINER__FILTER;

  /**
   * The feature id for the '<em><b>Servers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER__SERVERS = SERVER_TASK_CONTAINER__SERVERS;

  /**
   * The feature id for the '<em><b>Clean Previous Runtimes</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER__CLEAN_PREVIOUS_RUNTIMES = SERVER_TASK_CONTAINER__CLEAN_PREVIOUS_RUNTIMES;

  /**
   * The feature id for the '<em><b>Server Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER__SERVER_NAME = SERVER_TASK_CONTAINER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER__LOCATION = SERVER_TASK_CONTAINER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Runtime Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER__RUNTIME_NAME = SERVER_TASK_CONTAINER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Hostname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER__HOSTNAME = SERVER_TASK_CONTAINER_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Server Container</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER__SERVER_CONTAINER = SERVER_TASK_CONTAINER_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Server</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER_FEATURE_COUNT = SERVER_TASK_CONTAINER_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOMCAT_SERVER_TASK__ANNOTATIONS = SERVER__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOMCAT_SERVER_TASK__ID = SERVER__ID;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOMCAT_SERVER_TASK__DESCRIPTION = SERVER__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Scope Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOMCAT_SERVER_TASK__SCOPE_TYPE = SERVER__SCOPE_TYPE;

  /**
   * The feature id for the '<em><b>Excluded Triggers</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOMCAT_SERVER_TASK__EXCLUDED_TRIGGERS = SERVER__EXCLUDED_TRIGGERS;

  /**
   * The feature id for the '<em><b>Disabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOMCAT_SERVER_TASK__DISABLED = SERVER__DISABLED;

  /**
   * The feature id for the '<em><b>Predecessors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOMCAT_SERVER_TASK__PREDECESSORS = SERVER__PREDECESSORS;

  /**
   * The feature id for the '<em><b>Successors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOMCAT_SERVER_TASK__SUCCESSORS = SERVER__SUCCESSORS;

  /**
   * The feature id for the '<em><b>Restrictions</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOMCAT_SERVER_TASK__RESTRICTIONS = SERVER__RESTRICTIONS;

  /**
   * The feature id for the '<em><b>Filter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOMCAT_SERVER_TASK__FILTER = SERVER__FILTER;

  /**
   * The feature id for the '<em><b>Servers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOMCAT_SERVER_TASK__SERVERS = SERVER__SERVERS;

  /**
   * The feature id for the '<em><b>Clean Previous Runtimes</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOMCAT_SERVER_TASK__CLEAN_PREVIOUS_RUNTIMES = SERVER__CLEAN_PREVIOUS_RUNTIMES;

  /**
   * The feature id for the '<em><b>Server Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOMCAT_SERVER_TASK__SERVER_NAME = SERVER__SERVER_NAME;

  /**
   * The feature id for the '<em><b>Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOMCAT_SERVER_TASK__LOCATION = SERVER__LOCATION;

  /**
   * The feature id for the '<em><b>Runtime Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOMCAT_SERVER_TASK__RUNTIME_NAME = SERVER__RUNTIME_NAME;

  /**
   * The feature id for the '<em><b>Hostname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOMCAT_SERVER_TASK__HOSTNAME = SERVER__HOSTNAME;

  /**
   * The feature id for the '<em><b>Server Container</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOMCAT_SERVER_TASK__SERVER_CONTAINER = SERVER__SERVER_CONTAINER;

  /**
   * The feature id for the '<em><b>Jre Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOMCAT_SERVER_TASK__JRE_VERSION = SERVER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Port</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOMCAT_SERVER_TASK__PORT = SERVER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Https Port</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOMCAT_SERVER_TASK__HTTPS_PORT = SERVER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Server Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOMCAT_SERVER_TASK__SERVER_VERSION = SERVER_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Launch Program Args</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOMCAT_SERVER_TASK__LAUNCH_PROGRAM_ARGS = SERVER_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Launch Vm Args</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOMCAT_SERVER_TASK__LAUNCH_VM_ARGS = SERVER_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Tomcat Server Task</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOMCAT_SERVER_TASK_FEATURE_COUNT = SERVER_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEBLOGIC_SERVER_TASK__ANNOTATIONS = SERVER__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEBLOGIC_SERVER_TASK__ID = SERVER__ID;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEBLOGIC_SERVER_TASK__DESCRIPTION = SERVER__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Scope Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEBLOGIC_SERVER_TASK__SCOPE_TYPE = SERVER__SCOPE_TYPE;

  /**
   * The feature id for the '<em><b>Excluded Triggers</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEBLOGIC_SERVER_TASK__EXCLUDED_TRIGGERS = SERVER__EXCLUDED_TRIGGERS;

  /**
   * The feature id for the '<em><b>Disabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEBLOGIC_SERVER_TASK__DISABLED = SERVER__DISABLED;

  /**
   * The feature id for the '<em><b>Predecessors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEBLOGIC_SERVER_TASK__PREDECESSORS = SERVER__PREDECESSORS;

  /**
   * The feature id for the '<em><b>Successors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEBLOGIC_SERVER_TASK__SUCCESSORS = SERVER__SUCCESSORS;

  /**
   * The feature id for the '<em><b>Restrictions</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEBLOGIC_SERVER_TASK__RESTRICTIONS = SERVER__RESTRICTIONS;

  /**
   * The feature id for the '<em><b>Filter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEBLOGIC_SERVER_TASK__FILTER = SERVER__FILTER;

  /**
   * The feature id for the '<em><b>Servers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEBLOGIC_SERVER_TASK__SERVERS = SERVER__SERVERS;

  /**
   * The feature id for the '<em><b>Clean Previous Runtimes</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEBLOGIC_SERVER_TASK__CLEAN_PREVIOUS_RUNTIMES = SERVER__CLEAN_PREVIOUS_RUNTIMES;

  /**
   * The feature id for the '<em><b>Server Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEBLOGIC_SERVER_TASK__SERVER_NAME = SERVER__SERVER_NAME;

  /**
   * The feature id for the '<em><b>Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEBLOGIC_SERVER_TASK__LOCATION = SERVER__LOCATION;

  /**
   * The feature id for the '<em><b>Runtime Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEBLOGIC_SERVER_TASK__RUNTIME_NAME = SERVER__RUNTIME_NAME;

  /**
   * The feature id for the '<em><b>Hostname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEBLOGIC_SERVER_TASK__HOSTNAME = SERVER__HOSTNAME;

  /**
   * The feature id for the '<em><b>Server Container</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEBLOGIC_SERVER_TASK__SERVER_CONTAINER = SERVER__SERVER_CONTAINER;

  /**
   * The feature id for the '<em><b>Jre Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEBLOGIC_SERVER_TASK__JRE_VERSION = SERVER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Port</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEBLOGIC_SERVER_TASK__PORT = SERVER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Https Port</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEBLOGIC_SERVER_TASK__HTTPS_PORT = SERVER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Debug Port</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEBLOGIC_SERVER_TASK__DEBUG_PORT = SERVER_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Username</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEBLOGIC_SERVER_TASK__USERNAME = SERVER_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Password</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEBLOGIC_SERVER_TASK__PASSWORD = SERVER_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Weblogic Server Task</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEBLOGIC_SERVER_TASK_FEATURE_COUNT = SERVER_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEBSPHERE_SERVER_TASK__ANNOTATIONS = SERVER__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEBSPHERE_SERVER_TASK__ID = SERVER__ID;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEBSPHERE_SERVER_TASK__DESCRIPTION = SERVER__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Scope Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEBSPHERE_SERVER_TASK__SCOPE_TYPE = SERVER__SCOPE_TYPE;

  /**
   * The feature id for the '<em><b>Excluded Triggers</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEBSPHERE_SERVER_TASK__EXCLUDED_TRIGGERS = SERVER__EXCLUDED_TRIGGERS;

  /**
   * The feature id for the '<em><b>Disabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEBSPHERE_SERVER_TASK__DISABLED = SERVER__DISABLED;

  /**
   * The feature id for the '<em><b>Predecessors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEBSPHERE_SERVER_TASK__PREDECESSORS = SERVER__PREDECESSORS;

  /**
   * The feature id for the '<em><b>Successors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEBSPHERE_SERVER_TASK__SUCCESSORS = SERVER__SUCCESSORS;

  /**
   * The feature id for the '<em><b>Restrictions</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEBSPHERE_SERVER_TASK__RESTRICTIONS = SERVER__RESTRICTIONS;

  /**
   * The feature id for the '<em><b>Filter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEBSPHERE_SERVER_TASK__FILTER = SERVER__FILTER;

  /**
   * The feature id for the '<em><b>Servers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEBSPHERE_SERVER_TASK__SERVERS = SERVER__SERVERS;

  /**
   * The feature id for the '<em><b>Clean Previous Runtimes</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEBSPHERE_SERVER_TASK__CLEAN_PREVIOUS_RUNTIMES = SERVER__CLEAN_PREVIOUS_RUNTIMES;

  /**
   * The feature id for the '<em><b>Server Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEBSPHERE_SERVER_TASK__SERVER_NAME = SERVER__SERVER_NAME;

  /**
   * The feature id for the '<em><b>Location</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEBSPHERE_SERVER_TASK__LOCATION = SERVER__LOCATION;

  /**
   * The feature id for the '<em><b>Runtime Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEBSPHERE_SERVER_TASK__RUNTIME_NAME = SERVER__RUNTIME_NAME;

  /**
   * The feature id for the '<em><b>Hostname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEBSPHERE_SERVER_TASK__HOSTNAME = SERVER__HOSTNAME;

  /**
   * The feature id for the '<em><b>Server Container</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEBSPHERE_SERVER_TASK__SERVER_CONTAINER = SERVER__SERVER_CONTAINER;

  /**
   * The feature id for the '<em><b>Base Server Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEBSPHERE_SERVER_TASK__BASE_SERVER_NAME = SERVER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Profile Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEBSPHERE_SERVER_TASK__PROFILE_PATH = SERVER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Bootstrap Port</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEBSPHERE_SERVER_TASK__BOOTSTRAP_PORT = SERVER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Icp Port</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEBSPHERE_SERVER_TASK__ICP_PORT = SERVER_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Soap Port</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEBSPHERE_SERVER_TASK__SOAP_PORT = SERVER_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Remote Os User</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEBSPHERE_SERVER_TASK__REMOTE_OS_USER = SERVER_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Remote Os Password</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEBSPHERE_SERVER_TASK__REMOTE_OS_PASSWORD = SERVER_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Websphere Server Task</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEBSPHERE_SERVER_TASK_FEATURE_COUNT = SERVER_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link com.gratex.oomph.task.server.TomcatServerVersion <em>Tomcat Server Version</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.gratex.oomph.task.server.TomcatServerVersion
   * @see com.gratex.oomph.task.server.impl.ServerPackageImpl#getTomcatServerVersion()
   * @generated
   */
  int TOMCAT_SERVER_VERSION = 5;

  /**
   * Returns the meta object for class '{@link com.gratex.oomph.task.server.TomcatServerTask <em>Tomcat Server Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tomcat Server Task</em>'.
   * @see com.gratex.oomph.task.server.TomcatServerTask
   * @generated
   */
  EClass getTomcatServerTask();

  /**
   * Returns the meta object for the attribute '{@link com.gratex.oomph.task.server.TomcatServerTask#getJreVersion <em>Jre Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Jre Version</em>'.
   * @see com.gratex.oomph.task.server.TomcatServerTask#getJreVersion()
   * @see #getTomcatServerTask()
   * @generated
   */
  EAttribute getTomcatServerTask_JreVersion();

  /**
   * Returns the meta object for the attribute '{@link com.gratex.oomph.task.server.TomcatServerTask#getPort <em>Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Port</em>'.
   * @see com.gratex.oomph.task.server.TomcatServerTask#getPort()
   * @see #getTomcatServerTask()
   * @generated
   */
  EAttribute getTomcatServerTask_Port();

  /**
   * Returns the meta object for the attribute '{@link com.gratex.oomph.task.server.TomcatServerTask#getHttpsPort <em>Https Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Https Port</em>'.
   * @see com.gratex.oomph.task.server.TomcatServerTask#getHttpsPort()
   * @see #getTomcatServerTask()
   * @generated
   */
  EAttribute getTomcatServerTask_HttpsPort();

  /**
   * Returns the meta object for the attribute '{@link com.gratex.oomph.task.server.TomcatServerTask#getServerVersion <em>Server Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Server Version</em>'.
   * @see com.gratex.oomph.task.server.TomcatServerTask#getServerVersion()
   * @see #getTomcatServerTask()
   * @generated
   */
  EAttribute getTomcatServerTask_ServerVersion();

  /**
   * Returns the meta object for the attribute '{@link com.gratex.oomph.task.server.TomcatServerTask#getLaunchProgramArgs <em>Launch Program Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Launch Program Args</em>'.
   * @see com.gratex.oomph.task.server.TomcatServerTask#getLaunchProgramArgs()
   * @see #getTomcatServerTask()
   * @generated
   */
  EAttribute getTomcatServerTask_LaunchProgramArgs();

  /**
   * Returns the meta object for the attribute '{@link com.gratex.oomph.task.server.TomcatServerTask#getLaunchVmArgs <em>Launch Vm Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Launch Vm Args</em>'.
   * @see com.gratex.oomph.task.server.TomcatServerTask#getLaunchVmArgs()
   * @see #getTomcatServerTask()
   * @generated
   */
  EAttribute getTomcatServerTask_LaunchVmArgs();

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
   * Returns the meta object for class '{@link com.gratex.oomph.task.server.WebsphereServerTask <em>Websphere Server Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Websphere Server Task</em>'.
   * @see com.gratex.oomph.task.server.WebsphereServerTask
   * @generated
   */
  EClass getWebsphereServerTask();

  /**
   * Returns the meta object for the attribute '{@link com.gratex.oomph.task.server.WebsphereServerTask#getBaseServerName <em>Base Server Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Base Server Name</em>'.
   * @see com.gratex.oomph.task.server.WebsphereServerTask#getBaseServerName()
   * @see #getWebsphereServerTask()
   * @generated
   */
  EAttribute getWebsphereServerTask_BaseServerName();

  /**
   * Returns the meta object for the attribute '{@link com.gratex.oomph.task.server.WebsphereServerTask#getProfilePath <em>Profile Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Profile Path</em>'.
   * @see com.gratex.oomph.task.server.WebsphereServerTask#getProfilePath()
   * @see #getWebsphereServerTask()
   * @generated
   */
  EAttribute getWebsphereServerTask_ProfilePath();

  /**
   * Returns the meta object for the attribute '{@link com.gratex.oomph.task.server.WebsphereServerTask#getBootstrapPort <em>Bootstrap Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Bootstrap Port</em>'.
   * @see com.gratex.oomph.task.server.WebsphereServerTask#getBootstrapPort()
   * @see #getWebsphereServerTask()
   * @generated
   */
  EAttribute getWebsphereServerTask_BootstrapPort();

  /**
   * Returns the meta object for the attribute '{@link com.gratex.oomph.task.server.WebsphereServerTask#getIcpPort <em>Icp Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Icp Port</em>'.
   * @see com.gratex.oomph.task.server.WebsphereServerTask#getIcpPort()
   * @see #getWebsphereServerTask()
   * @generated
   */
  EAttribute getWebsphereServerTask_IcpPort();

  /**
   * Returns the meta object for the attribute '{@link com.gratex.oomph.task.server.WebsphereServerTask#getSoapPort <em>Soap Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Soap Port</em>'.
   * @see com.gratex.oomph.task.server.WebsphereServerTask#getSoapPort()
   * @see #getWebsphereServerTask()
   * @generated
   */
  EAttribute getWebsphereServerTask_SoapPort();

  /**
   * Returns the meta object for the attribute '{@link com.gratex.oomph.task.server.WebsphereServerTask#getRemoteOsUser <em>Remote Os User</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Remote Os User</em>'.
   * @see com.gratex.oomph.task.server.WebsphereServerTask#getRemoteOsUser()
   * @see #getWebsphereServerTask()
   * @generated
   */
  EAttribute getWebsphereServerTask_RemoteOsUser();

  /**
   * Returns the meta object for the attribute '{@link com.gratex.oomph.task.server.WebsphereServerTask#getRemoteOsPassword <em>Remote Os Password</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Remote Os Password</em>'.
   * @see com.gratex.oomph.task.server.WebsphereServerTask#getRemoteOsPassword()
   * @see #getWebsphereServerTask()
   * @generated
   */
  EAttribute getWebsphereServerTask_RemoteOsPassword();

  /**
   * Returns the meta object for class '{@link com.gratex.oomph.task.server.Server <em>Server</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Server</em>'.
   * @see com.gratex.oomph.task.server.Server
   * @generated
   */
  EClass getServer();

  /**
   * Returns the meta object for the attribute '{@link com.gratex.oomph.task.server.Server#getServerName <em>Server Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Server Name</em>'.
   * @see com.gratex.oomph.task.server.Server#getServerName()
   * @see #getServer()
   * @generated
   */
  EAttribute getServer_ServerName();

  /**
   * Returns the meta object for the attribute '{@link com.gratex.oomph.task.server.Server#getLocation <em>Location</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Location</em>'.
   * @see com.gratex.oomph.task.server.Server#getLocation()
   * @see #getServer()
   * @generated
   */
  EAttribute getServer_Location();

  /**
   * Returns the meta object for the attribute '{@link com.gratex.oomph.task.server.Server#getRuntimeName <em>Runtime Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Runtime Name</em>'.
   * @see com.gratex.oomph.task.server.Server#getRuntimeName()
   * @see #getServer()
   * @generated
   */
  EAttribute getServer_RuntimeName();

  /**
   * Returns the meta object for the attribute '{@link com.gratex.oomph.task.server.Server#getHostname <em>Hostname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Hostname</em>'.
   * @see com.gratex.oomph.task.server.Server#getHostname()
   * @see #getServer()
   * @generated
   */
  EAttribute getServer_Hostname();

  /**
   * Returns the meta object for the container reference '{@link com.gratex.oomph.task.server.Server#getServerContainer <em>Server Container</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Server Container</em>'.
   * @see com.gratex.oomph.task.server.Server#getServerContainer()
   * @see #getServer()
   * @generated
   */
  EReference getServer_ServerContainer();

  /**
   * Returns the meta object for class '{@link com.gratex.oomph.task.server.ServerTaskContainer <em>Task Container</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Task Container</em>'.
   * @see com.gratex.oomph.task.server.ServerTaskContainer
   * @generated
   */
  EClass getServerTaskContainer();

  /**
   * Returns the meta object for the containment reference list '{@link com.gratex.oomph.task.server.ServerTaskContainer#getServers <em>Servers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Servers</em>'.
   * @see com.gratex.oomph.task.server.ServerTaskContainer#getServers()
   * @see #getServerTaskContainer()
   * @generated
   */
  EReference getServerTaskContainer_Servers();

  /**
   * Returns the meta object for the attribute '{@link com.gratex.oomph.task.server.ServerTaskContainer#isCleanPreviousRuntimes <em>Clean Previous Runtimes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Clean Previous Runtimes</em>'.
   * @see com.gratex.oomph.task.server.ServerTaskContainer#isCleanPreviousRuntimes()
   * @see #getServerTaskContainer()
   * @generated
   */
  EAttribute getServerTaskContainer_CleanPreviousRuntimes();

  /**
   * Returns the meta object for enum '{@link com.gratex.oomph.task.server.TomcatServerVersion <em>Tomcat Server Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Tomcat Server Version</em>'.
   * @see com.gratex.oomph.task.server.TomcatServerVersion
   * @generated
   */
  EEnum getTomcatServerVersion();

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
     * The meta object literal for the '{@link com.gratex.oomph.task.server.impl.TomcatServerTaskImpl <em>Tomcat Server Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.gratex.oomph.task.server.impl.TomcatServerTaskImpl
     * @see com.gratex.oomph.task.server.impl.ServerPackageImpl#getTomcatServerTask()
     * @generated
     */
    EClass TOMCAT_SERVER_TASK = eINSTANCE.getTomcatServerTask();

    /**
     * The meta object literal for the '<em><b>Jre Version</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TOMCAT_SERVER_TASK__JRE_VERSION = eINSTANCE.getTomcatServerTask_JreVersion();

    /**
     * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TOMCAT_SERVER_TASK__PORT = eINSTANCE.getTomcatServerTask_Port();

    /**
     * The meta object literal for the '<em><b>Https Port</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TOMCAT_SERVER_TASK__HTTPS_PORT = eINSTANCE.getTomcatServerTask_HttpsPort();

    /**
     * The meta object literal for the '<em><b>Server Version</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TOMCAT_SERVER_TASK__SERVER_VERSION = eINSTANCE.getTomcatServerTask_ServerVersion();

    /**
     * The meta object literal for the '<em><b>Launch Program Args</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TOMCAT_SERVER_TASK__LAUNCH_PROGRAM_ARGS = eINSTANCE.getTomcatServerTask_LaunchProgramArgs();

    /**
     * The meta object literal for the '<em><b>Launch Vm Args</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TOMCAT_SERVER_TASK__LAUNCH_VM_ARGS = eINSTANCE.getTomcatServerTask_LaunchVmArgs();

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
     * The meta object literal for the '{@link com.gratex.oomph.task.server.impl.WebsphereServerTaskImpl <em>Websphere Server Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.gratex.oomph.task.server.impl.WebsphereServerTaskImpl
     * @see com.gratex.oomph.task.server.impl.ServerPackageImpl#getWebsphereServerTask()
     * @generated
     */
    EClass WEBSPHERE_SERVER_TASK = eINSTANCE.getWebsphereServerTask();

    /**
     * The meta object literal for the '<em><b>Base Server Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WEBSPHERE_SERVER_TASK__BASE_SERVER_NAME = eINSTANCE.getWebsphereServerTask_BaseServerName();

    /**
     * The meta object literal for the '<em><b>Profile Path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WEBSPHERE_SERVER_TASK__PROFILE_PATH = eINSTANCE.getWebsphereServerTask_ProfilePath();

    /**
     * The meta object literal for the '<em><b>Bootstrap Port</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WEBSPHERE_SERVER_TASK__BOOTSTRAP_PORT = eINSTANCE.getWebsphereServerTask_BootstrapPort();

    /**
     * The meta object literal for the '<em><b>Icp Port</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WEBSPHERE_SERVER_TASK__ICP_PORT = eINSTANCE.getWebsphereServerTask_IcpPort();

    /**
     * The meta object literal for the '<em><b>Soap Port</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WEBSPHERE_SERVER_TASK__SOAP_PORT = eINSTANCE.getWebsphereServerTask_SoapPort();

    /**
     * The meta object literal for the '<em><b>Remote Os User</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WEBSPHERE_SERVER_TASK__REMOTE_OS_USER = eINSTANCE.getWebsphereServerTask_RemoteOsUser();

    /**
     * The meta object literal for the '<em><b>Remote Os Password</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WEBSPHERE_SERVER_TASK__REMOTE_OS_PASSWORD = eINSTANCE.getWebsphereServerTask_RemoteOsPassword();

    /**
     * The meta object literal for the '{@link com.gratex.oomph.task.server.impl.ServerImpl <em>Server</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.gratex.oomph.task.server.impl.ServerImpl
     * @see com.gratex.oomph.task.server.impl.ServerPackageImpl#getServer()
     * @generated
     */
    EClass SERVER = eINSTANCE.getServer();

    /**
     * The meta object literal for the '<em><b>Server Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVER__SERVER_NAME = eINSTANCE.getServer_ServerName();

    /**
     * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVER__LOCATION = eINSTANCE.getServer_Location();

    /**
     * The meta object literal for the '<em><b>Runtime Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVER__RUNTIME_NAME = eINSTANCE.getServer_RuntimeName();

    /**
     * The meta object literal for the '<em><b>Hostname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVER__HOSTNAME = eINSTANCE.getServer_Hostname();

    /**
     * The meta object literal for the '<em><b>Server Container</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVER__SERVER_CONTAINER = eINSTANCE.getServer_ServerContainer();

    /**
     * The meta object literal for the '{@link com.gratex.oomph.task.server.impl.ServerTaskContainerImpl <em>Task Container</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.gratex.oomph.task.server.impl.ServerTaskContainerImpl
     * @see com.gratex.oomph.task.server.impl.ServerPackageImpl#getServerTaskContainer()
     * @generated
     */
    EClass SERVER_TASK_CONTAINER = eINSTANCE.getServerTaskContainer();

    /**
     * The meta object literal for the '<em><b>Servers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVER_TASK_CONTAINER__SERVERS = eINSTANCE.getServerTaskContainer_Servers();

    /**
     * The meta object literal for the '<em><b>Clean Previous Runtimes</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVER_TASK_CONTAINER__CLEAN_PREVIOUS_RUNTIMES = eINSTANCE.getServerTaskContainer_CleanPreviousRuntimes();

    /**
     * The meta object literal for the '{@link com.gratex.oomph.task.server.TomcatServerVersion <em>Tomcat Server Version</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.gratex.oomph.task.server.TomcatServerVersion
     * @see com.gratex.oomph.task.server.impl.ServerPackageImpl#getTomcatServerVersion()
     * @generated
     */
    EEnum TOMCAT_SERVER_VERSION = eINSTANCE.getTomcatServerVersion();

  }

} // ServerPackage
