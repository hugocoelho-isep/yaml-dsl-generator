/**
 */
package pt.isep.yamldslgen.github_actions.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import pt.isep.yamldslgen.github_actions.Include;
import pt.isep.yamldslgen.github_actions.YamlmdePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Include</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.IncludeImpl#getOs <em>Os</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.IncludeImpl#getCCompiler <em>CCompiler</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.IncludeImpl#getCppCompiler <em>Cpp Compiler</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IncludeImpl extends MinimalEObjectImpl.Container implements Include {
	/**
	 * The default value of the '{@link #getOs() <em>Os</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOs()
	 * @generated
	 * @ordered
	 */
	protected static final String OS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOs() <em>Os</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOs()
	 * @generated
	 * @ordered
	 */
	protected String os = OS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCCompiler() <em>CCompiler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCCompiler()
	 * @generated
	 * @ordered
	 */
	protected static final String CCOMPILER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCCompiler() <em>CCompiler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCCompiler()
	 * @generated
	 * @ordered
	 */
	protected String cCompiler = CCOMPILER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCppCompiler() <em>Cpp Compiler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCppCompiler()
	 * @generated
	 * @ordered
	 */
	protected static final String CPP_COMPILER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCppCompiler() <em>Cpp Compiler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCppCompiler()
	 * @generated
	 * @ordered
	 */
	protected String cppCompiler = CPP_COMPILER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IncludeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return YamlmdePackage.Literals.INCLUDE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOs() {
		return os;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOs(String newOs) {
		String oldOs = os;
		os = newOs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YamlmdePackage.INCLUDE__OS, oldOs, os));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCCompiler() {
		return cCompiler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCCompiler(String newCCompiler) {
		String oldCCompiler = cCompiler;
		cCompiler = newCCompiler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YamlmdePackage.INCLUDE__CCOMPILER, oldCCompiler,
					cCompiler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCppCompiler() {
		return cppCompiler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCppCompiler(String newCppCompiler) {
		String oldCppCompiler = cppCompiler;
		cppCompiler = newCppCompiler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YamlmdePackage.INCLUDE__CPP_COMPILER, oldCppCompiler,
					cppCompiler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case YamlmdePackage.INCLUDE__OS:
			return getOs();
		case YamlmdePackage.INCLUDE__CCOMPILER:
			return getCCompiler();
		case YamlmdePackage.INCLUDE__CPP_COMPILER:
			return getCppCompiler();
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
		case YamlmdePackage.INCLUDE__OS:
			setOs((String) newValue);
			return;
		case YamlmdePackage.INCLUDE__CCOMPILER:
			setCCompiler((String) newValue);
			return;
		case YamlmdePackage.INCLUDE__CPP_COMPILER:
			setCppCompiler((String) newValue);
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
		case YamlmdePackage.INCLUDE__OS:
			setOs(OS_EDEFAULT);
			return;
		case YamlmdePackage.INCLUDE__CCOMPILER:
			setCCompiler(CCOMPILER_EDEFAULT);
			return;
		case YamlmdePackage.INCLUDE__CPP_COMPILER:
			setCppCompiler(CPP_COMPILER_EDEFAULT);
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
		case YamlmdePackage.INCLUDE__OS:
			return OS_EDEFAULT == null ? os != null : !OS_EDEFAULT.equals(os);
		case YamlmdePackage.INCLUDE__CCOMPILER:
			return CCOMPILER_EDEFAULT == null ? cCompiler != null : !CCOMPILER_EDEFAULT.equals(cCompiler);
		case YamlmdePackage.INCLUDE__CPP_COMPILER:
			return CPP_COMPILER_EDEFAULT == null ? cppCompiler != null : !CPP_COMPILER_EDEFAULT.equals(cppCompiler);
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
		result.append(", cCompiler: ");
		result.append(cCompiler);
		result.append(", cppCompiler: ");
		result.append(cppCompiler);
		result.append(')');
		return result.toString();
	}

} //IncludeImpl
