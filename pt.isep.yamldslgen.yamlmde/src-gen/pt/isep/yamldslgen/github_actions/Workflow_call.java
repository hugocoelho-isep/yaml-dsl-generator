/**
 */
package pt.isep.yamldslgen.github_actions;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workflow call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.yamldslgen.github_actions.Workflow_call#getSecrets <em>Secrets</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.Workflow_call#getInputs <em>Inputs</em>}</li>
 * </ul>
 *
 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getWorkflow_call()
 * @model
 * @generated
 */
public interface Workflow_call extends EObject {
	/**
	 * Returns the value of the '<em><b>Secrets</b></em>' containment reference list.
	 * The list contents are of type {@link pt.isep.yamldslgen.github_actions.Secret}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secrets</em>' containment reference list.
	 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getWorkflow_call_Secrets()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Secret> getSecrets();

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link pt.isep.yamldslgen.github_actions.Input}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference list.
	 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getWorkflow_call_Inputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Input> getInputs();

} // Workflow_call
