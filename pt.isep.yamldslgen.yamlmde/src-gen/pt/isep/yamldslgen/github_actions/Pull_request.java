/**
 */
package pt.isep.yamldslgen.github_actions;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pull request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.yamldslgen.github_actions.Pull_request#getBranches <em>Branches</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.Pull_request#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getPull_request()
 * @model
 * @generated
 */
public interface Pull_request extends EObject {
	/**
	 * Returns the value of the '<em><b>Branches</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branches</em>' attribute list.
	 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getPull_request_Branches()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getBranches();

	/**
	 * Returns the value of the '<em><b>Types</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' attribute list.
	 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getPull_request_Types()
	 * @model
	 * @generated
	 */
	EList<String> getTypes();

} // Pull_request
