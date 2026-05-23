/**
 */
package pt.isep.yamldslgen.github_actions.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pt.isep.yamldslgen.github_actions.Exclude;
import pt.isep.yamldslgen.github_actions.Include;
import pt.isep.yamldslgen.github_actions.Matrix;
import pt.isep.yamldslgen.github_actions.YamlmdePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Matrix</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.MatrixImpl#getOs <em>Os</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.MatrixImpl#getBuildType <em>Build Type</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.MatrixImpl#getCCompiler <em>CCompiler</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.MatrixImpl#getOtp <em>Otp</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.MatrixImpl#getElixir <em>Elixir</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.MatrixImpl#getPythonVersion <em>Python Version</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.MatrixImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.MatrixImpl#getNodeVersion <em>Node Version</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.MatrixImpl#getRVersion <em>RVersion</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.MatrixImpl#getInclude <em>Include</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.MatrixImpl#getExclude <em>Exclude</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MatrixImpl extends MinimalEObjectImpl.Container implements Matrix {
	/**
	 * The cached value of the '{@link #getOs() <em>Os</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOs()
	 * @generated
	 * @ordered
	 */
	protected EList<String> os;

	/**
	 * The cached value of the '{@link #getBuildType() <em>Build Type</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildType()
	 * @generated
	 * @ordered
	 */
	protected EList<String> buildType;

	/**
	 * The cached value of the '{@link #getCCompiler() <em>CCompiler</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCCompiler()
	 * @generated
	 * @ordered
	 */
	protected EList<String> cCompiler;

	/**
	 * The cached value of the '{@link #getOtp() <em>Otp</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtp()
	 * @generated
	 * @ordered
	 */
	protected EList<String> otp;

	/**
	 * The cached value of the '{@link #getElixir() <em>Elixir</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElixir()
	 * @generated
	 * @ordered
	 */
	protected EList<String> elixir;

	/**
	 * The cached value of the '{@link #getPythonVersion() <em>Python Version</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPythonVersion()
	 * @generated
	 * @ordered
	 */
	protected EList<Float> pythonVersion;

	/**
	 * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration()
	 * @generated
	 * @ordered
	 */
	protected EList<String> configuration;

	/**
	 * The cached value of the '{@link #getNodeVersion() <em>Node Version</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeVersion()
	 * @generated
	 * @ordered
	 */
	protected EList<String> nodeVersion;

	/**
	 * The cached value of the '{@link #getRVersion() <em>RVersion</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRVersion()
	 * @generated
	 * @ordered
	 */
	protected EList<String> rVersion;

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
	public EList<String> getOs() {
		if (os == null) {
			os = new EDataTypeUniqueEList<String>(String.class, this, YamlmdePackage.MATRIX__OS);
		}
		return os;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getBuildType() {
		if (buildType == null) {
			buildType = new EDataTypeUniqueEList<String>(String.class, this, YamlmdePackage.MATRIX__BUILD_TYPE);
		}
		return buildType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getCCompiler() {
		if (cCompiler == null) {
			cCompiler = new EDataTypeUniqueEList<String>(String.class, this, YamlmdePackage.MATRIX__CCOMPILER);
		}
		return cCompiler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOtp() {
		if (otp == null) {
			otp = new EDataTypeUniqueEList<String>(String.class, this, YamlmdePackage.MATRIX__OTP);
		}
		return otp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getElixir() {
		if (elixir == null) {
			elixir = new EDataTypeUniqueEList<String>(String.class, this, YamlmdePackage.MATRIX__ELIXIR);
		}
		return elixir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Float> getPythonVersion() {
		if (pythonVersion == null) {
			pythonVersion = new EDataTypeUniqueEList<Float>(Float.class, this, YamlmdePackage.MATRIX__PYTHON_VERSION);
		}
		return pythonVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getConfiguration() {
		if (configuration == null) {
			configuration = new EDataTypeUniqueEList<String>(String.class, this, YamlmdePackage.MATRIX__CONFIGURATION);
		}
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getNodeVersion() {
		if (nodeVersion == null) {
			nodeVersion = new EDataTypeUniqueEList<String>(String.class, this, YamlmdePackage.MATRIX__NODE_VERSION);
		}
		return nodeVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getRVersion() {
		if (rVersion == null) {
			rVersion = new EDataTypeUniqueEList<String>(String.class, this, YamlmdePackage.MATRIX__RVERSION);
		}
		return rVersion;
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case YamlmdePackage.MATRIX__INCLUDE:
			return ((InternalEList<?>) getInclude()).basicRemove(otherEnd, msgs);
		case YamlmdePackage.MATRIX__EXCLUDE:
			return ((InternalEList<?>) getExclude()).basicRemove(otherEnd, msgs);
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
		case YamlmdePackage.MATRIX__OS:
			return getOs();
		case YamlmdePackage.MATRIX__BUILD_TYPE:
			return getBuildType();
		case YamlmdePackage.MATRIX__CCOMPILER:
			return getCCompiler();
		case YamlmdePackage.MATRIX__OTP:
			return getOtp();
		case YamlmdePackage.MATRIX__ELIXIR:
			return getElixir();
		case YamlmdePackage.MATRIX__PYTHON_VERSION:
			return getPythonVersion();
		case YamlmdePackage.MATRIX__CONFIGURATION:
			return getConfiguration();
		case YamlmdePackage.MATRIX__NODE_VERSION:
			return getNodeVersion();
		case YamlmdePackage.MATRIX__RVERSION:
			return getRVersion();
		case YamlmdePackage.MATRIX__INCLUDE:
			return getInclude();
		case YamlmdePackage.MATRIX__EXCLUDE:
			return getExclude();
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
		case YamlmdePackage.MATRIX__OS:
			getOs().clear();
			getOs().addAll((Collection<? extends String>) newValue);
			return;
		case YamlmdePackage.MATRIX__BUILD_TYPE:
			getBuildType().clear();
			getBuildType().addAll((Collection<? extends String>) newValue);
			return;
		case YamlmdePackage.MATRIX__CCOMPILER:
			getCCompiler().clear();
			getCCompiler().addAll((Collection<? extends String>) newValue);
			return;
		case YamlmdePackage.MATRIX__OTP:
			getOtp().clear();
			getOtp().addAll((Collection<? extends String>) newValue);
			return;
		case YamlmdePackage.MATRIX__ELIXIR:
			getElixir().clear();
			getElixir().addAll((Collection<? extends String>) newValue);
			return;
		case YamlmdePackage.MATRIX__PYTHON_VERSION:
			getPythonVersion().clear();
			getPythonVersion().addAll((Collection<? extends Float>) newValue);
			return;
		case YamlmdePackage.MATRIX__CONFIGURATION:
			getConfiguration().clear();
			getConfiguration().addAll((Collection<? extends String>) newValue);
			return;
		case YamlmdePackage.MATRIX__NODE_VERSION:
			getNodeVersion().clear();
			getNodeVersion().addAll((Collection<? extends String>) newValue);
			return;
		case YamlmdePackage.MATRIX__RVERSION:
			getRVersion().clear();
			getRVersion().addAll((Collection<? extends String>) newValue);
			return;
		case YamlmdePackage.MATRIX__INCLUDE:
			getInclude().clear();
			getInclude().addAll((Collection<? extends Include>) newValue);
			return;
		case YamlmdePackage.MATRIX__EXCLUDE:
			getExclude().clear();
			getExclude().addAll((Collection<? extends Exclude>) newValue);
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
		case YamlmdePackage.MATRIX__OS:
			getOs().clear();
			return;
		case YamlmdePackage.MATRIX__BUILD_TYPE:
			getBuildType().clear();
			return;
		case YamlmdePackage.MATRIX__CCOMPILER:
			getCCompiler().clear();
			return;
		case YamlmdePackage.MATRIX__OTP:
			getOtp().clear();
			return;
		case YamlmdePackage.MATRIX__ELIXIR:
			getElixir().clear();
			return;
		case YamlmdePackage.MATRIX__PYTHON_VERSION:
			getPythonVersion().clear();
			return;
		case YamlmdePackage.MATRIX__CONFIGURATION:
			getConfiguration().clear();
			return;
		case YamlmdePackage.MATRIX__NODE_VERSION:
			getNodeVersion().clear();
			return;
		case YamlmdePackage.MATRIX__RVERSION:
			getRVersion().clear();
			return;
		case YamlmdePackage.MATRIX__INCLUDE:
			getInclude().clear();
			return;
		case YamlmdePackage.MATRIX__EXCLUDE:
			getExclude().clear();
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
		case YamlmdePackage.MATRIX__OS:
			return os != null && !os.isEmpty();
		case YamlmdePackage.MATRIX__BUILD_TYPE:
			return buildType != null && !buildType.isEmpty();
		case YamlmdePackage.MATRIX__CCOMPILER:
			return cCompiler != null && !cCompiler.isEmpty();
		case YamlmdePackage.MATRIX__OTP:
			return otp != null && !otp.isEmpty();
		case YamlmdePackage.MATRIX__ELIXIR:
			return elixir != null && !elixir.isEmpty();
		case YamlmdePackage.MATRIX__PYTHON_VERSION:
			return pythonVersion != null && !pythonVersion.isEmpty();
		case YamlmdePackage.MATRIX__CONFIGURATION:
			return configuration != null && !configuration.isEmpty();
		case YamlmdePackage.MATRIX__NODE_VERSION:
			return nodeVersion != null && !nodeVersion.isEmpty();
		case YamlmdePackage.MATRIX__RVERSION:
			return rVersion != null && !rVersion.isEmpty();
		case YamlmdePackage.MATRIX__INCLUDE:
			return include != null && !include.isEmpty();
		case YamlmdePackage.MATRIX__EXCLUDE:
			return exclude != null && !exclude.isEmpty();
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
		result.append(" (os: ");
		result.append(os);
		result.append(", buildType: ");
		result.append(buildType);
		result.append(", cCompiler: ");
		result.append(cCompiler);
		result.append(", otp: ");
		result.append(otp);
		result.append(", elixir: ");
		result.append(elixir);
		result.append(", pythonVersion: ");
		result.append(pythonVersion);
		result.append(", configuration: ");
		result.append(configuration);
		result.append(", nodeVersion: ");
		result.append(nodeVersion);
		result.append(", rVersion: ");
		result.append(rVersion);
		result.append(')');
		return result.toString();
	}

} //MatrixImpl
