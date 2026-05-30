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

import pt.isep.yamldslgen.github_actions.On;
import pt.isep.yamldslgen.github_actions.YamlmdeFactory;
import pt.isep.yamldslgen.github_actions.YamlmdePackage;

/**
 * This is the item provider adapter for a {@link pt.isep.yamldslgen.github_actions.On} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OnItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnItemProvider(AdapterFactory adapterFactory) {
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

			addBranchProtectionRulePropertyDescriptor(object);
			addWorkflowDispatchPropertyDescriptor(object);
			addIssuesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Branch Protection Rule feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBranchProtectionRulePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_On_branchProtectionRule_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_On_branchProtectionRule_feature",
								"_UI_On_type"),
						YamlmdePackage.Literals.ON__BRANCH_PROTECTION_RULE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Workflow Dispatch feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWorkflowDispatchPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_On_workflowDispatch_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_On_workflowDispatch_feature",
								"_UI_On_type"),
						YamlmdePackage.Literals.ON__WORKFLOW_DISPATCH, true, false, false, null, null, null));
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
						getResourceLocator(), getString("_UI_On_issues_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_On_issues_feature", "_UI_On_type"),
						YamlmdePackage.Literals.ON__ISSUES, true, false, false, null, null, null));
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
			childrenFeatures.add(YamlmdePackage.Literals.ON__PUSH);
			childrenFeatures.add(YamlmdePackage.Literals.ON__PULL_REQUEST);
			childrenFeatures.add(YamlmdePackage.Literals.ON__SCHEDULE);
			childrenFeatures.add(YamlmdePackage.Literals.ON__WORKFLOW_CALL);
			childrenFeatures.add(YamlmdePackage.Literals.ON__PULL_REQUEST_TARGET);
			childrenFeatures.add(YamlmdePackage.Literals.ON__RELEASE);
			childrenFeatures.add(YamlmdePackage.Literals.ON__MERGE_GROUP);
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
	 * This returns On.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/On"));
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
		String label = ((On) object).getBranchProtectionRule();
		return label == null || label.length() == 0 ? getString("_UI_On_type") : getString("_UI_On_type") + " " + label;
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

		switch (notification.getFeatureID(On.class)) {
		case YamlmdePackage.ON__BRANCH_PROTECTION_RULE:
		case YamlmdePackage.ON__WORKFLOW_DISPATCH:
		case YamlmdePackage.ON__ISSUES:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case YamlmdePackage.ON__PUSH:
		case YamlmdePackage.ON__PULL_REQUEST:
		case YamlmdePackage.ON__SCHEDULE:
		case YamlmdePackage.ON__WORKFLOW_CALL:
		case YamlmdePackage.ON__PULL_REQUEST_TARGET:
		case YamlmdePackage.ON__RELEASE:
		case YamlmdePackage.ON__MERGE_GROUP:
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
				.add(createChildParameter(YamlmdePackage.Literals.ON__PUSH, YamlmdeFactory.eINSTANCE.createPush()));

		newChildDescriptors.add(createChildParameter(YamlmdePackage.Literals.ON__PULL_REQUEST,
				YamlmdeFactory.eINSTANCE.createPull_request()));

		newChildDescriptors.add(
				createChildParameter(YamlmdePackage.Literals.ON__SCHEDULE, YamlmdeFactory.eINSTANCE.createSchedule()));

		newChildDescriptors.add(createChildParameter(YamlmdePackage.Literals.ON__WORKFLOW_CALL,
				YamlmdeFactory.eINSTANCE.createWorkflow_call()));

		newChildDescriptors.add(createChildParameter(YamlmdePackage.Literals.ON__PULL_REQUEST_TARGET,
				YamlmdeFactory.eINSTANCE.createPull_request()));

		newChildDescriptors.add(
				createChildParameter(YamlmdePackage.Literals.ON__RELEASE, YamlmdeFactory.eINSTANCE.createRelease()));

		newChildDescriptors.add(createChildParameter(YamlmdePackage.Literals.ON__MERGE_GROUP,
				YamlmdeFactory.eINSTANCE.createMerge_group()));
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

		boolean qualify = childFeature == YamlmdePackage.Literals.ON__PULL_REQUEST
				|| childFeature == YamlmdePackage.Literals.ON__PULL_REQUEST_TARGET;

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
