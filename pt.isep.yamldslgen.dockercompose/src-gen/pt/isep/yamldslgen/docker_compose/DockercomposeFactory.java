/**
 */
package pt.isep.yamldslgen.docker_compose;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see pt.isep.yamldslgen.docker_compose.DockercomposePackage
 * @generated
 */
public interface DockercomposeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DockercomposeFactory eINSTANCE = pt.isep.yamldslgen.docker_compose.impl.DockercomposeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Key Value Pair</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Key Value Pair</em>'.
	 * @generated
	 */
	KeyValuePair createKeyValuePair();

	/**
	 * Returns a new object of class '<em>Docker Compose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Docker Compose</em>'.
	 * @generated
	 */
	DockerCompose createDockerCompose();

	/**
	 * Returns a new object of class '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service</em>'.
	 * @generated
	 */
	Service createService();

	/**
	 * Returns a new object of class '<em>Healthcheck</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Healthcheck</em>'.
	 * @generated
	 */
	Healthcheck createHealthcheck();

	/**
	 * Returns a new object of class '<em>Network</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Network</em>'.
	 * @generated
	 */
	Network createNetwork();

	/**
	 * Returns a new object of class '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource</em>'.
	 * @generated
	 */
	Resource createResource();

	/**
	 * Returns a new object of class '<em>Secret</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Secret</em>'.
	 * @generated
	 */
	Secret createSecret();

	/**
	 * Returns a new object of class '<em>Db</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Db</em>'.
	 * @generated
	 */
	Db createDb();

	/**
	 * Returns a new object of class '<em>Config</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Config</em>'.
	 * @generated
	 */
	Config createConfig();

	/**
	 * Returns a new object of class '<em>Volume Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Volume Object</em>'.
	 * @generated
	 */
	VolumeObject createVolumeObject();

	/**
	 * Returns a new object of class '<em>Volume Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Volume Value</em>'.
	 * @generated
	 */
	VolumeValue createVolumeValue();

	/**
	 * Returns a new object of class '<em>Build Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Build Object</em>'.
	 * @generated
	 */
	BuildObject createBuildObject();

	/**
	 * Returns a new object of class '<em>Build Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Build Value</em>'.
	 * @generated
	 */
	BuildValue createBuildValue();

	/**
	 * Returns a new object of class '<em>Networks Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Networks Object</em>'.
	 * @generated
	 */
	NetworksObject createNetworksObject();

	/**
	 * Returns a new object of class '<em>Networks Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Networks Value</em>'.
	 * @generated
	 */
	NetworksValue createNetworksValue();

	/**
	 * Returns a new object of class '<em>Depends on Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Depends on Object</em>'.
	 * @generated
	 */
	Depends_onObject createDepends_onObject();

	/**
	 * Returns a new object of class '<em>Depends on Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Depends on Value</em>'.
	 * @generated
	 */
	Depends_onValue createDepends_onValue();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DockercomposePackage getDockercomposePackage();

} //DockercomposeFactory
