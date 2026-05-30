/**
 */
package pt.isep.yamldslgen.github_actions;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workflow dispatch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.yamldslgen.github_actions.Workflow_dispatch#getInputs <em>Inputs</em>}</li>
 * </ul>
 *
 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getWorkflow_dispatch()
 * @model
 * @generated
 */
public interface Workflow_dispatch extends EObject {
	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link pt.isep.yamldslgen.github_actions.Input}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference list.
	 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getWorkflow_dispatch_Inputs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Input> getInputs();

} // Workflow_dispatch
