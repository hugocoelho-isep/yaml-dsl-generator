/**
 */
package pt.isep.yamldslgen.docker_compose;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Networks Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.NetworksValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see pt.isep.yamldslgen.docker_compose.DockercomposePackage#getNetworksValue()
 * @model
 * @generated
 */
public interface NetworksValue extends Networks {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute list.
	 * @see pt.isep.yamldslgen.docker_compose.DockercomposePackage#getNetworksValue_Value()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getValue();

} // NetworksValue
