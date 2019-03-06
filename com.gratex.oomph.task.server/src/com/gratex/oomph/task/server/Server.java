/**
 */
package com.gratex.oomph.task.server;

import org.eclipse.oomph.setup.SetupTask;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.gratex.oomph.task.server.Server#getServerName <em>Server Name</em>}</li>
 *   <li>{@link com.gratex.oomph.task.server.Server#getLocation <em>Location</em>}</li>
 *   <li>{@link com.gratex.oomph.task.server.Server#getRuntimeName <em>Runtime Name</em>}</li>
 *   <li>{@link com.gratex.oomph.task.server.Server#getHostname <em>Hostname</em>}</li>
 *   <li>{@link com.gratex.oomph.task.server.Server#isCleanPreviousRuntimes <em>Clean Previous Runtimes</em>}</li>
 *   <li>{@link com.gratex.oomph.task.server.Server#getStartTimeout <em>Start Timeout</em>}</li>
 *   <li>{@link com.gratex.oomph.task.server.Server#getStopTimeout <em>Stop Timeout</em>}</li>
 * </ul>
 *
 * @see com.gratex.oomph.task.server.ServerPackage#getServer()
 * @model abstract="true"
 * @generated
 */
public interface Server extends SetupTask
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
   * @see com.gratex.oomph.task.server.ServerPackage#getServer_ServerName()
   * @model required="true"
   * @generated
   */
  String getServerName();

  /**
   * Sets the value of the '{@link com.gratex.oomph.task.server.Server#getServerName <em>Server Name</em>}' attribute.
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
   * @see com.gratex.oomph.task.server.ServerPackage#getServer_Location()
   * @model required="true"
   * @generated
   */
  String getLocation();

  /**
   * Sets the value of the '{@link com.gratex.oomph.task.server.Server#getLocation <em>Location</em>}' attribute.
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
   * @see com.gratex.oomph.task.server.ServerPackage#getServer_RuntimeName()
   * @model required="true"
   * @generated
   */
  String getRuntimeName();

  /**
   * Sets the value of the '{@link com.gratex.oomph.task.server.Server#getRuntimeName <em>Runtime Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Runtime Name</em>' attribute.
   * @see #getRuntimeName()
   * @generated
   */
  void setRuntimeName(String value);

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
   * @see com.gratex.oomph.task.server.ServerPackage#getServer_Hostname()
   * @model default="localhost" required="true"
   * @generated
   */
  String getHostname();

  /**
   * Sets the value of the '{@link com.gratex.oomph.task.server.Server#getHostname <em>Hostname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hostname</em>' attribute.
   * @see #getHostname()
   * @generated
   */
  void setHostname(String value);

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
   * @see com.gratex.oomph.task.server.ServerPackage#getServer_CleanPreviousRuntimes()
   * @model default="false"
   * @generated
   */
  boolean isCleanPreviousRuntimes();

  /**
   * Sets the value of the '{@link com.gratex.oomph.task.server.Server#isCleanPreviousRuntimes <em>Clean Previous Runtimes</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Clean Previous Runtimes</em>' attribute.
   * @see #isCleanPreviousRuntimes()
   * @generated
   */
  void setCleanPreviousRuntimes(boolean value);

  /**
   * Returns the value of the '<em><b>Start Timeout</b></em>' attribute.
   * <!-- begin-user-doc -->
  	 * <p>
  	 * If the meaning of the '<em>Start Timeout</em>' attribute isn't clear,
  	 * there really should be more of a description here...
  	 * </p>
  	 * <!-- end-user-doc -->
   * @return the value of the '<em>Start Timeout</em>' attribute.
   * @see #setStartTimeout(String)
   * @see com.gratex.oomph.task.server.ServerPackage#getServer_StartTimeout()
   * @model
   * @generated
   */
  String getStartTimeout();

  Integer startTimeout();

  /**
   * Sets the value of the '{@link com.gratex.oomph.task.server.Server#getStartTimeout <em>Start Timeout</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Start Timeout</em>' attribute.
   * @see #getStartTimeout()
   * @generated
   */
  void setStartTimeout(String value);

  /**
   * Returns the value of the '<em><b>Stop Timeout</b></em>' attribute.
   * <!-- begin-user-doc -->
  	 * <p>
  	 * If the meaning of the '<em>Stop Timeout</em>' attribute isn't clear,
  	 * there really should be more of a description here...
  	 * </p>
  	 * <!-- end-user-doc -->
   * @return the value of the '<em>Stop Timeout</em>' attribute.
   * @see #setStopTimeout(String)
   * @see com.gratex.oomph.task.server.ServerPackage#getServer_StopTimeout()
   * @model
   * @generated
   */
  String getStopTimeout();

  Integer stopTimeout();

  /**
   * Sets the value of the '{@link com.gratex.oomph.task.server.Server#getStopTimeout <em>Stop Timeout</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Stop Timeout</em>' attribute.
   * @see #getStopTimeout()
   * @generated
   */
  void setStopTimeout(String value);

} // Server
