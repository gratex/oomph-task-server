/**
 */
package com.gratex.oomph.task.server.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import com.gratex.oomph.task.server.ServerFactory;
import com.gratex.oomph.task.server.ServerPackage;
import com.gratex.oomph.task.server.ServerTaskContainer;
import com.gratex.oomph.task.server.TomcatServerTask;
import com.gratex.oomph.task.server.TomcatServerVersion;
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
    case ServerPackage.TOMCAT_SERVER_TASK:
      return createTomcatServerTask();
    case ServerPackage.WEBLOGIC_SERVER_TASK:
      return createWeblogicServerTask();
    case ServerPackage.WEBSPHERE_SERVER_TASK:
      return createWebsphereServerTask();
    case ServerPackage.SERVER_TASK_CONTAINER:
      return createServerTaskContainer();
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
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
    case ServerPackage.TOMCAT_SERVER_VERSION:
      return createTomcatServerVersionFromString(eDataType, initialValue);
    default:
      throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
    case ServerPackage.TOMCAT_SERVER_VERSION:
      return convertTomcatServerVersionToString(eDataType, instanceValue);
    default:
      throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TomcatServerTask createTomcatServerTask()
  {
    TomcatServerTaskImpl tomcatServerTask = new TomcatServerTaskImpl();
    return tomcatServerTask;
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
  public ServerTaskContainer createServerTaskContainer()
  {
    ServerTaskContainerImpl serverTaskContainer = new ServerTaskContainerImpl();
    return serverTaskContainer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TomcatServerVersion createTomcatServerVersionFromString(EDataType eDataType, String initialValue)
  {
    TomcatServerVersion result = TomcatServerVersion.get(initialValue);
    if (result == null)
    {
      throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    }
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTomcatServerVersionToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
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
