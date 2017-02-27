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
import com.gratex.oomph.task.server.WebsphereServerTask;

import java.util.Collection;
import java.util.List;

/**
 * This is the item provider adapter for a {@link com.gratex.oomph.task.server.WebsphereServerTask} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WebsphereServerTaskItemProvider extends ServerItemProvider
{
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WebsphereServerTaskItemProvider(AdapterFactory adapterFactory)
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

      addBaseServerNamePropertyDescriptor(object);
      addProfilePathPropertyDescriptor(object);
      addBootstrapPortPropertyDescriptor(object);
      addIcpPortPropertyDescriptor(object);
      addSoapPortPropertyDescriptor(object);
      addRemoteOsUserPropertyDescriptor(object);
      addRemoteOsPasswordPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Base Server Name feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addBaseServerNamePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
        getString("_UI_WebsphereServerTask_baseServerName_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_WebsphereServerTask_baseServerName_feature", "_UI_WebsphereServerTask_type"),
        ServerPackage.Literals.WEBSPHERE_SERVER_TASK__BASE_SERVER_NAME, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Profile Path feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addProfilePathPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
        getString("_UI_WebsphereServerTask_profilePath_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_WebsphereServerTask_profilePath_feature", "_UI_WebsphereServerTask_type"),
        ServerPackage.Literals.WEBSPHERE_SERVER_TASK__PROFILE_PATH, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Bootstrap Port feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addBootstrapPortPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
        getString("_UI_WebsphereServerTask_bootstrapPort_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_WebsphereServerTask_bootstrapPort_feature", "_UI_WebsphereServerTask_type"),
        ServerPackage.Literals.WEBSPHERE_SERVER_TASK__BOOTSTRAP_PORT, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Icp Port feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addIcpPortPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
        getString("_UI_WebsphereServerTask_icpPort_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_WebsphereServerTask_icpPort_feature", "_UI_WebsphereServerTask_type"),
        ServerPackage.Literals.WEBSPHERE_SERVER_TASK__ICP_PORT, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Soap Port feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addSoapPortPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
        getString("_UI_WebsphereServerTask_soapPort_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_WebsphereServerTask_soapPort_feature", "_UI_WebsphereServerTask_type"),
        ServerPackage.Literals.WEBSPHERE_SERVER_TASK__SOAP_PORT, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Remote Os User feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addRemoteOsUserPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
        getString("_UI_WebsphereServerTask_remoteOsUser_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_WebsphereServerTask_remoteOsUser_feature", "_UI_WebsphereServerTask_type"),
        ServerPackage.Literals.WEBSPHERE_SERVER_TASK__REMOTE_OS_USER, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Remote Os Password feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addRemoteOsPasswordPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
        getString("_UI_WebsphereServerTask_remoteOsPassword_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_WebsphereServerTask_remoteOsPassword_feature", "_UI_WebsphereServerTask_type"),
        ServerPackage.Literals.WEBSPHERE_SERVER_TASK__REMOTE_OS_PASSWORD, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
  }

  /**
   * This returns WebsphereServerTask.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object)
  {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/WebsphereServerTask"));
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
    String label = ((WebsphereServerTask)object).getID();
    return label == null || label.length() == 0 ? getString("_UI_WebsphereServerTask_type") : getString("_UI_WebsphereServerTask_type") + " " + label;
  }

  @Override
  public String getText(Object object)
  {
    String label = getTextGen(object);

    String type = getString("_UI_WebsphereServerTask_type");
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

    switch (notification.getFeatureID(WebsphereServerTask.class))
    {
    case ServerPackage.WEBSPHERE_SERVER_TASK__BASE_SERVER_NAME:
    case ServerPackage.WEBSPHERE_SERVER_TASK__PROFILE_PATH:
    case ServerPackage.WEBSPHERE_SERVER_TASK__BOOTSTRAP_PORT:
    case ServerPackage.WEBSPHERE_SERVER_TASK__ICP_PORT:
    case ServerPackage.WEBSPHERE_SERVER_TASK__SOAP_PORT:
    case ServerPackage.WEBSPHERE_SERVER_TASK__REMOTE_OS_USER:
    case ServerPackage.WEBSPHERE_SERVER_TASK__REMOTE_OS_PASSWORD:
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
