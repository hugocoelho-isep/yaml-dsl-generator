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

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pt.isep.yamldslgen.github_actions.Environment;
import pt.isep.yamldslgen.github_actions.Job;
import pt.isep.yamldslgen.github_actions.KeyValuePair;
import pt.isep.yamldslgen.github_actions.Permissions;
import pt.isep.yamldslgen.github_actions.Service;
import pt.isep.yamldslgen.github_actions.Step;
import pt.isep.yamldslgen.github_actions.Strategy;
import pt.isep.yamldslgen.github_actions.YamlmdePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Job</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.JobImpl#getId <em>Id</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.JobImpl#getRunsOn <em>Runs On</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.JobImpl#getName <em>Name</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.JobImpl#getNeeds <em>Needs</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.JobImpl#getIf <em>If</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.JobImpl#getUses <em>Uses</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.JobImpl#getSteps <em>Steps</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.JobImpl#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.JobImpl#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.JobImpl#getStrategy <em>Strategy</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.JobImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.JobImpl#getServices <em>Services</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.JobImpl#getEnv <em>Env</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.JobImpl#getWith <em>With</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.JobImpl#getOutputs <em>Outputs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JobImpl extends MinimalEObjectImpl.Container implements Job {
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
	 * The default value of the '{@link #getRunsOn() <em>Runs On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunsOn()
	 * @generated
	 * @ordered
	 */
	protected static final String RUNS_ON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRunsOn() <em>Runs On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunsOn()
	 * @generated
	 * @ordered
	 */
	protected String runsOn = RUNS_ON_EDEFAULT;

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
	 * The cached value of the '{@link #getNeeds() <em>Needs</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeeds()
	 * @generated
	 * @ordered
	 */
	protected EList<String> needs;

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
	 * The cached value of the '{@link #getSteps() <em>Steps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<Step> steps;

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
	 * The cached value of the '{@link #getEnvironment() <em>Environment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironment()
	 * @generated
	 * @ordered
	 */
	protected Environment environment;

	/**
	 * The cached value of the '{@link #getStrategy() <em>Strategy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategy()
	 * @generated
	 * @ordered
	 */
	protected Strategy strategy;

	/**
	 * The cached value of the '{@link #getContainer() <em>Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer()
	 * @generated
	 * @ordered
	 */
	protected pt.isep.yamldslgen.github_actions.Container container;

	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> services;

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
	 * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList<KeyValuePair> outputs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JobImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return YamlmdePackage.Literals.JOB;
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
			eNotify(new ENotificationImpl(this, Notification.SET, YamlmdePackage.JOB__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRunsOn() {
		return runsOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRunsOn(String newRunsOn) {
		String oldRunsOn = runsOn;
		runsOn = newRunsOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YamlmdePackage.JOB__RUNS_ON, oldRunsOn, runsOn));
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
			eNotify(new ENotificationImpl(this, Notification.SET, YamlmdePackage.JOB__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getNeeds() {
		if (needs == null) {
			needs = new EDataTypeUniqueEList<String>(String.class, this, YamlmdePackage.JOB__NEEDS);
		}
		return needs;
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
			eNotify(new ENotificationImpl(this, Notification.SET, YamlmdePackage.JOB__IF, oldIf, if_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, YamlmdePackage.JOB__USES, oldUses, uses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Step> getSteps() {
		if (steps == null) {
			steps = new EObjectContainmentEList<Step>(Step.class, this, YamlmdePackage.JOB__STEPS);
		}
		return steps;
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
					YamlmdePackage.JOB__PERMISSIONS, oldPermissions, newPermissions);
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
						EOPPOSITE_FEATURE_BASE - YamlmdePackage.JOB__PERMISSIONS, null, msgs);
			if (newPermissions != null)
				msgs = ((InternalEObject) newPermissions).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - YamlmdePackage.JOB__PERMISSIONS, null, msgs);
			msgs = basicSetPermissions(newPermissions, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YamlmdePackage.JOB__PERMISSIONS, newPermissions,
					newPermissions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Environment getEnvironment() {
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnvironment(Environment newEnvironment, NotificationChain msgs) {
		Environment oldEnvironment = environment;
		environment = newEnvironment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					YamlmdePackage.JOB__ENVIRONMENT, oldEnvironment, newEnvironment);
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
	public void setEnvironment(Environment newEnvironment) {
		if (newEnvironment != environment) {
			NotificationChain msgs = null;
			if (environment != null)
				msgs = ((InternalEObject) environment).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - YamlmdePackage.JOB__ENVIRONMENT, null, msgs);
			if (newEnvironment != null)
				msgs = ((InternalEObject) newEnvironment).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - YamlmdePackage.JOB__ENVIRONMENT, null, msgs);
			msgs = basicSetEnvironment(newEnvironment, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YamlmdePackage.JOB__ENVIRONMENT, newEnvironment,
					newEnvironment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Strategy getStrategy() {
		return strategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStrategy(Strategy newStrategy, NotificationChain msgs) {
		Strategy oldStrategy = strategy;
		strategy = newStrategy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, YamlmdePackage.JOB__STRATEGY,
					oldStrategy, newStrategy);
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
	public void setStrategy(Strategy newStrategy) {
		if (newStrategy != strategy) {
			NotificationChain msgs = null;
			if (strategy != null)
				msgs = ((InternalEObject) strategy).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - YamlmdePackage.JOB__STRATEGY, null, msgs);
			if (newStrategy != null)
				msgs = ((InternalEObject) newStrategy).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - YamlmdePackage.JOB__STRATEGY, null, msgs);
			msgs = basicSetStrategy(newStrategy, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YamlmdePackage.JOB__STRATEGY, newStrategy,
					newStrategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public pt.isep.yamldslgen.github_actions.Container getContainer() {
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainer(pt.isep.yamldslgen.github_actions.Container newContainer,
			NotificationChain msgs) {
		pt.isep.yamldslgen.github_actions.Container oldContainer = container;
		container = newContainer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					YamlmdePackage.JOB__CONTAINER, oldContainer, newContainer);
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
	public void setContainer(pt.isep.yamldslgen.github_actions.Container newContainer) {
		if (newContainer != container) {
			NotificationChain msgs = null;
			if (container != null)
				msgs = ((InternalEObject) container).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - YamlmdePackage.JOB__CONTAINER, null, msgs);
			if (newContainer != null)
				msgs = ((InternalEObject) newContainer).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - YamlmdePackage.JOB__CONTAINER, null, msgs);
			msgs = basicSetContainer(newContainer, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YamlmdePackage.JOB__CONTAINER, newContainer,
					newContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Service> getServices() {
		if (services == null) {
			services = new EObjectContainmentEList<Service>(Service.class, this, YamlmdePackage.JOB__SERVICES);
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<KeyValuePair> getWith() {
		if (with == null) {
			with = new EObjectContainmentEList<KeyValuePair>(KeyValuePair.class, this, YamlmdePackage.JOB__WITH);
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
			env = new EObjectContainmentEList<KeyValuePair>(KeyValuePair.class, this, YamlmdePackage.JOB__ENV);
		}
		return env;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<KeyValuePair> getOutputs() {
		if (outputs == null) {
			outputs = new EObjectContainmentEList<KeyValuePair>(KeyValuePair.class, this, YamlmdePackage.JOB__OUTPUTS);
		}
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case YamlmdePackage.JOB__STEPS:
			return ((InternalEList<?>) getSteps()).basicRemove(otherEnd, msgs);
		case YamlmdePackage.JOB__PERMISSIONS:
			return basicSetPermissions(null, msgs);
		case YamlmdePackage.JOB__ENVIRONMENT:
			return basicSetEnvironment(null, msgs);
		case YamlmdePackage.JOB__STRATEGY:
			return basicSetStrategy(null, msgs);
		case YamlmdePackage.JOB__CONTAINER:
			return basicSetContainer(null, msgs);
		case YamlmdePackage.JOB__SERVICES:
			return ((InternalEList<?>) getServices()).basicRemove(otherEnd, msgs);
		case YamlmdePackage.JOB__ENV:
			return ((InternalEList<?>) getEnv()).basicRemove(otherEnd, msgs);
		case YamlmdePackage.JOB__WITH:
			return ((InternalEList<?>) getWith()).basicRemove(otherEnd, msgs);
		case YamlmdePackage.JOB__OUTPUTS:
			return ((InternalEList<?>) getOutputs()).basicRemove(otherEnd, msgs);
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
		case YamlmdePackage.JOB__ID:
			return getId();
		case YamlmdePackage.JOB__RUNS_ON:
			return getRunsOn();
		case YamlmdePackage.JOB__NAME:
			return getName();
		case YamlmdePackage.JOB__NEEDS:
			return getNeeds();
		case YamlmdePackage.JOB__IF:
			return getIf();
		case YamlmdePackage.JOB__USES:
			return getUses();
		case YamlmdePackage.JOB__STEPS:
			return getSteps();
		case YamlmdePackage.JOB__PERMISSIONS:
			return getPermissions();
		case YamlmdePackage.JOB__ENVIRONMENT:
			return getEnvironment();
		case YamlmdePackage.JOB__STRATEGY:
			return getStrategy();
		case YamlmdePackage.JOB__CONTAINER:
			return getContainer();
		case YamlmdePackage.JOB__SERVICES:
			return getServices();
		case YamlmdePackage.JOB__ENV:
			return getEnv();
		case YamlmdePackage.JOB__WITH:
			return getWith();
		case YamlmdePackage.JOB__OUTPUTS:
			return getOutputs();
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
		case YamlmdePackage.JOB__ID:
			setId((String) newValue);
			return;
		case YamlmdePackage.JOB__RUNS_ON:
			setRunsOn((String) newValue);
			return;
		case YamlmdePackage.JOB__NAME:
			setName((String) newValue);
			return;
		case YamlmdePackage.JOB__NEEDS:
			getNeeds().clear();
			getNeeds().addAll((Collection<? extends String>) newValue);
			return;
		case YamlmdePackage.JOB__IF:
			setIf((String) newValue);
			return;
		case YamlmdePackage.JOB__USES:
			setUses((String) newValue);
			return;
		case YamlmdePackage.JOB__STEPS:
			getSteps().clear();
			getSteps().addAll((Collection<? extends Step>) newValue);
			return;
		case YamlmdePackage.JOB__PERMISSIONS:
			setPermissions((Permissions) newValue);
			return;
		case YamlmdePackage.JOB__ENVIRONMENT:
			setEnvironment((Environment) newValue);
			return;
		case YamlmdePackage.JOB__STRATEGY:
			setStrategy((Strategy) newValue);
			return;
		case YamlmdePackage.JOB__CONTAINER:
			setContainer((pt.isep.yamldslgen.github_actions.Container) newValue);
			return;
		case YamlmdePackage.JOB__SERVICES:
			getServices().clear();
			getServices().addAll((Collection<? extends Service>) newValue);
			return;
		case YamlmdePackage.JOB__ENV:
			getEnv().clear();
			getEnv().addAll((Collection<? extends KeyValuePair>) newValue);
			return;
		case YamlmdePackage.JOB__WITH:
			getWith().clear();
			getWith().addAll((Collection<? extends KeyValuePair>) newValue);
			return;
		case YamlmdePackage.JOB__OUTPUTS:
			getOutputs().clear();
			getOutputs().addAll((Collection<? extends KeyValuePair>) newValue);
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
		case YamlmdePackage.JOB__ID:
			setId(ID_EDEFAULT);
			return;
		case YamlmdePackage.JOB__RUNS_ON:
			setRunsOn(RUNS_ON_EDEFAULT);
			return;
		case YamlmdePackage.JOB__NAME:
			setName(NAME_EDEFAULT);
			return;
		case YamlmdePackage.JOB__NEEDS:
			getNeeds().clear();
			return;
		case YamlmdePackage.JOB__IF:
			setIf(IF_EDEFAULT);
			return;
		case YamlmdePackage.JOB__USES:
			setUses(USES_EDEFAULT);
			return;
		case YamlmdePackage.JOB__STEPS:
			getSteps().clear();
			return;
		case YamlmdePackage.JOB__PERMISSIONS:
			setPermissions((Permissions) null);
			return;
		case YamlmdePackage.JOB__ENVIRONMENT:
			setEnvironment((Environment) null);
			return;
		case YamlmdePackage.JOB__STRATEGY:
			setStrategy((Strategy) null);
			return;
		case YamlmdePackage.JOB__CONTAINER:
			setContainer((pt.isep.yamldslgen.github_actions.Container) null);
			return;
		case YamlmdePackage.JOB__SERVICES:
			getServices().clear();
			return;
		case YamlmdePackage.JOB__ENV:
			getEnv().clear();
			return;
		case YamlmdePackage.JOB__WITH:
			getWith().clear();
			return;
		case YamlmdePackage.JOB__OUTPUTS:
			getOutputs().clear();
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
		case YamlmdePackage.JOB__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case YamlmdePackage.JOB__RUNS_ON:
			return RUNS_ON_EDEFAULT == null ? runsOn != null : !RUNS_ON_EDEFAULT.equals(runsOn);
		case YamlmdePackage.JOB__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case YamlmdePackage.JOB__NEEDS:
			return needs != null && !needs.isEmpty();
		case YamlmdePackage.JOB__IF:
			return IF_EDEFAULT == null ? if_ != null : !IF_EDEFAULT.equals(if_);
		case YamlmdePackage.JOB__USES:
			return USES_EDEFAULT == null ? uses != null : !USES_EDEFAULT.equals(uses);
		case YamlmdePackage.JOB__STEPS:
			return steps != null && !steps.isEmpty();
		case YamlmdePackage.JOB__PERMISSIONS:
			return permissions != null;
		case YamlmdePackage.JOB__ENVIRONMENT:
			return environment != null;
		case YamlmdePackage.JOB__STRATEGY:
			return strategy != null;
		case YamlmdePackage.JOB__CONTAINER:
			return container != null;
		case YamlmdePackage.JOB__SERVICES:
			return services != null && !services.isEmpty();
		case YamlmdePackage.JOB__ENV:
			return env != null && !env.isEmpty();
		case YamlmdePackage.JOB__WITH:
			return with != null && !with.isEmpty();
		case YamlmdePackage.JOB__OUTPUTS:
			return outputs != null && !outputs.isEmpty();
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
		result.append(" (id: ");
		result.append(id);
		result.append(", runsOn: ");
		result.append(runsOn);
		result.append(", name: ");
		result.append(name);
		result.append(", needs: ");
		result.append(needs);
		result.append(", if: ");
		result.append(if_);
		result.append(", uses: ");
		result.append(uses);
		result.append(')');
		return result.toString();
	}

} //JobImpl
