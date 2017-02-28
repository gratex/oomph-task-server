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
import com.gratex.oomph.task.server.WeblogicServerTask;

import java.util.Collection;
import java.util.List;

/**
 * This is the item provider adapter for a {@link com.gratex.oomph.task.server.WeblogicServerTask} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class WeblogicServerTaskItemProvider extends ServerItemProvider
{
  /**
   * This constructs an instance from a factory and a notifier.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WeblogicServerTaskItemProvider(AdapterFactory adapterFactory)
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
      addDebugPortPropertyDescriptor(object);
      addUsernamePropertyDescriptor(object);
      addPasswordPropertyDescriptor(object);
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
        getString("_UI_WeblogicServerTask_jreVersion_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_WeblogicServerTask_jreVersion_feature", "_UI_WeblogicServerTask_type"),
        ServerPackage.Literals.WEBLOGIC_SERVER_TASK__JRE_VERSION, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
        getString("_UI_WeblogicServerTask_port_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_WeblogicServerTask_port_feature", "_UI_WeblogicServerTask_type"),
        ServerPackage.Literals.WEBLOGIC_SERVER_TASK__PORT, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
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
        getString("_UI_WeblogicServerTask_httpsPort_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_WeblogicServerTask_httpsPort_feature", "_UI_WeblogicServerTask_type"),
        ServerPackage.Literals.WEBLOGIC_SERVER_TASK__HTTPS_PORT, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Debug Port feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addDebugPortPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
        getString("_UI_WeblogicServerTask_debugPort_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_WeblogicServerTask_debugPort_feature", "_UI_WeblogicServerTask_type"),
        ServerPackage.Literals.WEBLOGIC_SERVER_TASK__DEBUG_PORT, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Username feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addUsernamePropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
        getString("_UI_WeblogicServerTask_username_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_WeblogicServerTask_username_feature", "_UI_WeblogicServerTask_type"),
        ServerPackage.Literals.WEBLOGIC_SERVER_TASK__USERNAME, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
  }

  /**
   * This adds a property descriptor for the Password feature.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void addPasswordPropertyDescriptor(Object object)
  {
    itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(), getResourceLocator(),
        getString("_UI_WeblogicServerTask_password_feature"),
        getString("_UI_PropertyDescriptor_description", "_UI_WeblogicServerTask_password_feature", "_UI_WeblogicServerTask_type"),
        ServerPackage.Literals.WEBLOGIC_SERVER_TASK__PASSWORD, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
  }

  /**
   * This returns WeblogicServerTask.gif.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object getImage(Object object)
  {
    return overlayImage(object, getResourceLocator().getImage("full/obj16/WeblogicServerTask"));
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
  public String getTextGen(Object object)
  {
    String label = ((WeblogicServerTask)object).getID();
    return label == null || label.length() == 0 ? getString("_UI_WeblogicServerTask_type") : getString("_UI_WeblogicServerTask_type") + " " + label;
  }

  @Override
  public String getText(Object object)
  {
    String label = getTextGen(object);

    String type = getString("_UI_WeblogicServerTask_type");
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

    switch (notification.getFeatureID(WeblogicServerTask.class))
    {
    case ServerPackage.WEBLOGIC_SERVER_TASK__JRE_VERSION:
    case ServerPackage.WEBLOGIC_SERVER_TASK__PORT:
    case ServerPackage.WEBLOGIC_SERVER_TASK__HTTPS_PORT:
    case ServerPackage.WEBLOGIC_SERVER_TASK__DEBUG_PORT:
    case ServerPackage.WEBLOGIC_SERVER_TASK__USERNAME:
    case ServerPackage.WEBLOGIC_SERVER_TASK__PASSWORD:
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
