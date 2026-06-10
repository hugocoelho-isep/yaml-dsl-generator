/**
 */
package pt.isep.yamldslgen.github_actions.provider;

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

import pt.isep.yamldslgen.github_actions.Job;
import pt.isep.yamldslgen.github_actions.YamlmdeFactory;
import pt.isep.yamldslgen.github_actions.YamlmdePackage;

/**
 * This is the item provider adapter for a {@link pt.isep.yamldslgen.github_actions.Job} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class JobItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobItemProvider(AdapterFactory adapterFactory) {
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
			addRunsOnPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addNeedsPropertyDescriptor(object);
			addIfPropertyDescriptor(object);
			addUsesPropertyDescriptor(object);
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
						getResourceLocator(), getString("_UI_Job_id_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Job_id_feature", "_UI_Job_type"),
						YamlmdePackage.Literals.JOB__ID, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
						null, null));
	}

	/**
	 * This adds a property descriptor for the Runs On feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRunsOnPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Job_runsOn_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Job_runsOn_feature", "_UI_Job_type"),
						YamlmdePackage.Literals.JOB__RUNS_ON, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Job_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Job_name_feature", "_UI_Job_type"),
						YamlmdePackage.Literals.JOB__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Needs feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNeedsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Job_needs_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Job_needs_feature", "_UI_Job_type"),
						YamlmdePackage.Literals.JOB__NEEDS, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the If feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIfPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Job_if_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Job_if_feature", "_UI_Job_type"),
						YamlmdePackage.Literals.JOB__IF, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
						null, null));
	}

	/**
	 * This adds a property descriptor for the Uses feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUsesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Job_uses_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Job_uses_feature", "_UI_Job_type"),
						YamlmdePackage.Literals.JOB__USES, true, false, false,
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
			childrenFeatures.add(YamlmdePackage.Literals.JOB__STEPS);
			childrenFeatures.add(YamlmdePackage.Literals.JOB__PERMISSIONS);
			childrenFeatures.add(YamlmdePackage.Literals.JOB__ENVIRONMENT);
			childrenFeatures.add(YamlmdePackage.Literals.JOB__STRATEGY);
			childrenFeatures.add(YamlmdePackage.Literals.JOB__CONTAINER);
			childrenFeatures.add(YamlmdePackage.Literals.JOB__SERVICES);
			childrenFeatures.add(YamlmdePackage.Literals.JOB__DEFAULTS);
			childrenFeatures.add(YamlmdePackage.Literals.JOB__WITH);
			childrenFeatures.add(YamlmdePackage.Literals.JOB__ENV);
			childrenFeatures.add(YamlmdePackage.Literals.JOB__OUTPUTS);
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
	 * This returns Job.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Job"));
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
		String label = ((Job) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Job_type")
				: getString("_UI_Job_type") + " " + label;
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

		switch (notification.getFeatureID(Job.class)) {
		case YamlmdePackage.JOB__ID:
		case YamlmdePackage.JOB__RUNS_ON:
		case YamlmdePackage.JOB__NAME:
		case YamlmdePackage.JOB__NEEDS:
		case YamlmdePackage.JOB__IF:
		case YamlmdePackage.JOB__USES:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case YamlmdePackage.JOB__STEPS:
		case YamlmdePackage.JOB__PERMISSIONS:
		case YamlmdePackage.JOB__ENVIRONMENT:
		case YamlmdePackage.JOB__STRATEGY:
		case YamlmdePackage.JOB__CONTAINER:
		case YamlmdePackage.JOB__SERVICES:
		case YamlmdePackage.JOB__DEFAULTS:
		case YamlmdePackage.JOB__WITH:
		case YamlmdePackage.JOB__ENV:
		case YamlmdePackage.JOB__OUTPUTS:
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

		newChildDescriptors
				.add(createChildParameter(YamlmdePackage.Literals.JOB__STEPS, YamlmdeFactory.eINSTANCE.createStep()));

		newChildDescriptors.add(createChildParameter(YamlmdePackage.Literals.JOB__PERMISSIONS,
				YamlmdeFactory.eINSTANCE.createPermissionsObject()));

		newChildDescriptors.add(createChildParameter(YamlmdePackage.Literals.JOB__PERMISSIONS,
				YamlmdeFactory.eINSTANCE.createPermissionsValue()));

		newChildDescriptors.add(createChildParameter(YamlmdePackage.Literals.JOB__ENVIRONMENT,
				YamlmdeFactory.eINSTANCE.createEnvironmentObject()));

		newChildDescriptors.add(createChildParameter(YamlmdePackage.Literals.JOB__ENVIRONMENT,
				YamlmdeFactory.eINSTANCE.createEnvironmentValue()));

		newChildDescriptors.add(
				createChildParameter(YamlmdePackage.Literals.JOB__STRATEGY, YamlmdeFactory.eINSTANCE.createStrategy()));

		newChildDescriptors.add(createChildParameter(YamlmdePackage.Literals.JOB__CONTAINER,
				YamlmdeFactory.eINSTANCE.createContainer()));

		newChildDescriptors.add(
				createChildParameter(YamlmdePackage.Literals.JOB__SERVICES, YamlmdeFactory.eINSTANCE.createService()));

		newChildDescriptors.add(
				createChildParameter(YamlmdePackage.Literals.JOB__DEFAULTS, YamlmdeFactory.eINSTANCE.createDefaults()));

		newChildDescriptors.add(
				createChildParameter(YamlmdePackage.Literals.JOB__WITH, YamlmdeFactory.eINSTANCE.createKeyValuePair()));

		newChildDescriptors.add(
				createChildParameter(YamlmdePackage.Literals.JOB__ENV, YamlmdeFactory.eINSTANCE.createKeyValuePair()));

		newChildDescriptors.add(createChildParameter(YamlmdePackage.Literals.JOB__OUTPUTS,
				YamlmdeFactory.eINSTANCE.createKeyValuePair()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == YamlmdePackage.Literals.JOB__WITH
				|| childFeature == YamlmdePackage.Literals.JOB__ENV
				|| childFeature == YamlmdePackage.Literals.JOB__OUTPUTS;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return YamlmdeEditPlugin.INSTANCE;
	}

}
