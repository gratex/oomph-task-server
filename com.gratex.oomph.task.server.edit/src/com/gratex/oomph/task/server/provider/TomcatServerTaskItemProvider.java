/**
 */
package com.gratex.oomph.task.server.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import com.gratex.oomph.task.server.ServerPackage;
import com.gratex.oomph.task.server.TomcatServerTask;

import java.util.Collection;
import java.util.List;

/**
 * This is the item provider adapter for a {@link com.gratex.oomph.task.server.TomcatServerTask} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TomcatServerTaskItemProvider extends ServerItemProvider
{
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TomcatServerTaskItemProvider(AdapterFactory adapterFactory)
  {
    super(adapterFactory);
  }

  /**
   * This returns the property descriptors for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object)
  {
    if (itemPropertyDescriptors == null)
    {
      super.getPropertyDescriptors(object);

      addJreVersionPropertyDescriptor(object);
      addPortPropertyDescriptor(object);
      addHttpsPortPropertyDescriptor(object);
      addServerVersionPropertyDescriptor(object);
      addLaunchProgramArgsPropertyDescriptor(object);
      addLaunchVmArgsPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Jre Version feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addJreVersionPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
        getString("_UI_TomcatServerTask_jreVersion_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_TomcatServerTask_jreVersion_feature", "_UI_TomcatServerTask_type"),
        ServerPackage.Literals.TOMCAT_SERVER_TASK__JRE_VERSION, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Port feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addPortPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
        getString("_UI_TomcatServerTask_port_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_TomcatServerTask_port_feature", "_UI_TomcatServerTask_type"),
        ServerPackage.Literals.TOMCAT_SERVER_TASK__PORT, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Https Port feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addHttpsPortPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
        getString("_UI_TomcatServerTask_httpsPort_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_TomcatServerTask_httpsPort_feature", "_UI_TomcatServerTask_type"),
        ServerPackage.Literals.TOMCAT_SERVER_TASK__HTTPS_PORT, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Server Version feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addServerVersionPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
        getString("_UI_TomcatServerTask_serverVersion_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_TomcatServerTask_serverVersion_feature", "_UI_TomcatServerTask_type"),
        ServerPackage.Literals.TOMCAT_SERVER_TASK__SERVER_VERSION, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Launch Program Args feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addLaunchProgramArgsPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
        getString("_UI_TomcatServerTask_launchProgramArgs_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_TomcatServerTask_launchProgramArgs_feature", "_UI_TomcatServerTask_type"),
        ServerPackage.Literals.TOMCAT_SERVER_TASK__LAUNCH_PROGRAM_ARGS, true, true, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Launch Vm Args feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addLaunchVmArgsPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
        getString("_UI_TomcatServerTask_launchVmArgs_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_TomcatServerTask_launchVmArgs_feature", "_UI_TomcatServerTask_type"),
        ServerPackage.Literals.TOMCAT_SERVER_TASK__LAUNCH_VM_ARGS, true, true, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
  }

  /**
   * This returns TomcatServerTask.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object)
  {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/TomcatServerTask"));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected boolean shouldComposeCreationImage()
  {
    return true;
  }

  /**
   * This returns the label text for the adapted class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getTextGen(Object object)
  {
    String label = ((TomcatServerTask)object).getID();
    return label == null || label.length() == 0 ? getString("_UI_TomcatServerTask_type") : getString("_UI_TomcatServerTask_type") + " " + label;
  }

  @Override
  public String getText(Object object)
  {
    String label = getTextGen(object);

    String type = getString("_UI_TomcatServerTask_type");
    return label.startsWith(type + " ") && !label.equals(type) ? label.substring(type.length()).trim() : label;
  }

  /**
   * This handles model notifications by calling {@link #updateChildren} to update any cached
   * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void notifyChanged(Notification notification)
  {
    updateChildren(notification);

    switch (notification.getFeatureID(TomcatServerTask.class))
    {
    case ServerPackage.TOMCAT_SERVER_TASK__JRE_VERSION:
    case ServerPackage.TOMCAT_SERVER_TASK__PORT:
    case ServerPackage.TOMCAT_SERVER_TASK__HTTPS_PORT:
    case ServerPackage.TOMCAT_SERVER_TASK__SERVER_VERSION:
    case ServerPackage.TOMCAT_SERVER_TASK__LAUNCH_PROGRAM_ARGS:
    case ServerPackage.TOMCAT_SERVER_TASK__LAUNCH_VM_ARGS:
      fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
      return;
    }
    super.notifyChanged(notification);
  }

  /**
   * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
   * that can be created under this object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object)
  {
    super.collectNewChildDescriptors(newChildDescriptors, object);
  }

}
