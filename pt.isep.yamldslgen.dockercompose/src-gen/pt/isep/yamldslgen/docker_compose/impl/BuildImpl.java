/**
 */
package pt.isep.yamldslgen.docker_compose.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import pt.isep.yamldslgen.docker_compose.Build;
import pt.isep.yamldslgen.docker_compose.DockercomposePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Build</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class BuildImpl extends MinimalEObjectImpl.Container implements Build {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BuildImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockercomposePackage.Literals.BUILD;
	}

} //BuildImpl
