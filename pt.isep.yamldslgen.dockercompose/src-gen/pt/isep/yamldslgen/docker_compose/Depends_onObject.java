/**
 */
package pt.isep.yamldslgen.docker_compose;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Depends on Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.Depends_onObject#getDb <em>Db</em>}</li>
 * </ul>
 *
 * @see pt.isep.yamldslgen.docker_compose.DockercomposePackage#getDepends_onObject()
 * @model
 * @generated
 */
public interface Depends_onObject extends Depends_on {
	/**
	 * Returns the value of the '<em><b>Db</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Db</em>' containment reference.
	 * @see #setDb(Db)
	 * @see pt.isep.yamldslgen.docker_compose.DockercomposePackage#getDepends_onObject_Db()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Db getDb();

	/**
	 * Sets the value of the '{@link pt.isep.yamldslgen.docker_compose.Depends_onObject#getDb <em>Db</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Db</em>' containment reference.
	 * @see #getDb()
	 * @generated
	 */
	void setDb(Db value);

} // Depends_onObject
