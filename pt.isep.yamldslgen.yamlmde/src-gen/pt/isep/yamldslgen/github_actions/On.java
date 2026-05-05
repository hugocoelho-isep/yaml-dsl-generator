/**
 */
package pt.isep.yamldslgen.github_actions;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>On</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.yamldslgen.github_actions.On#getPush <em>Push</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.On#getPullRequest <em>Pull Request</em>}</li>
 * </ul>
 *
 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getOn()
 * @model
 * @generated
 */
public interface On extends EObject {
	/**
	 * Returns the value of the '<em><b>Push</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Push</em>' containment reference.
	 * @see #setPush(Push)
	 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getOn_Push()
	 * @model containment="true"
	 * @generated
	 */
	Push getPush();

	/**
	 * Sets the value of the '{@link pt.isep.yamldslgen.github_actions.On#getPush <em>Push</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Push</em>' containment reference.
	 * @see #getPush()
	 * @generated
	 */
	void setPush(Push value);

	/**
	 * Returns the value of the '<em><b>Pull Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pull Request</em>' containment reference.
	 * @see #setPullRequest(Pull_request)
	 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getOn_PullRequest()
	 * @model containment="true"
	 * @generated
	 */
	Pull_request getPullRequest();

	/**
	 * Sets the value of the '{@link pt.isep.yamldslgen.github_actions.On#getPullRequest <em>Pull Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pull Request</em>' containment reference.
	 * @see #getPullRequest()
	 * @generated
	 */
	void setPullRequest(Pull_request value);

} // On
