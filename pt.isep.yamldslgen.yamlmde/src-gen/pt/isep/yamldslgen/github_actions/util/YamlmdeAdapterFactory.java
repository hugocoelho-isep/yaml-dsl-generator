/**
 */
package pt.isep.yamldslgen.github_actions.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import pt.isep.yamldslgen.github_actions.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage
 * @generated
 */
public class YamlmdeAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static YamlmdePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YamlmdeAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = YamlmdePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected YamlmdeSwitch<Adapter> modelSwitch = new YamlmdeSwitch<Adapter>() {
		@Override
		public Adapter caseGithubActions(GithubActions object) {
			return createGithubActionsAdapter();
		}

		@Override
		public Adapter caseOn(On object) {
			return createOnAdapter();
		}

		@Override
		public Adapter casePush(Push object) {
			return createPushAdapter();
		}

		@Override
		public Adapter casePull_request(Pull_request object) {
			return createPull_requestAdapter();
		}

		@Override
		public Adapter caseJob(Job object) {
			return createJobAdapter();
		}

		@Override
		public Adapter caseStep(Step object) {
			return createStepAdapter();
		}

		@Override
		public Adapter caseWith(With object) {
			return createWithAdapter();
		}

		@Override
		public Adapter casePermissions(Permissions object) {
			return createPermissionsAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link pt.isep.yamldslgen.github_actions.GithubActions <em>Github Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pt.isep.yamldslgen.github_actions.GithubActions
	 * @generated
	 */
	public Adapter createGithubActionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pt.isep.yamldslgen.github_actions.On <em>On</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pt.isep.yamldslgen.github_actions.On
	 * @generated
	 */
	public Adapter createOnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pt.isep.yamldslgen.github_actions.Push <em>Push</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pt.isep.yamldslgen.github_actions.Push
	 * @generated
	 */
	public Adapter createPushAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pt.isep.yamldslgen.github_actions.Pull_request <em>Pull request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pt.isep.yamldslgen.github_actions.Pull_request
	 * @generated
	 */
	public Adapter createPull_requestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pt.isep.yamldslgen.github_actions.Job <em>Job</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pt.isep.yamldslgen.github_actions.Job
	 * @generated
	 */
	public Adapter createJobAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pt.isep.yamldslgen.github_actions.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pt.isep.yamldslgen.github_actions.Step
	 * @generated
	 */
	public Adapter createStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pt.isep.yamldslgen.github_actions.With <em>With</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pt.isep.yamldslgen.github_actions.With
	 * @generated
	 */
	public Adapter createWithAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link pt.isep.yamldslgen.github_actions.Permissions <em>Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see pt.isep.yamldslgen.github_actions.Permissions
	 * @generated
	 */
	public Adapter createPermissionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //YamlmdeAdapterFactory
