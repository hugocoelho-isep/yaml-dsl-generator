/**
 */
package pt.isep.yamldslgen.github_actions;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Matrix</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.yamldslgen.github_actions.Matrix#getOs <em>Os</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.Matrix#getBuildType <em>Build Type</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.Matrix#getCCompiler <em>CCompiler</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.Matrix#getOtp <em>Otp</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.Matrix#getElixir <em>Elixir</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.Matrix#getInclude <em>Include</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.Matrix#getExclude <em>Exclude</em>}</li>
 * </ul>
 *
 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getMatrix()
 * @model
 * @generated
 */
public interface Matrix extends EObject {
	/**
	 * Returns the value of the '<em><b>Os</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Os</em>' attribute list.
	 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getMatrix_Os()
	 * @model
	 * @generated
	 */
	EList<String> getOs();

	/**
	 * Returns the value of the '<em><b>Build Type</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Build Type</em>' attribute list.
	 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getMatrix_BuildType()
	 * @model
	 * @generated
	 */
	EList<String> getBuildType();

	/**
	 * Returns the value of the '<em><b>CCompiler</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CCompiler</em>' attribute list.
	 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getMatrix_CCompiler()
	 * @model
	 * @generated
	 */
	EList<String> getCCompiler();

	/**
	 * Returns the value of the '<em><b>Otp</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Otp</em>' attribute list.
	 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getMatrix_Otp()
	 * @model
	 * @generated
	 */
	EList<String> getOtp();

	/**
	 * Returns the value of the '<em><b>Elixir</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elixir</em>' attribute list.
	 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getMatrix_Elixir()
	 * @model
	 * @generated
	 */
	EList<String> getElixir();

	/**
	 * Returns the value of the '<em><b>Include</b></em>' containment reference list.
	 * The list contents are of type {@link pt.isep.yamldslgen.github_actions.Include}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include</em>' containment reference list.
	 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getMatrix_Include()
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
	 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getMatrix_Exclude()
	 * @model containment="true"
	 * @generated
	 */
	EList<Exclude> getExclude();

} // Matrix
