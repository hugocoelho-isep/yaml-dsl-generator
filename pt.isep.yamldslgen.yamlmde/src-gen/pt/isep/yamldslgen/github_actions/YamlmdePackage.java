/**
 */
package pt.isep.yamldslgen.github_actions;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see pt.isep.yamldslgen.github_actions.YamlmdeFactory
 * @model kind="package"
 * @generated
 */
public interface YamlmdePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "github_actions";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.isep.pt/metayaml/github_actions";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "github_actions";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	YamlmdePackage eINSTANCE = pt.isep.yamldslgen.github_actions.impl.YamlmdePackageImpl.init();

	/**
	 * The meta object id for the '{@link pt.isep.yamldslgen.github_actions.impl.KeyValuePairImpl <em>Key Value Pair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.yamldslgen.github_actions.impl.KeyValuePairImpl
	 * @see pt.isep.yamldslgen.github_actions.impl.YamlmdePackageImpl#getKeyValuePair()
	 * @generated
	 */
	int KEY_VALUE_PAIR = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PAIR__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PAIR__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Key Value Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PAIR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Key Value Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PAIR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.isep.yamldslgen.github_actions.impl.GithubActionsImpl <em>Github Actions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.yamldslgen.github_actions.impl.GithubActionsImpl
	 * @see pt.isep.yamldslgen.github_actions.impl.YamlmdePackageImpl#getGithubActions()
	 * @generated
	 */
	int GITHUB_ACTIONS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GITHUB_ACTIONS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Jobs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GITHUB_ACTIONS__JOBS = 1;

	/**
	 * The feature id for the '<em><b>On</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GITHUB_ACTIONS__ON = 2;

	/**
	 * The feature id for the '<em><b>Permissions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GITHUB_ACTIONS__PERMISSIONS = 3;

	/**
	 * The feature id for the '<em><b>Concurrency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GITHUB_ACTIONS__CONCURRENCY = 4;

	/**
	 * The feature id for the '<em><b>Defaults</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GITHUB_ACTIONS__DEFAULTS = 5;

	/**
	 * The feature id for the '<em><b>Env</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GITHUB_ACTIONS__ENV = 6;

	/**
	 * The number of structural features of the '<em>Github Actions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GITHUB_ACTIONS_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Github Actions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GITHUB_ACTIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.isep.yamldslgen.github_actions.impl.JobImpl <em>Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.yamldslgen.github_actions.impl.JobImpl
	 * @see pt.isep.yamldslgen.github_actions.impl.YamlmdePackageImpl#getJob()
	 * @generated
	 */
	int JOB = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__ID = 0;

	/**
	 * The feature id for the '<em><b>Runs On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__RUNS_ON = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__NAME = 2;

	/**
	 * The feature id for the '<em><b>Needs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__NEEDS = 3;

	/**
	 * The feature id for the '<em><b>If</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__IF = 4;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__USES = 5;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__STEPS = 6;

	/**
	 * The feature id for the '<em><b>Permissions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__PERMISSIONS = 7;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__ENVIRONMENT = 8;

	/**
	 * The feature id for the '<em><b>Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__STRATEGY = 9;

	/**
	 * The feature id for the '<em><b>Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__CONTAINER = 10;

	/**
	 * The feature id for the '<em><b>With</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__WITH = 11;

	/**
	 * The feature id for the '<em><b>Env</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__ENV = 12;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__OUTPUTS = 13;

	/**
	 * The number of structural features of the '<em>Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.isep.yamldslgen.github_actions.impl.StepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.yamldslgen.github_actions.impl.StepImpl
	 * @see pt.isep.yamldslgen.github_actions.impl.YamlmdePackageImpl#getStep()
	 * @generated
	 */
	int STEP = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__NAME = 0;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__USES = 1;

	/**
	 * The feature id for the '<em><b>Run</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__RUN = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__ID = 3;

	/**
	 * The feature id for the '<em><b>If</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__IF = 4;

	/**
	 * The feature id for the '<em><b>Working Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__WORKING_DIRECTORY = 5;

	/**
	 * The feature id for the '<em><b>Shell</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__SHELL = 6;

	/**
	 * The feature id for the '<em><b>Continue On Error</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__CONTINUE_ON_ERROR = 7;

	/**
	 * The feature id for the '<em><b>With</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__WITH = 8;

	/**
	 * The feature id for the '<em><b>Env</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__ENV = 9;

	/**
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.isep.yamldslgen.github_actions.impl.OnImpl <em>On</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.yamldslgen.github_actions.impl.OnImpl
	 * @see pt.isep.yamldslgen.github_actions.impl.YamlmdePackageImpl#getOn()
	 * @generated
	 */
	int ON = 4;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON__ISSUES = 0;

	/**
	 * The feature id for the '<em><b>Push</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON__PUSH = 1;

	/**
	 * The feature id for the '<em><b>Pull Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON__PULL_REQUEST = 2;

	/**
	 * The feature id for the '<em><b>Schedule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON__SCHEDULE = 3;

	/**
	 * The feature id for the '<em><b>Workflow Dispatch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON__WORKFLOW_DISPATCH = 4;

	/**
	 * The feature id for the '<em><b>Workflow Call</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON__WORKFLOW_CALL = 5;

	/**
	 * The feature id for the '<em><b>Pull Request Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON__PULL_REQUEST_TARGET = 6;

	/**
	 * The feature id for the '<em><b>Release</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON__RELEASE = 7;

	/**
	 * The number of structural features of the '<em>On</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>On</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.isep.yamldslgen.github_actions.impl.PushImpl <em>Push</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.yamldslgen.github_actions.impl.PushImpl
	 * @see pt.isep.yamldslgen.github_actions.impl.YamlmdePackageImpl#getPush()
	 * @generated
	 */
	int PUSH = 5;

	/**
	 * The feature id for the '<em><b>Branches</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH__BRANCHES = 0;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH__TAGS = 1;

	/**
	 * The number of structural features of the '<em>Push</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Push</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.isep.yamldslgen.github_actions.impl.Pull_requestImpl <em>Pull request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.yamldslgen.github_actions.impl.Pull_requestImpl
	 * @see pt.isep.yamldslgen.github_actions.impl.YamlmdePackageImpl#getPull_request()
	 * @generated
	 */
	int PULL_REQUEST = 6;

	/**
	 * The feature id for the '<em><b>Branches</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULL_REQUEST__BRANCHES = 0;

	/**
	 * The feature id for the '<em><b>Types</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULL_REQUEST__TYPES = 1;

	/**
	 * The number of structural features of the '<em>Pull request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULL_REQUEST_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Pull request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PULL_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.isep.yamldslgen.github_actions.impl.PermissionsImpl <em>Permissions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.yamldslgen.github_actions.impl.PermissionsImpl
	 * @see pt.isep.yamldslgen.github_actions.impl.YamlmdePackageImpl#getPermissions()
	 * @generated
	 */
	int PERMISSIONS = 7;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSIONS__CONTENTS = 0;

	/**
	 * The feature id for the '<em><b>Security Events</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSIONS__SECURITY_EVENTS = 1;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSIONS__ACTIONS = 2;

	/**
	 * The feature id for the '<em><b>Pages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSIONS__PAGES = 3;

	/**
	 * The feature id for the '<em><b>Id Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSIONS__ID_TOKEN = 4;

	/**
	 * The feature id for the '<em><b>Pull Requests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSIONS__PULL_REQUESTS = 5;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSIONS__ISSUES = 6;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSIONS__PACKAGES = 7;

	/**
	 * The number of structural features of the '<em>Permissions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSIONS_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Permissions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.isep.yamldslgen.github_actions.impl.ScheduleImpl <em>Schedule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.yamldslgen.github_actions.impl.ScheduleImpl
	 * @see pt.isep.yamldslgen.github_actions.impl.YamlmdePackageImpl#getSchedule()
	 * @generated
	 */
	int SCHEDULE = 8;

	/**
	 * The feature id for the '<em><b>Cron</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE__CRON = 0;

	/**
	 * The number of structural features of the '<em>Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Schedule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.isep.yamldslgen.github_actions.impl.Workflow_dispatchImpl <em>Workflow dispatch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.yamldslgen.github_actions.impl.Workflow_dispatchImpl
	 * @see pt.isep.yamldslgen.github_actions.impl.YamlmdePackageImpl#getWorkflow_dispatch()
	 * @generated
	 */
	int WORKFLOW_DISPATCH = 9;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_DISPATCH__INPUTS = 0;

	/**
	 * The number of structural features of the '<em>Workflow dispatch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_DISPATCH_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Workflow dispatch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_DISPATCH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.isep.yamldslgen.github_actions.impl.EnvironmentImpl <em>Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.yamldslgen.github_actions.impl.EnvironmentImpl
	 * @see pt.isep.yamldslgen.github_actions.impl.YamlmdePackageImpl#getEnvironment()
	 * @generated
	 */
	int ENVIRONMENT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__URL = 1;

	/**
	 * The number of structural features of the '<em>Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.isep.yamldslgen.github_actions.impl.ConcurrencyImpl <em>Concurrency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.yamldslgen.github_actions.impl.ConcurrencyImpl
	 * @see pt.isep.yamldslgen.github_actions.impl.YamlmdePackageImpl#getConcurrency()
	 * @generated
	 */
	int CONCURRENCY = 11;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCURRENCY__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Cancel In Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCURRENCY__CANCEL_IN_PROGRESS = 1;

	/**
	 * The number of structural features of the '<em>Concurrency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCURRENCY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Concurrency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCURRENCY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.isep.yamldslgen.github_actions.impl.StrategyImpl <em>Strategy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.yamldslgen.github_actions.impl.StrategyImpl
	 * @see pt.isep.yamldslgen.github_actions.impl.YamlmdePackageImpl#getStrategy()
	 * @generated
	 */
	int STRATEGY = 12;

	/**
	 * The feature id for the '<em><b>Fail Fast</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__FAIL_FAST = 0;

	/**
	 * The feature id for the '<em><b>Max Parallel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__MAX_PARALLEL = 1;

	/**
	 * The feature id for the '<em><b>Matrix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY__MATRIX = 2;

	/**
	 * The number of structural features of the '<em>Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Strategy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRATEGY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.isep.yamldslgen.github_actions.impl.MatrixImpl <em>Matrix</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.yamldslgen.github_actions.impl.MatrixImpl
	 * @see pt.isep.yamldslgen.github_actions.impl.YamlmdePackageImpl#getMatrix()
	 * @generated
	 */
	int MATRIX = 13;

	/**
	 * The feature id for the '<em><b>Os</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__OS = 0;

	/**
	 * The feature id for the '<em><b>Build Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__BUILD_TYPE = 1;

	/**
	 * The feature id for the '<em><b>CCompiler</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__CCOMPILER = 2;

	/**
	 * The feature id for the '<em><b>Otp</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__OTP = 3;

	/**
	 * The feature id for the '<em><b>Elixir</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__ELIXIR = 4;

	/**
	 * The feature id for the '<em><b>Python Version</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__PYTHON_VERSION = 5;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__CONFIGURATION = 6;

	/**
	 * The feature id for the '<em><b>Node Version</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__NODE_VERSION = 7;

	/**
	 * The feature id for the '<em><b>Include</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__INCLUDE = 8;

	/**
	 * The feature id for the '<em><b>Exclude</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX__EXCLUDE = 9;

	/**
	 * The number of structural features of the '<em>Matrix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Matrix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATRIX_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.isep.yamldslgen.github_actions.impl.IncludeImpl <em>Include</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.yamldslgen.github_actions.impl.IncludeImpl
	 * @see pt.isep.yamldslgen.github_actions.impl.YamlmdePackageImpl#getInclude()
	 * @generated
	 */
	int INCLUDE = 14;

	/**
	 * The feature id for the '<em><b>Os</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE__OS = 0;

	/**
	 * The feature id for the '<em><b>CCompiler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE__CCOMPILER = 1;

	/**
	 * The feature id for the '<em><b>Cpp Compiler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE__CPP_COMPILER = 2;

	/**
	 * The number of structural features of the '<em>Include</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Include</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.isep.yamldslgen.github_actions.impl.ExcludeImpl <em>Exclude</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.yamldslgen.github_actions.impl.ExcludeImpl
	 * @see pt.isep.yamldslgen.github_actions.impl.YamlmdePackageImpl#getExclude()
	 * @generated
	 */
	int EXCLUDE = 15;

	/**
	 * The feature id for the '<em><b>Os</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDE__OS = 0;

	/**
	 * The feature id for the '<em><b>CCompiler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDE__CCOMPILER = 1;

	/**
	 * The number of structural features of the '<em>Exclude</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Exclude</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.isep.yamldslgen.github_actions.impl.Workflow_callImpl <em>Workflow call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.yamldslgen.github_actions.impl.Workflow_callImpl
	 * @see pt.isep.yamldslgen.github_actions.impl.YamlmdePackageImpl#getWorkflow_call()
	 * @generated
	 */
	int WORKFLOW_CALL = 16;

	/**
	 * The feature id for the '<em><b>Secrets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_CALL__SECRETS = 0;

	/**
	 * The number of structural features of the '<em>Workflow call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_CALL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Workflow call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKFLOW_CALL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.isep.yamldslgen.github_actions.impl.SecretImpl <em>Secret</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.yamldslgen.github_actions.impl.SecretImpl
	 * @see pt.isep.yamldslgen.github_actions.impl.YamlmdePackageImpl#getSecret()
	 * @generated
	 */
	int SECRET = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRET__ID = 0;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRET__REQUIRED = 1;

	/**
	 * The number of structural features of the '<em>Secret</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRET_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Secret</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.isep.yamldslgen.github_actions.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.yamldslgen.github_actions.impl.ContainerImpl
	 * @see pt.isep.yamldslgen.github_actions.impl.YamlmdePackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 18;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__IMAGE = 0;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.isep.yamldslgen.github_actions.impl.DefaultsImpl <em>Defaults</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.yamldslgen.github_actions.impl.DefaultsImpl
	 * @see pt.isep.yamldslgen.github_actions.impl.YamlmdePackageImpl#getDefaults()
	 * @generated
	 */
	int DEFAULTS = 19;

	/**
	 * The feature id for the '<em><b>Run</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULTS__RUN = 0;

	/**
	 * The number of structural features of the '<em>Defaults</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Defaults</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.isep.yamldslgen.github_actions.impl.RunImpl <em>Run</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.yamldslgen.github_actions.impl.RunImpl
	 * @see pt.isep.yamldslgen.github_actions.impl.YamlmdePackageImpl#getRun()
	 * @generated
	 */
	int RUN = 20;

	/**
	 * The feature id for the '<em><b>Shell</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN__SHELL = 0;

	/**
	 * The number of structural features of the '<em>Run</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Run</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RUN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.isep.yamldslgen.github_actions.impl.ReleaseImpl <em>Release</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.yamldslgen.github_actions.impl.ReleaseImpl
	 * @see pt.isep.yamldslgen.github_actions.impl.YamlmdePackageImpl#getRelease()
	 * @generated
	 */
	int RELEASE = 21;

	/**
	 * The feature id for the '<em><b>Types</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE__TYPES = 0;

	/**
	 * The number of structural features of the '<em>Release</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Release</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELEASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.isep.yamldslgen.github_actions.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.yamldslgen.github_actions.impl.InputImpl
	 * @see pt.isep.yamldslgen.github_actions.impl.YamlmdePackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 22;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__ID = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__DEFAULT = 2;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__REQUIRED = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__TYPE = 4;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link pt.isep.yamldslgen.github_actions.KeyValuePair <em>Key Value Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Value Pair</em>'.
	 * @see pt.isep.yamldslgen.github_actions.KeyValuePair
	 * @generated
	 */
	EClass getKeyValuePair();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.github_actions.KeyValuePair#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see pt.isep.yamldslgen.github_actions.KeyValuePair#getKey()
	 * @see #getKeyValuePair()
	 * @generated
	 */
	EAttribute getKeyValuePair_Key();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.github_actions.KeyValuePair#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see pt.isep.yamldslgen.github_actions.KeyValuePair#getValue()
	 * @see #getKeyValuePair()
	 * @generated
	 */
	EAttribute getKeyValuePair_Value();

	/**
	 * Returns the meta object for class '{@link pt.isep.yamldslgen.github_actions.GithubActions <em>Github Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Github Actions</em>'.
	 * @see pt.isep.yamldslgen.github_actions.GithubActions
	 * @generated
	 */
	EClass getGithubActions();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.github_actions.GithubActions#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.isep.yamldslgen.github_actions.GithubActions#getName()
	 * @see #getGithubActions()
	 * @generated
	 */
	EAttribute getGithubActions_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.isep.yamldslgen.github_actions.GithubActions#getJobs <em>Jobs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Jobs</em>'.
	 * @see pt.isep.yamldslgen.github_actions.GithubActions#getJobs()
	 * @see #getGithubActions()
	 * @generated
	 */
	EReference getGithubActions_Jobs();

	/**
	 * Returns the meta object for the containment reference '{@link pt.isep.yamldslgen.github_actions.GithubActions#getOn <em>On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>On</em>'.
	 * @see pt.isep.yamldslgen.github_actions.GithubActions#getOn()
	 * @see #getGithubActions()
	 * @generated
	 */
	EReference getGithubActions_On();

	/**
	 * Returns the meta object for the containment reference '{@link pt.isep.yamldslgen.github_actions.GithubActions#getPermissions <em>Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Permissions</em>'.
	 * @see pt.isep.yamldslgen.github_actions.GithubActions#getPermissions()
	 * @see #getGithubActions()
	 * @generated
	 */
	EReference getGithubActions_Permissions();

	/**
	 * Returns the meta object for the containment reference '{@link pt.isep.yamldslgen.github_actions.GithubActions#getConcurrency <em>Concurrency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Concurrency</em>'.
	 * @see pt.isep.yamldslgen.github_actions.GithubActions#getConcurrency()
	 * @see #getGithubActions()
	 * @generated
	 */
	EReference getGithubActions_Concurrency();

	/**
	 * Returns the meta object for the containment reference '{@link pt.isep.yamldslgen.github_actions.GithubActions#getDefaults <em>Defaults</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Defaults</em>'.
	 * @see pt.isep.yamldslgen.github_actions.GithubActions#getDefaults()
	 * @see #getGithubActions()
	 * @generated
	 */
	EReference getGithubActions_Defaults();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.isep.yamldslgen.github_actions.GithubActions#getEnv <em>Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Env</em>'.
	 * @see pt.isep.yamldslgen.github_actions.GithubActions#getEnv()
	 * @see #getGithubActions()
	 * @generated
	 */
	EReference getGithubActions_Env();

	/**
	 * Returns the meta object for class '{@link pt.isep.yamldslgen.github_actions.Job <em>Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Job
	 * @generated
	 */
	EClass getJob();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.github_actions.Job#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Job#getId()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_Id();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.github_actions.Job#getRunsOn <em>Runs On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Runs On</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Job#getRunsOn()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_RunsOn();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.github_actions.Job#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Job#getName()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_Name();

	/**
	 * Returns the meta object for the attribute list '{@link pt.isep.yamldslgen.github_actions.Job#getNeeds <em>Needs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Needs</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Job#getNeeds()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_Needs();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.github_actions.Job#getIf <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>If</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Job#getIf()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_If();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.github_actions.Job#getUses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uses</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Job#getUses()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_Uses();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.isep.yamldslgen.github_actions.Job#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Steps</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Job#getSteps()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Steps();

	/**
	 * Returns the meta object for the containment reference '{@link pt.isep.yamldslgen.github_actions.Job#getPermissions <em>Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Permissions</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Job#getPermissions()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Permissions();

	/**
	 * Returns the meta object for the containment reference '{@link pt.isep.yamldslgen.github_actions.Job#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Environment</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Job#getEnvironment()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Environment();

	/**
	 * Returns the meta object for the containment reference '{@link pt.isep.yamldslgen.github_actions.Job#getStrategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Strategy</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Job#getStrategy()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Strategy();

	/**
	 * Returns the meta object for the containment reference '{@link pt.isep.yamldslgen.github_actions.Job#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Container</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Job#getContainer()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Container();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.isep.yamldslgen.github_actions.Job#getWith <em>With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>With</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Job#getWith()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_With();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.isep.yamldslgen.github_actions.Job#getEnv <em>Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Env</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Job#getEnv()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Env();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.isep.yamldslgen.github_actions.Job#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outputs</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Job#getOutputs()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Outputs();

	/**
	 * Returns the meta object for class '{@link pt.isep.yamldslgen.github_actions.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Step
	 * @generated
	 */
	EClass getStep();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.github_actions.Step#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Step#getName()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Name();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.github_actions.Step#getUses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uses</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Step#getUses()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Uses();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.github_actions.Step#getRun <em>Run</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Run</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Step#getRun()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Run();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.github_actions.Step#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Step#getId()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Id();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.github_actions.Step#getIf <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>If</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Step#getIf()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_If();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.github_actions.Step#getWorkingDirectory <em>Working Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Working Directory</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Step#getWorkingDirectory()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_WorkingDirectory();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.github_actions.Step#getShell <em>Shell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shell</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Step#getShell()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Shell();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.github_actions.Step#isContinueOnError <em>Continue On Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Continue On Error</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Step#isContinueOnError()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_ContinueOnError();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.isep.yamldslgen.github_actions.Step#getWith <em>With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>With</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Step#getWith()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_With();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.isep.yamldslgen.github_actions.Step#getEnv <em>Env</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Env</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Step#getEnv()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Env();

	/**
	 * Returns the meta object for class '{@link pt.isep.yamldslgen.github_actions.On <em>On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>On</em>'.
	 * @see pt.isep.yamldslgen.github_actions.On
	 * @generated
	 */
	EClass getOn();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.github_actions.On#getIssues <em>Issues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issues</em>'.
	 * @see pt.isep.yamldslgen.github_actions.On#getIssues()
	 * @see #getOn()
	 * @generated
	 */
	EAttribute getOn_Issues();

	/**
	 * Returns the meta object for the containment reference '{@link pt.isep.yamldslgen.github_actions.On#getPush <em>Push</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Push</em>'.
	 * @see pt.isep.yamldslgen.github_actions.On#getPush()
	 * @see #getOn()
	 * @generated
	 */
	EReference getOn_Push();

	/**
	 * Returns the meta object for the containment reference '{@link pt.isep.yamldslgen.github_actions.On#getPullRequest <em>Pull Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pull Request</em>'.
	 * @see pt.isep.yamldslgen.github_actions.On#getPullRequest()
	 * @see #getOn()
	 * @generated
	 */
	EReference getOn_PullRequest();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.isep.yamldslgen.github_actions.On#getSchedule <em>Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Schedule</em>'.
	 * @see pt.isep.yamldslgen.github_actions.On#getSchedule()
	 * @see #getOn()
	 * @generated
	 */
	EReference getOn_Schedule();

	/**
	 * Returns the meta object for the containment reference '{@link pt.isep.yamldslgen.github_actions.On#getWorkflowDispatch <em>Workflow Dispatch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Workflow Dispatch</em>'.
	 * @see pt.isep.yamldslgen.github_actions.On#getWorkflowDispatch()
	 * @see #getOn()
	 * @generated
	 */
	EReference getOn_WorkflowDispatch();

	/**
	 * Returns the meta object for the containment reference '{@link pt.isep.yamldslgen.github_actions.On#getWorkflowCall <em>Workflow Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Workflow Call</em>'.
	 * @see pt.isep.yamldslgen.github_actions.On#getWorkflowCall()
	 * @see #getOn()
	 * @generated
	 */
	EReference getOn_WorkflowCall();

	/**
	 * Returns the meta object for the containment reference '{@link pt.isep.yamldslgen.github_actions.On#getPullRequestTarget <em>Pull Request Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pull Request Target</em>'.
	 * @see pt.isep.yamldslgen.github_actions.On#getPullRequestTarget()
	 * @see #getOn()
	 * @generated
	 */
	EReference getOn_PullRequestTarget();

	/**
	 * Returns the meta object for the containment reference '{@link pt.isep.yamldslgen.github_actions.On#getRelease <em>Release</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Release</em>'.
	 * @see pt.isep.yamldslgen.github_actions.On#getRelease()
	 * @see #getOn()
	 * @generated
	 */
	EReference getOn_Release();

	/**
	 * Returns the meta object for class '{@link pt.isep.yamldslgen.github_actions.Push <em>Push</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Push</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Push
	 * @generated
	 */
	EClass getPush();

	/**
	 * Returns the meta object for the attribute list '{@link pt.isep.yamldslgen.github_actions.Push#getBranches <em>Branches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Branches</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Push#getBranches()
	 * @see #getPush()
	 * @generated
	 */
	EAttribute getPush_Branches();

	/**
	 * Returns the meta object for the attribute list '{@link pt.isep.yamldslgen.github_actions.Push#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Tags</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Push#getTags()
	 * @see #getPush()
	 * @generated
	 */
	EAttribute getPush_Tags();

	/**
	 * Returns the meta object for class '{@link pt.isep.yamldslgen.github_actions.Pull_request <em>Pull request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pull request</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Pull_request
	 * @generated
	 */
	EClass getPull_request();

	/**
	 * Returns the meta object for the attribute list '{@link pt.isep.yamldslgen.github_actions.Pull_request#getBranches <em>Branches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Branches</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Pull_request#getBranches()
	 * @see #getPull_request()
	 * @generated
	 */
	EAttribute getPull_request_Branches();

	/**
	 * Returns the meta object for the attribute list '{@link pt.isep.yamldslgen.github_actions.Pull_request#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Types</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Pull_request#getTypes()
	 * @see #getPull_request()
	 * @generated
	 */
	EAttribute getPull_request_Types();

	/**
	 * Returns the meta object for class '{@link pt.isep.yamldslgen.github_actions.Permissions <em>Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Permissions</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Permissions
	 * @generated
	 */
	EClass getPermissions();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.github_actions.Permissions#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contents</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Permissions#getContents()
	 * @see #getPermissions()
	 * @generated
	 */
	EAttribute getPermissions_Contents();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.github_actions.Permissions#getSecurityEvents <em>Security Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security Events</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Permissions#getSecurityEvents()
	 * @see #getPermissions()
	 * @generated
	 */
	EAttribute getPermissions_SecurityEvents();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.github_actions.Permissions#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actions</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Permissions#getActions()
	 * @see #getPermissions()
	 * @generated
	 */
	EAttribute getPermissions_Actions();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.github_actions.Permissions#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pages</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Permissions#getPages()
	 * @see #getPermissions()
	 * @generated
	 */
	EAttribute getPermissions_Pages();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.github_actions.Permissions#getIdToken <em>Id Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id Token</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Permissions#getIdToken()
	 * @see #getPermissions()
	 * @generated
	 */
	EAttribute getPermissions_IdToken();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.github_actions.Permissions#getPullRequests <em>Pull Requests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pull Requests</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Permissions#getPullRequests()
	 * @see #getPermissions()
	 * @generated
	 */
	EAttribute getPermissions_PullRequests();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.github_actions.Permissions#getIssues <em>Issues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issues</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Permissions#getIssues()
	 * @see #getPermissions()
	 * @generated
	 */
	EAttribute getPermissions_Issues();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.github_actions.Permissions#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Packages</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Permissions#getPackages()
	 * @see #getPermissions()
	 * @generated
	 */
	EAttribute getPermissions_Packages();

	/**
	 * Returns the meta object for class '{@link pt.isep.yamldslgen.github_actions.Schedule <em>Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schedule</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Schedule
	 * @generated
	 */
	EClass getSchedule();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.github_actions.Schedule#getCron <em>Cron</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cron</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Schedule#getCron()
	 * @see #getSchedule()
	 * @generated
	 */
	EAttribute getSchedule_Cron();

	/**
	 * Returns the meta object for class '{@link pt.isep.yamldslgen.github_actions.Workflow_dispatch <em>Workflow dispatch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow dispatch</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Workflow_dispatch
	 * @generated
	 */
	EClass getWorkflow_dispatch();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.isep.yamldslgen.github_actions.Workflow_dispatch#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Workflow_dispatch#getInputs()
	 * @see #getWorkflow_dispatch()
	 * @generated
	 */
	EReference getWorkflow_dispatch_Inputs();

	/**
	 * Returns the meta object for class '{@link pt.isep.yamldslgen.github_actions.Environment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Environment
	 * @generated
	 */
	EClass getEnvironment();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.github_actions.Environment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Environment#getName()
	 * @see #getEnvironment()
	 * @generated
	 */
	EAttribute getEnvironment_Name();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.github_actions.Environment#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Environment#getUrl()
	 * @see #getEnvironment()
	 * @generated
	 */
	EAttribute getEnvironment_Url();

	/**
	 * Returns the meta object for class '{@link pt.isep.yamldslgen.github_actions.Concurrency <em>Concurrency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concurrency</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Concurrency
	 * @generated
	 */
	EClass getConcurrency();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.github_actions.Concurrency#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Concurrency#getGroup()
	 * @see #getConcurrency()
	 * @generated
	 */
	EAttribute getConcurrency_Group();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.github_actions.Concurrency#isCancelInProgress <em>Cancel In Progress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cancel In Progress</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Concurrency#isCancelInProgress()
	 * @see #getConcurrency()
	 * @generated
	 */
	EAttribute getConcurrency_CancelInProgress();

	/**
	 * Returns the meta object for class '{@link pt.isep.yamldslgen.github_actions.Strategy <em>Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strategy</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Strategy
	 * @generated
	 */
	EClass getStrategy();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.github_actions.Strategy#isFailFast <em>Fail Fast</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fail Fast</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Strategy#isFailFast()
	 * @see #getStrategy()
	 * @generated
	 */
	EAttribute getStrategy_FailFast();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.github_actions.Strategy#getMaxParallel <em>Max Parallel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Parallel</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Strategy#getMaxParallel()
	 * @see #getStrategy()
	 * @generated
	 */
	EAttribute getStrategy_MaxParallel();

	/**
	 * Returns the meta object for the containment reference '{@link pt.isep.yamldslgen.github_actions.Strategy#getMatrix <em>Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Matrix</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Strategy#getMatrix()
	 * @see #getStrategy()
	 * @generated
	 */
	EReference getStrategy_Matrix();

	/**
	 * Returns the meta object for class '{@link pt.isep.yamldslgen.github_actions.Matrix <em>Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Matrix</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Matrix
	 * @generated
	 */
	EClass getMatrix();

	/**
	 * Returns the meta object for the attribute list '{@link pt.isep.yamldslgen.github_actions.Matrix#getOs <em>Os</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Os</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Matrix#getOs()
	 * @see #getMatrix()
	 * @generated
	 */
	EAttribute getMatrix_Os();

	/**
	 * Returns the meta object for the attribute list '{@link pt.isep.yamldslgen.github_actions.Matrix#getBuildType <em>Build Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Build Type</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Matrix#getBuildType()
	 * @see #getMatrix()
	 * @generated
	 */
	EAttribute getMatrix_BuildType();

	/**
	 * Returns the meta object for the attribute list '{@link pt.isep.yamldslgen.github_actions.Matrix#getCCompiler <em>CCompiler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>CCompiler</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Matrix#getCCompiler()
	 * @see #getMatrix()
	 * @generated
	 */
	EAttribute getMatrix_CCompiler();

	/**
	 * Returns the meta object for the attribute list '{@link pt.isep.yamldslgen.github_actions.Matrix#getOtp <em>Otp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Otp</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Matrix#getOtp()
	 * @see #getMatrix()
	 * @generated
	 */
	EAttribute getMatrix_Otp();

	/**
	 * Returns the meta object for the attribute list '{@link pt.isep.yamldslgen.github_actions.Matrix#getElixir <em>Elixir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Elixir</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Matrix#getElixir()
	 * @see #getMatrix()
	 * @generated
	 */
	EAttribute getMatrix_Elixir();

	/**
	 * Returns the meta object for the attribute list '{@link pt.isep.yamldslgen.github_actions.Matrix#getPythonVersion <em>Python Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Python Version</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Matrix#getPythonVersion()
	 * @see #getMatrix()
	 * @generated
	 */
	EAttribute getMatrix_PythonVersion();

	/**
	 * Returns the meta object for the attribute list '{@link pt.isep.yamldslgen.github_actions.Matrix#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Configuration</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Matrix#getConfiguration()
	 * @see #getMatrix()
	 * @generated
	 */
	EAttribute getMatrix_Configuration();

	/**
	 * Returns the meta object for the attribute list '{@link pt.isep.yamldslgen.github_actions.Matrix#getNodeVersion <em>Node Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Node Version</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Matrix#getNodeVersion()
	 * @see #getMatrix()
	 * @generated
	 */
	EAttribute getMatrix_NodeVersion();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.isep.yamldslgen.github_actions.Matrix#getInclude <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Include</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Matrix#getInclude()
	 * @see #getMatrix()
	 * @generated
	 */
	EReference getMatrix_Include();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.isep.yamldslgen.github_actions.Matrix#getExclude <em>Exclude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exclude</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Matrix#getExclude()
	 * @see #getMatrix()
	 * @generated
	 */
	EReference getMatrix_Exclude();

	/**
	 * Returns the meta object for class '{@link pt.isep.yamldslgen.github_actions.Include <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Include</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Include
	 * @generated
	 */
	EClass getInclude();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.github_actions.Include#getOs <em>Os</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Os</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Include#getOs()
	 * @see #getInclude()
	 * @generated
	 */
	EAttribute getInclude_Os();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.github_actions.Include#getCCompiler <em>CCompiler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CCompiler</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Include#getCCompiler()
	 * @see #getInclude()
	 * @generated
	 */
	EAttribute getInclude_CCompiler();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.github_actions.Include#getCppCompiler <em>Cpp Compiler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cpp Compiler</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Include#getCppCompiler()
	 * @see #getInclude()
	 * @generated
	 */
	EAttribute getInclude_CppCompiler();

	/**
	 * Returns the meta object for class '{@link pt.isep.yamldslgen.github_actions.Exclude <em>Exclude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exclude</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Exclude
	 * @generated
	 */
	EClass getExclude();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.github_actions.Exclude#getOs <em>Os</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Os</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Exclude#getOs()
	 * @see #getExclude()
	 * @generated
	 */
	EAttribute getExclude_Os();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.github_actions.Exclude#getCCompiler <em>CCompiler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>CCompiler</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Exclude#getCCompiler()
	 * @see #getExclude()
	 * @generated
	 */
	EAttribute getExclude_CCompiler();

	/**
	 * Returns the meta object for class '{@link pt.isep.yamldslgen.github_actions.Workflow_call <em>Workflow call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workflow call</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Workflow_call
	 * @generated
	 */
	EClass getWorkflow_call();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.isep.yamldslgen.github_actions.Workflow_call#getSecrets <em>Secrets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Secrets</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Workflow_call#getSecrets()
	 * @see #getWorkflow_call()
	 * @generated
	 */
	EReference getWorkflow_call_Secrets();

	/**
	 * Returns the meta object for class '{@link pt.isep.yamldslgen.github_actions.Secret <em>Secret</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Secret</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Secret
	 * @generated
	 */
	EClass getSecret();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.github_actions.Secret#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Secret#getId()
	 * @see #getSecret()
	 * @generated
	 */
	EAttribute getSecret_Id();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.github_actions.Secret#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Secret#isRequired()
	 * @see #getSecret()
	 * @generated
	 */
	EAttribute getSecret_Required();

	/**
	 * Returns the meta object for class '{@link pt.isep.yamldslgen.github_actions.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.github_actions.Container#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Container#getImage()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Image();

	/**
	 * Returns the meta object for class '{@link pt.isep.yamldslgen.github_actions.Defaults <em>Defaults</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Defaults</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Defaults
	 * @generated
	 */
	EClass getDefaults();

	/**
	 * Returns the meta object for the containment reference '{@link pt.isep.yamldslgen.github_actions.Defaults#getRun <em>Run</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Run</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Defaults#getRun()
	 * @see #getDefaults()
	 * @generated
	 */
	EReference getDefaults_Run();

	/**
	 * Returns the meta object for class '{@link pt.isep.yamldslgen.github_actions.Run <em>Run</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Run</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Run
	 * @generated
	 */
	EClass getRun();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.github_actions.Run#getShell <em>Shell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shell</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Run#getShell()
	 * @see #getRun()
	 * @generated
	 */
	EAttribute getRun_Shell();

	/**
	 * Returns the meta object for class '{@link pt.isep.yamldslgen.github_actions.Release <em>Release</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Release</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Release
	 * @generated
	 */
	EClass getRelease();

	/**
	 * Returns the meta object for the attribute list '{@link pt.isep.yamldslgen.github_actions.Release#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Types</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Release#getTypes()
	 * @see #getRelease()
	 * @generated
	 */
	EAttribute getRelease_Types();

	/**
	 * Returns the meta object for class '{@link pt.isep.yamldslgen.github_actions.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.github_actions.Input#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Input#getId()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Id();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.github_actions.Input#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Input#getDescription()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Description();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.github_actions.Input#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Input#getDefault()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Default();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.github_actions.Input#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Input#isRequired()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Required();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.github_actions.Input#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see pt.isep.yamldslgen.github_actions.Input#getType()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	YamlmdeFactory getYamlmdeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link pt.isep.yamldslgen.github_actions.impl.KeyValuePairImpl <em>Key Value Pair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.yamldslgen.github_actions.impl.KeyValuePairImpl
		 * @see pt.isep.yamldslgen.github_actions.impl.YamlmdePackageImpl#getKeyValuePair()
		 * @generated
		 */
		EClass KEY_VALUE_PAIR = eINSTANCE.getKeyValuePair();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_VALUE_PAIR__KEY = eINSTANCE.getKeyValuePair_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_VALUE_PAIR__VALUE = eINSTANCE.getKeyValuePair_Value();

		/**
		 * The meta object literal for the '{@link pt.isep.yamldslgen.github_actions.impl.GithubActionsImpl <em>Github Actions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.yamldslgen.github_actions.impl.GithubActionsImpl
		 * @see pt.isep.yamldslgen.github_actions.impl.YamlmdePackageImpl#getGithubActions()
		 * @generated
		 */
		EClass GITHUB_ACTIONS = eINSTANCE.getGithubActions();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GITHUB_ACTIONS__NAME = eINSTANCE.getGithubActions_Name();

		/**
		 * The meta object literal for the '<em><b>Jobs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GITHUB_ACTIONS__JOBS = eINSTANCE.getGithubActions_Jobs();

		/**
		 * The meta object literal for the '<em><b>On</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GITHUB_ACTIONS__ON = eINSTANCE.getGithubActions_On();

		/**
		 * The meta object literal for the '<em><b>Permissions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GITHUB_ACTIONS__PERMISSIONS = eINSTANCE.getGithubActions_Permissions();

		/**
		 * The meta object literal for the '<em><b>Concurrency</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GITHUB_ACTIONS__CONCURRENCY = eINSTANCE.getGithubActions_Concurrency();

		/**
		 * The meta object literal for the '<em><b>Defaults</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GITHUB_ACTIONS__DEFAULTS = eINSTANCE.getGithubActions_Defaults();

		/**
		 * The meta object literal for the '<em><b>Env</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GITHUB_ACTIONS__ENV = eINSTANCE.getGithubActions_Env();

		/**
		 * The meta object literal for the '{@link pt.isep.yamldslgen.github_actions.impl.JobImpl <em>Job</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.yamldslgen.github_actions.impl.JobImpl
		 * @see pt.isep.yamldslgen.github_actions.impl.YamlmdePackageImpl#getJob()
		 * @generated
		 */
		EClass JOB = eINSTANCE.getJob();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__ID = eINSTANCE.getJob_Id();

		/**
		 * The meta object literal for the '<em><b>Runs On</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__RUNS_ON = eINSTANCE.getJob_RunsOn();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__NAME = eINSTANCE.getJob_Name();

		/**
		 * The meta object literal for the '<em><b>Needs</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__NEEDS = eINSTANCE.getJob_Needs();

		/**
		 * The meta object literal for the '<em><b>If</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__IF = eINSTANCE.getJob_If();

		/**
		 * The meta object literal for the '<em><b>Uses</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__USES = eINSTANCE.getJob_Uses();

		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__STEPS = eINSTANCE.getJob_Steps();

		/**
		 * The meta object literal for the '<em><b>Permissions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__PERMISSIONS = eINSTANCE.getJob_Permissions();

		/**
		 * The meta object literal for the '<em><b>Environment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__ENVIRONMENT = eINSTANCE.getJob_Environment();

		/**
		 * The meta object literal for the '<em><b>Strategy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__STRATEGY = eINSTANCE.getJob_Strategy();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__CONTAINER = eINSTANCE.getJob_Container();

		/**
		 * The meta object literal for the '<em><b>With</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__WITH = eINSTANCE.getJob_With();

		/**
		 * The meta object literal for the '<em><b>Env</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__ENV = eINSTANCE.getJob_Env();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__OUTPUTS = eINSTANCE.getJob_Outputs();

		/**
		 * The meta object literal for the '{@link pt.isep.yamldslgen.github_actions.impl.StepImpl <em>Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.yamldslgen.github_actions.impl.StepImpl
		 * @see pt.isep.yamldslgen.github_actions.impl.YamlmdePackageImpl#getStep()
		 * @generated
		 */
		EClass STEP = eINSTANCE.getStep();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__NAME = eINSTANCE.getStep_Name();

		/**
		 * The meta object literal for the '<em><b>Uses</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__USES = eINSTANCE.getStep_Uses();

		/**
		 * The meta object literal for the '<em><b>Run</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__RUN = eINSTANCE.getStep_Run();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__ID = eINSTANCE.getStep_Id();

		/**
		 * The meta object literal for the '<em><b>If</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__IF = eINSTANCE.getStep_If();

		/**
		 * The meta object literal for the '<em><b>Working Directory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__WORKING_DIRECTORY = eINSTANCE.getStep_WorkingDirectory();

		/**
		 * The meta object literal for the '<em><b>Shell</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__SHELL = eINSTANCE.getStep_Shell();

		/**
		 * The meta object literal for the '<em><b>Continue On Error</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__CONTINUE_ON_ERROR = eINSTANCE.getStep_ContinueOnError();

		/**
		 * The meta object literal for the '<em><b>With</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__WITH = eINSTANCE.getStep_With();

		/**
		 * The meta object literal for the '<em><b>Env</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__ENV = eINSTANCE.getStep_Env();

		/**
		 * The meta object literal for the '{@link pt.isep.yamldslgen.github_actions.impl.OnImpl <em>On</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.yamldslgen.github_actions.impl.OnImpl
		 * @see pt.isep.yamldslgen.github_actions.impl.YamlmdePackageImpl#getOn()
		 * @generated
		 */
		EClass ON = eINSTANCE.getOn();

		/**
		 * The meta object literal for the '<em><b>Issues</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ON__ISSUES = eINSTANCE.getOn_Issues();

		/**
		 * The meta object literal for the '<em><b>Push</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON__PUSH = eINSTANCE.getOn_Push();

		/**
		 * The meta object literal for the '<em><b>Pull Request</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON__PULL_REQUEST = eINSTANCE.getOn_PullRequest();

		/**
		 * The meta object literal for the '<em><b>Schedule</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON__SCHEDULE = eINSTANCE.getOn_Schedule();

		/**
		 * The meta object literal for the '<em><b>Workflow Dispatch</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON__WORKFLOW_DISPATCH = eINSTANCE.getOn_WorkflowDispatch();

		/**
		 * The meta object literal for the '<em><b>Workflow Call</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON__WORKFLOW_CALL = eINSTANCE.getOn_WorkflowCall();

		/**
		 * The meta object literal for the '<em><b>Pull Request Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON__PULL_REQUEST_TARGET = eINSTANCE.getOn_PullRequestTarget();

		/**
		 * The meta object literal for the '<em><b>Release</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON__RELEASE = eINSTANCE.getOn_Release();

		/**
		 * The meta object literal for the '{@link pt.isep.yamldslgen.github_actions.impl.PushImpl <em>Push</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.yamldslgen.github_actions.impl.PushImpl
		 * @see pt.isep.yamldslgen.github_actions.impl.YamlmdePackageImpl#getPush()
		 * @generated
		 */
		EClass PUSH = eINSTANCE.getPush();

		/**
		 * The meta object literal for the '<em><b>Branches</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUSH__BRANCHES = eINSTANCE.getPush_Branches();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUSH__TAGS = eINSTANCE.getPush_Tags();

		/**
		 * The meta object literal for the '{@link pt.isep.yamldslgen.github_actions.impl.Pull_requestImpl <em>Pull request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.yamldslgen.github_actions.impl.Pull_requestImpl
		 * @see pt.isep.yamldslgen.github_actions.impl.YamlmdePackageImpl#getPull_request()
		 * @generated
		 */
		EClass PULL_REQUEST = eINSTANCE.getPull_request();

		/**
		 * The meta object literal for the '<em><b>Branches</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PULL_REQUEST__BRANCHES = eINSTANCE.getPull_request_Branches();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PULL_REQUEST__TYPES = eINSTANCE.getPull_request_Types();

		/**
		 * The meta object literal for the '{@link pt.isep.yamldslgen.github_actions.impl.PermissionsImpl <em>Permissions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.yamldslgen.github_actions.impl.PermissionsImpl
		 * @see pt.isep.yamldslgen.github_actions.impl.YamlmdePackageImpl#getPermissions()
		 * @generated
		 */
		EClass PERMISSIONS = eINSTANCE.getPermissions();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERMISSIONS__CONTENTS = eINSTANCE.getPermissions_Contents();

		/**
		 * The meta object literal for the '<em><b>Security Events</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERMISSIONS__SECURITY_EVENTS = eINSTANCE.getPermissions_SecurityEvents();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERMISSIONS__ACTIONS = eINSTANCE.getPermissions_Actions();

		/**
		 * The meta object literal for the '<em><b>Pages</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERMISSIONS__PAGES = eINSTANCE.getPermissions_Pages();

		/**
		 * The meta object literal for the '<em><b>Id Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERMISSIONS__ID_TOKEN = eINSTANCE.getPermissions_IdToken();

		/**
		 * The meta object literal for the '<em><b>Pull Requests</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERMISSIONS__PULL_REQUESTS = eINSTANCE.getPermissions_PullRequests();

		/**
		 * The meta object literal for the '<em><b>Issues</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERMISSIONS__ISSUES = eINSTANCE.getPermissions_Issues();

		/**
		 * The meta object literal for the '<em><b>Packages</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERMISSIONS__PACKAGES = eINSTANCE.getPermissions_Packages();

		/**
		 * The meta object literal for the '{@link pt.isep.yamldslgen.github_actions.impl.ScheduleImpl <em>Schedule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.yamldslgen.github_actions.impl.ScheduleImpl
		 * @see pt.isep.yamldslgen.github_actions.impl.YamlmdePackageImpl#getSchedule()
		 * @generated
		 */
		EClass SCHEDULE = eINSTANCE.getSchedule();

		/**
		 * The meta object literal for the '<em><b>Cron</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULE__CRON = eINSTANCE.getSchedule_Cron();

		/**
		 * The meta object literal for the '{@link pt.isep.yamldslgen.github_actions.impl.Workflow_dispatchImpl <em>Workflow dispatch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.yamldslgen.github_actions.impl.Workflow_dispatchImpl
		 * @see pt.isep.yamldslgen.github_actions.impl.YamlmdePackageImpl#getWorkflow_dispatch()
		 * @generated
		 */
		EClass WORKFLOW_DISPATCH = eINSTANCE.getWorkflow_dispatch();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_DISPATCH__INPUTS = eINSTANCE.getWorkflow_dispatch_Inputs();

		/**
		 * The meta object literal for the '{@link pt.isep.yamldslgen.github_actions.impl.EnvironmentImpl <em>Environment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.yamldslgen.github_actions.impl.EnvironmentImpl
		 * @see pt.isep.yamldslgen.github_actions.impl.YamlmdePackageImpl#getEnvironment()
		 * @generated
		 */
		EClass ENVIRONMENT = eINSTANCE.getEnvironment();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENT__NAME = eINSTANCE.getEnvironment_Name();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENT__URL = eINSTANCE.getEnvironment_Url();

		/**
		 * The meta object literal for the '{@link pt.isep.yamldslgen.github_actions.impl.ConcurrencyImpl <em>Concurrency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.yamldslgen.github_actions.impl.ConcurrencyImpl
		 * @see pt.isep.yamldslgen.github_actions.impl.YamlmdePackageImpl#getConcurrency()
		 * @generated
		 */
		EClass CONCURRENCY = eINSTANCE.getConcurrency();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCURRENCY__GROUP = eINSTANCE.getConcurrency_Group();

		/**
		 * The meta object literal for the '<em><b>Cancel In Progress</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCURRENCY__CANCEL_IN_PROGRESS = eINSTANCE.getConcurrency_CancelInProgress();

		/**
		 * The meta object literal for the '{@link pt.isep.yamldslgen.github_actions.impl.StrategyImpl <em>Strategy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.yamldslgen.github_actions.impl.StrategyImpl
		 * @see pt.isep.yamldslgen.github_actions.impl.YamlmdePackageImpl#getStrategy()
		 * @generated
		 */
		EClass STRATEGY = eINSTANCE.getStrategy();

		/**
		 * The meta object literal for the '<em><b>Fail Fast</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRATEGY__FAIL_FAST = eINSTANCE.getStrategy_FailFast();

		/**
		 * The meta object literal for the '<em><b>Max Parallel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRATEGY__MAX_PARALLEL = eINSTANCE.getStrategy_MaxParallel();

		/**
		 * The meta object literal for the '<em><b>Matrix</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRATEGY__MATRIX = eINSTANCE.getStrategy_Matrix();

		/**
		 * The meta object literal for the '{@link pt.isep.yamldslgen.github_actions.impl.MatrixImpl <em>Matrix</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.yamldslgen.github_actions.impl.MatrixImpl
		 * @see pt.isep.yamldslgen.github_actions.impl.YamlmdePackageImpl#getMatrix()
		 * @generated
		 */
		EClass MATRIX = eINSTANCE.getMatrix();

		/**
		 * The meta object literal for the '<em><b>Os</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATRIX__OS = eINSTANCE.getMatrix_Os();

		/**
		 * The meta object literal for the '<em><b>Build Type</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATRIX__BUILD_TYPE = eINSTANCE.getMatrix_BuildType();

		/**
		 * The meta object literal for the '<em><b>CCompiler</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATRIX__CCOMPILER = eINSTANCE.getMatrix_CCompiler();

		/**
		 * The meta object literal for the '<em><b>Otp</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATRIX__OTP = eINSTANCE.getMatrix_Otp();

		/**
		 * The meta object literal for the '<em><b>Elixir</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATRIX__ELIXIR = eINSTANCE.getMatrix_Elixir();

		/**
		 * The meta object literal for the '<em><b>Python Version</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATRIX__PYTHON_VERSION = eINSTANCE.getMatrix_PythonVersion();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATRIX__CONFIGURATION = eINSTANCE.getMatrix_Configuration();

		/**
		 * The meta object literal for the '<em><b>Node Version</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATRIX__NODE_VERSION = eINSTANCE.getMatrix_NodeVersion();

		/**
		 * The meta object literal for the '<em><b>Include</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATRIX__INCLUDE = eINSTANCE.getMatrix_Include();

		/**
		 * The meta object literal for the '<em><b>Exclude</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATRIX__EXCLUDE = eINSTANCE.getMatrix_Exclude();

		/**
		 * The meta object literal for the '{@link pt.isep.yamldslgen.github_actions.impl.IncludeImpl <em>Include</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.yamldslgen.github_actions.impl.IncludeImpl
		 * @see pt.isep.yamldslgen.github_actions.impl.YamlmdePackageImpl#getInclude()
		 * @generated
		 */
		EClass INCLUDE = eINSTANCE.getInclude();

		/**
		 * The meta object literal for the '<em><b>Os</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCLUDE__OS = eINSTANCE.getInclude_Os();

		/**
		 * The meta object literal for the '<em><b>CCompiler</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCLUDE__CCOMPILER = eINSTANCE.getInclude_CCompiler();

		/**
		 * The meta object literal for the '<em><b>Cpp Compiler</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCLUDE__CPP_COMPILER = eINSTANCE.getInclude_CppCompiler();

		/**
		 * The meta object literal for the '{@link pt.isep.yamldslgen.github_actions.impl.ExcludeImpl <em>Exclude</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.yamldslgen.github_actions.impl.ExcludeImpl
		 * @see pt.isep.yamldslgen.github_actions.impl.YamlmdePackageImpl#getExclude()
		 * @generated
		 */
		EClass EXCLUDE = eINSTANCE.getExclude();

		/**
		 * The meta object literal for the '<em><b>Os</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCLUDE__OS = eINSTANCE.getExclude_Os();

		/**
		 * The meta object literal for the '<em><b>CCompiler</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCLUDE__CCOMPILER = eINSTANCE.getExclude_CCompiler();

		/**
		 * The meta object literal for the '{@link pt.isep.yamldslgen.github_actions.impl.Workflow_callImpl <em>Workflow call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.yamldslgen.github_actions.impl.Workflow_callImpl
		 * @see pt.isep.yamldslgen.github_actions.impl.YamlmdePackageImpl#getWorkflow_call()
		 * @generated
		 */
		EClass WORKFLOW_CALL = eINSTANCE.getWorkflow_call();

		/**
		 * The meta object literal for the '<em><b>Secrets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKFLOW_CALL__SECRETS = eINSTANCE.getWorkflow_call_Secrets();

		/**
		 * The meta object literal for the '{@link pt.isep.yamldslgen.github_actions.impl.SecretImpl <em>Secret</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.yamldslgen.github_actions.impl.SecretImpl
		 * @see pt.isep.yamldslgen.github_actions.impl.YamlmdePackageImpl#getSecret()
		 * @generated
		 */
		EClass SECRET = eINSTANCE.getSecret();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECRET__ID = eINSTANCE.getSecret_Id();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECRET__REQUIRED = eINSTANCE.getSecret_Required();

		/**
		 * The meta object literal for the '{@link pt.isep.yamldslgen.github_actions.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.yamldslgen.github_actions.impl.ContainerImpl
		 * @see pt.isep.yamldslgen.github_actions.impl.YamlmdePackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__IMAGE = eINSTANCE.getContainer_Image();

		/**
		 * The meta object literal for the '{@link pt.isep.yamldslgen.github_actions.impl.DefaultsImpl <em>Defaults</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.yamldslgen.github_actions.impl.DefaultsImpl
		 * @see pt.isep.yamldslgen.github_actions.impl.YamlmdePackageImpl#getDefaults()
		 * @generated
		 */
		EClass DEFAULTS = eINSTANCE.getDefaults();

		/**
		 * The meta object literal for the '<em><b>Run</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFAULTS__RUN = eINSTANCE.getDefaults_Run();

		/**
		 * The meta object literal for the '{@link pt.isep.yamldslgen.github_actions.impl.RunImpl <em>Run</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.yamldslgen.github_actions.impl.RunImpl
		 * @see pt.isep.yamldslgen.github_actions.impl.YamlmdePackageImpl#getRun()
		 * @generated
		 */
		EClass RUN = eINSTANCE.getRun();

		/**
		 * The meta object literal for the '<em><b>Shell</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RUN__SHELL = eINSTANCE.getRun_Shell();

		/**
		 * The meta object literal for the '{@link pt.isep.yamldslgen.github_actions.impl.ReleaseImpl <em>Release</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.yamldslgen.github_actions.impl.ReleaseImpl
		 * @see pt.isep.yamldslgen.github_actions.impl.YamlmdePackageImpl#getRelease()
		 * @generated
		 */
		EClass RELEASE = eINSTANCE.getRelease();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELEASE__TYPES = eINSTANCE.getRelease_Types();

		/**
		 * The meta object literal for the '{@link pt.isep.yamldslgen.github_actions.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.yamldslgen.github_actions.impl.InputImpl
		 * @see pt.isep.yamldslgen.github_actions.impl.YamlmdePackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__ID = eINSTANCE.getInput_Id();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__DESCRIPTION = eINSTANCE.getInput_Description();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__DEFAULT = eINSTANCE.getInput_Default();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__REQUIRED = eINSTANCE.getInput_Required();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__TYPE = eINSTANCE.getInput_Type();

	}

} //YamlmdePackage
