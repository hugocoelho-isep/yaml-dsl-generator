/**
 */
package pt.isep.yamldslgen.github_actions;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exclude</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.yamldslgen.github_actions.Exclude#getOs <em>Os</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.Exclude#getCCompiler <em>CCompiler</em>}</li>
 * </ul>
 *
 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getExclude()
 * @model
 * @generated
 */
public interface Exclude extends EObject {
	/**
	 * Returns the value of the '<em><b>Os</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Os</em>' attribute.
	 * @see #setOs(String)
	 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getExclude_Os()
	 * @model required="true"
	 * @generated
	 */
	String getOs();

	/**
	 * Sets the value of the '{@link pt.isep.yamldslgen.github_actions.Exclude#getOs <em>Os</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Os</em>' attribute.
	 * @see #getOs()
	 * @generated
	 */
	void setOs(String value);

	/**
	 * Returns the value of the '<em><b>CCompiler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CCompiler</em>' attribute.
	 * @see #setCCompiler(String)
	 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getExclude_CCompiler()
	 * @model required="true"
	 * @generated
	 */
	String getCCompiler();

	/**
	 * Sets the value of the '{@link pt.isep.yamldslgen.github_actions.Exclude#getCCompiler <em>CCompiler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CCompiler</em>' attribute.
	 * @see #getCCompiler()
	 * @generated
	 */
	void setCCompiler(String value);

} // Exclude
