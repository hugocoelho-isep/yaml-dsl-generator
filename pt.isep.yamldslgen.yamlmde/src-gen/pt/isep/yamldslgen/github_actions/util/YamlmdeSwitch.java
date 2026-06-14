/**
 */
package pt.isep.yamldslgen.github_actions.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import pt.isep.yamldslgen.github_actions.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage
 * @generated
 */
public class YamlmdeSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static YamlmdePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YamlmdeSwitch() {
		if (modelPackage == null) {
			modelPackage = YamlmdePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case YamlmdePackage.KEY_VALUE_PAIR: {
			KeyValuePair keyValuePair = (KeyValuePair) theEObject;
			T result = caseKeyValuePair(keyValuePair);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case YamlmdePackage.GITHUB_ACTIONS: {
			GithubActions githubActions = (GithubActions) theEObject;
			T result = caseGithubActions(githubActions);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case YamlmdePackage.JOB: {
			Job job = (Job) theEObject;
			T result = caseJob(job);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case YamlmdePackage.STEP: {
			Step step = (Step) theEObject;
			T result = caseStep(step);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case YamlmdePackage.ON: {
			On on = (On) theEObject;
			T result = caseOn(on);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case YamlmdePackage.PUSH: {
			Push push = (Push) theEObject;
			T result = casePush(push);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case YamlmdePackage.PULL_REQUEST: {
			Pull_request pull_request = (Pull_request) theEObject;
			T result = casePull_request(pull_request);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case YamlmdePackage.PERMISSIONS: {
			Permissions permissions = (Permissions) theEObject;
			T result = casePermissions(permissions);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case YamlmdePackage.SCHEDULE: {
			Schedule schedule = (Schedule) theEObject;
			T result = caseSchedule(schedule);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case YamlmdePackage.WORKFLOW_DISPATCH: {
			Workflow_dispatch workflow_dispatch = (Workflow_dispatch) theEObject;
			T result = caseWorkflow_dispatch(workflow_dispatch);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case YamlmdePackage.ENVIRONMENT: {
			Environment environment = (Environment) theEObject;
			T result = caseEnvironment(environment);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case YamlmdePackage.CONCURRENCY: {
			Concurrency concurrency = (Concurrency) theEObject;
			T result = caseConcurrency(concurrency);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case YamlmdePackage.STRATEGY: {
			Strategy strategy = (Strategy) theEObject;
			T result = caseStrategy(strategy);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case YamlmdePackage.MATRIX: {
			Matrix matrix = (Matrix) theEObject;
			T result = caseMatrix(matrix);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case YamlmdePackage.INCLUDE: {
			Include include = (Include) theEObject;
			T result = caseInclude(include);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case YamlmdePackage.EXCLUDE: {
			Exclude exclude = (Exclude) theEObject;
			T result = caseExclude(exclude);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case YamlmdePackage.WORKFLOW_CALL: {
			Workflow_call workflow_call = (Workflow_call) theEObject;
			T result = caseWorkflow_call(workflow_call);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case YamlmdePackage.SECRET: {
			Secret secret = (Secret) theEObject;
			T result = caseSecret(secret);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case YamlmdePackage.CONTAINER: {
			Container container = (Container) theEObject;
			T result = caseContainer(container);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case YamlmdePackage.DEFAULTS: {
			Defaults defaults = (Defaults) theEObject;
			T result = caseDefaults(defaults);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case YamlmdePackage.RUN: {
			Run run = (Run) theEObject;
			T result = caseRun(run);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case YamlmdePackage.RELEASE: {
			Release release = (Release) theEObject;
			T result = caseRelease(release);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case YamlmdePackage.INPUT: {
			Input input = (Input) theEObject;
			T result = caseInput(input);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case YamlmdePackage.MERGE_GROUP: {
			Merge_group merge_group = (Merge_group) theEObject;
			T result = caseMerge_group(merge_group);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case YamlmdePackage.SERVICE: {
			Service service = (Service) theEObject;
			T result = caseService(service);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case YamlmdePackage.ISSUES: {
			Issues issues = (Issues) theEObject;
			T result = caseIssues(issues);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case YamlmdePackage.PERMISSIONS_OBJECT: {
			PermissionsObject permissionsObject = (PermissionsObject) theEObject;
			T result = casePermissionsObject(permissionsObject);
			if (result == null)
				result = casePermissions(permissionsObject);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case YamlmdePackage.PERMISSIONS_VALUE: {
			PermissionsValue permissionsValue = (PermissionsValue) theEObject;
			T result = casePermissionsValue(permissionsValue);
			if (result == null)
				result = casePermissions(permissionsValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case YamlmdePackage.ON_OBJECT: {
			OnObject onObject = (OnObject) theEObject;
			T result = caseOnObject(onObject);
			if (result == null)
				result = caseOn(onObject);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case YamlmdePackage.ON_VALUE: {
			OnValue onValue = (OnValue) theEObject;
			T result = caseOnValue(onValue);
			if (result == null)
				result = caseOn(onValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case YamlmdePackage.ENVIRONMENT_OBJECT: {
			EnvironmentObject environmentObject = (EnvironmentObject) theEObject;
			T result = caseEnvironmentObject(environmentObject);
			if (result == null)
				result = caseEnvironment(environmentObject);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case YamlmdePackage.ENVIRONMENT_VALUE: {
			EnvironmentValue environmentValue = (EnvironmentValue) theEObject;
			T result = caseEnvironmentValue(environmentValue);
			if (result == null)
				result = caseEnvironment(environmentValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case YamlmdePackage.MATRIX_OBJECT: {
			MatrixObject matrixObject = (MatrixObject) theEObject;
			T result = caseMatrixObject(matrixObject);
			if (result == null)
				result = caseMatrix(matrixObject);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case YamlmdePackage.MATRIX_VALUE: {
			MatrixValue matrixValue = (MatrixValue) theEObject;
			T result = caseMatrixValue(matrixValue);
			if (result == null)
				result = caseMatrix(matrixValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case YamlmdePackage.MATRIX_PARAMETER: {
			MatrixParameter matrixParameter = (MatrixParameter) theEObject;
			T result = caseMatrixParameter(matrixParameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key Value Pair</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Value Pair</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyValuePair(KeyValuePair object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Github Actions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Github Actions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGithubActions(GithubActions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>On</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>On</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOn(On object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Push</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Push</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePush(Push object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pull request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pull request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePull_request(Pull_request object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Job</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Job</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJob(Job object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStep(Step object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Permissions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Permissions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePermissions(Permissions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schedule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schedule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchedule(Schedule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workflow dispatch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workflow dispatch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkflow_dispatch(Workflow_dispatch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Environment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Environment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnvironment(Environment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concurrency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concurrency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcurrency(Concurrency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strategy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strategy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrategy(Strategy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Matrix</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Matrix</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMatrix(Matrix object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Include</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Include</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInclude(Include object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exclude</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exclude</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExclude(Exclude object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workflow call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workflow call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkflow_call(Workflow_call object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Secret</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Secret</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecret(Secret object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainer(Container object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Defaults</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Defaults</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefaults(Defaults object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Run</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Run</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRun(Run object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Release</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Release</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelease(Release object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Issues</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Issues</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIssues(Issues object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInput(Input object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Merge group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Merge group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMerge_group(Merge_group object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseService(Service object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Permissions Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Permissions Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePermissionsObject(PermissionsObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Permissions Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Permissions Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePermissionsValue(PermissionsValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>On Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>On Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOnObject(OnObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>On Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>On Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOnValue(OnValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Environment Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Environment Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnvironmentObject(EnvironmentObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Environment Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Environment Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnvironmentValue(EnvironmentValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Matrix Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Matrix Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMatrixObject(MatrixObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Matrix Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Matrix Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMatrixValue(MatrixValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Matrix Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Matrix Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMatrixParameter(MatrixParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //YamlmdeSwitch
