/**
 */
package pt.isep.yamldslgen.docker_compose;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.Network#getId <em>Id</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.Network#getDriver <em>Driver</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.Network#getIpv4Address <em>Ipv4 Address</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.Network#getIpam <em>Ipam</em>}</li>
 * </ul>
 *
 * @see pt.isep.yamldslgen.docker_compose.DockercomposePackage#getNetwork()
 * @model
 * @generated
 */
public interface Network extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see pt.isep.yamldslgen.docker_compose.DockercomposePackage#getNetwork_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link pt.isep.yamldslgen.docker_compose.Network#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Driver</em>' attribute.
	 * @see #setDriver(String)
	 * @see pt.isep.yamldslgen.docker_compose.DockercomposePackage#getNetwork_Driver()
	 * @model
	 * @generated
	 */
	String getDriver();

	/**
	 * Sets the value of the '{@link pt.isep.yamldslgen.docker_compose.Network#getDriver <em>Driver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Driver</em>' attribute.
	 * @see #getDriver()
	 * @generated
	 */
	void setDriver(String value);

	/**
	 * Returns the value of the '<em><b>Ipv4 Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ipv4 Address</em>' attribute.
	 * @see #setIpv4Address(String)
	 * @see pt.isep.yamldslgen.docker_compose.DockercomposePackage#getNetwork_Ipv4Address()
	 * @model
	 * @generated
	 */
	String getIpv4Address();

	/**
	 * Sets the value of the '{@link pt.isep.yamldslgen.docker_compose.Network#getIpv4Address <em>Ipv4 Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ipv4 Address</em>' attribute.
	 * @see #getIpv4Address()
	 * @generated
	 */
	void setIpv4Address(String value);

	/**
	 * Returns the value of the '<em><b>Ipam</b></em>' containment reference list.
	 * The list contents are of type {@link pt.isep.yamldslgen.docker_compose.Config}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ipam</em>' containment reference list.
	 * @see pt.isep.yamldslgen.docker_compose.DockercomposePackage#getNetwork_Ipam()
	 * @model containment="true"
	 * @generated
	 */
	EList<Config> getIpam();

} // Network
