/**
 */
package com.gratex.oomph.task.server;

import org.eclipse.oomph.setup.SetupTask;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.gratex.oomph.task.server.ServerTaskContainer#getServers <em>Servers</em>}</li>
 *   <li>{@link com.gratex.oomph.task.server.ServerTaskContainer#isCleanPreviousRuntimes <em>Clean Previous Runtimes</em>}</li>
 * </ul>
 *
 * @see com.gratex.oomph.task.server.ServerPackage#getServerTaskContainer()
 * @model annotation="http://www.eclipse.org/oomph/setup/Enablement variableName='p2.server' repository='https://gratex.github.io/oomph-task-server/repository/' installableUnits='com.gratex.oomph.task.server.feature.feature.group'"
 * @generated
 */
public interface ServerTaskContainer extends SetupTask
{
  /**
   * Returns the value of the '<em><b>Servers</b></em>' containment reference list.
   * The list contents are of type {@link com.gratex.oomph.task.server.Server}.
   * It is bidirectional and its opposite is '{@link com.gratex.oomph.task.server.Server#getServerContainer <em>Server Container</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Servers</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Servers</em>' containment reference list.
   * @see com.gratex.oomph.task.server.ServerPackage#getServerTaskContainer_Servers()
   * @see com.gratex.oomph.task.server.Server#getServerContainer
   * @model opposite="serverContainer" containment="true" keys="iD serverName"
   *        extendedMetaData="name='server'"
   * @generated
   */
  EList<Server> getServers();

  /**
   * Returns the value of the '<em><b>Clean Previous Runtimes</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Clean Previous Runtimes</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Clean Previous Runtimes</em>' attribute.
   * @see #setCleanPreviousRuntimes(boolean)
   * @see com.gratex.oomph.task.server.ServerPackage#getServerTaskContainer_CleanPreviousRuntimes()
   * @model default="false"
   * @generated
   */
  boolean isCleanPreviousRuntimes();

  /**
   * Sets the value of the '{@link com.gratex.oomph.task.server.ServerTaskContainer#isCleanPreviousRuntimes <em>Clean Previous Runtimes</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Clean Previous Runtimes</em>' attribute.
   * @see #isCleanPreviousRuntimes()
   * @generated
   */
  void setCleanPreviousRuntimes(boolean value);

} // ServerTaskContainer
