/**
 */
package pt.isep.yamldslgen.github_actions.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import pt.isep.yamldslgen.github_actions.Step;
import pt.isep.yamldslgen.github_actions.With;
import pt.isep.yamldslgen.github_actions.YamlmdePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.StepImpl#getName <em>Name</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.StepImpl#getUses <em>Uses</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.StepImpl#getRun <em>Run</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.StepImpl#getWith <em>With</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StepImpl extends MinimalEObjectImpl.Container implements Step {
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
	 * The default value of the '{@link #getUses() <em>Uses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUses()
	 * @generated
	 * @ordered
	 */
	protected static final String USES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUses() <em>Uses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUses()
	 * @generated
	 * @ordered
	 */
	protected String uses = USES_EDEFAULT;

	/**
	 * The default value of the '{@link #getRun() <em>Run</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRun()
	 * @generated
	 * @ordered
	 */
	protected static final String RUN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRun() <em>Run</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRun()
	 * @generated
	 * @ordered
	 */
	protected String run = RUN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWith() <em>With</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWith()
	 * @generated
	 * @ordered
	 */
	protected With with;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return YamlmdePackage.Literals.STEP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, YamlmdePackage.STEP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUses() {
		return uses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUses(String newUses) {
		String oldUses = uses;
		uses = newUses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YamlmdePackage.STEP__USES, oldUses, uses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRun() {
		return run;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRun(String newRun) {
		String oldRun = run;
		run = newRun;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YamlmdePackage.STEP__RUN, oldRun, run));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public With getWith() {
		return with;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWith(With newWith, NotificationChain msgs) {
		With oldWith = with;
		with = newWith;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, YamlmdePackage.STEP__WITH,
					oldWith, newWith);
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
	public void setWith(With newWith) {
		if (newWith != with) {
			NotificationChain msgs = null;
			if (with != null)
				msgs = ((InternalEObject) with).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - YamlmdePackage.STEP__WITH,
						null, msgs);
			if (newWith != null)
				msgs = ((InternalEObject) newWith).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - YamlmdePackage.STEP__WITH,
						null, msgs);
			msgs = basicSetWith(newWith, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YamlmdePackage.STEP__WITH, newWith, newWith));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case YamlmdePackage.STEP__WITH:
			return basicSetWith(null, msgs);
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
		case YamlmdePackage.STEP__NAME:
			return getName();
		case YamlmdePackage.STEP__USES:
			return getUses();
		case YamlmdePackage.STEP__RUN:
			return getRun();
		case YamlmdePackage.STEP__WITH:
			return getWith();
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
		case YamlmdePackage.STEP__NAME:
			setName((String) newValue);
			return;
		case YamlmdePackage.STEP__USES:
			setUses((String) newValue);
			return;
		case YamlmdePackage.STEP__RUN:
			setRun((String) newValue);
			return;
		case YamlmdePackage.STEP__WITH:
			setWith((With) newValue);
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
		case YamlmdePackage.STEP__NAME:
			setName(NAME_EDEFAULT);
			return;
		case YamlmdePackage.STEP__USES:
			setUses(USES_EDEFAULT);
			return;
		case YamlmdePackage.STEP__RUN:
			setRun(RUN_EDEFAULT);
			return;
		case YamlmdePackage.STEP__WITH:
			setWith((With) null);
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
		case YamlmdePackage.STEP__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case YamlmdePackage.STEP__USES:
			return USES_EDEFAULT == null ? uses != null : !USES_EDEFAULT.equals(uses);
		case YamlmdePackage.STEP__RUN:
			return RUN_EDEFAULT == null ? run != null : !RUN_EDEFAULT.equals(run);
		case YamlmdePackage.STEP__WITH:
			return with != null;
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
		result.append(", uses: ");
		result.append(uses);
		result.append(", run: ");
		result.append(run);
		result.append(')');
		return result.toString();
	}

} //StepImpl
