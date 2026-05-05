/**
 */
package pt.isep.yamldslgen.github_actions.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import pt.isep.yamldslgen.github_actions.Permissions;
import pt.isep.yamldslgen.github_actions.YamlmdePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Permissions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.PermissionsImpl#getContents <em>Contents</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PermissionsImpl extends MinimalEObjectImpl.Container implements Permissions {
	/**
	 * The default value of the '{@link #getContents() <em>Contents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContents()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContents() <em>Contents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContents()
	 * @generated
	 * @ordered
	 */
	protected String contents = CONTENTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PermissionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return YamlmdePackage.Literals.PERMISSIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContents() {
		return contents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContents(String newContents) {
		String oldContents = contents;
		contents = newContents;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YamlmdePackage.PERMISSIONS__CONTENTS, oldContents,
					contents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case YamlmdePackage.PERMISSIONS__CONTENTS:
			return getContents();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case YamlmdePackage.PERMISSIONS__CONTENTS:
			setContents((String) newValue);
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
		case YamlmdePackage.PERMISSIONS__CONTENTS:
			setContents(CONTENTS_EDEFAULT);
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
		case YamlmdePackage.PERMISSIONS__CONTENTS:
			return CONTENTS_EDEFAULT == null ? contents != null : !CONTENTS_EDEFAULT.equals(contents);
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
		result.append(" (contents: ");
		result.append(contents);
		result.append(')');
		return result.toString();
	}

} //PermissionsImpl
