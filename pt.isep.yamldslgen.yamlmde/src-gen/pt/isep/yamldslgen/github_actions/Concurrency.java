/**
 */
package pt.isep.yamldslgen.github_actions;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concurrency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.yamldslgen.github_actions.Concurrency#getGroup <em>Group</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.Concurrency#isCancelInProgress <em>Cancel In Progress</em>}</li>
 * </ul>
 *
 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getConcurrency()
 * @model
 * @generated
 */
public interface Concurrency extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute.
	 * @see #setGroup(String)
	 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getConcurrency_Group()
	 * @model required="true"
	 * @generated
	 */
	String getGroup();

	/**
	 * Sets the value of the '{@link pt.isep.yamldslgen.github_actions.Concurrency#getGroup <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group</em>' attribute.
	 * @see #getGroup()
	 * @generated
	 */
	void setGroup(String value);

	/**
	 * Returns the value of the '<em><b>Cancel In Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cancel In Progress</em>' attribute.
	 * @see #setCancelInProgress(boolean)
	 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getConcurrency_CancelInProgress()
	 * @model required="true"
	 * @generated
	 */
	boolean isCancelInProgress();

	/**
	 * Sets the value of the '{@link pt.isep.yamldslgen.github_actions.Concurrency#isCancelInProgress <em>Cancel In Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cancel In Progress</em>' attribute.
	 * @see #isCancelInProgress()
	 * @generated
	 */
	void setCancelInProgress(boolean value);

} // Concurrency
