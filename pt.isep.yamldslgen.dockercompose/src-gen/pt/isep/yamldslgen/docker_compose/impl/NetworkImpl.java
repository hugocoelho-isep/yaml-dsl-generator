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

import pt.isep.yamldslgen.docker_compose.Config;
import pt.isep.yamldslgen.docker_compose.DockercomposePackage;
import pt.isep.yamldslgen.docker_compose.Network;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Network</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.impl.NetworkImpl#getId <em>Id</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.impl.NetworkImpl#getDriver <em>Driver</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.impl.NetworkImpl#getIpv4Address <em>Ipv4 Address</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.impl.NetworkImpl#getIpam <em>Ipam</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NetworkImpl extends MinimalEObjectImpl.Container implements Network {
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
	 * The default value of the '{@link #getDriver() <em>Driver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriver()
	 * @generated
	 * @ordered
	 */
	protected static final String DRIVER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDriver() <em>Driver</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDriver()
	 * @generated
	 * @ordered
	 */
	protected String driver = DRIVER_EDEFAULT;

	/**
	 * The default value of the '{@link #getIpv4Address() <em>Ipv4 Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIpv4Address()
	 * @generated
	 * @ordered
	 */
	protected static final String IPV4_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIpv4Address() <em>Ipv4 Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIpv4Address()
	 * @generated
	 * @ordered
	 */
	protected String ipv4Address = IPV4_ADDRESS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIpam() <em>Ipam</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIpam()
	 * @generated
	 * @ordered
	 */
	protected EList<Config> ipam;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockercomposePackage.Literals.NETWORK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.NETWORK__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDriver() {
		return driver;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDriver(String newDriver) {
		String oldDriver = driver;
		driver = newDriver;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.NETWORK__DRIVER, oldDriver,
					driver));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIpv4Address() {
		return ipv4Address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIpv4Address(String newIpv4Address) {
		String oldIpv4Address = ipv4Address;
		ipv4Address = newIpv4Address;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.NETWORK__IPV4_ADDRESS,
					oldIpv4Address, ipv4Address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Config> getIpam() {
		if (ipam == null) {
			ipam = new EObjectContainmentEList<Config>(Config.class, this, DockercomposePackage.NETWORK__IPAM);
		}
		return ipam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DockercomposePackage.NETWORK__IPAM:
			return ((InternalEList<?>) getIpam()).basicRemove(otherEnd, msgs);
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
		case DockercomposePackage.NETWORK__ID:
			return getId();
		case DockercomposePackage.NETWORK__DRIVER:
			return getDriver();
		case DockercomposePackage.NETWORK__IPV4_ADDRESS:
			return getIpv4Address();
		case DockercomposePackage.NETWORK__IPAM:
			return getIpam();
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
		case DockercomposePackage.NETWORK__ID:
			setId((String) newValue);
			return;
		case DockercomposePackage.NETWORK__DRIVER:
			setDriver((String) newValue);
			return;
		case DockercomposePackage.NETWORK__IPV4_ADDRESS:
			setIpv4Address((String) newValue);
			return;
		case DockercomposePackage.NETWORK__IPAM:
			getIpam().clear();
			getIpam().addAll((Collection<? extends Config>) newValue);
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
		case DockercomposePackage.NETWORK__ID:
			setId(ID_EDEFAULT);
			return;
		case DockercomposePackage.NETWORK__DRIVER:
			setDriver(DRIVER_EDEFAULT);
			return;
		case DockercomposePackage.NETWORK__IPV4_ADDRESS:
			setIpv4Address(IPV4_ADDRESS_EDEFAULT);
			return;
		case DockercomposePackage.NETWORK__IPAM:
			getIpam().clear();
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
		case DockercomposePackage.NETWORK__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case DockercomposePackage.NETWORK__DRIVER:
			return DRIVER_EDEFAULT == null ? driver != null : !DRIVER_EDEFAULT.equals(driver);
		case DockercomposePackage.NETWORK__IPV4_ADDRESS:
			return IPV4_ADDRESS_EDEFAULT == null ? ipv4Address != null : !IPV4_ADDRESS_EDEFAULT.equals(ipv4Address);
		case DockercomposePackage.NETWORK__IPAM:
			return ipam != null && !ipam.isEmpty();
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
		result.append(", driver: ");
		result.append(driver);
		result.append(", ipv4Address: ");
		result.append(ipv4Address);
		result.append(')');
		return result.toString();
	}

} //NetworkImpl
