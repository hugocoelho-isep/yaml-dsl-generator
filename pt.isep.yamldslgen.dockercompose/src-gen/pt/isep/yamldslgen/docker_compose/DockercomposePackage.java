/**
 */
package pt.isep.yamldslgen.docker_compose;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see pt.isep.yamldslgen.docker_compose.DockercomposeFactory
 * @model kind="package"
 * @generated
 */
public interface DockercomposePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "docker_compose";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.isep.pt/metayaml/docker_compose";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "docker_compose";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DockercomposePackage eINSTANCE = pt.isep.yamldslgen.docker_compose.impl.DockercomposePackageImpl.init();

	/**
	 * The meta object id for the '{@link pt.isep.yamldslgen.docker_compose.impl.KeyValuePairImpl <em>Key Value Pair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.yamldslgen.docker_compose.impl.KeyValuePairImpl
	 * @see pt.isep.yamldslgen.docker_compose.impl.DockercomposePackageImpl#getKeyValuePair()
	 * @generated
	 */
	int KEY_VALUE_PAIR = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PAIR__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PAIR__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Key Value Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PAIR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Key Value Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEY_VALUE_PAIR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.isep.yamldslgen.docker_compose.impl.DockerComposeImpl <em>Docker Compose</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.yamldslgen.docker_compose.impl.DockerComposeImpl
	 * @see pt.isep.yamldslgen.docker_compose.impl.DockercomposePackageImpl#getDockerCompose()
	 * @generated
	 */
	int DOCKER_COMPOSE = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_COMPOSE__VERSION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_COMPOSE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_COMPOSE__SERVICES = 2;

	/**
	 * The feature id for the '<em><b>Networks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_COMPOSE__NETWORKS = 3;

	/**
	 * The feature id for the '<em><b>Volumes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_COMPOSE__VOLUMES = 4;

	/**
	 * The feature id for the '<em><b>Secrets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_COMPOSE__SECRETS = 5;

	/**
	 * The number of structural features of the '<em>Docker Compose</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_COMPOSE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Docker Compose</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_COMPOSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.isep.yamldslgen.docker_compose.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.yamldslgen.docker_compose.impl.ServiceImpl
	 * @see pt.isep.yamldslgen.docker_compose.impl.DockercomposePackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__ID = 0;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__PORTS = 1;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__IMAGE = 2;

	/**
	 * The feature id for the '<em><b>Restart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__RESTART = 3;

	/**
	 * The feature id for the '<em><b>Container Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__CONTAINER_NAME = 4;

	/**
	 * The feature id for the '<em><b>Command</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__COMMAND = 5;

	/**
	 * The feature id for the '<em><b>Stop Signal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__STOP_SIGNAL = 6;

	/**
	 * The feature id for the '<em><b>Expose</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__EXPOSE = 7;

	/**
	 * The feature id for the '<em><b>Secrets</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__SECRETS = 8;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__USER = 9;

	/**
	 * The feature id for the '<em><b>Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__HOSTNAME = 10;

	/**
	 * The feature id for the '<em><b>Cap Add</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__CAP_ADD = 11;

	/**
	 * The feature id for the '<em><b>Network Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NETWORK_MODE = 12;

	/**
	 * The feature id for the '<em><b>Stdin Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__STDIN_OPEN = 13;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__LABELS = 14;

	/**
	 * The feature id for the '<em><b>Platform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__PLATFORM = 15;

	/**
	 * The feature id for the '<em><b>Runtime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__RUNTIME = 16;

	/**
	 * The feature id for the '<em><b>Sysctls</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__SYSCTLS = 17;

	/**
	 * The feature id for the '<em><b>Build</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__BUILD = 18;

	/**
	 * The feature id for the '<em><b>Healthcheck</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__HEALTHCHECK = 19;

	/**
	 * The feature id for the '<em><b>Deploy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__DEPLOY = 20;

	/**
	 * The feature id for the '<em><b>Depends On</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__DEPENDS_ON = 21;

	/**
	 * The feature id for the '<em><b>Volumes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__VOLUMES = 22;

	/**
	 * The feature id for the '<em><b>Networks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NETWORKS = 23;

	/**
	 * The feature id for the '<em><b>Environment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__ENVIRONMENT = 24;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = 25;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.isep.yamldslgen.docker_compose.impl.BuildImpl <em>Build</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.yamldslgen.docker_compose.impl.BuildImpl
	 * @see pt.isep.yamldslgen.docker_compose.impl.DockercomposePackageImpl#getBuild()
	 * @generated
	 */
	int BUILD = 3;

	/**
	 * The number of structural features of the '<em>Build</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Build</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.isep.yamldslgen.docker_compose.impl.HealthcheckImpl <em>Healthcheck</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.yamldslgen.docker_compose.impl.HealthcheckImpl
	 * @see pt.isep.yamldslgen.docker_compose.impl.DockercomposePackageImpl#getHealthcheck()
	 * @generated
	 */
	int HEALTHCHECK = 4;

	/**
	 * The feature id for the '<em><b>Test</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTHCHECK__TEST = 0;

	/**
	 * The feature id for the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTHCHECK__INTERVAL = 1;

	/**
	 * The feature id for the '<em><b>Retries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTHCHECK__RETRIES = 2;

	/**
	 * The feature id for the '<em><b>Start Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTHCHECK__START_PERIOD = 3;

	/**
	 * The feature id for the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTHCHECK__TIMEOUT = 4;

	/**
	 * The number of structural features of the '<em>Healthcheck</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTHCHECK_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Healthcheck</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTHCHECK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.isep.yamldslgen.docker_compose.impl.NetworksImpl <em>Networks</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.yamldslgen.docker_compose.impl.NetworksImpl
	 * @see pt.isep.yamldslgen.docker_compose.impl.DockercomposePackageImpl#getNetworks()
	 * @generated
	 */
	int NETWORKS = 5;

	/**
	 * The number of structural features of the '<em>Networks</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Networks</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.isep.yamldslgen.docker_compose.impl.NetworkImpl <em>Network</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.yamldslgen.docker_compose.impl.NetworkImpl
	 * @see pt.isep.yamldslgen.docker_compose.impl.DockercomposePackageImpl#getNetwork()
	 * @generated
	 */
	int NETWORK = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__ID = 0;

	/**
	 * The feature id for the '<em><b>Driver</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__DRIVER = 1;

	/**
	 * The feature id for the '<em><b>Ipv4 Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__IPV4_ADDRESS = 2;

	/**
	 * The feature id for the '<em><b>Ipam</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK__IPAM = 3;

	/**
	 * The number of structural features of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Network</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.isep.yamldslgen.docker_compose.impl.VolumeImpl <em>Volume</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.yamldslgen.docker_compose.impl.VolumeImpl
	 * @see pt.isep.yamldslgen.docker_compose.impl.DockercomposePackageImpl#getVolume()
	 * @generated
	 */
	int VOLUME = 7;

	/**
	 * The number of structural features of the '<em>Volume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Volume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.isep.yamldslgen.docker_compose.impl.DeployImpl <em>Deploy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.yamldslgen.docker_compose.impl.DeployImpl
	 * @see pt.isep.yamldslgen.docker_compose.impl.DockercomposePackageImpl#getDeploy()
	 * @generated
	 */
	int DEPLOY = 8;

	/**
	 * The feature id for the '<em><b>Resources</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY__RESOURCES = 0;

	/**
	 * The number of structural features of the '<em>Deploy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Deploy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.isep.yamldslgen.docker_compose.impl.ResourcesImpl <em>Resources</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.yamldslgen.docker_compose.impl.ResourcesImpl
	 * @see pt.isep.yamldslgen.docker_compose.impl.DockercomposePackageImpl#getResources()
	 * @generated
	 */
	int RESOURCES = 9;

	/**
	 * The feature id for the '<em><b>Limits</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES__LIMITS = 0;

	/**
	 * The number of structural features of the '<em>Resources</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Resources</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.isep.yamldslgen.docker_compose.impl.LimitsImpl <em>Limits</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.yamldslgen.docker_compose.impl.LimitsImpl
	 * @see pt.isep.yamldslgen.docker_compose.impl.DockercomposePackageImpl#getLimits()
	 * @generated
	 */
	int LIMITS = 10;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMITS__MEMORY = 0;

	/**
	 * The number of structural features of the '<em>Limits</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMITS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Limits</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMITS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.isep.yamldslgen.docker_compose.impl.Depends_onImpl <em>Depends on</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.yamldslgen.docker_compose.impl.Depends_onImpl
	 * @see pt.isep.yamldslgen.docker_compose.impl.DockercomposePackageImpl#getDepends_on()
	 * @generated
	 */
	int DEPENDS_ON = 11;

	/**
	 * The number of structural features of the '<em>Depends on</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDS_ON_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Depends on</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDS_ON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.isep.yamldslgen.docker_compose.impl.DbImpl <em>Db</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.yamldslgen.docker_compose.impl.DbImpl
	 * @see pt.isep.yamldslgen.docker_compose.impl.DockercomposePackageImpl#getDb()
	 * @generated
	 */
	int DB = 12;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB__CONDITION = 0;

	/**
	 * The number of structural features of the '<em>Db</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Db</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.isep.yamldslgen.docker_compose.impl.SecretImpl <em>Secret</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.yamldslgen.docker_compose.impl.SecretImpl
	 * @see pt.isep.yamldslgen.docker_compose.impl.DockercomposePackageImpl#getSecret()
	 * @generated
	 */
	int SECRET = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRET__ID = 0;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRET__FILE = 1;

	/**
	 * The number of structural features of the '<em>Secret</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRET_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Secret</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.isep.yamldslgen.docker_compose.impl.IpamImpl <em>Ipam</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.yamldslgen.docker_compose.impl.IpamImpl
	 * @see pt.isep.yamldslgen.docker_compose.impl.DockercomposePackageImpl#getIpam()
	 * @generated
	 */
	int IPAM = 14;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPAM__CONFIG = 0;

	/**
	 * The number of structural features of the '<em>Ipam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPAM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Ipam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.isep.yamldslgen.docker_compose.impl.ConfigImpl <em>Config</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.yamldslgen.docker_compose.impl.ConfigImpl
	 * @see pt.isep.yamldslgen.docker_compose.impl.DockercomposePackageImpl#getConfig()
	 * @generated
	 */
	int CONFIG = 15;

	/**
	 * The feature id for the '<em><b>Subnet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG__SUBNET = 0;

	/**
	 * The number of structural features of the '<em>Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Config</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link pt.isep.yamldslgen.docker_compose.impl.VolumeObjectImpl <em>Volume Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.yamldslgen.docker_compose.impl.VolumeObjectImpl
	 * @see pt.isep.yamldslgen.docker_compose.impl.DockercomposePackageImpl#getVolumeObject()
	 * @generated
	 */
	int VOLUME_OBJECT = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_OBJECT__ID = VOLUME_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_OBJECT__TYPE = VOLUME_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_OBJECT__SOURCE = VOLUME_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_OBJECT__TARGET = VOLUME_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_OBJECT__READ_ONLY = VOLUME_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Volume Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_OBJECT_FEATURE_COUNT = VOLUME_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Volume Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_OBJECT_OPERATION_COUNT = VOLUME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pt.isep.yamldslgen.docker_compose.impl.VolumeValueImpl <em>Volume Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.yamldslgen.docker_compose.impl.VolumeValueImpl
	 * @see pt.isep.yamldslgen.docker_compose.impl.DockercomposePackageImpl#getVolumeValue()
	 * @generated
	 */
	int VOLUME_VALUE = 17;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_VALUE__VALUE = VOLUME_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Volume Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_VALUE_FEATURE_COUNT = VOLUME_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Volume Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_VALUE_OPERATION_COUNT = VOLUME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pt.isep.yamldslgen.docker_compose.impl.BuildObjectImpl <em>Build Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.yamldslgen.docker_compose.impl.BuildObjectImpl
	 * @see pt.isep.yamldslgen.docker_compose.impl.DockercomposePackageImpl#getBuildObject()
	 * @generated
	 */
	int BUILD_OBJECT = 18;

	/**
	 * The feature id for the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_OBJECT__CONTEXT = BUILD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_OBJECT__TARGET = BUILD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Args</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_OBJECT__ARGS = BUILD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Dockerfile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_OBJECT__DOCKERFILE = BUILD_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Build Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_OBJECT_FEATURE_COUNT = BUILD_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Build Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_OBJECT_OPERATION_COUNT = BUILD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pt.isep.yamldslgen.docker_compose.impl.BuildValueImpl <em>Build Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.yamldslgen.docker_compose.impl.BuildValueImpl
	 * @see pt.isep.yamldslgen.docker_compose.impl.DockercomposePackageImpl#getBuildValue()
	 * @generated
	 */
	int BUILD_VALUE = 19;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_VALUE__VALUE = BUILD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Build Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_VALUE_FEATURE_COUNT = BUILD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Build Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUILD_VALUE_OPERATION_COUNT = BUILD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pt.isep.yamldslgen.docker_compose.impl.NetworksObjectImpl <em>Networks Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.yamldslgen.docker_compose.impl.NetworksObjectImpl
	 * @see pt.isep.yamldslgen.docker_compose.impl.DockercomposePackageImpl#getNetworksObject()
	 * @generated
	 */
	int NETWORKS_OBJECT = 20;

	/**
	 * The feature id for the '<em><b>Network</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKS_OBJECT__NETWORK = NETWORKS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Networks Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKS_OBJECT_FEATURE_COUNT = NETWORKS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Networks Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKS_OBJECT_OPERATION_COUNT = NETWORKS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pt.isep.yamldslgen.docker_compose.impl.NetworksValueImpl <em>Networks Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.yamldslgen.docker_compose.impl.NetworksValueImpl
	 * @see pt.isep.yamldslgen.docker_compose.impl.DockercomposePackageImpl#getNetworksValue()
	 * @generated
	 */
	int NETWORKS_VALUE = 21;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKS_VALUE__VALUE = NETWORKS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Networks Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKS_VALUE_FEATURE_COUNT = NETWORKS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Networks Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORKS_VALUE_OPERATION_COUNT = NETWORKS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pt.isep.yamldslgen.docker_compose.impl.Depends_onObjectImpl <em>Depends on Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.yamldslgen.docker_compose.impl.Depends_onObjectImpl
	 * @see pt.isep.yamldslgen.docker_compose.impl.DockercomposePackageImpl#getDepends_onObject()
	 * @generated
	 */
	int DEPENDS_ON_OBJECT = 22;

	/**
	 * The feature id for the '<em><b>Db</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDS_ON_OBJECT__DB = DEPENDS_ON_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Depends on Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDS_ON_OBJECT_FEATURE_COUNT = DEPENDS_ON_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Depends on Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDS_ON_OBJECT_OPERATION_COUNT = DEPENDS_ON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link pt.isep.yamldslgen.docker_compose.impl.Depends_onValueImpl <em>Depends on Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see pt.isep.yamldslgen.docker_compose.impl.Depends_onValueImpl
	 * @see pt.isep.yamldslgen.docker_compose.impl.DockercomposePackageImpl#getDepends_onValue()
	 * @generated
	 */
	int DEPENDS_ON_VALUE = 23;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDS_ON_VALUE__VALUE = DEPENDS_ON_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Depends on Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDS_ON_VALUE_FEATURE_COUNT = DEPENDS_ON_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Depends on Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDS_ON_VALUE_OPERATION_COUNT = DEPENDS_ON_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link pt.isep.yamldslgen.docker_compose.KeyValuePair <em>Key Value Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Value Pair</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.KeyValuePair
	 * @generated
	 */
	EClass getKeyValuePair();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.docker_compose.KeyValuePair#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.KeyValuePair#getKey()
	 * @see #getKeyValuePair()
	 * @generated
	 */
	EAttribute getKeyValuePair_Key();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.docker_compose.KeyValuePair#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.KeyValuePair#getValue()
	 * @see #getKeyValuePair()
	 * @generated
	 */
	EAttribute getKeyValuePair_Value();

	/**
	 * Returns the meta object for class '{@link pt.isep.yamldslgen.docker_compose.DockerCompose <em>Docker Compose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Docker Compose</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.DockerCompose
	 * @generated
	 */
	EClass getDockerCompose();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.docker_compose.DockerCompose#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.DockerCompose#getVersion()
	 * @see #getDockerCompose()
	 * @generated
	 */
	EAttribute getDockerCompose_Version();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.docker_compose.DockerCompose#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.DockerCompose#getName()
	 * @see #getDockerCompose()
	 * @generated
	 */
	EAttribute getDockerCompose_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.isep.yamldslgen.docker_compose.DockerCompose#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Services</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.DockerCompose#getServices()
	 * @see #getDockerCompose()
	 * @generated
	 */
	EReference getDockerCompose_Services();

	/**
	 * Returns the meta object for the containment reference '{@link pt.isep.yamldslgen.docker_compose.DockerCompose#getNetworks <em>Networks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Networks</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.DockerCompose#getNetworks()
	 * @see #getDockerCompose()
	 * @generated
	 */
	EReference getDockerCompose_Networks();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.isep.yamldslgen.docker_compose.DockerCompose#getVolumes <em>Volumes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Volumes</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.DockerCompose#getVolumes()
	 * @see #getDockerCompose()
	 * @generated
	 */
	EReference getDockerCompose_Volumes();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.isep.yamldslgen.docker_compose.DockerCompose#getSecrets <em>Secrets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Secrets</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.DockerCompose#getSecrets()
	 * @see #getDockerCompose()
	 * @generated
	 */
	EReference getDockerCompose_Secrets();

	/**
	 * Returns the meta object for class '{@link pt.isep.yamldslgen.docker_compose.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.docker_compose.Service#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.Service#getId()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Id();

	/**
	 * Returns the meta object for the attribute list '{@link pt.isep.yamldslgen.docker_compose.Service#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Ports</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.Service#getPorts()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Ports();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.docker_compose.Service#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.Service#getImage()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Image();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.docker_compose.Service#getRestart <em>Restart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Restart</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.Service#getRestart()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Restart();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.docker_compose.Service#getContainerName <em>Container Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Container Name</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.Service#getContainerName()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_ContainerName();

	/**
	 * Returns the meta object for the attribute list '{@link pt.isep.yamldslgen.docker_compose.Service#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Command</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.Service#getCommand()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Command();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.docker_compose.Service#getStopSignal <em>Stop Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stop Signal</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.Service#getStopSignal()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_StopSignal();

	/**
	 * Returns the meta object for the attribute list '{@link pt.isep.yamldslgen.docker_compose.Service#getExpose <em>Expose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Expose</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.Service#getExpose()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Expose();

	/**
	 * Returns the meta object for the attribute list '{@link pt.isep.yamldslgen.docker_compose.Service#getSecrets <em>Secrets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Secrets</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.Service#getSecrets()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Secrets();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.docker_compose.Service#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.Service#getUser()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_User();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.docker_compose.Service#getHostname <em>Hostname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hostname</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.Service#getHostname()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Hostname();

	/**
	 * Returns the meta object for the attribute list '{@link pt.isep.yamldslgen.docker_compose.Service#getCapAdd <em>Cap Add</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Cap Add</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.Service#getCapAdd()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_CapAdd();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.docker_compose.Service#getNetworkMode <em>Network Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Network Mode</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.Service#getNetworkMode()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_NetworkMode();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.docker_compose.Service#isStdinOpen <em>Stdin Open</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stdin Open</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.Service#isStdinOpen()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_StdinOpen();

	/**
	 * Returns the meta object for the attribute list '{@link pt.isep.yamldslgen.docker_compose.Service#getLabels <em>Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Labels</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.Service#getLabels()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Labels();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.docker_compose.Service#getPlatform <em>Platform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Platform</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.Service#getPlatform()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Platform();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.docker_compose.Service#getRuntime <em>Runtime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Runtime</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.Service#getRuntime()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Runtime();

	/**
	 * Returns the meta object for the attribute list '{@link pt.isep.yamldslgen.docker_compose.Service#getSysctls <em>Sysctls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Sysctls</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.Service#getSysctls()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Sysctls();

	/**
	 * Returns the meta object for the containment reference '{@link pt.isep.yamldslgen.docker_compose.Service#getBuild <em>Build</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Build</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.Service#getBuild()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Build();

	/**
	 * Returns the meta object for the containment reference '{@link pt.isep.yamldslgen.docker_compose.Service#getHealthcheck <em>Healthcheck</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Healthcheck</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.Service#getHealthcheck()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Healthcheck();

	/**
	 * Returns the meta object for the containment reference '{@link pt.isep.yamldslgen.docker_compose.Service#getDeploy <em>Deploy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deploy</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.Service#getDeploy()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Deploy();

	/**
	 * Returns the meta object for the containment reference '{@link pt.isep.yamldslgen.docker_compose.Service#getDependsOn <em>Depends On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Depends On</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.Service#getDependsOn()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_DependsOn();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.isep.yamldslgen.docker_compose.Service#getVolumes <em>Volumes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Volumes</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.Service#getVolumes()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Volumes();

	/**
	 * Returns the meta object for the containment reference '{@link pt.isep.yamldslgen.docker_compose.Service#getNetworks <em>Networks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Networks</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.Service#getNetworks()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Networks();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.isep.yamldslgen.docker_compose.Service#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Environment</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.Service#getEnvironment()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Environment();

	/**
	 * Returns the meta object for class '{@link pt.isep.yamldslgen.docker_compose.Build <em>Build</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Build</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.Build
	 * @generated
	 */
	EClass getBuild();

	/**
	 * Returns the meta object for class '{@link pt.isep.yamldslgen.docker_compose.Healthcheck <em>Healthcheck</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Healthcheck</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.Healthcheck
	 * @generated
	 */
	EClass getHealthcheck();

	/**
	 * Returns the meta object for the attribute list '{@link pt.isep.yamldslgen.docker_compose.Healthcheck#getTest <em>Test</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Test</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.Healthcheck#getTest()
	 * @see #getHealthcheck()
	 * @generated
	 */
	EAttribute getHealthcheck_Test();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.docker_compose.Healthcheck#getInterval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interval</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.Healthcheck#getInterval()
	 * @see #getHealthcheck()
	 * @generated
	 */
	EAttribute getHealthcheck_Interval();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.docker_compose.Healthcheck#getRetries <em>Retries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Retries</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.Healthcheck#getRetries()
	 * @see #getHealthcheck()
	 * @generated
	 */
	EAttribute getHealthcheck_Retries();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.docker_compose.Healthcheck#getStartPeriod <em>Start Period</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Period</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.Healthcheck#getStartPeriod()
	 * @see #getHealthcheck()
	 * @generated
	 */
	EAttribute getHealthcheck_StartPeriod();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.docker_compose.Healthcheck#getTimeout <em>Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timeout</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.Healthcheck#getTimeout()
	 * @see #getHealthcheck()
	 * @generated
	 */
	EAttribute getHealthcheck_Timeout();

	/**
	 * Returns the meta object for class '{@link pt.isep.yamldslgen.docker_compose.Networks <em>Networks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Networks</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.Networks
	 * @generated
	 */
	EClass getNetworks();

	/**
	 * Returns the meta object for class '{@link pt.isep.yamldslgen.docker_compose.Network <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.Network
	 * @generated
	 */
	EClass getNetwork();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.docker_compose.Network#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.Network#getId()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_Id();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.docker_compose.Network#getDriver <em>Driver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Driver</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.Network#getDriver()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_Driver();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.docker_compose.Network#getIpv4Address <em>Ipv4 Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ipv4 Address</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.Network#getIpv4Address()
	 * @see #getNetwork()
	 * @generated
	 */
	EAttribute getNetwork_Ipv4Address();

	/**
	 * Returns the meta object for the containment reference '{@link pt.isep.yamldslgen.docker_compose.Network#getIpam <em>Ipam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ipam</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.Network#getIpam()
	 * @see #getNetwork()
	 * @generated
	 */
	EReference getNetwork_Ipam();

	/**
	 * Returns the meta object for class '{@link pt.isep.yamldslgen.docker_compose.Volume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Volume</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.Volume
	 * @generated
	 */
	EClass getVolume();

	/**
	 * Returns the meta object for class '{@link pt.isep.yamldslgen.docker_compose.Deploy <em>Deploy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deploy</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.Deploy
	 * @generated
	 */
	EClass getDeploy();

	/**
	 * Returns the meta object for the containment reference '{@link pt.isep.yamldslgen.docker_compose.Deploy#getResources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resources</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.Deploy#getResources()
	 * @see #getDeploy()
	 * @generated
	 */
	EReference getDeploy_Resources();

	/**
	 * Returns the meta object for class '{@link pt.isep.yamldslgen.docker_compose.Resources <em>Resources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resources</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.Resources
	 * @generated
	 */
	EClass getResources();

	/**
	 * Returns the meta object for the containment reference '{@link pt.isep.yamldslgen.docker_compose.Resources#getLimits <em>Limits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Limits</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.Resources#getLimits()
	 * @see #getResources()
	 * @generated
	 */
	EReference getResources_Limits();

	/**
	 * Returns the meta object for class '{@link pt.isep.yamldslgen.docker_compose.Limits <em>Limits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Limits</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.Limits
	 * @generated
	 */
	EClass getLimits();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.docker_compose.Limits#getMemory <em>Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.Limits#getMemory()
	 * @see #getLimits()
	 * @generated
	 */
	EAttribute getLimits_Memory();

	/**
	 * Returns the meta object for class '{@link pt.isep.yamldslgen.docker_compose.Depends_on <em>Depends on</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Depends on</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.Depends_on
	 * @generated
	 */
	EClass getDepends_on();

	/**
	 * Returns the meta object for class '{@link pt.isep.yamldslgen.docker_compose.Db <em>Db</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Db</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.Db
	 * @generated
	 */
	EClass getDb();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.docker_compose.Db#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.Db#getCondition()
	 * @see #getDb()
	 * @generated
	 */
	EAttribute getDb_Condition();

	/**
	 * Returns the meta object for class '{@link pt.isep.yamldslgen.docker_compose.Secret <em>Secret</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Secret</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.Secret
	 * @generated
	 */
	EClass getSecret();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.docker_compose.Secret#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.Secret#getId()
	 * @see #getSecret()
	 * @generated
	 */
	EAttribute getSecret_Id();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.docker_compose.Secret#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.Secret#getFile()
	 * @see #getSecret()
	 * @generated
	 */
	EAttribute getSecret_File();

	/**
	 * Returns the meta object for class '{@link pt.isep.yamldslgen.docker_compose.Ipam <em>Ipam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ipam</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.Ipam
	 * @generated
	 */
	EClass getIpam();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.isep.yamldslgen.docker_compose.Ipam#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Config</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.Ipam#getConfig()
	 * @see #getIpam()
	 * @generated
	 */
	EReference getIpam_Config();

	/**
	 * Returns the meta object for class '{@link pt.isep.yamldslgen.docker_compose.Config <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Config</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.Config
	 * @generated
	 */
	EClass getConfig();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.docker_compose.Config#getSubnet <em>Subnet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subnet</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.Config#getSubnet()
	 * @see #getConfig()
	 * @generated
	 */
	EAttribute getConfig_Subnet();

	/**
	 * Returns the meta object for class '{@link pt.isep.yamldslgen.docker_compose.VolumeObject <em>Volume Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Volume Object</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.VolumeObject
	 * @generated
	 */
	EClass getVolumeObject();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.docker_compose.VolumeObject#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.VolumeObject#getId()
	 * @see #getVolumeObject()
	 * @generated
	 */
	EAttribute getVolumeObject_Id();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.docker_compose.VolumeObject#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.VolumeObject#getType()
	 * @see #getVolumeObject()
	 * @generated
	 */
	EAttribute getVolumeObject_Type();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.docker_compose.VolumeObject#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.VolumeObject#getSource()
	 * @see #getVolumeObject()
	 * @generated
	 */
	EAttribute getVolumeObject_Source();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.docker_compose.VolumeObject#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.VolumeObject#getTarget()
	 * @see #getVolumeObject()
	 * @generated
	 */
	EAttribute getVolumeObject_Target();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.docker_compose.VolumeObject#isReadOnly <em>Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Only</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.VolumeObject#isReadOnly()
	 * @see #getVolumeObject()
	 * @generated
	 */
	EAttribute getVolumeObject_ReadOnly();

	/**
	 * Returns the meta object for class '{@link pt.isep.yamldslgen.docker_compose.VolumeValue <em>Volume Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Volume Value</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.VolumeValue
	 * @generated
	 */
	EClass getVolumeValue();

	/**
	 * Returns the meta object for the attribute list '{@link pt.isep.yamldslgen.docker_compose.VolumeValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.VolumeValue#getValue()
	 * @see #getVolumeValue()
	 * @generated
	 */
	EAttribute getVolumeValue_Value();

	/**
	 * Returns the meta object for class '{@link pt.isep.yamldslgen.docker_compose.BuildObject <em>Build Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Build Object</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.BuildObject
	 * @generated
	 */
	EClass getBuildObject();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.docker_compose.BuildObject#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.BuildObject#getContext()
	 * @see #getBuildObject()
	 * @generated
	 */
	EAttribute getBuildObject_Context();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.docker_compose.BuildObject#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.BuildObject#getTarget()
	 * @see #getBuildObject()
	 * @generated
	 */
	EAttribute getBuildObject_Target();

	/**
	 * Returns the meta object for the attribute list '{@link pt.isep.yamldslgen.docker_compose.BuildObject#getArgs <em>Args</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Args</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.BuildObject#getArgs()
	 * @see #getBuildObject()
	 * @generated
	 */
	EAttribute getBuildObject_Args();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.docker_compose.BuildObject#getDockerfile <em>Dockerfile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dockerfile</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.BuildObject#getDockerfile()
	 * @see #getBuildObject()
	 * @generated
	 */
	EAttribute getBuildObject_Dockerfile();

	/**
	 * Returns the meta object for class '{@link pt.isep.yamldslgen.docker_compose.BuildValue <em>Build Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Build Value</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.BuildValue
	 * @generated
	 */
	EClass getBuildValue();

	/**
	 * Returns the meta object for the attribute '{@link pt.isep.yamldslgen.docker_compose.BuildValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.BuildValue#getValue()
	 * @see #getBuildValue()
	 * @generated
	 */
	EAttribute getBuildValue_Value();

	/**
	 * Returns the meta object for class '{@link pt.isep.yamldslgen.docker_compose.NetworksObject <em>Networks Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Networks Object</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.NetworksObject
	 * @generated
	 */
	EClass getNetworksObject();

	/**
	 * Returns the meta object for the containment reference list '{@link pt.isep.yamldslgen.docker_compose.NetworksObject#getNetwork <em>Network</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Network</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.NetworksObject#getNetwork()
	 * @see #getNetworksObject()
	 * @generated
	 */
	EReference getNetworksObject_Network();

	/**
	 * Returns the meta object for class '{@link pt.isep.yamldslgen.docker_compose.NetworksValue <em>Networks Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Networks Value</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.NetworksValue
	 * @generated
	 */
	EClass getNetworksValue();

	/**
	 * Returns the meta object for the attribute list '{@link pt.isep.yamldslgen.docker_compose.NetworksValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.NetworksValue#getValue()
	 * @see #getNetworksValue()
	 * @generated
	 */
	EAttribute getNetworksValue_Value();

	/**
	 * Returns the meta object for class '{@link pt.isep.yamldslgen.docker_compose.Depends_onObject <em>Depends on Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Depends on Object</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.Depends_onObject
	 * @generated
	 */
	EClass getDepends_onObject();

	/**
	 * Returns the meta object for the containment reference '{@link pt.isep.yamldslgen.docker_compose.Depends_onObject#getDb <em>Db</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Db</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.Depends_onObject#getDb()
	 * @see #getDepends_onObject()
	 * @generated
	 */
	EReference getDepends_onObject_Db();

	/**
	 * Returns the meta object for class '{@link pt.isep.yamldslgen.docker_compose.Depends_onValue <em>Depends on Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Depends on Value</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.Depends_onValue
	 * @generated
	 */
	EClass getDepends_onValue();

	/**
	 * Returns the meta object for the attribute list '{@link pt.isep.yamldslgen.docker_compose.Depends_onValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see pt.isep.yamldslgen.docker_compose.Depends_onValue#getValue()
	 * @see #getDepends_onValue()
	 * @generated
	 */
	EAttribute getDepends_onValue_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DockercomposeFactory getDockercomposeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link pt.isep.yamldslgen.docker_compose.impl.KeyValuePairImpl <em>Key Value Pair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.yamldslgen.docker_compose.impl.KeyValuePairImpl
		 * @see pt.isep.yamldslgen.docker_compose.impl.DockercomposePackageImpl#getKeyValuePair()
		 * @generated
		 */
		EClass KEY_VALUE_PAIR = eINSTANCE.getKeyValuePair();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_VALUE_PAIR__KEY = eINSTANCE.getKeyValuePair_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEY_VALUE_PAIR__VALUE = eINSTANCE.getKeyValuePair_Value();

		/**
		 * The meta object literal for the '{@link pt.isep.yamldslgen.docker_compose.impl.DockerComposeImpl <em>Docker Compose</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.yamldslgen.docker_compose.impl.DockerComposeImpl
		 * @see pt.isep.yamldslgen.docker_compose.impl.DockercomposePackageImpl#getDockerCompose()
		 * @generated
		 */
		EClass DOCKER_COMPOSE = eINSTANCE.getDockerCompose();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_COMPOSE__VERSION = eINSTANCE.getDockerCompose_Version();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_COMPOSE__NAME = eINSTANCE.getDockerCompose_Name();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCKER_COMPOSE__SERVICES = eINSTANCE.getDockerCompose_Services();

		/**
		 * The meta object literal for the '<em><b>Networks</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCKER_COMPOSE__NETWORKS = eINSTANCE.getDockerCompose_Networks();

		/**
		 * The meta object literal for the '<em><b>Volumes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCKER_COMPOSE__VOLUMES = eINSTANCE.getDockerCompose_Volumes();

		/**
		 * The meta object literal for the '<em><b>Secrets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCKER_COMPOSE__SECRETS = eINSTANCE.getDockerCompose_Secrets();

		/**
		 * The meta object literal for the '{@link pt.isep.yamldslgen.docker_compose.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.yamldslgen.docker_compose.impl.ServiceImpl
		 * @see pt.isep.yamldslgen.docker_compose.impl.DockercomposePackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__ID = eINSTANCE.getService_Id();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__PORTS = eINSTANCE.getService_Ports();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__IMAGE = eINSTANCE.getService_Image();

		/**
		 * The meta object literal for the '<em><b>Restart</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__RESTART = eINSTANCE.getService_Restart();

		/**
		 * The meta object literal for the '<em><b>Container Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__CONTAINER_NAME = eINSTANCE.getService_ContainerName();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__COMMAND = eINSTANCE.getService_Command();

		/**
		 * The meta object literal for the '<em><b>Stop Signal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__STOP_SIGNAL = eINSTANCE.getService_StopSignal();

		/**
		 * The meta object literal for the '<em><b>Expose</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__EXPOSE = eINSTANCE.getService_Expose();

		/**
		 * The meta object literal for the '<em><b>Secrets</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__SECRETS = eINSTANCE.getService_Secrets();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__USER = eINSTANCE.getService_User();

		/**
		 * The meta object literal for the '<em><b>Hostname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__HOSTNAME = eINSTANCE.getService_Hostname();

		/**
		 * The meta object literal for the '<em><b>Cap Add</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__CAP_ADD = eINSTANCE.getService_CapAdd();

		/**
		 * The meta object literal for the '<em><b>Network Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__NETWORK_MODE = eINSTANCE.getService_NetworkMode();

		/**
		 * The meta object literal for the '<em><b>Stdin Open</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__STDIN_OPEN = eINSTANCE.getService_StdinOpen();

		/**
		 * The meta object literal for the '<em><b>Labels</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__LABELS = eINSTANCE.getService_Labels();

		/**
		 * The meta object literal for the '<em><b>Platform</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__PLATFORM = eINSTANCE.getService_Platform();

		/**
		 * The meta object literal for the '<em><b>Runtime</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__RUNTIME = eINSTANCE.getService_Runtime();

		/**
		 * The meta object literal for the '<em><b>Sysctls</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__SYSCTLS = eINSTANCE.getService_Sysctls();

		/**
		 * The meta object literal for the '<em><b>Build</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__BUILD = eINSTANCE.getService_Build();

		/**
		 * The meta object literal for the '<em><b>Healthcheck</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__HEALTHCHECK = eINSTANCE.getService_Healthcheck();

		/**
		 * The meta object literal for the '<em><b>Deploy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__DEPLOY = eINSTANCE.getService_Deploy();

		/**
		 * The meta object literal for the '<em><b>Depends On</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__DEPENDS_ON = eINSTANCE.getService_DependsOn();

		/**
		 * The meta object literal for the '<em><b>Volumes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__VOLUMES = eINSTANCE.getService_Volumes();

		/**
		 * The meta object literal for the '<em><b>Networks</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__NETWORKS = eINSTANCE.getService_Networks();

		/**
		 * The meta object literal for the '<em><b>Environment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__ENVIRONMENT = eINSTANCE.getService_Environment();

		/**
		 * The meta object literal for the '{@link pt.isep.yamldslgen.docker_compose.impl.BuildImpl <em>Build</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.yamldslgen.docker_compose.impl.BuildImpl
		 * @see pt.isep.yamldslgen.docker_compose.impl.DockercomposePackageImpl#getBuild()
		 * @generated
		 */
		EClass BUILD = eINSTANCE.getBuild();

		/**
		 * The meta object literal for the '{@link pt.isep.yamldslgen.docker_compose.impl.HealthcheckImpl <em>Healthcheck</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.yamldslgen.docker_compose.impl.HealthcheckImpl
		 * @see pt.isep.yamldslgen.docker_compose.impl.DockercomposePackageImpl#getHealthcheck()
		 * @generated
		 */
		EClass HEALTHCHECK = eINSTANCE.getHealthcheck();

		/**
		 * The meta object literal for the '<em><b>Test</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEALTHCHECK__TEST = eINSTANCE.getHealthcheck_Test();

		/**
		 * The meta object literal for the '<em><b>Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEALTHCHECK__INTERVAL = eINSTANCE.getHealthcheck_Interval();

		/**
		 * The meta object literal for the '<em><b>Retries</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEALTHCHECK__RETRIES = eINSTANCE.getHealthcheck_Retries();

		/**
		 * The meta object literal for the '<em><b>Start Period</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEALTHCHECK__START_PERIOD = eINSTANCE.getHealthcheck_StartPeriod();

		/**
		 * The meta object literal for the '<em><b>Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEALTHCHECK__TIMEOUT = eINSTANCE.getHealthcheck_Timeout();

		/**
		 * The meta object literal for the '{@link pt.isep.yamldslgen.docker_compose.impl.NetworksImpl <em>Networks</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.yamldslgen.docker_compose.impl.NetworksImpl
		 * @see pt.isep.yamldslgen.docker_compose.impl.DockercomposePackageImpl#getNetworks()
		 * @generated
		 */
		EClass NETWORKS = eINSTANCE.getNetworks();

		/**
		 * The meta object literal for the '{@link pt.isep.yamldslgen.docker_compose.impl.NetworkImpl <em>Network</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.yamldslgen.docker_compose.impl.NetworkImpl
		 * @see pt.isep.yamldslgen.docker_compose.impl.DockercomposePackageImpl#getNetwork()
		 * @generated
		 */
		EClass NETWORK = eINSTANCE.getNetwork();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__ID = eINSTANCE.getNetwork_Id();

		/**
		 * The meta object literal for the '<em><b>Driver</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__DRIVER = eINSTANCE.getNetwork_Driver();

		/**
		 * The meta object literal for the '<em><b>Ipv4 Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK__IPV4_ADDRESS = eINSTANCE.getNetwork_Ipv4Address();

		/**
		 * The meta object literal for the '<em><b>Ipam</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORK__IPAM = eINSTANCE.getNetwork_Ipam();

		/**
		 * The meta object literal for the '{@link pt.isep.yamldslgen.docker_compose.impl.VolumeImpl <em>Volume</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.yamldslgen.docker_compose.impl.VolumeImpl
		 * @see pt.isep.yamldslgen.docker_compose.impl.DockercomposePackageImpl#getVolume()
		 * @generated
		 */
		EClass VOLUME = eINSTANCE.getVolume();

		/**
		 * The meta object literal for the '{@link pt.isep.yamldslgen.docker_compose.impl.DeployImpl <em>Deploy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.yamldslgen.docker_compose.impl.DeployImpl
		 * @see pt.isep.yamldslgen.docker_compose.impl.DockercomposePackageImpl#getDeploy()
		 * @generated
		 */
		EClass DEPLOY = eINSTANCE.getDeploy();

		/**
		 * The meta object literal for the '<em><b>Resources</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOY__RESOURCES = eINSTANCE.getDeploy_Resources();

		/**
		 * The meta object literal for the '{@link pt.isep.yamldslgen.docker_compose.impl.ResourcesImpl <em>Resources</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.yamldslgen.docker_compose.impl.ResourcesImpl
		 * @see pt.isep.yamldslgen.docker_compose.impl.DockercomposePackageImpl#getResources()
		 * @generated
		 */
		EClass RESOURCES = eINSTANCE.getResources();

		/**
		 * The meta object literal for the '<em><b>Limits</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCES__LIMITS = eINSTANCE.getResources_Limits();

		/**
		 * The meta object literal for the '{@link pt.isep.yamldslgen.docker_compose.impl.LimitsImpl <em>Limits</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.yamldslgen.docker_compose.impl.LimitsImpl
		 * @see pt.isep.yamldslgen.docker_compose.impl.DockercomposePackageImpl#getLimits()
		 * @generated
		 */
		EClass LIMITS = eINSTANCE.getLimits();

		/**
		 * The meta object literal for the '<em><b>Memory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIMITS__MEMORY = eINSTANCE.getLimits_Memory();

		/**
		 * The meta object literal for the '{@link pt.isep.yamldslgen.docker_compose.impl.Depends_onImpl <em>Depends on</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.yamldslgen.docker_compose.impl.Depends_onImpl
		 * @see pt.isep.yamldslgen.docker_compose.impl.DockercomposePackageImpl#getDepends_on()
		 * @generated
		 */
		EClass DEPENDS_ON = eINSTANCE.getDepends_on();

		/**
		 * The meta object literal for the '{@link pt.isep.yamldslgen.docker_compose.impl.DbImpl <em>Db</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.yamldslgen.docker_compose.impl.DbImpl
		 * @see pt.isep.yamldslgen.docker_compose.impl.DockercomposePackageImpl#getDb()
		 * @generated
		 */
		EClass DB = eINSTANCE.getDb();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DB__CONDITION = eINSTANCE.getDb_Condition();

		/**
		 * The meta object literal for the '{@link pt.isep.yamldslgen.docker_compose.impl.SecretImpl <em>Secret</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.yamldslgen.docker_compose.impl.SecretImpl
		 * @see pt.isep.yamldslgen.docker_compose.impl.DockercomposePackageImpl#getSecret()
		 * @generated
		 */
		EClass SECRET = eINSTANCE.getSecret();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECRET__ID = eINSTANCE.getSecret_Id();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECRET__FILE = eINSTANCE.getSecret_File();

		/**
		 * The meta object literal for the '{@link pt.isep.yamldslgen.docker_compose.impl.IpamImpl <em>Ipam</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.yamldslgen.docker_compose.impl.IpamImpl
		 * @see pt.isep.yamldslgen.docker_compose.impl.DockercomposePackageImpl#getIpam()
		 * @generated
		 */
		EClass IPAM = eINSTANCE.getIpam();

		/**
		 * The meta object literal for the '<em><b>Config</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IPAM__CONFIG = eINSTANCE.getIpam_Config();

		/**
		 * The meta object literal for the '{@link pt.isep.yamldslgen.docker_compose.impl.ConfigImpl <em>Config</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.yamldslgen.docker_compose.impl.ConfigImpl
		 * @see pt.isep.yamldslgen.docker_compose.impl.DockercomposePackageImpl#getConfig()
		 * @generated
		 */
		EClass CONFIG = eINSTANCE.getConfig();

		/**
		 * The meta object literal for the '<em><b>Subnet</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFIG__SUBNET = eINSTANCE.getConfig_Subnet();

		/**
		 * The meta object literal for the '{@link pt.isep.yamldslgen.docker_compose.impl.VolumeObjectImpl <em>Volume Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.yamldslgen.docker_compose.impl.VolumeObjectImpl
		 * @see pt.isep.yamldslgen.docker_compose.impl.DockercomposePackageImpl#getVolumeObject()
		 * @generated
		 */
		EClass VOLUME_OBJECT = eINSTANCE.getVolumeObject();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME_OBJECT__ID = eINSTANCE.getVolumeObject_Id();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME_OBJECT__TYPE = eINSTANCE.getVolumeObject_Type();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME_OBJECT__SOURCE = eINSTANCE.getVolumeObject_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME_OBJECT__TARGET = eINSTANCE.getVolumeObject_Target();

		/**
		 * The meta object literal for the '<em><b>Read Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME_OBJECT__READ_ONLY = eINSTANCE.getVolumeObject_ReadOnly();

		/**
		 * The meta object literal for the '{@link pt.isep.yamldslgen.docker_compose.impl.VolumeValueImpl <em>Volume Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.yamldslgen.docker_compose.impl.VolumeValueImpl
		 * @see pt.isep.yamldslgen.docker_compose.impl.DockercomposePackageImpl#getVolumeValue()
		 * @generated
		 */
		EClass VOLUME_VALUE = eINSTANCE.getVolumeValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOLUME_VALUE__VALUE = eINSTANCE.getVolumeValue_Value();

		/**
		 * The meta object literal for the '{@link pt.isep.yamldslgen.docker_compose.impl.BuildObjectImpl <em>Build Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.yamldslgen.docker_compose.impl.BuildObjectImpl
		 * @see pt.isep.yamldslgen.docker_compose.impl.DockercomposePackageImpl#getBuildObject()
		 * @generated
		 */
		EClass BUILD_OBJECT = eINSTANCE.getBuildObject();

		/**
		 * The meta object literal for the '<em><b>Context</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILD_OBJECT__CONTEXT = eINSTANCE.getBuildObject_Context();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILD_OBJECT__TARGET = eINSTANCE.getBuildObject_Target();

		/**
		 * The meta object literal for the '<em><b>Args</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILD_OBJECT__ARGS = eINSTANCE.getBuildObject_Args();

		/**
		 * The meta object literal for the '<em><b>Dockerfile</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILD_OBJECT__DOCKERFILE = eINSTANCE.getBuildObject_Dockerfile();

		/**
		 * The meta object literal for the '{@link pt.isep.yamldslgen.docker_compose.impl.BuildValueImpl <em>Build Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.yamldslgen.docker_compose.impl.BuildValueImpl
		 * @see pt.isep.yamldslgen.docker_compose.impl.DockercomposePackageImpl#getBuildValue()
		 * @generated
		 */
		EClass BUILD_VALUE = eINSTANCE.getBuildValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUILD_VALUE__VALUE = eINSTANCE.getBuildValue_Value();

		/**
		 * The meta object literal for the '{@link pt.isep.yamldslgen.docker_compose.impl.NetworksObjectImpl <em>Networks Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.yamldslgen.docker_compose.impl.NetworksObjectImpl
		 * @see pt.isep.yamldslgen.docker_compose.impl.DockercomposePackageImpl#getNetworksObject()
		 * @generated
		 */
		EClass NETWORKS_OBJECT = eINSTANCE.getNetworksObject();

		/**
		 * The meta object literal for the '<em><b>Network</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETWORKS_OBJECT__NETWORK = eINSTANCE.getNetworksObject_Network();

		/**
		 * The meta object literal for the '{@link pt.isep.yamldslgen.docker_compose.impl.NetworksValueImpl <em>Networks Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.yamldslgen.docker_compose.impl.NetworksValueImpl
		 * @see pt.isep.yamldslgen.docker_compose.impl.DockercomposePackageImpl#getNetworksValue()
		 * @generated
		 */
		EClass NETWORKS_VALUE = eINSTANCE.getNetworksValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORKS_VALUE__VALUE = eINSTANCE.getNetworksValue_Value();

		/**
		 * The meta object literal for the '{@link pt.isep.yamldslgen.docker_compose.impl.Depends_onObjectImpl <em>Depends on Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.yamldslgen.docker_compose.impl.Depends_onObjectImpl
		 * @see pt.isep.yamldslgen.docker_compose.impl.DockercomposePackageImpl#getDepends_onObject()
		 * @generated
		 */
		EClass DEPENDS_ON_OBJECT = eINSTANCE.getDepends_onObject();

		/**
		 * The meta object literal for the '<em><b>Db</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDS_ON_OBJECT__DB = eINSTANCE.getDepends_onObject_Db();

		/**
		 * The meta object literal for the '{@link pt.isep.yamldslgen.docker_compose.impl.Depends_onValueImpl <em>Depends on Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see pt.isep.yamldslgen.docker_compose.impl.Depends_onValueImpl
		 * @see pt.isep.yamldslgen.docker_compose.impl.DockercomposePackageImpl#getDepends_onValue()
		 * @generated
		 */
		EClass DEPENDS_ON_VALUE = eINSTANCE.getDepends_onValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDS_ON_VALUE__VALUE = eINSTANCE.getDepends_onValue_Value();

	}

} //DockercomposePackage
