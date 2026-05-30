/**
 */
package pt.isep.yamldslgen.github_actions;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exclude</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.yamldslgen.github_actions.Exclude#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getExclude()
 * @model
 * @generated
 */
public interface Exclude extends EObject {
	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link pt.isep.yamldslgen.github_actions.KeyValuePair}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getExclude_Entries()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<KeyValuePair> getEntries();

} // Exclude
