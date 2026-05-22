/**
 */
package pt.isep.yamldslgen.github_actions.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import pt.isep.yamldslgen.github_actions.Matrix;
import pt.isep.yamldslgen.github_actions.Strategy;
import pt.isep.yamldslgen.github_actions.YamlmdePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Strategy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.StrategyImpl#isFailFast <em>Fail Fast</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.StrategyImpl#getMaxParallel <em>Max Parallel</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.StrategyImpl#getMatrix <em>Matrix</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StrategyImpl extends MinimalEObjectImpl.Container implements Strategy {
	/**
	 * The default value of the '{@link #isFailFast() <em>Fail Fast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFailFast()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FAIL_FAST_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFailFast() <em>Fail Fast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFailFast()
	 * @generated
	 * @ordered
	 */
	protected boolean failFast = FAIL_FAST_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxParallel() <em>Max Parallel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxParallel()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_PARALLEL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxParallel() <em>Max Parallel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxParallel()
	 * @generated
	 * @ordered
	 */
	protected int maxParallel = MAX_PARALLEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMatrix() <em>Matrix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatrix()
	 * @generated
	 * @ordered
	 */
	protected Matrix matrix;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StrategyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return YamlmdePackage.Literals.STRATEGY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFailFast() {
		return failFast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFailFast(boolean newFailFast) {
		boolean oldFailFast = failFast;
		failFast = newFailFast;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YamlmdePackage.STRATEGY__FAIL_FAST, oldFailFast,
					failFast));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMaxParallel() {
		return maxParallel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxParallel(int newMaxParallel) {
		int oldMaxParallel = maxParallel;
		maxParallel = newMaxParallel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YamlmdePackage.STRATEGY__MAX_PARALLEL, oldMaxParallel,
					maxParallel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Matrix getMatrix() {
		return matrix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMatrix(Matrix newMatrix, NotificationChain msgs) {
		Matrix oldMatrix = matrix;
		matrix = newMatrix;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					YamlmdePackage.STRATEGY__MATRIX, oldMatrix, newMatrix);
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
	public void setMatrix(Matrix newMatrix) {
		if (newMatrix != matrix) {
			NotificationChain msgs = null;
			if (matrix != null)
				msgs = ((InternalEObject) matrix).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - YamlmdePackage.STRATEGY__MATRIX, null, msgs);
			if (newMatrix != null)
				msgs = ((InternalEObject) newMatrix).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - YamlmdePackage.STRATEGY__MATRIX, null, msgs);
			msgs = basicSetMatrix(newMatrix, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YamlmdePackage.STRATEGY__MATRIX, newMatrix,
					newMatrix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case YamlmdePackage.STRATEGY__MATRIX:
			return basicSetMatrix(null, msgs);
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
		case YamlmdePackage.STRATEGY__FAIL_FAST:
			return isFailFast();
		case YamlmdePackage.STRATEGY__MAX_PARALLEL:
			return getMaxParallel();
		case YamlmdePackage.STRATEGY__MATRIX:
			return getMatrix();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case YamlmdePackage.STRATEGY__FAIL_FAST:
			setFailFast((Boolean) newValue);
			return;
		case YamlmdePackage.STRATEGY__MAX_PARALLEL:
			setMaxParallel((Integer) newValue);
			return;
		case YamlmdePackage.STRATEGY__MATRIX:
			setMatrix((Matrix) newValue);
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
		case YamlmdePackage.STRATEGY__FAIL_FAST:
			setFailFast(FAIL_FAST_EDEFAULT);
			return;
		case YamlmdePackage.STRATEGY__MAX_PARALLEL:
			setMaxParallel(MAX_PARALLEL_EDEFAULT);
			return;
		case YamlmdePackage.STRATEGY__MATRIX:
			setMatrix((Matrix) null);
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
		case YamlmdePackage.STRATEGY__FAIL_FAST:
			return failFast != FAIL_FAST_EDEFAULT;
		case YamlmdePackage.STRATEGY__MAX_PARALLEL:
			return maxParallel != MAX_PARALLEL_EDEFAULT;
		case YamlmdePackage.STRATEGY__MATRIX:
			return matrix != null;
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
		result.append(" (failFast: ");
		result.append(failFast);
		result.append(", maxParallel: ");
		result.append(maxParallel);
		result.append(')');
		return result.toString();
	}

} //StrategyImpl
