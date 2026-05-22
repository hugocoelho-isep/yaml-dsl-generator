/**
 */
package pt.isep.yamldslgen.github_actions;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Defaults</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.yamldslgen.github_actions.Defaults#getRun <em>Run</em>}</li>
 * </ul>
 *
 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getDefaults()
 * @model
 * @generated
 */
public interface Defaults extends EObject {
	/**
	 * Returns the value of the '<em><b>Run</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Run</em>' containment reference.
	 * @see #setRun(Run)
	 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getDefaults_Run()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Run getRun();

	/**
	 * Sets the value of the '{@link pt.isep.yamldslgen.github_actions.Defaults#getRun <em>Run</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Run</em>' containment reference.
	 * @see #getRun()
	 * @generated
	 */
	void setRun(Run value);

} // Defaults
