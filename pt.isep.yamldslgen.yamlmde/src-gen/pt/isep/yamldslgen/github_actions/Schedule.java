/**
 */
package pt.isep.yamldslgen.github_actions;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.yamldslgen.github_actions.Schedule#getCron <em>Cron</em>}</li>
 * </ul>
 *
 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getSchedule()
 * @model
 * @generated
 */
public interface Schedule extends EObject {
	/**
	 * Returns the value of the '<em><b>Cron</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cron</em>' attribute.
	 * @see #setCron(String)
	 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getSchedule_Cron()
	 * @model required="true"
	 * @generated
	 */
	String getCron();

	/**
	 * Sets the value of the '{@link pt.isep.yamldslgen.github_actions.Schedule#getCron <em>Cron</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cron</em>' attribute.
	 * @see #getCron()
	 * @generated
	 */
	void setCron(String value);

} // Schedule
