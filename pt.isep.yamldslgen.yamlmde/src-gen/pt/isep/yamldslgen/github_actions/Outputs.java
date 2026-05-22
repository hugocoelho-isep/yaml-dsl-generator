/**
 */
package pt.isep.yamldslgen.github_actions;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Outputs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.yamldslgen.github_actions.Outputs#getDigests <em>Digests</em>}</li>
 * </ul>
 *
 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getOutputs()
 * @model
 * @generated
 */
public interface Outputs extends EObject {
	/**
	 * Returns the value of the '<em><b>Digests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Digests</em>' attribute.
	 * @see #setDigests(String)
	 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getOutputs_Digests()
	 * @model required="true"
	 * @generated
	 */
	String getDigests();

	/**
	 * Sets the value of the '{@link pt.isep.yamldslgen.github_actions.Outputs#getDigests <em>Digests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Digests</em>' attribute.
	 * @see #getDigests()
	 * @generated
	 */
	void setDigests(String value);

} // Outputs
