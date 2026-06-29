/**
 */
package pt.isep.yamldslgen.docker_compose.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import pt.isep.yamldslgen.docker_compose.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see pt.isep.yamldslgen.docker_compose.DockercomposePackage
 * @generated
 */
public class DockercomposeSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DockercomposePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DockercomposeSwitch() {
		if (modelPackage == null) {
			modelPackage = DockercomposePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case DockercomposePackage.KEY_VALUE_PAIR: {
			KeyValuePair keyValuePair = (KeyValuePair) theEObject;
			T result = caseKeyValuePair(keyValuePair);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DockercomposePackage.DOCKER_COMPOSE: {
			DockerCompose dockerCompose = (DockerCompose) theEObject;
			T result = caseDockerCompose(dockerCompose);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DockercomposePackage.SERVICE: {
			Service service = (Service) theEObject;
			T result = caseService(service);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DockercomposePackage.BUILD: {
			Build build = (Build) theEObject;
			T result = caseBuild(build);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DockercomposePackage.HEALTHCHECK: {
			Healthcheck healthcheck = (Healthcheck) theEObject;
			T result = caseHealthcheck(healthcheck);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DockercomposePackage.NETWORKS: {
			Networks networks = (Networks) theEObject;
			T result = caseNetworks(networks);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DockercomposePackage.NETWORK: {
			Network network = (Network) theEObject;
			T result = caseNetwork(network);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DockercomposePackage.VOLUME: {
			Volume volume = (Volume) theEObject;
			T result = caseVolume(volume);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DockercomposePackage.DEPLOY: {
			Deploy deploy = (Deploy) theEObject;
			T result = caseDeploy(deploy);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DockercomposePackage.RESOURCES: {
			Resources resources = (Resources) theEObject;
			T result = caseResources(resources);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DockercomposePackage.LIMITS: {
			Limits limits = (Limits) theEObject;
			T result = caseLimits(limits);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DockercomposePackage.DEPENDS_ON: {
			Depends_on depends_on = (Depends_on) theEObject;
			T result = caseDepends_on(depends_on);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DockercomposePackage.DB: {
			Db db = (Db) theEObject;
			T result = caseDb(db);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DockercomposePackage.SECRET: {
			Secret secret = (Secret) theEObject;
			T result = caseSecret(secret);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DockercomposePackage.IPAM: {
			Ipam ipam = (Ipam) theEObject;
			T result = caseIpam(ipam);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DockercomposePackage.CONFIG: {
			Config config = (Config) theEObject;
			T result = caseConfig(config);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DockercomposePackage.VOLUME_OBJECT: {
			VolumeObject volumeObject = (VolumeObject) theEObject;
			T result = caseVolumeObject(volumeObject);
			if (result == null)
				result = caseVolume(volumeObject);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DockercomposePackage.VOLUME_VALUE: {
			VolumeValue volumeValue = (VolumeValue) theEObject;
			T result = caseVolumeValue(volumeValue);
			if (result == null)
				result = caseVolume(volumeValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DockercomposePackage.BUILD_OBJECT: {
			BuildObject buildObject = (BuildObject) theEObject;
			T result = caseBuildObject(buildObject);
			if (result == null)
				result = caseBuild(buildObject);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DockercomposePackage.BUILD_VALUE: {
			BuildValue buildValue = (BuildValue) theEObject;
			T result = caseBuildValue(buildValue);
			if (result == null)
				result = caseBuild(buildValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DockercomposePackage.NETWORKS_OBJECT: {
			NetworksObject networksObject = (NetworksObject) theEObject;
			T result = caseNetworksObject(networksObject);
			if (result == null)
				result = caseNetworks(networksObject);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DockercomposePackage.NETWORKS_VALUE: {
			NetworksValue networksValue = (NetworksValue) theEObject;
			T result = caseNetworksValue(networksValue);
			if (result == null)
				result = caseNetworks(networksValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DockercomposePackage.DEPENDS_ON_OBJECT: {
			Depends_onObject depends_onObject = (Depends_onObject) theEObject;
			T result = caseDepends_onObject(depends_onObject);
			if (result == null)
				result = caseDepends_on(depends_onObject);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case DockercomposePackage.DEPENDS_ON_VALUE: {
			Depends_onValue depends_onValue = (Depends_onValue) theEObject;
			T result = caseDepends_onValue(depends_onValue);
			if (result == null)
				result = caseDepends_on(depends_onValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key Value Pair</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Value Pair</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyValuePair(KeyValuePair object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Docker Compose</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Docker Compose</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDockerCompose(DockerCompose object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseService(Service object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Build</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Build</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuild(Build object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Healthcheck</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Healthcheck</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHealthcheck(Healthcheck object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Networks</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Networks</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworks(Networks object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetwork(Network object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Volume</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Volume</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVolume(Volume object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deploy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deploy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeploy(Deploy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resources</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resources</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResources(Resources object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Limits</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Limits</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLimits(Limits object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Depends on</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Depends on</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDepends_on(Depends_on object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Db</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Db</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDb(Db object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Secret</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Secret</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecret(Secret object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ipam</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ipam</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIpam(Ipam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Config</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfig(Config object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Volume Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Volume Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVolumeObject(VolumeObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Volume Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Volume Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVolumeValue(VolumeValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Build Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Build Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuildObject(BuildObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Build Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Build Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuildValue(BuildValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Networks Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Networks Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworksObject(NetworksObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Networks Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Networks Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworksValue(NetworksValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Depends on Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Depends on Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDepends_onObject(Depends_onObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Depends on Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Depends on Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDepends_onValue(Depends_onValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //DockercomposeSwitch
