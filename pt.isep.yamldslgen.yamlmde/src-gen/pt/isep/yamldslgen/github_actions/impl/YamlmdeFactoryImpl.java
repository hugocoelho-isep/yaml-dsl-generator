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
		case YamlmdePackage.GITHUB_ACTIONS:
			return createGithubActions();
		case YamlmdePackage.ON:
			return createOn();
		case YamlmdePackage.PUSH:
			return createPush();
		case YamlmdePackage.PULL_REQUEST:
			return createPull_request();
		case YamlmdePackage.JOB:
			return createJob();
		case YamlmdePackage.STEP:
			return createStep();
		case YamlmdePackage.WITH:
			return createWith();
		case YamlmdePackage.PERMISSIONS:
			return createPermissions();
<<<<<<< Updated upstream
=======
		case YamlmdePackage.SCHEDULE:
			return createSchedule();
		case YamlmdePackage.ENVIRONMENT:
			return createEnvironment();
		case YamlmdePackage.CONCURRENCY:
			return createConcurrency();
>>>>>>> Stashed changes
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
	public With createWith() {
		WithImpl with = new WithImpl();
		return with;
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
