/**
 */
package pt.isep.yamldslgen.docker_compose.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pt.isep.yamldslgen.docker_compose.Build;
import pt.isep.yamldslgen.docker_compose.Depends_on;
import pt.isep.yamldslgen.docker_compose.DockercomposePackage;
import pt.isep.yamldslgen.docker_compose.Healthcheck;
import pt.isep.yamldslgen.docker_compose.KeyValuePair;
import pt.isep.yamldslgen.docker_compose.Networks;
import pt.isep.yamldslgen.docker_compose.Resource;
import pt.isep.yamldslgen.docker_compose.Service;
import pt.isep.yamldslgen.docker_compose.Volume;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.impl.ServiceImpl#getId <em>Id</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.impl.ServiceImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.impl.ServiceImpl#getImage <em>Image</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.impl.ServiceImpl#getRestart <em>Restart</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.impl.ServiceImpl#getContainerName <em>Container Name</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.impl.ServiceImpl#getCommand <em>Command</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.impl.ServiceImpl#getStopSignal <em>Stop Signal</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.impl.ServiceImpl#getExpose <em>Expose</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.impl.ServiceImpl#getSecrets <em>Secrets</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.impl.ServiceImpl#getUser <em>User</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.impl.ServiceImpl#getHostname <em>Hostname</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.impl.ServiceImpl#getCapAdd <em>Cap Add</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.impl.ServiceImpl#getNetworkMode <em>Network Mode</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.impl.ServiceImpl#isStdinOpen <em>Stdin Open</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.impl.ServiceImpl#getLabels <em>Labels</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.impl.ServiceImpl#getPlatform <em>Platform</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.impl.ServiceImpl#getRuntime <em>Runtime</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.impl.ServiceImpl#getSysctls <em>Sysctls</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.impl.ServiceImpl#getBuild <em>Build</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.impl.ServiceImpl#getHealthcheck <em>Healthcheck</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.impl.ServiceImpl#getDeploy <em>Deploy</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.impl.ServiceImpl#getDependsOn <em>Depends On</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.impl.ServiceImpl#getVolumes <em>Volumes</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.impl.ServiceImpl#getNetworks <em>Networks</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.impl.ServiceImpl#getEnvironment <em>Environment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceImpl extends MinimalEObjectImpl.Container implements Service {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPorts() <em>Ports</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<String> ports;

	/**
	 * The default value of the '{@link #getImage() <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImage() <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected String image = IMAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRestart() <em>Restart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestart()
	 * @generated
	 * @ordered
	 */
	protected static final String RESTART_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRestart() <em>Restart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestart()
	 * @generated
	 * @ordered
	 */
	protected String restart = RESTART_EDEFAULT;

	/**
	 * The default value of the '{@link #getContainerName() <em>Container Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerName()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTAINER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContainerName() <em>Container Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerName()
	 * @generated
	 * @ordered
	 */
	protected String containerName = CONTAINER_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCommand() <em>Command</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommand()
	 * @generated
	 * @ordered
	 */
	protected EList<String> command;

	/**
	 * The default value of the '{@link #getStopSignal() <em>Stop Signal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopSignal()
	 * @generated
	 * @ordered
	 */
	protected static final String STOP_SIGNAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStopSignal() <em>Stop Signal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopSignal()
	 * @generated
	 * @ordered
	 */
	protected String stopSignal = STOP_SIGNAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExpose() <em>Expose</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpose()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> expose;

	/**
	 * The cached value of the '{@link #getSecrets() <em>Secrets</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecrets()
	 * @generated
	 * @ordered
	 */
	protected EList<String> secrets;

	/**
	 * The default value of the '{@link #getUser() <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected String user = USER_EDEFAULT;

	/**
	 * The default value of the '{@link #getHostname() <em>Hostname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostname()
	 * @generated
	 * @ordered
	 */
	protected static final String HOSTNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHostname() <em>Hostname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostname()
	 * @generated
	 * @ordered
	 */
	protected String hostname = HOSTNAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCapAdd() <em>Cap Add</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapAdd()
	 * @generated
	 * @ordered
	 */
	protected EList<String> capAdd;

	/**
	 * The default value of the '{@link #getNetworkMode() <em>Network Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkMode()
	 * @generated
	 * @ordered
	 */
	protected static final String NETWORK_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNetworkMode() <em>Network Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkMode()
	 * @generated
	 * @ordered
	 */
	protected String networkMode = NETWORK_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #isStdinOpen() <em>Stdin Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStdinOpen()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STDIN_OPEN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStdinOpen() <em>Stdin Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStdinOpen()
	 * @generated
	 * @ordered
	 */
	protected boolean stdinOpen = STDIN_OPEN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLabels() <em>Labels</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabels()
	 * @generated
	 * @ordered
	 */
	protected EList<String> labels;

	/**
	 * The default value of the '{@link #getPlatform() <em>Platform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatform()
	 * @generated
	 * @ordered
	 */
	protected static final String PLATFORM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlatform() <em>Platform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatform()
	 * @generated
	 * @ordered
	 */
	protected String platform = PLATFORM_EDEFAULT;

	/**
	 * The default value of the '{@link #getRuntime() <em>Runtime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntime()
	 * @generated
	 * @ordered
	 */
	protected static final String RUNTIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRuntime() <em>Runtime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntime()
	 * @generated
	 * @ordered
	 */
	protected String runtime = RUNTIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSysctls() <em>Sysctls</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSysctls()
	 * @generated
	 * @ordered
	 */
	protected EList<String> sysctls;

	/**
	 * The cached value of the '{@link #getBuild() <em>Build</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuild()
	 * @generated
	 * @ordered
	 */
	protected Build build;

	/**
	 * The cached value of the '{@link #getHealthcheck() <em>Healthcheck</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealthcheck()
	 * @generated
	 * @ordered
	 */
	protected Healthcheck healthcheck;

	/**
	 * The cached value of the '{@link #getDeploy() <em>Deploy</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeploy()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> deploy;

	/**
	 * The cached value of the '{@link #getDependsOn() <em>Depends On</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependsOn()
	 * @generated
	 * @ordered
	 */
	protected Depends_on dependsOn;

	/**
	 * The cached value of the '{@link #getVolumes() <em>Volumes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumes()
	 * @generated
	 * @ordered
	 */
	protected EList<Volume> volumes;

	/**
	 * The cached value of the '{@link #getNetworks() <em>Networks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworks()
	 * @generated
	 * @ordered
	 */
	protected Networks networks;

	/**
	 * The cached value of the '{@link #getEnvironment() <em>Environment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvironment()
	 * @generated
	 * @ordered
	 */
	protected EList<KeyValuePair> environment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockercomposePackage.Literals.SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.SERVICE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getPorts() {
		if (ports == null) {
			ports = new EDataTypeUniqueEList<String>(String.class, this, DockercomposePackage.SERVICE__PORTS);
		}
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImage() {
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImage(String newImage) {
		String oldImage = image;
		image = newImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.SERVICE__IMAGE, oldImage,
					image));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRestart() {
		return restart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRestart(String newRestart) {
		String oldRestart = restart;
		restart = newRestart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.SERVICE__RESTART, oldRestart,
					restart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContainerName() {
		return containerName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainerName(String newContainerName) {
		String oldContainerName = containerName;
		containerName = newContainerName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.SERVICE__CONTAINER_NAME,
					oldContainerName, containerName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getCommand() {
		if (command == null) {
			command = new EDataTypeUniqueEList<String>(String.class, this, DockercomposePackage.SERVICE__COMMAND);
		}
		return command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStopSignal() {
		return stopSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStopSignal(String newStopSignal) {
		String oldStopSignal = stopSignal;
		stopSignal = newStopSignal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.SERVICE__STOP_SIGNAL,
					oldStopSignal, stopSignal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Integer> getExpose() {
		if (expose == null) {
			expose = new EDataTypeUniqueEList<Integer>(Integer.class, this, DockercomposePackage.SERVICE__EXPOSE);
		}
		return expose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getSecrets() {
		if (secrets == null) {
			secrets = new EDataTypeUniqueEList<String>(String.class, this, DockercomposePackage.SERVICE__SECRETS);
		}
		return secrets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUser() {
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUser(String newUser) {
		String oldUser = user;
		user = newUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.SERVICE__USER, oldUser, user));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHostname() {
		return hostname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHostname(String newHostname) {
		String oldHostname = hostname;
		hostname = newHostname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.SERVICE__HOSTNAME, oldHostname,
					hostname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getCapAdd() {
		if (capAdd == null) {
			capAdd = new EDataTypeUniqueEList<String>(String.class, this, DockercomposePackage.SERVICE__CAP_ADD);
		}
		return capAdd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNetworkMode() {
		return networkMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNetworkMode(String newNetworkMode) {
		String oldNetworkMode = networkMode;
		networkMode = newNetworkMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.SERVICE__NETWORK_MODE,
					oldNetworkMode, networkMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isStdinOpen() {
		return stdinOpen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStdinOpen(boolean newStdinOpen) {
		boolean oldStdinOpen = stdinOpen;
		stdinOpen = newStdinOpen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.SERVICE__STDIN_OPEN,
					oldStdinOpen, stdinOpen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getLabels() {
		if (labels == null) {
			labels = new EDataTypeUniqueEList<String>(String.class, this, DockercomposePackage.SERVICE__LABELS);
		}
		return labels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPlatform() {
		return platform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlatform(String newPlatform) {
		String oldPlatform = platform;
		platform = newPlatform;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.SERVICE__PLATFORM, oldPlatform,
					platform));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRuntime() {
		return runtime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRuntime(String newRuntime) {
		String oldRuntime = runtime;
		runtime = newRuntime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.SERVICE__RUNTIME, oldRuntime,
					runtime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getSysctls() {
		if (sysctls == null) {
			sysctls = new EDataTypeUniqueEList<String>(String.class, this, DockercomposePackage.SERVICE__SYSCTLS);
		}
		return sysctls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Build getBuild() {
		return build;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBuild(Build newBuild, NotificationChain msgs) {
		Build oldBuild = build;
		build = newBuild;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DockercomposePackage.SERVICE__BUILD, oldBuild, newBuild);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBuild(Build newBuild) {
		if (newBuild != build) {
			NotificationChain msgs = null;
			if (build != null)
				msgs = ((InternalEObject) build).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DockercomposePackage.SERVICE__BUILD, null, msgs);
			if (newBuild != null)
				msgs = ((InternalEObject) newBuild).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DockercomposePackage.SERVICE__BUILD, null, msgs);
			msgs = basicSetBuild(newBuild, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.SERVICE__BUILD, newBuild,
					newBuild));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Healthcheck getHealthcheck() {
		return healthcheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHealthcheck(Healthcheck newHealthcheck, NotificationChain msgs) {
		Healthcheck oldHealthcheck = healthcheck;
		healthcheck = newHealthcheck;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DockercomposePackage.SERVICE__HEALTHCHECK, oldHealthcheck, newHealthcheck);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHealthcheck(Healthcheck newHealthcheck) {
		if (newHealthcheck != healthcheck) {
			NotificationChain msgs = null;
			if (healthcheck != null)
				msgs = ((InternalEObject) healthcheck).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DockercomposePackage.SERVICE__HEALTHCHECK, null, msgs);
			if (newHealthcheck != null)
				msgs = ((InternalEObject) newHealthcheck).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DockercomposePackage.SERVICE__HEALTHCHECK, null, msgs);
			msgs = basicSetHealthcheck(newHealthcheck, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.SERVICE__HEALTHCHECK,
					newHealthcheck, newHealthcheck));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Resource> getDeploy() {
		if (deploy == null) {
			deploy = new EObjectContainmentEList<Resource>(Resource.class, this, DockercomposePackage.SERVICE__DEPLOY);
		}
		return deploy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Depends_on getDependsOn() {
		return dependsOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDependsOn(Depends_on newDependsOn, NotificationChain msgs) {
		Depends_on oldDependsOn = dependsOn;
		dependsOn = newDependsOn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DockercomposePackage.SERVICE__DEPENDS_ON, oldDependsOn, newDependsOn);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDependsOn(Depends_on newDependsOn) {
		if (newDependsOn != dependsOn) {
			NotificationChain msgs = null;
			if (dependsOn != null)
				msgs = ((InternalEObject) dependsOn).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DockercomposePackage.SERVICE__DEPENDS_ON, null, msgs);
			if (newDependsOn != null)
				msgs = ((InternalEObject) newDependsOn).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DockercomposePackage.SERVICE__DEPENDS_ON, null, msgs);
			msgs = basicSetDependsOn(newDependsOn, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.SERVICE__DEPENDS_ON,
					newDependsOn, newDependsOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Volume> getVolumes() {
		if (volumes == null) {
			volumes = new EObjectContainmentEList<Volume>(Volume.class, this, DockercomposePackage.SERVICE__VOLUMES);
		}
		return volumes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Networks getNetworks() {
		return networks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNetworks(Networks newNetworks, NotificationChain msgs) {
		Networks oldNetworks = networks;
		networks = newNetworks;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DockercomposePackage.SERVICE__NETWORKS, oldNetworks, newNetworks);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNetworks(Networks newNetworks) {
		if (newNetworks != networks) {
			NotificationChain msgs = null;
			if (networks != null)
				msgs = ((InternalEObject) networks).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DockercomposePackage.SERVICE__NETWORKS, null, msgs);
			if (newNetworks != null)
				msgs = ((InternalEObject) newNetworks).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DockercomposePackage.SERVICE__NETWORKS, null, msgs);
			msgs = basicSetNetworks(newNetworks, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.SERVICE__NETWORKS, newNetworks,
					newNetworks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<KeyValuePair> getEnvironment() {
		if (environment == null) {
			environment = new EObjectContainmentEList<KeyValuePair>(KeyValuePair.class, this,
					DockercomposePackage.SERVICE__ENVIRONMENT);
		}
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DockercomposePackage.SERVICE__BUILD:
			return basicSetBuild(null, msgs);
		case DockercomposePackage.SERVICE__HEALTHCHECK:
			return basicSetHealthcheck(null, msgs);
		case DockercomposePackage.SERVICE__DEPLOY:
			return ((InternalEList<?>) getDeploy()).basicRemove(otherEnd, msgs);
		case DockercomposePackage.SERVICE__DEPENDS_ON:
			return basicSetDependsOn(null, msgs);
		case DockercomposePackage.SERVICE__VOLUMES:
			return ((InternalEList<?>) getVolumes()).basicRemove(otherEnd, msgs);
		case DockercomposePackage.SERVICE__NETWORKS:
			return basicSetNetworks(null, msgs);
		case DockercomposePackage.SERVICE__ENVIRONMENT:
			return ((InternalEList<?>) getEnvironment()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DockercomposePackage.SERVICE__ID:
			return getId();
		case DockercomposePackage.SERVICE__PORTS:
			return getPorts();
		case DockercomposePackage.SERVICE__IMAGE:
			return getImage();
		case DockercomposePackage.SERVICE__RESTART:
			return getRestart();
		case DockercomposePackage.SERVICE__CONTAINER_NAME:
			return getContainerName();
		case DockercomposePackage.SERVICE__COMMAND:
			return getCommand();
		case DockercomposePackage.SERVICE__STOP_SIGNAL:
			return getStopSignal();
		case DockercomposePackage.SERVICE__EXPOSE:
			return getExpose();
		case DockercomposePackage.SERVICE__SECRETS:
			return getSecrets();
		case DockercomposePackage.SERVICE__USER:
			return getUser();
		case DockercomposePackage.SERVICE__HOSTNAME:
			return getHostname();
		case DockercomposePackage.SERVICE__CAP_ADD:
			return getCapAdd();
		case DockercomposePackage.SERVICE__NETWORK_MODE:
			return getNetworkMode();
		case DockercomposePackage.SERVICE__STDIN_OPEN:
			return isStdinOpen();
		case DockercomposePackage.SERVICE__LABELS:
			return getLabels();
		case DockercomposePackage.SERVICE__PLATFORM:
			return getPlatform();
		case DockercomposePackage.SERVICE__RUNTIME:
			return getRuntime();
		case DockercomposePackage.SERVICE__SYSCTLS:
			return getSysctls();
		case DockercomposePackage.SERVICE__BUILD:
			return getBuild();
		case DockercomposePackage.SERVICE__HEALTHCHECK:
			return getHealthcheck();
		case DockercomposePackage.SERVICE__DEPLOY:
			return getDeploy();
		case DockercomposePackage.SERVICE__DEPENDS_ON:
			return getDependsOn();
		case DockercomposePackage.SERVICE__VOLUMES:
			return getVolumes();
		case DockercomposePackage.SERVICE__NETWORKS:
			return getNetworks();
		case DockercomposePackage.SERVICE__ENVIRONMENT:
			return getEnvironment();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case DockercomposePackage.SERVICE__ID:
			setId((String) newValue);
			return;
		case DockercomposePackage.SERVICE__PORTS:
			getPorts().clear();
			getPorts().addAll((Collection<? extends String>) newValue);
			return;
		case DockercomposePackage.SERVICE__IMAGE:
			setImage((String) newValue);
			return;
		case DockercomposePackage.SERVICE__RESTART:
			setRestart((String) newValue);
			return;
		case DockercomposePackage.SERVICE__CONTAINER_NAME:
			setContainerName((String) newValue);
			return;
		case DockercomposePackage.SERVICE__COMMAND:
			getCommand().clear();
			getCommand().addAll((Collection<? extends String>) newValue);
			return;
		case DockercomposePackage.SERVICE__STOP_SIGNAL:
			setStopSignal((String) newValue);
			return;
		case DockercomposePackage.SERVICE__EXPOSE:
			getExpose().clear();
			getExpose().addAll((Collection<? extends Integer>) newValue);
			return;
		case DockercomposePackage.SERVICE__SECRETS:
			getSecrets().clear();
			getSecrets().addAll((Collection<? extends String>) newValue);
			return;
		case DockercomposePackage.SERVICE__USER:
			setUser((String) newValue);
			return;
		case DockercomposePackage.SERVICE__HOSTNAME:
			setHostname((String) newValue);
			return;
		case DockercomposePackage.SERVICE__CAP_ADD:
			getCapAdd().clear();
			getCapAdd().addAll((Collection<? extends String>) newValue);
			return;
		case DockercomposePackage.SERVICE__NETWORK_MODE:
			setNetworkMode((String) newValue);
			return;
		case DockercomposePackage.SERVICE__STDIN_OPEN:
			setStdinOpen((Boolean) newValue);
			return;
		case DockercomposePackage.SERVICE__LABELS:
			getLabels().clear();
			getLabels().addAll((Collection<? extends String>) newValue);
			return;
		case DockercomposePackage.SERVICE__PLATFORM:
			setPlatform((String) newValue);
			return;
		case DockercomposePackage.SERVICE__RUNTIME:
			setRuntime((String) newValue);
			return;
		case DockercomposePackage.SERVICE__SYSCTLS:
			getSysctls().clear();
			getSysctls().addAll((Collection<? extends String>) newValue);
			return;
		case DockercomposePackage.SERVICE__BUILD:
			setBuild((Build) newValue);
			return;
		case DockercomposePackage.SERVICE__HEALTHCHECK:
			setHealthcheck((Healthcheck) newValue);
			return;
		case DockercomposePackage.SERVICE__DEPLOY:
			getDeploy().clear();
			getDeploy().addAll((Collection<? extends Resource>) newValue);
			return;
		case DockercomposePackage.SERVICE__DEPENDS_ON:
			setDependsOn((Depends_on) newValue);
			return;
		case DockercomposePackage.SERVICE__VOLUMES:
			getVolumes().clear();
			getVolumes().addAll((Collection<? extends Volume>) newValue);
			return;
		case DockercomposePackage.SERVICE__NETWORKS:
			setNetworks((Networks) newValue);
			return;
		case DockercomposePackage.SERVICE__ENVIRONMENT:
			getEnvironment().clear();
			getEnvironment().addAll((Collection<? extends KeyValuePair>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case DockercomposePackage.SERVICE__ID:
			setId(ID_EDEFAULT);
			return;
		case DockercomposePackage.SERVICE__PORTS:
			getPorts().clear();
			return;
		case DockercomposePackage.SERVICE__IMAGE:
			setImage(IMAGE_EDEFAULT);
			return;
		case DockercomposePackage.SERVICE__RESTART:
			setRestart(RESTART_EDEFAULT);
			return;
		case DockercomposePackage.SERVICE__CONTAINER_NAME:
			setContainerName(CONTAINER_NAME_EDEFAULT);
			return;
		case DockercomposePackage.SERVICE__COMMAND:
			getCommand().clear();
			return;
		case DockercomposePackage.SERVICE__STOP_SIGNAL:
			setStopSignal(STOP_SIGNAL_EDEFAULT);
			return;
		case DockercomposePackage.SERVICE__EXPOSE:
			getExpose().clear();
			return;
		case DockercomposePackage.SERVICE__SECRETS:
			getSecrets().clear();
			return;
		case DockercomposePackage.SERVICE__USER:
			setUser(USER_EDEFAULT);
			return;
		case DockercomposePackage.SERVICE__HOSTNAME:
			setHostname(HOSTNAME_EDEFAULT);
			return;
		case DockercomposePackage.SERVICE__CAP_ADD:
			getCapAdd().clear();
			return;
		case DockercomposePackage.SERVICE__NETWORK_MODE:
			setNetworkMode(NETWORK_MODE_EDEFAULT);
			return;
		case DockercomposePackage.SERVICE__STDIN_OPEN:
			setStdinOpen(STDIN_OPEN_EDEFAULT);
			return;
		case DockercomposePackage.SERVICE__LABELS:
			getLabels().clear();
			return;
		case DockercomposePackage.SERVICE__PLATFORM:
			setPlatform(PLATFORM_EDEFAULT);
			return;
		case DockercomposePackage.SERVICE__RUNTIME:
			setRuntime(RUNTIME_EDEFAULT);
			return;
		case DockercomposePackage.SERVICE__SYSCTLS:
			getSysctls().clear();
			return;
		case DockercomposePackage.SERVICE__BUILD:
			setBuild((Build) null);
			return;
		case DockercomposePackage.SERVICE__HEALTHCHECK:
			setHealthcheck((Healthcheck) null);
			return;
		case DockercomposePackage.SERVICE__DEPLOY:
			getDeploy().clear();
			return;
		case DockercomposePackage.SERVICE__DEPENDS_ON:
			setDependsOn((Depends_on) null);
			return;
		case DockercomposePackage.SERVICE__VOLUMES:
			getVolumes().clear();
			return;
		case DockercomposePackage.SERVICE__NETWORKS:
			setNetworks((Networks) null);
			return;
		case DockercomposePackage.SERVICE__ENVIRONMENT:
			getEnvironment().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case DockercomposePackage.SERVICE__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case DockercomposePackage.SERVICE__PORTS:
			return ports != null && !ports.isEmpty();
		case DockercomposePackage.SERVICE__IMAGE:
			return IMAGE_EDEFAULT == null ? image != null : !IMAGE_EDEFAULT.equals(image);
		case DockercomposePackage.SERVICE__RESTART:
			return RESTART_EDEFAULT == null ? restart != null : !RESTART_EDEFAULT.equals(restart);
		case DockercomposePackage.SERVICE__CONTAINER_NAME:
			return CONTAINER_NAME_EDEFAULT == null ? containerName != null
					: !CONTAINER_NAME_EDEFAULT.equals(containerName);
		case DockercomposePackage.SERVICE__COMMAND:
			return command != null && !command.isEmpty();
		case DockercomposePackage.SERVICE__STOP_SIGNAL:
			return STOP_SIGNAL_EDEFAULT == null ? stopSignal != null : !STOP_SIGNAL_EDEFAULT.equals(stopSignal);
		case DockercomposePackage.SERVICE__EXPOSE:
			return expose != null && !expose.isEmpty();
		case DockercomposePackage.SERVICE__SECRETS:
			return secrets != null && !secrets.isEmpty();
		case DockercomposePackage.SERVICE__USER:
			return USER_EDEFAULT == null ? user != null : !USER_EDEFAULT.equals(user);
		case DockercomposePackage.SERVICE__HOSTNAME:
			return HOSTNAME_EDEFAULT == null ? hostname != null : !HOSTNAME_EDEFAULT.equals(hostname);
		case DockercomposePackage.SERVICE__CAP_ADD:
			return capAdd != null && !capAdd.isEmpty();
		case DockercomposePackage.SERVICE__NETWORK_MODE:
			return NETWORK_MODE_EDEFAULT == null ? networkMode != null : !NETWORK_MODE_EDEFAULT.equals(networkMode);
		case DockercomposePackage.SERVICE__STDIN_OPEN:
			return stdinOpen != STDIN_OPEN_EDEFAULT;
		case DockercomposePackage.SERVICE__LABELS:
			return labels != null && !labels.isEmpty();
		case DockercomposePackage.SERVICE__PLATFORM:
			return PLATFORM_EDEFAULT == null ? platform != null : !PLATFORM_EDEFAULT.equals(platform);
		case DockercomposePackage.SERVICE__RUNTIME:
			return RUNTIME_EDEFAULT == null ? runtime != null : !RUNTIME_EDEFAULT.equals(runtime);
		case DockercomposePackage.SERVICE__SYSCTLS:
			return sysctls != null && !sysctls.isEmpty();
		case DockercomposePackage.SERVICE__BUILD:
			return build != null;
		case DockercomposePackage.SERVICE__HEALTHCHECK:
			return healthcheck != null;
		case DockercomposePackage.SERVICE__DEPLOY:
			return deploy != null && !deploy.isEmpty();
		case DockercomposePackage.SERVICE__DEPENDS_ON:
			return dependsOn != null;
		case DockercomposePackage.SERVICE__VOLUMES:
			return volumes != null && !volumes.isEmpty();
		case DockercomposePackage.SERVICE__NETWORKS:
			return networks != null;
		case DockercomposePackage.SERVICE__ENVIRONMENT:
			return environment != null && !environment.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", ports: ");
		result.append(ports);
		result.append(", image: ");
		result.append(image);
		result.append(", restart: ");
		result.append(restart);
		result.append(", containerName: ");
		result.append(containerName);
		result.append(", command: ");
		result.append(command);
		result.append(", stopSignal: ");
		result.append(stopSignal);
		result.append(", expose: ");
		result.append(expose);
		result.append(", secrets: ");
		result.append(secrets);
		result.append(", user: ");
		result.append(user);
		result.append(", hostname: ");
		result.append(hostname);
		result.append(", capAdd: ");
		result.append(capAdd);
		result.append(", networkMode: ");
		result.append(networkMode);
		result.append(", stdinOpen: ");
		result.append(stdinOpen);
		result.append(", labels: ");
		result.append(labels);
		result.append(", platform: ");
		result.append(platform);
		result.append(", runtime: ");
		result.append(runtime);
		result.append(", sysctls: ");
		result.append(sysctls);
		result.append(')');
		return result.toString();
	}

} //ServiceImpl
