/**
 */
package pt.isep.yamldslgen.docker_compose.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import pt.isep.yamldslgen.docker_compose.DockercomposeFactory;
import pt.isep.yamldslgen.docker_compose.DockercomposePackage;
import pt.isep.yamldslgen.docker_compose.Service;

/**
 * This is the item provider adapter for a {@link pt.isep.yamldslgen.docker_compose.Service} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ServiceItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceItemProvider(AdapterFactory adapterFactory) {
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

			addIdPropertyDescriptor(object);
			addPortsPropertyDescriptor(object);
			addImagePropertyDescriptor(object);
			addRestartPropertyDescriptor(object);
			addContainerNamePropertyDescriptor(object);
			addCommandPropertyDescriptor(object);
			addStopSignalPropertyDescriptor(object);
			addExposePropertyDescriptor(object);
			addSecretsPropertyDescriptor(object);
			addUserPropertyDescriptor(object);
			addHostnamePropertyDescriptor(object);
			addCapAddPropertyDescriptor(object);
			addNetworkModePropertyDescriptor(object);
			addStdinOpenPropertyDescriptor(object);
			addLabelsPropertyDescriptor(object);
			addPlatformPropertyDescriptor(object);
			addRuntimePropertyDescriptor(object);
			addSysctlsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Service_id_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Service_id_feature", "_UI_Service_type"),
						DockercomposePackage.Literals.SERVICE__ID, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Ports feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPortsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Service_ports_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Service_ports_feature",
								"_UI_Service_type"),
						DockercomposePackage.Literals.SERVICE__PORTS, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Image feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImagePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Service_image_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Service_image_feature",
								"_UI_Service_type"),
						DockercomposePackage.Literals.SERVICE__IMAGE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Restart feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRestartPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Service_restart_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Service_restart_feature",
								"_UI_Service_type"),
						DockercomposePackage.Literals.SERVICE__RESTART, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Container Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContainerNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Service_containerName_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Service_containerName_feature",
								"_UI_Service_type"),
						DockercomposePackage.Literals.SERVICE__CONTAINER_NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Command feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommandPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Service_command_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Service_command_feature",
								"_UI_Service_type"),
						DockercomposePackage.Literals.SERVICE__COMMAND, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Stop Signal feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStopSignalPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Service_stopSignal_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Service_stopSignal_feature",
								"_UI_Service_type"),
						DockercomposePackage.Literals.SERVICE__STOP_SIGNAL, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Expose feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExposePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Service_expose_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Service_expose_feature",
								"_UI_Service_type"),
						DockercomposePackage.Literals.SERVICE__EXPOSE, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Secrets feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSecretsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Service_secrets_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Service_secrets_feature",
								"_UI_Service_type"),
						DockercomposePackage.Literals.SERVICE__SECRETS, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the User feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUserPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Service_user_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Service_user_feature", "_UI_Service_type"),
						DockercomposePackage.Literals.SERVICE__USER, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Hostname feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostnamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Service_hostname_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Service_hostname_feature",
								"_UI_Service_type"),
						DockercomposePackage.Literals.SERVICE__HOSTNAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Cap Add feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCapAddPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Service_capAdd_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Service_capAdd_feature",
								"_UI_Service_type"),
						DockercomposePackage.Literals.SERVICE__CAP_ADD, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Network Mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNetworkModePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Service_networkMode_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Service_networkMode_feature",
								"_UI_Service_type"),
						DockercomposePackage.Literals.SERVICE__NETWORK_MODE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Stdin Open feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStdinOpenPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Service_stdinOpen_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Service_stdinOpen_feature",
								"_UI_Service_type"),
						DockercomposePackage.Literals.SERVICE__STDIN_OPEN, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Labels feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLabelsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Service_labels_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Service_labels_feature",
								"_UI_Service_type"),
						DockercomposePackage.Literals.SERVICE__LABELS, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Platform feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPlatformPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Service_platform_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Service_platform_feature",
								"_UI_Service_type"),
						DockercomposePackage.Literals.SERVICE__PLATFORM, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Runtime feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRuntimePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Service_runtime_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Service_runtime_feature",
								"_UI_Service_type"),
						DockercomposePackage.Literals.SERVICE__RUNTIME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Sysctls feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSysctlsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Service_sysctls_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Service_sysctls_feature",
								"_UI_Service_type"),
						DockercomposePackage.Literals.SERVICE__SYSCTLS, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(DockercomposePackage.Literals.SERVICE__BUILD);
			childrenFeatures.add(DockercomposePackage.Literals.SERVICE__HEALTHCHECK);
			childrenFeatures.add(DockercomposePackage.Literals.SERVICE__DEPLOY);
			childrenFeatures.add(DockercomposePackage.Literals.SERVICE__DEPENDS_ON);
			childrenFeatures.add(DockercomposePackage.Literals.SERVICE__VOLUMES);
			childrenFeatures.add(DockercomposePackage.Literals.SERVICE__NETWORKS);
			childrenFeatures.add(DockercomposePackage.Literals.SERVICE__ENVIRONMENT);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Service.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Service"));
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
		String label = ((Service) object).getId();
		return label == null || label.length() == 0 ? getString("_UI_Service_type")
				: getString("_UI_Service_type") + " " + label;
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

		switch (notification.getFeatureID(Service.class)) {
		case DockercomposePackage.SERVICE__ID:
		case DockercomposePackage.SERVICE__PORTS:
		case DockercomposePackage.SERVICE__IMAGE:
		case DockercomposePackage.SERVICE__RESTART:
		case DockercomposePackage.SERVICE__CONTAINER_NAME:
		case DockercomposePackage.SERVICE__COMMAND:
		case DockercomposePackage.SERVICE__STOP_SIGNAL:
		case DockercomposePackage.SERVICE__EXPOSE:
		case DockercomposePackage.SERVICE__SECRETS:
		case DockercomposePackage.SERVICE__USER:
		case DockercomposePackage.SERVICE__HOSTNAME:
		case DockercomposePackage.SERVICE__CAP_ADD:
		case DockercomposePackage.SERVICE__NETWORK_MODE:
		case DockercomposePackage.SERVICE__STDIN_OPEN:
		case DockercomposePackage.SERVICE__LABELS:
		case DockercomposePackage.SERVICE__PLATFORM:
		case DockercomposePackage.SERVICE__RUNTIME:
		case DockercomposePackage.SERVICE__SYSCTLS:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case DockercomposePackage.SERVICE__BUILD:
		case DockercomposePackage.SERVICE__HEALTHCHECK:
		case DockercomposePackage.SERVICE__DEPLOY:
		case DockercomposePackage.SERVICE__DEPENDS_ON:
		case DockercomposePackage.SERVICE__VOLUMES:
		case DockercomposePackage.SERVICE__NETWORKS:
		case DockercomposePackage.SERVICE__ENVIRONMENT:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add(createChildParameter(DockercomposePackage.Literals.SERVICE__BUILD,
				DockercomposeFactory.eINSTANCE.createBuildObject()));

		newChildDescriptors.add(createChildParameter(DockercomposePackage.Literals.SERVICE__BUILD,
				DockercomposeFactory.eINSTANCE.createBuildValue()));

		newChildDescriptors.add(createChildParameter(DockercomposePackage.Literals.SERVICE__HEALTHCHECK,
				DockercomposeFactory.eINSTANCE.createHealthcheck()));

		newChildDescriptors.add(createChildParameter(DockercomposePackage.Literals.SERVICE__DEPLOY,
				DockercomposeFactory.eINSTANCE.createResource()));

		newChildDescriptors.add(createChildParameter(DockercomposePackage.Literals.SERVICE__DEPENDS_ON,
				DockercomposeFactory.eINSTANCE.createDepends_onObject()));

		newChildDescriptors.add(createChildParameter(DockercomposePackage.Literals.SERVICE__DEPENDS_ON,
				DockercomposeFactory.eINSTANCE.createDepends_onValue()));

		newChildDescriptors.add(createChildParameter(DockercomposePackage.Literals.SERVICE__VOLUMES,
				DockercomposeFactory.eINSTANCE.createVolumeObject()));

		newChildDescriptors.add(createChildParameter(DockercomposePackage.Literals.SERVICE__VOLUMES,
				DockercomposeFactory.eINSTANCE.createVolumeValue()));

		newChildDescriptors.add(createChildParameter(DockercomposePackage.Literals.SERVICE__NETWORKS,
				DockercomposeFactory.eINSTANCE.createNetworksObject()));

		newChildDescriptors.add(createChildParameter(DockercomposePackage.Literals.SERVICE__NETWORKS,
				DockercomposeFactory.eINSTANCE.createNetworksValue()));

		newChildDescriptors.add(createChildParameter(DockercomposePackage.Literals.SERVICE__ENVIRONMENT,
				DockercomposeFactory.eINSTANCE.createKeyValuePair()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return DockercomposeEditPlugin.INSTANCE;
	}

}
