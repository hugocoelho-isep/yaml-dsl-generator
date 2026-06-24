/**
 */
package pt.isep.yamldslgen.docker_compose;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Depends on Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.Depends_onValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see pt.isep.yamldslgen.docker_compose.DockercomposePackage#getDepends_onValue()
 * @model
 * @generated
 */
public interface Depends_onValue extends Depends_on {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute list.
	 * @see pt.isep.yamldslgen.docker_compose.DockercomposePackage#getDepends_onValue_Value()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getValue();

} // Depends_onValue
