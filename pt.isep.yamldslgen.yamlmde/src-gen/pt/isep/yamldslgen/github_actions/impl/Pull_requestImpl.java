/**
 */
package pt.isep.yamldslgen.github_actions.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import pt.isep.yamldslgen.github_actions.Pull_request;
import pt.isep.yamldslgen.github_actions.YamlmdePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pull request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.Pull_requestImpl#getBranches <em>Branches</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.Pull_requestImpl#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Pull_requestImpl extends MinimalEObjectImpl.Container implements Pull_request {
	/**
	 * The cached value of the '{@link #getBranches() <em>Branches</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBranches()
	 * @generated
	 * @ordered
	 */
	protected EList<String> branches;

	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> types;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Pull_requestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return YamlmdePackage.Literals.PULL_REQUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getBranches() {
		if (branches == null) {
			branches = new EDataTypeUniqueEList<String>(String.class, this, YamlmdePackage.PULL_REQUEST__BRANCHES);
		}
		return branches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getTypes() {
		if (types == null) {
			types = new EDataTypeUniqueEList<String>(String.class, this, YamlmdePackage.PULL_REQUEST__TYPES);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case YamlmdePackage.PULL_REQUEST__BRANCHES:
			return getBranches();
		case YamlmdePackage.PULL_REQUEST__TYPES:
			return getTypes();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case YamlmdePackage.PULL_REQUEST__BRANCHES:
			getBranches().clear();
			getBranches().addAll((Collection<? extends String>) newValue);
			return;
		case YamlmdePackage.PULL_REQUEST__TYPES:
			getTypes().clear();
			getTypes().addAll((Collection<? extends String>) newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
		case YamlmdePackage.PULL_REQUEST__BRANCHES:
			getBranches().clear();
			return;
		case YamlmdePackage.PULL_REQUEST__TYPES:
			getTypes().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case YamlmdePackage.PULL_REQUEST__BRANCHES:
			return branches != null && !branches.isEmpty();
		case YamlmdePackage.PULL_REQUEST__TYPES:
			return types != null && !types.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (branches: ");
		result.append(branches);
		result.append(", types: ");
		result.append(types);
		result.append(')');
		return result.toString();
	}

} //Pull_requestImpl
