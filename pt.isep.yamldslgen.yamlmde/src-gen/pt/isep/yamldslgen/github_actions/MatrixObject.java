/**
 */
package pt.isep.yamldslgen.github_actions;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Matrix Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.yamldslgen.github_actions.MatrixObject#getInclude <em>Include</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.MatrixObject#getExclude <em>Exclude</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.MatrixObject#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getMatrixObject()
 * @model
 * @generated
 */
public interface MatrixObject extends Matrix {
	/**
	 * Returns the value of the '<em><b>Include</b></em>' containment reference list.
	 * The list contents are of type {@link pt.isep.yamldslgen.github_actions.Include}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include</em>' containment reference list.
	 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getMatrixObject_Include()
	 * @model containment="true"
	 * @generated
	 */
	EList<Include> getInclude();

	/**
	 * Returns the value of the '<em><b>Exclude</b></em>' containment reference list.
	 * The list contents are of type {@link pt.isep.yamldslgen.github_actions.Exclude}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclude</em>' containment reference list.
	 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getMatrixObject_Exclude()
	 * @model containment="true"
	 * @generated
	 */
	EList<Exclude> getExclude();

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link pt.isep.yamldslgen.github_actions.MatrixParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getMatrixObject_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<MatrixParameter> getParameters();

} // MatrixObject
