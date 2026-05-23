/**
 */
package pt.isep.yamldslgen.github_actions;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Merge group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.yamldslgen.github_actions.Merge_group#getBranches <em>Branches</em>}</li>
 * </ul>
 *
 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getMerge_group()
 * @model
 * @generated
 */
public interface Merge_group extends EObject {
	/**
	 * Returns the value of the '<em><b>Branches</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branches</em>' attribute list.
	 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getMerge_group_Branches()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getBranches();

} // Merge_group
