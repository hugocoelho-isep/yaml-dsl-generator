/**
 */
package pt.isep.yamldslgen.github_actions.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pt.isep.yamldslgen.github_actions.Exclude;
import pt.isep.yamldslgen.github_actions.Include;
import pt.isep.yamldslgen.github_actions.Matrix;
import pt.isep.yamldslgen.github_actions.MatrixParameter;
import pt.isep.yamldslgen.github_actions.YamlmdePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Matrix</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.MatrixImpl#getInclude <em>Include</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.MatrixImpl#getExclude <em>Exclude</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.MatrixImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MatrixImpl extends MinimalEObjectImpl.Container implements Matrix {
	/**
	 * The cached value of the '{@link #getInclude() <em>Include</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInclude()
	 * @generated
	 * @ordered
	 */
	protected EList<Include> include;

	/**
	 * The cached value of the '{@link #getExclude() <em>Exclude</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclude()
	 * @generated
	 * @ordered
	 */
	protected EList<Exclude> exclude;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<MatrixParameter> parameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatrixImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return YamlmdePackage.Literals.MATRIX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Include> getInclude() {
		if (include == null) {
			include = new EObjectContainmentEList<Include>(Include.class, this, YamlmdePackage.MATRIX__INCLUDE);
		}
		return include;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Exclude> getExclude() {
		if (exclude == null) {
			exclude = new EObjectContainmentEList<Exclude>(Exclude.class, this, YamlmdePackage.MATRIX__EXCLUDE);
		}
		return exclude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MatrixParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<MatrixParameter>(MatrixParameter.class, this,
					YamlmdePackage.MATRIX__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case YamlmdePackage.MATRIX__INCLUDE:
			return ((InternalEList<?>) getInclude()).basicRemove(otherEnd, msgs);
		case YamlmdePackage.MATRIX__EXCLUDE:
			return ((InternalEList<?>) getExclude()).basicRemove(otherEnd, msgs);
		case YamlmdePackage.MATRIX__PARAMETERS:
			return ((InternalEList<?>) getParameters()).basicRemove(otherEnd, msgs);
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
		case YamlmdePackage.MATRIX__INCLUDE:
			return getInclude();
		case YamlmdePackage.MATRIX__EXCLUDE:
			return getExclude();
		case YamlmdePackage.MATRIX__PARAMETERS:
			return getParameters();
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
		case YamlmdePackage.MATRIX__INCLUDE:
			getInclude().clear();
			getInclude().addAll((Collection<? extends Include>) newValue);
			return;
		case YamlmdePackage.MATRIX__EXCLUDE:
			getExclude().clear();
			getExclude().addAll((Collection<? extends Exclude>) newValue);
			return;
		case YamlmdePackage.MATRIX__PARAMETERS:
			getParameters().clear();
			getParameters().addAll((Collection<? extends MatrixParameter>) newValue);
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
		case YamlmdePackage.MATRIX__INCLUDE:
			getInclude().clear();
			return;
		case YamlmdePackage.MATRIX__EXCLUDE:
			getExclude().clear();
			return;
		case YamlmdePackage.MATRIX__PARAMETERS:
			getParameters().clear();
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
		case YamlmdePackage.MATRIX__INCLUDE:
			return include != null && !include.isEmpty();
		case YamlmdePackage.MATRIX__EXCLUDE:
			return exclude != null && !exclude.isEmpty();
		case YamlmdePackage.MATRIX__PARAMETERS:
			return parameters != null && !parameters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MatrixImpl
