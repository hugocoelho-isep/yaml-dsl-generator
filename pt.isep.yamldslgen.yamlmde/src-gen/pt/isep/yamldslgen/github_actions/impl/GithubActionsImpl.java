/**
 */
package pt.isep.yamldslgen.github_actions.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pt.isep.yamldslgen.github_actions.GithubActions;
import pt.isep.yamldslgen.github_actions.Job;
import pt.isep.yamldslgen.github_actions.On;
import pt.isep.yamldslgen.github_actions.YamlmdePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Github Actions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.GithubActionsImpl#getName <em>Name</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.GithubActionsImpl#getOn <em>On</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.GithubActionsImpl#getJobs <em>Jobs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GithubActionsImpl extends MinimalEObjectImpl.Container implements GithubActions {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOn() <em>On</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOn()
	 * @generated
	 * @ordered
	 */
	protected On on;

	/**
	 * The cached value of the '{@link #getJobs() <em>Jobs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobs()
	 * @generated
	 * @ordered
	 */
	protected EList<Job> jobs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GithubActionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return YamlmdePackage.Literals.GITHUB_ACTIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YamlmdePackage.GITHUB_ACTIONS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public On getOn() {
		return on;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOn(On newOn, NotificationChain msgs) {
		On oldOn = on;
		on = newOn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					YamlmdePackage.GITHUB_ACTIONS__ON, oldOn, newOn);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOn(On newOn) {
		if (newOn != on) {
			NotificationChain msgs = null;
			if (on != null)
				msgs = ((InternalEObject) on).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - YamlmdePackage.GITHUB_ACTIONS__ON, null, msgs);
			if (newOn != null)
				msgs = ((InternalEObject) newOn).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - YamlmdePackage.GITHUB_ACTIONS__ON, null, msgs);
			msgs = basicSetOn(newOn, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YamlmdePackage.GITHUB_ACTIONS__ON, newOn, newOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Job> getJobs() {
		if (jobs == null) {
			jobs = new EObjectContainmentEList<Job>(Job.class, this, YamlmdePackage.GITHUB_ACTIONS__JOBS);
		}
		return jobs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case YamlmdePackage.GITHUB_ACTIONS__ON:
			return basicSetOn(null, msgs);
		case YamlmdePackage.GITHUB_ACTIONS__JOBS:
			return ((InternalEList<?>) getJobs()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case YamlmdePackage.GITHUB_ACTIONS__NAME:
			return getName();
		case YamlmdePackage.GITHUB_ACTIONS__ON:
			return getOn();
		case YamlmdePackage.GITHUB_ACTIONS__JOBS:
			return getJobs();
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
		case YamlmdePackage.GITHUB_ACTIONS__NAME:
			setName((String) newValue);
			return;
		case YamlmdePackage.GITHUB_ACTIONS__ON:
			setOn((On) newValue);
			return;
		case YamlmdePackage.GITHUB_ACTIONS__JOBS:
			getJobs().clear();
			getJobs().addAll((Collection<? extends Job>) newValue);
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
		case YamlmdePackage.GITHUB_ACTIONS__NAME:
			setName(NAME_EDEFAULT);
			return;
		case YamlmdePackage.GITHUB_ACTIONS__ON:
			setOn((On) null);
			return;
		case YamlmdePackage.GITHUB_ACTIONS__JOBS:
			getJobs().clear();
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
		case YamlmdePackage.GITHUB_ACTIONS__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case YamlmdePackage.GITHUB_ACTIONS__ON:
			return on != null;
		case YamlmdePackage.GITHUB_ACTIONS__JOBS:
			return jobs != null && !jobs.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //GithubActionsImpl
