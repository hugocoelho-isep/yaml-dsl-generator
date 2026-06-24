/**
 */
package pt.isep.yamldslgen.docker_compose.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import pt.isep.yamldslgen.docker_compose.DockercomposePackage;
import pt.isep.yamldslgen.docker_compose.Healthcheck;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Healthcheck</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.impl.HealthcheckImpl#getTest <em>Test</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.impl.HealthcheckImpl#getInterval <em>Interval</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.impl.HealthcheckImpl#getRetries <em>Retries</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.impl.HealthcheckImpl#getStartPeriod <em>Start Period</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.impl.HealthcheckImpl#getTimeout <em>Timeout</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HealthcheckImpl extends MinimalEObjectImpl.Container implements Healthcheck {
	/**
	 * The cached value of the '{@link #getTest() <em>Test</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTest()
	 * @generated
	 * @ordered
	 */
	protected EList<String> test;

	/**
	 * The default value of the '{@link #getInterval() <em>Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterval()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERVAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInterval() <em>Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterval()
	 * @generated
	 * @ordered
	 */
	protected String interval = INTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getRetries() <em>Retries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetries()
	 * @generated
	 * @ordered
	 */
	protected static final int RETRIES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRetries() <em>Retries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetries()
	 * @generated
	 * @ordered
	 */
	protected int retries = RETRIES_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartPeriod() <em>Start Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartPeriod()
	 * @generated
	 * @ordered
	 */
	protected static final String START_PERIOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartPeriod() <em>Start Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartPeriod()
	 * @generated
	 * @ordered
	 */
	protected String startPeriod = START_PERIOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final String TIMEOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeout()
	 * @generated
	 * @ordered
	 */
	protected String timeout = TIMEOUT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HealthcheckImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockercomposePackage.Literals.HEALTHCHECK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getTest() {
		if (test == null) {
			test = new EDataTypeUniqueEList<String>(String.class, this, DockercomposePackage.HEALTHCHECK__TEST);
		}
		return test;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInterval() {
		return interval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInterval(String newInterval) {
		String oldInterval = interval;
		interval = newInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.HEALTHCHECK__INTERVAL,
					oldInterval, interval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getRetries() {
		return retries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRetries(int newRetries) {
		int oldRetries = retries;
		retries = newRetries;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.HEALTHCHECK__RETRIES, oldRetries,
					retries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStartPeriod() {
		return startPeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartPeriod(String newStartPeriod) {
		String oldStartPeriod = startPeriod;
		startPeriod = newStartPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.HEALTHCHECK__START_PERIOD,
					oldStartPeriod, startPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTimeout() {
		return timeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeout(String newTimeout) {
		String oldTimeout = timeout;
		timeout = newTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.HEALTHCHECK__TIMEOUT, oldTimeout,
					timeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DockercomposePackage.HEALTHCHECK__TEST:
			return getTest();
		case DockercomposePackage.HEALTHCHECK__INTERVAL:
			return getInterval();
		case DockercomposePackage.HEALTHCHECK__RETRIES:
			return getRetries();
		case DockercomposePackage.HEALTHCHECK__START_PERIOD:
			return getStartPeriod();
		case DockercomposePackage.HEALTHCHECK__TIMEOUT:
			return getTimeout();
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
		case DockercomposePackage.HEALTHCHECK__TEST:
			getTest().clear();
			getTest().addAll((Collection<? extends String>) newValue);
			return;
		case DockercomposePackage.HEALTHCHECK__INTERVAL:
			setInterval((String) newValue);
			return;
		case DockercomposePackage.HEALTHCHECK__RETRIES:
			setRetries((Integer) newValue);
			return;
		case DockercomposePackage.HEALTHCHECK__START_PERIOD:
			setStartPeriod((String) newValue);
			return;
		case DockercomposePackage.HEALTHCHECK__TIMEOUT:
			setTimeout((String) newValue);
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
		case DockercomposePackage.HEALTHCHECK__TEST:
			getTest().clear();
			return;
		case DockercomposePackage.HEALTHCHECK__INTERVAL:
			setInterval(INTERVAL_EDEFAULT);
			return;
		case DockercomposePackage.HEALTHCHECK__RETRIES:
			setRetries(RETRIES_EDEFAULT);
			return;
		case DockercomposePackage.HEALTHCHECK__START_PERIOD:
			setStartPeriod(START_PERIOD_EDEFAULT);
			return;
		case DockercomposePackage.HEALTHCHECK__TIMEOUT:
			setTimeout(TIMEOUT_EDEFAULT);
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
		case DockercomposePackage.HEALTHCHECK__TEST:
			return test != null && !test.isEmpty();
		case DockercomposePackage.HEALTHCHECK__INTERVAL:
			return INTERVAL_EDEFAULT == null ? interval != null : !INTERVAL_EDEFAULT.equals(interval);
		case DockercomposePackage.HEALTHCHECK__RETRIES:
			return retries != RETRIES_EDEFAULT;
		case DockercomposePackage.HEALTHCHECK__START_PERIOD:
			return START_PERIOD_EDEFAULT == null ? startPeriod != null : !START_PERIOD_EDEFAULT.equals(startPeriod);
		case DockercomposePackage.HEALTHCHECK__TIMEOUT:
			return TIMEOUT_EDEFAULT == null ? timeout != null : !TIMEOUT_EDEFAULT.equals(timeout);
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
		result.append(" (test: ");
		result.append(test);
		result.append(", interval: ");
		result.append(interval);
		result.append(", retries: ");
		result.append(retries);
		result.append(", startPeriod: ");
		result.append(startPeriod);
		result.append(", timeout: ");
		result.append(timeout);
		result.append(')');
		return result.toString();
	}

} //HealthcheckImpl
