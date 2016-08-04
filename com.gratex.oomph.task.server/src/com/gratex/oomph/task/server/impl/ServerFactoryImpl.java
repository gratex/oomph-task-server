/**
 */
package com.gratex.oomph.task.server.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import com.gratex.oomph.task.server.ServerFactory;
import com.gratex.oomph.task.server.ServerPackage;
import com.gratex.oomph.task.server.ServerTask;
import com.gratex.oomph.task.server.WeblogicServerTask;
import com.gratex.oomph.task.server.WebsphereServerTask;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServerFactoryImpl extends EFactoryImpl implements ServerFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ServerFactory init()
  {
    try
    {
      ServerFactory theServerFactory = (ServerFactory)EPackage.Registry.INSTANCE.getEFactory(ServerPackage.eNS_URI);
      if (theServerFactory != null)
      {
        return theServerFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ServerFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServerFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
    case ServerPackage.SERVER_TASK:
      return createServerTask();
    case ServerPackage.WEBLOGIC_SERVER_TASK:
      return createWeblogicServerTask();
    case ServerPackage.WEBSPHERE_SERVER_TASK:
      return createWebsphereServerTask();
    default:
      throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ServerTask createServerTask()
  {
    ServerTaskImpl serverTask = new ServerTaskImpl();
    return serverTask;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public WeblogicServerTask createWeblogicServerTask()
  {
    WeblogicServerTaskImpl weblogicServerTask = new WeblogicServerTaskImpl();
    return weblogicServerTask;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public WebsphereServerTask createWebsphereServerTask()
  {
    WebsphereServerTaskImpl websphereServerTask = new WebsphereServerTaskImpl();
    return websphereServerTask;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ServerPackage getServerPackage()
  {
    return (ServerPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ServerPackage getPackage()
  {
    return ServerPackage.eINSTANCE;
  }

} // ServerFactoryImpl
