/**
 */
package com.gratex.oomph.task.server.util;

import org.eclipse.oomph.base.ModelElement;
import org.eclipse.oomph.setup.SetupTask;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import com.gratex.oomph.task.server.Server;
import com.gratex.oomph.task.server.ServerPackage;
import com.gratex.oomph.task.server.ServerTaskContainer;
import com.gratex.oomph.task.server.TomcatServerTask;
import com.gratex.oomph.task.server.WeblogicServerTask;
import com.gratex.oomph.task.server.WebsphereServerTask;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.gratex.oomph.task.server.ServerPackage
 * @generated
 */
public class ServerSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ServerPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServerSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = ServerPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
    case ServerPackage.TOMCAT_SERVER_TASK:
    {
      TomcatServerTask tomcatServerTask = (TomcatServerTask)theEObject;
      T result = caseTomcatServerTask(tomcatServerTask);
      if (result == null)
      {
        result = caseServer(tomcatServerTask);
      }
      if (result == null)
      {
        result = caseServerTaskContainer(tomcatServerTask);
      }
      if (result == null)
      {
        result = caseSetupTask(tomcatServerTask);
      }
      if (result == null)
      {
        result = caseModelElement(tomcatServerTask);
      }
      if (result == null)
      {
        result = defaultCase(theEObject);
      }
      return result;
    }
    case ServerPackage.WEBLOGIC_SERVER_TASK:
    {
      WeblogicServerTask weblogicServerTask = (WeblogicServerTask)theEObject;
      T result = caseWeblogicServerTask(weblogicServerTask);
      if (result == null)
      {
        result = caseServer(weblogicServerTask);
      }
      if (result == null)
      {
        result = caseServerTaskContainer(weblogicServerTask);
      }
      if (result == null)
      {
        result = caseSetupTask(weblogicServerTask);
      }
      if (result == null)
      {
        result = caseModelElement(weblogicServerTask);
      }
      if (result == null)
      {
        result = defaultCase(theEObject);
      }
      return result;
    }
    case ServerPackage.WEBSPHERE_SERVER_TASK:
    {
      WebsphereServerTask websphereServerTask = (WebsphereServerTask)theEObject;
      T result = caseWebsphereServerTask(websphereServerTask);
      if (result == null)
      {
        result = caseServer(websphereServerTask);
      }
      if (result == null)
      {
        result = caseServerTaskContainer(websphereServerTask);
      }
      if (result == null)
      {
        result = caseSetupTask(websphereServerTask);
      }
      if (result == null)
      {
        result = caseModelElement(websphereServerTask);
      }
      if (result == null)
      {
        result = defaultCase(theEObject);
      }
      return result;
    }
    case ServerPackage.SERVER:
    {
      Server server = (Server)theEObject;
      T result = caseServer(server);
      if (result == null)
      {
        result = caseServerTaskContainer(server);
      }
      if (result == null)
      {
        result = caseSetupTask(server);
      }
      if (result == null)
      {
        result = caseModelElement(server);
      }
      if (result == null)
      {
        result = defaultCase(theEObject);
      }
      return result;
    }
    case ServerPackage.SERVER_TASK_CONTAINER:
    {
      ServerTaskContainer serverTaskContainer = (ServerTaskContainer)theEObject;
      T result = caseServerTaskContainer(serverTaskContainer);
      if (result == null)
      {
        result = caseSetupTask(serverTaskContainer);
      }
      if (result == null)
      {
        result = caseModelElement(serverTaskContainer);
      }
      if (result == null)
      {
        result = defaultCase(theEObject);
      }
      return result;
    }
    default:
      return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tomcat Server Task</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tomcat Server Task</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTomcatServerTask(TomcatServerTask object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Weblogic Server Task</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Weblogic Server Task</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWeblogicServerTask(WeblogicServerTask object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Websphere Server Task</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Websphere Server Task</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWebsphereServerTask(WebsphereServerTask object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Server</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Server</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseServer(Server object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Task Container</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Task Container</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseServerTaskContainer(ServerTaskContainer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModelElement(ModelElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Task</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Task</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSetupTask(SetupTask object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} // ServerSwitch
