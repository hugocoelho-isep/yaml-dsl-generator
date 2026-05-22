/**
 */
package pt.isep.yamldslgen.github_actions.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import pt.isep.yamldslgen.github_actions.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class YamlmdeFactoryImpl extends EFactoryImpl implements YamlmdeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static YamlmdeFactory init() {
		try {
			YamlmdeFactory theYamlmdeFactory = (YamlmdeFactory) EPackage.Registry.INSTANCE
					.getEFactory(YamlmdePackage.eNS_URI);
			if (theYamlmdeFactory != null) {
				return theYamlmdeFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new YamlmdeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YamlmdeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case YamlmdePackage.KEY_VALUE_PAIR:
			return createKeyValuePair();
		case YamlmdePackage.GITHUB_ACTIONS:
			return createGithubActions();
		case YamlmdePackage.JOB:
			return createJob();
		case YamlmdePackage.STEP:
			return createStep();
		case YamlmdePackage.ON:
			return createOn();
		case YamlmdePackage.PUSH:
			return createPush();
		case YamlmdePackage.PULL_REQUEST:
			return createPull_request();
		case YamlmdePackage.PERMISSIONS:
			return createPermissions();
		case YamlmdePackage.SCHEDULE:
			return createSchedule();
		case YamlmdePackage.CONCURRENCY:
			return createConcurrency();
		case YamlmdePackage.ENVIRONMENT:
			return createEnvironment();
		case YamlmdePackage.STRATEGY:
			return createStrategy();
		case YamlmdePackage.MATRIX:
			return createMatrix();
		case YamlmdePackage.INCLUDE:
			return createInclude();
		case YamlmdePackage.EXCLUDE:
			return createExclude();
		case YamlmdePackage.WORKFLOW_CALL:
			return createWorkflow_call();
		case YamlmdePackage.SECRET:
			return createSecret();
		case YamlmdePackage.CONTAINER:
			return createContainer();
		case YamlmdePackage.DEFAULTS:
			return createDefaults();
		case YamlmdePackage.RUN:
			return createRun();
		case YamlmdePackage.OUTPUTS:
			return createOutputs();
		case YamlmdePackage.RELEASE:
			return createRelease();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KeyValuePair createKeyValuePair() {
		KeyValuePairImpl keyValuePair = new KeyValuePairImpl();
		return keyValuePair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubActions createGithubActions() {
		GithubActionsImpl githubActions = new GithubActionsImpl();
		return githubActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public On createOn() {
		OnImpl on = new OnImpl();
		return on;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Push createPush() {
		PushImpl push = new PushImpl();
		return push;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pull_request createPull_request() {
		Pull_requestImpl pull_request = new Pull_requestImpl();
		return pull_request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Job createJob() {
		JobImpl job = new JobImpl();
		return job;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Step createStep() {
		StepImpl step = new StepImpl();
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Permissions createPermissions() {
		PermissionsImpl permissions = new PermissionsImpl();
		return permissions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schedule createSchedule() {
		ScheduleImpl schedule = new ScheduleImpl();
		return schedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Environment createEnvironment() {
		EnvironmentImpl environment = new EnvironmentImpl();
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Strategy createStrategy() {
		StrategyImpl strategy = new StrategyImpl();
		return strategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Matrix createMatrix() {
		MatrixImpl matrix = new MatrixImpl();
		return matrix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Include createInclude() {
		IncludeImpl include = new IncludeImpl();
		return include;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Exclude createExclude() {
		ExcludeImpl exclude = new ExcludeImpl();
		return exclude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Workflow_call createWorkflow_call() {
		Workflow_callImpl workflow_call = new Workflow_callImpl();
		return workflow_call;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Secret createSecret() {
		SecretImpl secret = new SecretImpl();
		return secret;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public pt.isep.yamldslgen.github_actions.Container createContainer() {
		ContainerImpl container = new ContainerImpl();
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Defaults createDefaults() {
		DefaultsImpl defaults = new DefaultsImpl();
		return defaults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Run createRun() {
		RunImpl run = new RunImpl();
		return run;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Outputs createOutputs() {
		OutputsImpl outputs = new OutputsImpl();
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Release createRelease() {
		ReleaseImpl release = new ReleaseImpl();
		return release;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Concurrency createConcurrency() {
		ConcurrencyImpl concurrency = new ConcurrencyImpl();
		return concurrency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public YamlmdePackage getYamlmdePackage() {
		return (YamlmdePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static YamlmdePackage getPackage() {
		return YamlmdePackage.eINSTANCE;
	}

} //YamlmdeFactoryImpl
