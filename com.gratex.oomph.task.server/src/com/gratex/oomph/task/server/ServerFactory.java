/**
 */
package com.gratex.oomph.task.server;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.gratex.oomph.task.server.ServerPackage
 * @generated
 */
public interface ServerFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ServerFactory eINSTANCE = com.gratex.oomph.task.server.impl.ServerFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Tomcat Server Task</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Tomcat Server Task</em>'.
   * @generated
   */
  TomcatServerTask createTomcatServerTask();

  /**
   * Returns a new object of class '<em>Weblogic Server Task</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Weblogic Server Task</em>'.
   * @generated
   */
  WeblogicServerTask createWeblogicServerTask();

  /**
   * Returns a new object of class '<em>Websphere Server Task</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Websphere Server Task</em>'.
   * @generated
   */
  WebsphereServerTask createWebsphereServerTask();

  /**
   * Returns a new object of class '<em>Task Container</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Task Container</em>'.
   * @generated
   */
  ServerTaskContainer createServerTaskContainer();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ServerPackage getServerPackage();

} // ServerFactory
