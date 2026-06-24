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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pt.isep.yamldslgen.docker_compose.DockerCompose;
import pt.isep.yamldslgen.docker_compose.DockercomposePackage;
import pt.isep.yamldslgen.docker_compose.Networks;
import pt.isep.yamldslgen.docker_compose.Secret;
import pt.isep.yamldslgen.docker_compose.Service;
import pt.isep.yamldslgen.docker_compose.Volume;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Docker Compose</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.impl.DockerComposeImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.impl.DockerComposeImpl#getName <em>Name</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.impl.DockerComposeImpl#getServices <em>Services</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.impl.DockerComposeImpl#getNetworks <em>Networks</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.impl.DockerComposeImpl#getVolumes <em>Volumes</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.impl.DockerComposeImpl#getSecrets <em>Secrets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DockerComposeImpl extends MinimalEObjectImpl.Container implements DockerCompose {
	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> services;

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
	 * The cached value of the '{@link #getVolumes() <em>Volumes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolumes()
	 * @generated
	 * @ordered
	 */
	protected EList<Volume> volumes;

	/**
	 * The cached value of the '{@link #getSecrets() <em>Secrets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecrets()
	 * @generated
	 * @ordered
	 */
	protected EList<Secret> secrets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DockerComposeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockercomposePackage.Literals.DOCKER_COMPOSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.DOCKER_COMPOSE__VERSION,
					oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.DOCKER_COMPOSE__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Service> getServices() {
		if (services == null) {
			services = new EObjectContainmentEList<Service>(Service.class, this,
					DockercomposePackage.DOCKER_COMPOSE__SERVICES);
		}
		return services;
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
					DockercomposePackage.DOCKER_COMPOSE__NETWORKS, oldNetworks, newNetworks);
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
						EOPPOSITE_FEATURE_BASE - DockercomposePackage.DOCKER_COMPOSE__NETWORKS, null, msgs);
			if (newNetworks != null)
				msgs = ((InternalEObject) newNetworks).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DockercomposePackage.DOCKER_COMPOSE__NETWORKS, null, msgs);
			msgs = basicSetNetworks(newNetworks, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.DOCKER_COMPOSE__NETWORKS,
					newNetworks, newNetworks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Volume> getVolumes() {
		if (volumes == null) {
			volumes = new EObjectContainmentEList<Volume>(Volume.class, this,
					DockercomposePackage.DOCKER_COMPOSE__VOLUMES);
		}
		return volumes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Secret> getSecrets() {
		if (secrets == null) {
			secrets = new EObjectContainmentEList<Secret>(Secret.class, this,
					DockercomposePackage.DOCKER_COMPOSE__SECRETS);
		}
		return secrets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DockercomposePackage.DOCKER_COMPOSE__SERVICES:
			return ((InternalEList<?>) getServices()).basicRemove(otherEnd, msgs);
		case DockercomposePackage.DOCKER_COMPOSE__NETWORKS:
			return basicSetNetworks(null, msgs);
		case DockercomposePackage.DOCKER_COMPOSE__VOLUMES:
			return ((InternalEList<?>) getVolumes()).basicRemove(otherEnd, msgs);
		case DockercomposePackage.DOCKER_COMPOSE__SECRETS:
			return ((InternalEList<?>) getSecrets()).basicRemove(otherEnd, msgs);
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
		case DockercomposePackage.DOCKER_COMPOSE__VERSION:
			return getVersion();
		case DockercomposePackage.DOCKER_COMPOSE__NAME:
			return getName();
		case DockercomposePackage.DOCKER_COMPOSE__SERVICES:
			return getServices();
		case DockercomposePackage.DOCKER_COMPOSE__NETWORKS:
			return getNetworks();
		case DockercomposePackage.DOCKER_COMPOSE__VOLUMES:
			return getVolumes();
		case DockercomposePackage.DOCKER_COMPOSE__SECRETS:
			return getSecrets();
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
		case DockercomposePackage.DOCKER_COMPOSE__VERSION:
			setVersion((String) newValue);
			return;
		case DockercomposePackage.DOCKER_COMPOSE__NAME:
			setName((String) newValue);
			return;
		case DockercomposePackage.DOCKER_COMPOSE__SERVICES:
			getServices().clear();
			getServices().addAll((Collection<? extends Service>) newValue);
			return;
		case DockercomposePackage.DOCKER_COMPOSE__NETWORKS:
			setNetworks((Networks) newValue);
			return;
		case DockercomposePackage.DOCKER_COMPOSE__VOLUMES:
			getVolumes().clear();
			getVolumes().addAll((Collection<? extends Volume>) newValue);
			return;
		case DockercomposePackage.DOCKER_COMPOSE__SECRETS:
			getSecrets().clear();
			getSecrets().addAll((Collection<? extends Secret>) newValue);
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
		case DockercomposePackage.DOCKER_COMPOSE__VERSION:
			setVersion(VERSION_EDEFAULT);
			return;
		case DockercomposePackage.DOCKER_COMPOSE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case DockercomposePackage.DOCKER_COMPOSE__SERVICES:
			getServices().clear();
			return;
		case DockercomposePackage.DOCKER_COMPOSE__NETWORKS:
			setNetworks((Networks) null);
			return;
		case DockercomposePackage.DOCKER_COMPOSE__VOLUMES:
			getVolumes().clear();
			return;
		case DockercomposePackage.DOCKER_COMPOSE__SECRETS:
			getSecrets().clear();
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
		case DockercomposePackage.DOCKER_COMPOSE__VERSION:
			return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
		case DockercomposePackage.DOCKER_COMPOSE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case DockercomposePackage.DOCKER_COMPOSE__SERVICES:
			return services != null && !services.isEmpty();
		case DockercomposePackage.DOCKER_COMPOSE__NETWORKS:
			return networks != null;
		case DockercomposePackage.DOCKER_COMPOSE__VOLUMES:
			return volumes != null && !volumes.isEmpty();
		case DockercomposePackage.DOCKER_COMPOSE__SECRETS:
			return secrets != null && !secrets.isEmpty();
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
		result.append(" (version: ");
		result.append(version);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DockerComposeImpl
