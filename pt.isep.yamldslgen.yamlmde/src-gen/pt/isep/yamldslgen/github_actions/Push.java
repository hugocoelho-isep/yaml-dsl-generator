/**
 */
package pt.isep.yamldslgen.github_actions;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Push</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.yamldslgen.github_actions.Push#getBranches <em>Branches</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.Push#getTags <em>Tags</em>}</li>
 * </ul>
 *
 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getPush()
 * @model
 * @generated
 */
public interface Push extends EObject {
	/**
	 * Returns the value of the '<em><b>Branches</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branches</em>' attribute list.
	 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getPush_Branches()
	 * @model
	 * @generated
	 */
	EList<String> getBranches();

	/**
	 * Returns the value of the '<em><b>Tags</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' attribute list.
	 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getPush_Tags()
	 * @model
	 * @generated
	 */
	EList<String> getTags();

} // Push
