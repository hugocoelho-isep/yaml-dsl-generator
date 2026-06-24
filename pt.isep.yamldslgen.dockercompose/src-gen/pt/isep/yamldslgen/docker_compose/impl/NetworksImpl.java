/**
 */
package pt.isep.yamldslgen.docker_compose.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import pt.isep.yamldslgen.docker_compose.DockercomposePackage;
import pt.isep.yamldslgen.docker_compose.Networks;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Networks</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class NetworksImpl extends MinimalEObjectImpl.Container implements Networks {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworksImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockercomposePackage.Literals.NETWORKS;
	}

} //NetworksImpl
