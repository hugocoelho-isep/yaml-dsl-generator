/**
 */
package pt.isep.yamldslgen.github_actions;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.yamldslgen.github_actions.Step#getName <em>Name</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.Step#getUses <em>Uses</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.Step#getRun <em>Run</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.Step#getWith <em>With</em>}</li>
 * </ul>
 *
 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getStep()
 * @model
 * @generated
 */
public interface Step extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getStep_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pt.isep.yamldslgen.github_actions.Step#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Uses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses</em>' attribute.
	 * @see #setUses(String)
	 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getStep_Uses()
	 * @model
	 * @generated
	 */
	String getUses();

	/**
	 * Sets the value of the '{@link pt.isep.yamldslgen.github_actions.Step#getUses <em>Uses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses</em>' attribute.
	 * @see #getUses()
	 * @generated
	 */
	void setUses(String value);

	/**
	 * Returns the value of the '<em><b>Run</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Run</em>' attribute.
	 * @see #setRun(String)
	 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getStep_Run()
	 * @model
	 * @generated
	 */
	String getRun();

	/**
	 * Sets the value of the '{@link pt.isep.yamldslgen.github_actions.Step#getRun <em>Run</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Run</em>' attribute.
	 * @see #getRun()
	 * @generated
	 */
	void setRun(String value);

	/**
	 * Returns the value of the '<em><b>With</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>With</em>' containment reference.
	 * @see #setWith(With)
	 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getStep_With()
	 * @model containment="true"
	 * @generated
	 */
	With getWith();

	/**
	 * Sets the value of the '{@link pt.isep.yamldslgen.github_actions.Step#getWith <em>With</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>With</em>' containment reference.
	 * @see #getWith()
	 * @generated
	 */
	void setWith(With value);

} // Step
