/**
 */
package com.gratex.oomph.task.server.impl;

import org.eclipse.oomph.setup.SetupTaskContext;
import org.eclipse.oomph.setup.impl.SetupTaskImpl;
import org.eclipse.oomph.setup.log.ProgressLog.Severity;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.wst.server.core.IRuntime;
import org.eclipse.wst.server.core.IServer;
import org.eclipse.wst.server.core.ServerCore;

import com.gratex.oomph.task.server.Server;
import com.gratex.oomph.task.server.ServerPackage;
import com.gratex.oomph.task.server.ServerTaskContainer;

import java.util.Collection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.gratex.oomph.task.server.impl.ServerTaskContainerImpl#getServers <em>Servers</em>}</li>
 *   <li>{@link com.gratex.oomph.task.server.impl.ServerTaskContainerImpl#isCleanPreviousRuntimes <em>Clean Previous Runtimes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServerTaskContainerImpl extends SetupTaskImpl implements ServerTaskContainer
{
  /**
   * The cached value of the '{@link #getServers() <em>Servers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServers()
   * @generated
   * @ordered
   */
  protected EList<Server> servers;

  /**
   * The default value of the '{@link #isCleanPreviousRuntimes() <em>Clean Previous Runtimes</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCleanPreviousRuntimes()
   * @generated
   * @ordered
   */
  protected static final boolean CLEAN_PREVIOUS_RUNTIMES_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isCleanPreviousRuntimes() <em>Clean Previous Runtimes</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCleanPreviousRuntimes()
   * @generated
   * @ordered
   */
  protected boolean cleanPreviousRuntimes = CLEAN_PREVIOUS_RUNTIMES_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ServerTaskContainerImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ServerPackage.Literals.SERVER_TASK_CONTAINER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Server> getServers()
  {
    if (servers == null)
    {
      servers = new EObjectContainmentWithInverseEList<Server>(Server.class, this, ServerPackage.SERVER_TASK_CONTAINER__SERVERS,
          ServerPackage.SERVER__SERVER_CONTAINER);
    }
    return servers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isCleanPreviousRuntimes()
  {
    return cleanPreviousRuntimes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCleanPreviousRuntimes(boolean newCleanPreviousRuntimes)
  {
    boolean oldCleanPreviousRuntimes = cleanPreviousRuntimes;
    cleanPreviousRuntimes = newCleanPreviousRuntimes;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.SERVER_TASK_CONTAINER__CLEAN_PREVIOUS_RUNTIMES, oldCleanPreviousRuntimes,
          cleanPreviousRuntimes));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
    case ServerPackage.SERVER_TASK_CONTAINER__SERVERS:
      return ((InternalEList<InternalEObject>)(InternalEList<?>)getServers()).basicAdd(otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
    case ServerPackage.SERVER_TASK_CONTAINER__SERVERS:
      return ((InternalEList<?>)getServers()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
    case ServerPackage.SERVER_TASK_CONTAINER__SERVERS:
      return getServers();
    case ServerPackage.SERVER_TASK_CONTAINER__CLEAN_PREVIOUS_RUNTIMES:
      return isCleanPreviousRuntimes();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
    case ServerPackage.SERVER_TASK_CONTAINER__SERVERS:
      getServers().clear();
      getServers().addAll((Collection<? extends Server>)newValue);
      return;
    case ServerPackage.SERVER_TASK_CONTAINER__CLEAN_PREVIOUS_RUNTIMES:
      setCleanPreviousRuntimes((Boolean)newValue);
      return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
    case ServerPackage.SERVER_TASK_CONTAINER__SERVERS:
      getServers().clear();
      return;
    case ServerPackage.SERVER_TASK_CONTAINER__CLEAN_PREVIOUS_RUNTIMES:
      setCleanPreviousRuntimes(CLEAN_PREVIOUS_RUNTIMES_EDEFAULT);
      return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
    case ServerPackage.SERVER_TASK_CONTAINER__SERVERS:
      return servers != null && !servers.isEmpty();
    case ServerPackage.SERVER_TASK_CONTAINER__CLEAN_PREVIOUS_RUNTIMES:
      return cleanPreviousRuntimes != CLEAN_PREVIOUS_RUNTIMES_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy())
    {
      return super.toString();
    }

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (cleanPreviousRuntimes: ");
    result.append(cleanPreviousRuntimes);
    result.append(')');
    return result.toString();
  }

  /*
   * (non-Javadoc)
   * @see org.eclipse.oomph.setup.SetupTask#isNeeded(org.eclipse.oomph.setup.SetupTaskContext)
   */
  @Override
  public boolean isNeeded(SetupTaskContext context) throws Exception
  {
    return true;
  }

  /*
   * (non-Javadoc)
   * @see org.eclipse.oomph.setup.SetupTask#perform(org.eclipse.oomph.setup.SetupTaskContext)
   */
  @Override
  public void perform(SetupTaskContext context) throws Exception
  {
    if (isCleanPreviousRuntimes())
    {
      IServer[] serverList = ServerCore.getServers();
      if (serverList != null && serverList.length > 0)
      {
        for (IServer server : serverList)
        {
          context.log("Removing existing server " + server.getName(), Severity.INFO);
          server.delete();
        }
      }

      IRuntime[] runtimeList = ServerCore.getRuntimes();
      if (runtimeList != null && runtimeList.length > 0)
      {
        for (IRuntime runtime : runtimeList)
        {
          context.log("Removing existing runtime " + runtime.getName(), Severity.INFO);
          runtime.delete();
        }
      }
    }
  }

} // ServerTaskContainerImpl
