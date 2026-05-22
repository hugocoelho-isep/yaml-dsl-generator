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

import pt.isep.yamldslgen.github_actions.Concurrency;
import pt.isep.yamldslgen.github_actions.Defaults;
import pt.isep.yamldslgen.github_actions.GithubActions;
import pt.isep.yamldslgen.github_actions.Job;
import pt.isep.yamldslgen.github_actions.KeyValuePair;
import pt.isep.yamldslgen.github_actions.On;
import pt.isep.yamldslgen.github_actions.Permissions;
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
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.GithubActionsImpl#getJobs <em>Jobs</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.GithubActionsImpl#getOn <em>On</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.GithubActionsImpl#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.GithubActionsImpl#getConcurrency <em>Concurrency</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.GithubActionsImpl#getDefaults <em>Defaults</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.GithubActionsImpl#getEnv <em>Env</em>}</li>
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
	 * The cached value of the '{@link #getJobs() <em>Jobs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobs()
	 * @generated
	 * @ordered
	 */
	protected EList<Job> jobs;

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
	 * The cached value of the '{@link #getPermissions() <em>Permissions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermissions()
	 * @generated
	 * @ordered
	 */
	protected Permissions permissions;

	/**
	 * The cached value of the '{@link #getConcurrency() <em>Concurrency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcurrency()
	 * @generated
	 * @ordered
	 */
	protected Concurrency concurrency;

	/**
	 * The cached value of the '{@link #getDefaults() <em>Defaults</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaults()
	 * @generated
	 * @ordered
	 */
	protected Defaults defaults;

	/**
	 * The cached value of the '{@link #getEnv() <em>Env</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnv()
	 * @generated
	 * @ordered
	 */
	protected EList<KeyValuePair> env;

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
	public Permissions getPermissions() {
		return permissions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPermissions(Permissions newPermissions, NotificationChain msgs) {
		Permissions oldPermissions = permissions;
		permissions = newPermissions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					YamlmdePackage.GITHUB_ACTIONS__PERMISSIONS, oldPermissions, newPermissions);
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
	public void setPermissions(Permissions newPermissions) {
		if (newPermissions != permissions) {
			NotificationChain msgs = null;
			if (permissions != null)
				msgs = ((InternalEObject) permissions).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - YamlmdePackage.GITHUB_ACTIONS__PERMISSIONS, null, msgs);
			if (newPermissions != null)
				msgs = ((InternalEObject) newPermissions).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - YamlmdePackage.GITHUB_ACTIONS__PERMISSIONS, null, msgs);
			msgs = basicSetPermissions(newPermissions, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YamlmdePackage.GITHUB_ACTIONS__PERMISSIONS,
					newPermissions, newPermissions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Concurrency getConcurrency() {
		return concurrency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcurrency(Concurrency newConcurrency, NotificationChain msgs) {
		Concurrency oldConcurrency = concurrency;
		concurrency = newConcurrency;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					YamlmdePackage.GITHUB_ACTIONS__CONCURRENCY, oldConcurrency, newConcurrency);
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
	public void setConcurrency(Concurrency newConcurrency) {
		if (newConcurrency != concurrency) {
			NotificationChain msgs = null;
			if (concurrency != null)
				msgs = ((InternalEObject) concurrency).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - YamlmdePackage.GITHUB_ACTIONS__CONCURRENCY, null, msgs);
			if (newConcurrency != null)
				msgs = ((InternalEObject) newConcurrency).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - YamlmdePackage.GITHUB_ACTIONS__CONCURRENCY, null, msgs);
			msgs = basicSetConcurrency(newConcurrency, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YamlmdePackage.GITHUB_ACTIONS__CONCURRENCY,
					newConcurrency, newConcurrency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Defaults getDefaults() {
		return defaults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaults(Defaults newDefaults, NotificationChain msgs) {
		Defaults oldDefaults = defaults;
		defaults = newDefaults;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					YamlmdePackage.GITHUB_ACTIONS__DEFAULTS, oldDefaults, newDefaults);
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
	public void setDefaults(Defaults newDefaults) {
		if (newDefaults != defaults) {
			NotificationChain msgs = null;
			if (defaults != null)
				msgs = ((InternalEObject) defaults).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - YamlmdePackage.GITHUB_ACTIONS__DEFAULTS, null, msgs);
			if (newDefaults != null)
				msgs = ((InternalEObject) newDefaults).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - YamlmdePackage.GITHUB_ACTIONS__DEFAULTS, null, msgs);
			msgs = basicSetDefaults(newDefaults, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YamlmdePackage.GITHUB_ACTIONS__DEFAULTS, newDefaults,
					newDefaults));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<KeyValuePair> getEnv() {
		if (env == null) {
			env = new EObjectContainmentEList<KeyValuePair>(KeyValuePair.class, this,
					YamlmdePackage.GITHUB_ACTIONS__ENV);
		}
		return env;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case YamlmdePackage.GITHUB_ACTIONS__JOBS:
			return ((InternalEList<?>) getJobs()).basicRemove(otherEnd, msgs);
		case YamlmdePackage.GITHUB_ACTIONS__ON:
			return basicSetOn(null, msgs);
		case YamlmdePackage.GITHUB_ACTIONS__PERMISSIONS:
			return basicSetPermissions(null, msgs);
		case YamlmdePackage.GITHUB_ACTIONS__CONCURRENCY:
			return basicSetConcurrency(null, msgs);
		case YamlmdePackage.GITHUB_ACTIONS__DEFAULTS:
			return basicSetDefaults(null, msgs);
		case YamlmdePackage.GITHUB_ACTIONS__ENV:
			return ((InternalEList<?>) getEnv()).basicRemove(otherEnd, msgs);
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
		case YamlmdePackage.GITHUB_ACTIONS__JOBS:
			return getJobs();
		case YamlmdePackage.GITHUB_ACTIONS__ON:
			return getOn();
		case YamlmdePackage.GITHUB_ACTIONS__PERMISSIONS:
			return getPermissions();
		case YamlmdePackage.GITHUB_ACTIONS__CONCURRENCY:
			return getConcurrency();
		case YamlmdePackage.GITHUB_ACTIONS__DEFAULTS:
			return getDefaults();
		case YamlmdePackage.GITHUB_ACTIONS__ENV:
			return getEnv();
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
		case YamlmdePackage.GITHUB_ACTIONS__JOBS:
			getJobs().clear();
			getJobs().addAll((Collection<? extends Job>) newValue);
			return;
		case YamlmdePackage.GITHUB_ACTIONS__ON:
			setOn((On) newValue);
			return;
		case YamlmdePackage.GITHUB_ACTIONS__PERMISSIONS:
			setPermissions((Permissions) newValue);
			return;
		case YamlmdePackage.GITHUB_ACTIONS__CONCURRENCY:
			setConcurrency((Concurrency) newValue);
			return;
		case YamlmdePackage.GITHUB_ACTIONS__DEFAULTS:
			setDefaults((Defaults) newValue);
			return;
		case YamlmdePackage.GITHUB_ACTIONS__ENV:
			getEnv().clear();
			getEnv().addAll((Collection<? extends KeyValuePair>) newValue);
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
		case YamlmdePackage.GITHUB_ACTIONS__JOBS:
			getJobs().clear();
			return;
		case YamlmdePackage.GITHUB_ACTIONS__ON:
			setOn((On) null);
			return;
		case YamlmdePackage.GITHUB_ACTIONS__PERMISSIONS:
			setPermissions((Permissions) null);
			return;
		case YamlmdePackage.GITHUB_ACTIONS__CONCURRENCY:
			setConcurrency((Concurrency) null);
			return;
		case YamlmdePackage.GITHUB_ACTIONS__DEFAULTS:
			setDefaults((Defaults) null);
			return;
		case YamlmdePackage.GITHUB_ACTIONS__ENV:
			getEnv().clear();
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
		case YamlmdePackage.GITHUB_ACTIONS__JOBS:
			return jobs != null && !jobs.isEmpty();
		case YamlmdePackage.GITHUB_ACTIONS__ON:
			return on != null;
		case YamlmdePackage.GITHUB_ACTIONS__PERMISSIONS:
			return permissions != null;
		case YamlmdePackage.GITHUB_ACTIONS__CONCURRENCY:
			return concurrency != null;
		case YamlmdePackage.GITHUB_ACTIONS__DEFAULTS:
			return defaults != null;
		case YamlmdePackage.GITHUB_ACTIONS__ENV:
			return env != null && !env.isEmpty();
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
