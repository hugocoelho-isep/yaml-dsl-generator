/**
 */
package pt.isep.yamldslgen.docker_compose;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Docker Compose</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.DockerCompose#getVersion <em>Version</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.DockerCompose#getName <em>Name</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.DockerCompose#getServices <em>Services</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.DockerCompose#getNetworks <em>Networks</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.DockerCompose#getVolumes <em>Volumes</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.DockerCompose#getSecrets <em>Secrets</em>}</li>
 * </ul>
 *
 * @see pt.isep.yamldslgen.docker_compose.DockercomposePackage#getDockerCompose()
 * @model
 * @generated
 */
public interface DockerCompose extends EObject {
	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see pt.isep.yamldslgen.docker_compose.DockercomposePackage#getDockerCompose_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link pt.isep.yamldslgen.docker_compose.DockerCompose#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see pt.isep.yamldslgen.docker_compose.DockercomposePackage#getDockerCompose_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pt.isep.yamldslgen.docker_compose.DockerCompose#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference list.
	 * The list contents are of type {@link pt.isep.yamldslgen.docker_compose.Service}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' containment reference list.
	 * @see pt.isep.yamldslgen.docker_compose.DockercomposePackage#getDockerCompose_Services()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Service> getServices();

	/**
	 * Returns the value of the '<em><b>Networks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Networks</em>' containment reference.
	 * @see #setNetworks(Networks)
	 * @see pt.isep.yamldslgen.docker_compose.DockercomposePackage#getDockerCompose_Networks()
	 * @model containment="true"
	 * @generated
	 */
	Networks getNetworks();

	/**
	 * Sets the value of the '{@link pt.isep.yamldslgen.docker_compose.DockerCompose#getNetworks <em>Networks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Networks</em>' containment reference.
	 * @see #getNetworks()
	 * @generated
	 */
	void setNetworks(Networks value);

	/**
	 * Returns the value of the '<em><b>Volumes</b></em>' containment reference list.
	 * The list contents are of type {@link pt.isep.yamldslgen.docker_compose.Volume}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volumes</em>' containment reference list.
	 * @see pt.isep.yamldslgen.docker_compose.DockercomposePackage#getDockerCompose_Volumes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Volume> getVolumes();

	/**
	 * Returns the value of the '<em><b>Secrets</b></em>' containment reference list.
	 * The list contents are of type {@link pt.isep.yamldslgen.docker_compose.Secret}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secrets</em>' containment reference list.
	 * @see pt.isep.yamldslgen.docker_compose.DockercomposePackage#getDockerCompose_Secrets()
	 * @model containment="true"
	 * @generated
	 */
	EList<Secret> getSecrets();

} // DockerCompose
