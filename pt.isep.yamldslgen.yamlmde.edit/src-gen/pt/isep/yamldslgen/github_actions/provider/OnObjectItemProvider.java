/**
 */
package pt.isep.yamldslgen.github_actions.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import pt.isep.yamldslgen.github_actions.OnObject;
import pt.isep.yamldslgen.github_actions.YamlmdeFactory;
import pt.isep.yamldslgen.github_actions.YamlmdePackage;

/**
 * This is the item provider adapter for a {@link pt.isep.yamldslgen.github_actions.OnObject} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OnObjectItemProvider extends OnItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnObjectItemProvider(AdapterFactory adapterFactory) {
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
						getResourceLocator(), getString("_UI_OnObject_branchProtectionRule_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_OnObject_branchProtectionRule_feature",
								"_UI_OnObject_type"),
						YamlmdePackage.Literals.ON_OBJECT__BRANCH_PROTECTION_RULE, true, false, false,
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
			childrenFeatures.add(YamlmdePackage.Literals.ON_OBJECT__PUSH);
			childrenFeatures.add(YamlmdePackage.Literals.ON_OBJECT__PULL_REQUEST);
			childrenFeatures.add(YamlmdePackage.Literals.ON_OBJECT__SCHEDULE);
			childrenFeatures.add(YamlmdePackage.Literals.ON_OBJECT__WORKFLOW_DISPATCH);
			childrenFeatures.add(YamlmdePackage.Literals.ON_OBJECT__WORKFLOW_CALL);
			childrenFeatures.add(YamlmdePackage.Literals.ON_OBJECT__PULL_REQUEST_TARGET);
			childrenFeatures.add(YamlmdePackage.Literals.ON_OBJECT__RELEASE);
			childrenFeatures.add(YamlmdePackage.Literals.ON_OBJECT__MERGE_GROUP);
			childrenFeatures.add(YamlmdePackage.Literals.ON_OBJECT__ISSUES);
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
	 * This returns OnObject.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/OnObject"));
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
		String label = ((OnObject) object).getBranchProtectionRule();
		return label == null || label.length() == 0 ? getString("_UI_OnObject_type")
				: getString("_UI_OnObject_type") + " " + label;
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

		switch (notification.getFeatureID(OnObject.class)) {
		case YamlmdePackage.ON_OBJECT__BRANCH_PROTECTION_RULE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case YamlmdePackage.ON_OBJECT__PUSH:
		case YamlmdePackage.ON_OBJECT__PULL_REQUEST:
		case YamlmdePackage.ON_OBJECT__SCHEDULE:
		case YamlmdePackage.ON_OBJECT__WORKFLOW_DISPATCH:
		case YamlmdePackage.ON_OBJECT__WORKFLOW_CALL:
		case YamlmdePackage.ON_OBJECT__PULL_REQUEST_TARGET:
		case YamlmdePackage.ON_OBJECT__RELEASE:
		case YamlmdePackage.ON_OBJECT__MERGE_GROUP:
		case YamlmdePackage.ON_OBJECT__ISSUES:
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

		newChildDescriptors.add(
				createChildParameter(YamlmdePackage.Literals.ON_OBJECT__PUSH, YamlmdeFactory.eINSTANCE.createPush()));

		newChildDescriptors.add(createChildParameter(YamlmdePackage.Literals.ON_OBJECT__PULL_REQUEST,
				YamlmdeFactory.eINSTANCE.createPull_request()));

		newChildDescriptors.add(createChildParameter(YamlmdePackage.Literals.ON_OBJECT__SCHEDULE,
				YamlmdeFactory.eINSTANCE.createSchedule()));

		newChildDescriptors.add(createChildParameter(YamlmdePackage.Literals.ON_OBJECT__WORKFLOW_DISPATCH,
				YamlmdeFactory.eINSTANCE.createWorkflow_dispatch()));

		newChildDescriptors.add(createChildParameter(YamlmdePackage.Literals.ON_OBJECT__WORKFLOW_CALL,
				YamlmdeFactory.eINSTANCE.createWorkflow_call()));

		newChildDescriptors.add(createChildParameter(YamlmdePackage.Literals.ON_OBJECT__PULL_REQUEST_TARGET,
				YamlmdeFactory.eINSTANCE.createPull_request()));

		newChildDescriptors.add(createChildParameter(YamlmdePackage.Literals.ON_OBJECT__RELEASE,
				YamlmdeFactory.eINSTANCE.createRelease()));

		newChildDescriptors.add(createChildParameter(YamlmdePackage.Literals.ON_OBJECT__MERGE_GROUP,
				YamlmdeFactory.eINSTANCE.createMerge_group()));

		newChildDescriptors.add(createChildParameter(YamlmdePackage.Literals.ON_OBJECT__ISSUES,
				YamlmdeFactory.eINSTANCE.createIssues()));
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

		boolean qualify = childFeature == YamlmdePackage.Literals.ON_OBJECT__PULL_REQUEST
				|| childFeature == YamlmdePackage.Literals.ON_OBJECT__PULL_REQUEST_TARGET;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
