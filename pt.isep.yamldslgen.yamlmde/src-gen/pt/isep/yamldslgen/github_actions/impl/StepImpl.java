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

import pt.isep.yamldslgen.github_actions.KeyValuePair;
import pt.isep.yamldslgen.github_actions.Step;
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
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.StepImpl#getId <em>Id</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.StepImpl#getIf <em>If</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.StepImpl#getWorkingDirectory <em>Working Directory</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.StepImpl#getShell <em>Shell</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.StepImpl#isContinueOnError <em>Continue On Error</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.StepImpl#getTimeoutMinutes <em>Timeout Minutes</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.StepImpl#getEnv <em>Env</em>}</li>
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
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getIf() <em>If</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIf()
	 * @generated
	 * @ordered
	 */
	protected static final String IF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIf() <em>If</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIf()
	 * @generated
	 * @ordered
	 */
	protected String if_ = IF_EDEFAULT;

	/**
	 * The default value of the '{@link #getWorkingDirectory() <em>Working Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkingDirectory()
	 * @generated
	 * @ordered
	 */
	protected static final String WORKING_DIRECTORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorkingDirectory() <em>Working Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkingDirectory()
	 * @generated
	 * @ordered
	 */
	protected String workingDirectory = WORKING_DIRECTORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getShell() <em>Shell</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShell()
	 * @generated
	 * @ordered
	 */
	protected static final String SHELL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShell() <em>Shell</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShell()
	 * @generated
	 * @ordered
	 */
	protected String shell = SHELL_EDEFAULT;

	/**
	 * The default value of the '{@link #isContinueOnError() <em>Continue On Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContinueOnError()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONTINUE_ON_ERROR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isContinueOnError() <em>Continue On Error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContinueOnError()
	 * @generated
	 * @ordered
	 */
	protected boolean continueOnError = CONTINUE_ON_ERROR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeoutMinutes() <em>Timeout Minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeoutMinutes()
	 * @generated
	 * @ordered
	 */
	protected static final int TIMEOUT_MINUTES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTimeoutMinutes() <em>Timeout Minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeoutMinutes()
	 * @generated
	 * @ordered
	 */
	protected int timeoutMinutes = TIMEOUT_MINUTES_EDEFAULT;

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
	 * The cached value of the '{@link #getWith() <em>With</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWith()
	 * @generated
	 * @ordered
	 */
	protected EList<KeyValuePair> with;

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
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YamlmdePackage.STEP__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIf() {
		return if_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIf(String newIf) {
		String oldIf = if_;
		if_ = newIf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YamlmdePackage.STEP__IF, oldIf, if_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWorkingDirectory() {
		return workingDirectory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkingDirectory(String newWorkingDirectory) {
		String oldWorkingDirectory = workingDirectory;
		workingDirectory = newWorkingDirectory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YamlmdePackage.STEP__WORKING_DIRECTORY,
					oldWorkingDirectory, workingDirectory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShell() {
		return shell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShell(String newShell) {
		String oldShell = shell;
		shell = newShell;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YamlmdePackage.STEP__SHELL, oldShell, shell));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isContinueOnError() {
		return continueOnError;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContinueOnError(boolean newContinueOnError) {
		boolean oldContinueOnError = continueOnError;
		continueOnError = newContinueOnError;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YamlmdePackage.STEP__CONTINUE_ON_ERROR,
					oldContinueOnError, continueOnError));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTimeoutMinutes() {
		return timeoutMinutes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeoutMinutes(int newTimeoutMinutes) {
		int oldTimeoutMinutes = timeoutMinutes;
		timeoutMinutes = newTimeoutMinutes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YamlmdePackage.STEP__TIMEOUT_MINUTES,
					oldTimeoutMinutes, timeoutMinutes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<KeyValuePair> getWith() {
		if (with == null) {
			with = new EObjectContainmentEList<KeyValuePair>(KeyValuePair.class, this, YamlmdePackage.STEP__WITH);
		}
		return with;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<KeyValuePair> getEnv() {
		if (env == null) {
			env = new EObjectContainmentEList<KeyValuePair>(KeyValuePair.class, this, YamlmdePackage.STEP__ENV);
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
		case YamlmdePackage.STEP__ENV:
			return ((InternalEList<?>) getEnv()).basicRemove(otherEnd, msgs);
		case YamlmdePackage.STEP__WITH:
			return ((InternalEList<?>) getWith()).basicRemove(otherEnd, msgs);
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
		case YamlmdePackage.STEP__ID:
			return getId();
		case YamlmdePackage.STEP__IF:
			return getIf();
		case YamlmdePackage.STEP__WORKING_DIRECTORY:
			return getWorkingDirectory();
		case YamlmdePackage.STEP__SHELL:
			return getShell();
		case YamlmdePackage.STEP__CONTINUE_ON_ERROR:
			return isContinueOnError();
		case YamlmdePackage.STEP__TIMEOUT_MINUTES:
			return getTimeoutMinutes();
		case YamlmdePackage.STEP__ENV:
			return getEnv();
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
	@SuppressWarnings("unchecked")
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
		case YamlmdePackage.STEP__ID:
			setId((String) newValue);
			return;
		case YamlmdePackage.STEP__IF:
			setIf((String) newValue);
			return;
		case YamlmdePackage.STEP__WORKING_DIRECTORY:
			setWorkingDirectory((String) newValue);
			return;
		case YamlmdePackage.STEP__SHELL:
			setShell((String) newValue);
			return;
		case YamlmdePackage.STEP__CONTINUE_ON_ERROR:
			setContinueOnError((Boolean) newValue);
			return;
		case YamlmdePackage.STEP__TIMEOUT_MINUTES:
			setTimeoutMinutes((Integer) newValue);
			return;
		case YamlmdePackage.STEP__ENV:
			getEnv().clear();
			getEnv().addAll((Collection<? extends KeyValuePair>) newValue);
			return;
		case YamlmdePackage.STEP__WITH:
			getWith().clear();
			getWith().addAll((Collection<? extends KeyValuePair>) newValue);
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
		case YamlmdePackage.STEP__ID:
			setId(ID_EDEFAULT);
			return;
		case YamlmdePackage.STEP__IF:
			setIf(IF_EDEFAULT);
			return;
		case YamlmdePackage.STEP__WORKING_DIRECTORY:
			setWorkingDirectory(WORKING_DIRECTORY_EDEFAULT);
			return;
		case YamlmdePackage.STEP__SHELL:
			setShell(SHELL_EDEFAULT);
			return;
		case YamlmdePackage.STEP__CONTINUE_ON_ERROR:
			setContinueOnError(CONTINUE_ON_ERROR_EDEFAULT);
			return;
		case YamlmdePackage.STEP__TIMEOUT_MINUTES:
			setTimeoutMinutes(TIMEOUT_MINUTES_EDEFAULT);
			return;
		case YamlmdePackage.STEP__ENV:
			getEnv().clear();
			return;
		case YamlmdePackage.STEP__WITH:
			getWith().clear();
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
		case YamlmdePackage.STEP__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case YamlmdePackage.STEP__IF:
			return IF_EDEFAULT == null ? if_ != null : !IF_EDEFAULT.equals(if_);
		case YamlmdePackage.STEP__WORKING_DIRECTORY:
			return WORKING_DIRECTORY_EDEFAULT == null ? workingDirectory != null
					: !WORKING_DIRECTORY_EDEFAULT.equals(workingDirectory);
		case YamlmdePackage.STEP__SHELL:
			return SHELL_EDEFAULT == null ? shell != null : !SHELL_EDEFAULT.equals(shell);
		case YamlmdePackage.STEP__CONTINUE_ON_ERROR:
			return continueOnError != CONTINUE_ON_ERROR_EDEFAULT;
		case YamlmdePackage.STEP__TIMEOUT_MINUTES:
			return timeoutMinutes != TIMEOUT_MINUTES_EDEFAULT;
		case YamlmdePackage.STEP__ENV:
			return env != null && !env.isEmpty();
		case YamlmdePackage.STEP__WITH:
			return with != null && !with.isEmpty();
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
		result.append(", id: ");
		result.append(id);
		result.append(", if: ");
		result.append(if_);
		result.append(", workingDirectory: ");
		result.append(workingDirectory);
		result.append(", shell: ");
		result.append(shell);
		result.append(", continueOnError: ");
		result.append(continueOnError);
		result.append(", timeoutMinutes: ");
		result.append(timeoutMinutes);
		result.append(')');
		return result.toString();
	}

} //StepImpl
