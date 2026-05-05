/**
 */
package pt.isep.yamldslgen.github_actions;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Permissions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.yamldslgen.github_actions.Permissions#getContents <em>Contents</em>}</li>
 * </ul>
 *
 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getPermissions()
 * @model
 * @generated
 */
public interface Permissions extends EObject {
	/**
	 * Returns the value of the '<em><b>Contents</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' attribute.
	 * @see #setContents(String)
	 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getPermissions_Contents()
	 * @model required="true"
	 * @generated
	 */
	String getContents();

	/**
	 * Sets the value of the '{@link pt.isep.yamldslgen.github_actions.Permissions#getContents <em>Contents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contents</em>' attribute.
	 * @see #getContents()
	 * @generated
	 */
	void setContents(String value);

} // Permissions
