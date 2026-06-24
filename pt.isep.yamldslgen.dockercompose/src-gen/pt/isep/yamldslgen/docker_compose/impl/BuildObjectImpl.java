/**
 */
package pt.isep.yamldslgen.docker_compose.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import pt.isep.yamldslgen.docker_compose.BuildObject;
import pt.isep.yamldslgen.docker_compose.DockercomposePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Build Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.impl.BuildObjectImpl#getContext <em>Context</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.impl.BuildObjectImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.impl.BuildObjectImpl#getArgs <em>Args</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.impl.BuildObjectImpl#getDockerfile <em>Dockerfile</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BuildObjectImpl extends BuildImpl implements BuildObject {
	/**
	 * The default value of the '{@link #getContext() <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected String context = CONTEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTarget() <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected String target = TARGET_EDEFAULT;

	/**
	 * The cached value of the '{@link #getArgs() <em>Args</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgs()
	 * @generated
	 * @ordered
	 */
	protected EList<String> args;

	/**
	 * The default value of the '{@link #getDockerfile() <em>Dockerfile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDockerfile()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCKERFILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDockerfile() <em>Dockerfile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDockerfile()
	 * @generated
	 * @ordered
	 */
	protected String dockerfile = DOCKERFILE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BuildObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockercomposePackage.Literals.BUILD_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContext(String newContext) {
		String oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.BUILD_OBJECT__CONTEXT,
					oldContext, context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(String newTarget) {
		String oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.BUILD_OBJECT__TARGET, oldTarget,
					target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getArgs() {
		if (args == null) {
			args = new EDataTypeUniqueEList<String>(String.class, this, DockercomposePackage.BUILD_OBJECT__ARGS);
		}
		return args;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDockerfile() {
		return dockerfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDockerfile(String newDockerfile) {
		String oldDockerfile = dockerfile;
		dockerfile = newDockerfile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.BUILD_OBJECT__DOCKERFILE,
					oldDockerfile, dockerfile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case DockercomposePackage.BUILD_OBJECT__CONTEXT:
			return getContext();
		case DockercomposePackage.BUILD_OBJECT__TARGET:
			return getTarget();
		case DockercomposePackage.BUILD_OBJECT__ARGS:
			return getArgs();
		case DockercomposePackage.BUILD_OBJECT__DOCKERFILE:
			return getDockerfile();
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
		case DockercomposePackage.BUILD_OBJECT__CONTEXT:
			setContext((String) newValue);
			return;
		case DockercomposePackage.BUILD_OBJECT__TARGET:
			setTarget((String) newValue);
			return;
		case DockercomposePackage.BUILD_OBJECT__ARGS:
			getArgs().clear();
			getArgs().addAll((Collection<? extends String>) newValue);
			return;
		case DockercomposePackage.BUILD_OBJECT__DOCKERFILE:
			setDockerfile((String) newValue);
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
		case DockercomposePackage.BUILD_OBJECT__CONTEXT:
			setContext(CONTEXT_EDEFAULT);
			return;
		case DockercomposePackage.BUILD_OBJECT__TARGET:
			setTarget(TARGET_EDEFAULT);
			return;
		case DockercomposePackage.BUILD_OBJECT__ARGS:
			getArgs().clear();
			return;
		case DockercomposePackage.BUILD_OBJECT__DOCKERFILE:
			setDockerfile(DOCKERFILE_EDEFAULT);
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
		case DockercomposePackage.BUILD_OBJECT__CONTEXT:
			return CONTEXT_EDEFAULT == null ? context != null : !CONTEXT_EDEFAULT.equals(context);
		case DockercomposePackage.BUILD_OBJECT__TARGET:
			return TARGET_EDEFAULT == null ? target != null : !TARGET_EDEFAULT.equals(target);
		case DockercomposePackage.BUILD_OBJECT__ARGS:
			return args != null && !args.isEmpty();
		case DockercomposePackage.BUILD_OBJECT__DOCKERFILE:
			return DOCKERFILE_EDEFAULT == null ? dockerfile != null : !DOCKERFILE_EDEFAULT.equals(dockerfile);
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
		result.append(" (context: ");
		result.append(context);
		result.append(", target: ");
		result.append(target);
		result.append(", args: ");
		result.append(args);
		result.append(", dockerfile: ");
		result.append(dockerfile);
		result.append(')');
		return result.toString();
	}

} //BuildObjectImpl
