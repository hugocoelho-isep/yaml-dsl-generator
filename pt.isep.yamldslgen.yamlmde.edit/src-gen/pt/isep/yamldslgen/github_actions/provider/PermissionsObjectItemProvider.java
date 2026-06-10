/**
 */
package pt.isep.yamldslgen.github_actions.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import pt.isep.yamldslgen.github_actions.PermissionsObject;
import pt.isep.yamldslgen.github_actions.YamlmdePackage;

/**
 * This is the item provider adapter for a {@link pt.isep.yamldslgen.github_actions.PermissionsObject} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PermissionsObjectItemProvider extends PermissionsItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PermissionsObjectItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addContentsPropertyDescriptor(object);
			addSecurityEventsPropertyDescriptor(object);
			addActionsPropertyDescriptor(object);
			addPagesPropertyDescriptor(object);
			addIdTokenPropertyDescriptor(object);
			addPullRequestsPropertyDescriptor(object);
			addIssuesPropertyDescriptor(object);
			addPackagesPropertyDescriptor(object);
			addModelsPropertyDescriptor(object);
			addChecksPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Contents feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContentsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_PermissionsObject_contents_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_PermissionsObject_contents_feature",
								"_UI_PermissionsObject_type"),
						YamlmdePackage.Literals.PERMISSIONS_OBJECT__CONTENTS, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Security Events feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSecurityEventsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_PermissionsObject_securityEvents_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_PermissionsObject_securityEvents_feature",
						"_UI_PermissionsObject_type"),
				YamlmdePackage.Literals.PERMISSIONS_OBJECT__SECURITY_EVENTS, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Actions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_PermissionsObject_actions_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_PermissionsObject_actions_feature",
								"_UI_PermissionsObject_type"),
						YamlmdePackage.Literals.PERMISSIONS_OBJECT__ACTIONS, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Pages feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPagesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_PermissionsObject_pages_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_PermissionsObject_pages_feature",
								"_UI_PermissionsObject_type"),
						YamlmdePackage.Literals.PERMISSIONS_OBJECT__PAGES, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Id Token feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdTokenPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_PermissionsObject_idToken_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_PermissionsObject_idToken_feature",
								"_UI_PermissionsObject_type"),
						YamlmdePackage.Literals.PERMISSIONS_OBJECT__ID_TOKEN, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Pull Requests feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPullRequestsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_PermissionsObject_pullRequests_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_PermissionsObject_pullRequests_feature",
						"_UI_PermissionsObject_type"),
				YamlmdePackage.Literals.PERMISSIONS_OBJECT__PULL_REQUESTS, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Issues feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIssuesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_PermissionsObject_issues_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_PermissionsObject_issues_feature",
								"_UI_PermissionsObject_type"),
						YamlmdePackage.Literals.PERMISSIONS_OBJECT__ISSUES, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Packages feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPackagesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_PermissionsObject_packages_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_PermissionsObject_packages_feature",
								"_UI_PermissionsObject_type"),
						YamlmdePackage.Literals.PERMISSIONS_OBJECT__PACKAGES, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Models feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModelsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_PermissionsObject_models_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_PermissionsObject_models_feature",
								"_UI_PermissionsObject_type"),
						YamlmdePackage.Literals.PERMISSIONS_OBJECT__MODELS, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Checks feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addChecksPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_PermissionsObject_checks_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_PermissionsObject_checks_feature",
								"_UI_PermissionsObject_type"),
						YamlmdePackage.Literals.PERMISSIONS_OBJECT__CHECKS, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns PermissionsObject.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PermissionsObject"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((PermissionsObject) object).getContents();
		return label == null || label.length() == 0 ? getString("_UI_PermissionsObject_type")
				: getString("_UI_PermissionsObject_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(PermissionsObject.class)) {
		case YamlmdePackage.PERMISSIONS_OBJECT__CONTENTS:
		case YamlmdePackage.PERMISSIONS_OBJECT__SECURITY_EVENTS:
		case YamlmdePackage.PERMISSIONS_OBJECT__ACTIONS:
		case YamlmdePackage.PERMISSIONS_OBJECT__PAGES:
		case YamlmdePackage.PERMISSIONS_OBJECT__ID_TOKEN:
		case YamlmdePackage.PERMISSIONS_OBJECT__PULL_REQUESTS:
		case YamlmdePackage.PERMISSIONS_OBJECT__ISSUES:
		case YamlmdePackage.PERMISSIONS_OBJECT__PACKAGES:
		case YamlmdePackage.PERMISSIONS_OBJECT__MODELS:
		case YamlmdePackage.PERMISSIONS_OBJECT__CHECKS:
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
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
