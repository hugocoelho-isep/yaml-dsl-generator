/**
 */
package pt.isep.yamldslgen.docker_compose.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import pt.isep.yamldslgen.docker_compose.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DockercomposeFactoryImpl extends EFactoryImpl implements DockercomposeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DockercomposeFactory init() {
		try {
			DockercomposeFactory theDockercomposeFactory = (DockercomposeFactory) EPackage.Registry.INSTANCE
					.getEFactory(DockercomposePackage.eNS_URI);
			if (theDockercomposeFactory != null) {
				return theDockercomposeFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DockercomposeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DockercomposeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case DockercomposePackage.KEY_VALUE_PAIR:
			return createKeyValuePair();
		case DockercomposePackage.DOCKER_COMPOSE:
			return createDockerCompose();
		case DockercomposePackage.SERVICE:
			return createService();
		case DockercomposePackage.HEALTHCHECK:
			return createHealthcheck();
		case DockercomposePackage.NETWORK:
			return createNetwork();
		case DockercomposePackage.RESOURCE:
			return createResource();
		case DockercomposePackage.SECRET:
			return createSecret();
		case DockercomposePackage.DB:
			return createDb();
		case DockercomposePackage.CONFIG:
			return createConfig();
		case DockercomposePackage.VOLUME_OBJECT:
			return createVolumeObject();
		case DockercomposePackage.VOLUME_VALUE:
			return createVolumeValue();
		case DockercomposePackage.BUILD_OBJECT:
			return createBuildObject();
		case DockercomposePackage.BUILD_VALUE:
			return createBuildValue();
		case DockercomposePackage.NETWORKS_OBJECT:
			return createNetworksObject();
		case DockercomposePackage.NETWORKS_VALUE:
			return createNetworksValue();
		case DockercomposePackage.DEPENDS_ON_OBJECT:
			return createDepends_onObject();
		case DockercomposePackage.DEPENDS_ON_VALUE:
			return createDepends_onValue();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KeyValuePair createKeyValuePair() {
		KeyValuePairImpl keyValuePair = new KeyValuePairImpl();
		return keyValuePair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DockerCompose createDockerCompose() {
		DockerComposeImpl dockerCompose = new DockerComposeImpl();
		return dockerCompose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Healthcheck createHealthcheck() {
		HealthcheckImpl healthcheck = new HealthcheckImpl();
		return healthcheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Network createNetwork() {
		NetworkImpl network = new NetworkImpl();
		return network;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Resource createResource() {
		ResourceImpl resource = new ResourceImpl();
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Secret createSecret() {
		SecretImpl secret = new SecretImpl();
		return secret;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Db createDb() {
		DbImpl db = new DbImpl();
		return db;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Config createConfig() {
		ConfigImpl config = new ConfigImpl();
		return config;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VolumeObject createVolumeObject() {
		VolumeObjectImpl volumeObject = new VolumeObjectImpl();
		return volumeObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VolumeValue createVolumeValue() {
		VolumeValueImpl volumeValue = new VolumeValueImpl();
		return volumeValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BuildObject createBuildObject() {
		BuildObjectImpl buildObject = new BuildObjectImpl();
		return buildObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BuildValue createBuildValue() {
		BuildValueImpl buildValue = new BuildValueImpl();
		return buildValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NetworksObject createNetworksObject() {
		NetworksObjectImpl networksObject = new NetworksObjectImpl();
		return networksObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NetworksValue createNetworksValue() {
		NetworksValueImpl networksValue = new NetworksValueImpl();
		return networksValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Depends_onObject createDepends_onObject() {
		Depends_onObjectImpl depends_onObject = new Depends_onObjectImpl();
		return depends_onObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Depends_onValue createDepends_onValue() {
		Depends_onValueImpl depends_onValue = new Depends_onValueImpl();
		return depends_onValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DockercomposePackage getDockercomposePackage() {
		return (DockercomposePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DockercomposePackage getPackage() {
		return DockercomposePackage.eINSTANCE;
	}

} //DockercomposeFactoryImpl
