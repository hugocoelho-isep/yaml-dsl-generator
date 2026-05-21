/**
 */
package pt.isep.yamldslgen.github_actions;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Include</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.yamldslgen.github_actions.Include#getOs <em>Os</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.Include#getCCompiler <em>CCompiler</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.Include#getCppCompiler <em>Cpp Compiler</em>}</li>
 * </ul>
 *
 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getInclude()
 * @model
 * @generated
 */
public interface Include extends EObject {
	/**
	 * Returns the value of the '<em><b>Os</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Os</em>' attribute.
	 * @see #setOs(String)
	 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getInclude_Os()
	 * @model required="true"
	 * @generated
	 */
	String getOs();

	/**
	 * Sets the value of the '{@link pt.isep.yamldslgen.github_actions.Include#getOs <em>Os</em>}' attribute.
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
	 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getInclude_CCompiler()
	 * @model required="true"
	 * @generated
	 */
	String getCCompiler();

	/**
	 * Sets the value of the '{@link pt.isep.yamldslgen.github_actions.Include#getCCompiler <em>CCompiler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CCompiler</em>' attribute.
	 * @see #getCCompiler()
	 * @generated
	 */
	void setCCompiler(String value);

	/**
	 * Returns the value of the '<em><b>Cpp Compiler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cpp Compiler</em>' attribute.
	 * @see #setCppCompiler(String)
	 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getInclude_CppCompiler()
	 * @model required="true"
	 * @generated
	 */
	String getCppCompiler();

	/**
	 * Sets the value of the '{@link pt.isep.yamldslgen.github_actions.Include#getCppCompiler <em>Cpp Compiler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cpp Compiler</em>' attribute.
	 * @see #getCppCompiler()
	 * @generated
	 */
	void setCppCompiler(String value);

} // Include
