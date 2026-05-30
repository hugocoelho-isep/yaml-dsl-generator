/**
 */
package pt.isep.yamldslgen.github_actions;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.yamldslgen.github_actions.Strategy#isFailFast <em>Fail Fast</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.Strategy#getMaxParallel <em>Max Parallel</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.Strategy#getMatrix <em>Matrix</em>}</li>
 * </ul>
 *
 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getStrategy()
 * @model
 * @generated
 */
public interface Strategy extends EObject {
	/**
	 * Returns the value of the '<em><b>Fail Fast</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fail Fast</em>' attribute.
	 * @see #setFailFast(boolean)
	 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getStrategy_FailFast()
	 * @model
	 * @generated
	 */
	boolean isFailFast();

	/**
	 * Sets the value of the '{@link pt.isep.yamldslgen.github_actions.Strategy#isFailFast <em>Fail Fast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fail Fast</em>' attribute.
	 * @see #isFailFast()
	 * @generated
	 */
	void setFailFast(boolean value);

	/**
	 * Returns the value of the '<em><b>Max Parallel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Parallel</em>' attribute.
	 * @see #setMaxParallel(int)
	 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getStrategy_MaxParallel()
	 * @model
	 * @generated
	 */
	int getMaxParallel();

	/**
	 * Sets the value of the '{@link pt.isep.yamldslgen.github_actions.Strategy#getMaxParallel <em>Max Parallel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Parallel</em>' attribute.
	 * @see #getMaxParallel()
	 * @generated
	 */
	void setMaxParallel(int value);

	/**
	 * Returns the value of the '<em><b>Matrix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matrix</em>' containment reference.
	 * @see #setMatrix(Matrix)
	 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getStrategy_Matrix()
	 * @model containment="true"
	 * @generated
	 */
	Matrix getMatrix();

	/**
	 * Sets the value of the '{@link pt.isep.yamldslgen.github_actions.Strategy#getMatrix <em>Matrix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matrix</em>' containment reference.
	 * @see #getMatrix()
	 * @generated
	 */
	void setMatrix(Matrix value);

} // Strategy
