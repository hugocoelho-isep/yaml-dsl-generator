/**
 */
package pt.isep.yamldslgen.docker_compose;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Build Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.BuildObject#getContext <em>Context</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.BuildObject#getTarget <em>Target</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.BuildObject#getArgs <em>Args</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.BuildObject#getDockerfile <em>Dockerfile</em>}</li>
 * </ul>
 *
 * @see pt.isep.yamldslgen.docker_compose.DockercomposePackage#getBuildObject()
 * @model
 * @generated
 */
public interface BuildObject extends Build {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' attribute.
	 * @see #setContext(String)
	 * @see pt.isep.yamldslgen.docker_compose.DockercomposePackage#getBuildObject_Context()
	 * @model required="true"
	 * @generated
	 */
	String getContext();

	/**
	 * Sets the value of the '{@link pt.isep.yamldslgen.docker_compose.BuildObject#getContext <em>Context</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' attribute.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(String value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' attribute.
	 * @see #setTarget(String)
	 * @see pt.isep.yamldslgen.docker_compose.DockercomposePackage#getBuildObject_Target()
	 * @model
	 * @generated
	 */
	String getTarget();

	/**
	 * Sets the value of the '{@link pt.isep.yamldslgen.docker_compose.BuildObject#getTarget <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' attribute.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(String value);

	/**
	 * Returns the value of the '<em><b>Args</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Args</em>' attribute list.
	 * @see pt.isep.yamldslgen.docker_compose.DockercomposePackage#getBuildObject_Args()
	 * @model
	 * @generated
	 */
	EList<String> getArgs();

	/**
	 * Returns the value of the '<em><b>Dockerfile</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dockerfile</em>' attribute.
	 * @see #setDockerfile(String)
	 * @see pt.isep.yamldslgen.docker_compose.DockercomposePackage#getBuildObject_Dockerfile()
	 * @model
	 * @generated
	 */
	String getDockerfile();

	/**
	 * Sets the value of the '{@link pt.isep.yamldslgen.docker_compose.BuildObject#getDockerfile <em>Dockerfile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dockerfile</em>' attribute.
	 * @see #getDockerfile()
	 * @generated
	 */
	void setDockerfile(String value);

} // BuildObject
