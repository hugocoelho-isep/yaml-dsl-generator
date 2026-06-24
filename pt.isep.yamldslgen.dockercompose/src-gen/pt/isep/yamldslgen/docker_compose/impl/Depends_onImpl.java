/**
 */
package pt.isep.yamldslgen.docker_compose.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import pt.isep.yamldslgen.docker_compose.Depends_on;
import pt.isep.yamldslgen.docker_compose.DockercomposePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Depends on</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class Depends_onImpl extends MinimalEObjectImpl.Container implements Depends_on {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Depends_onImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockercomposePackage.Literals.DEPENDS_ON;
	}

} //Depends_onImpl
