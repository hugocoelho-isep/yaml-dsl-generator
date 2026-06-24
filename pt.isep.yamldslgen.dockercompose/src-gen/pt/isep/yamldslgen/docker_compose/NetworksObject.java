/**
 */
package pt.isep.yamldslgen.docker_compose;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Networks Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.NetworksObject#getNetwork <em>Network</em>}</li>
 * </ul>
 *
 * @see pt.isep.yamldslgen.docker_compose.DockercomposePackage#getNetworksObject()
 * @model
 * @generated
 */
public interface NetworksObject extends Networks {
	/**
	 * Returns the value of the '<em><b>Network</b></em>' containment reference list.
	 * The list contents are of type {@link pt.isep.yamldslgen.docker_compose.Network}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network</em>' containment reference list.
	 * @see pt.isep.yamldslgen.docker_compose.DockercomposePackage#getNetworksObject_Network()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Network> getNetwork();

} // NetworksObject
