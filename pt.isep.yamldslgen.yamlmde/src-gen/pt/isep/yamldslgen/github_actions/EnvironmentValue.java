/**
 */
package pt.isep.yamldslgen.github_actions;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Environment Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.yamldslgen.github_actions.EnvironmentValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getEnvironmentValue()
 * @model
 * @generated
 */
public interface EnvironmentValue extends Environment {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getEnvironmentValue_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link pt.isep.yamldslgen.github_actions.EnvironmentValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // EnvironmentValue
