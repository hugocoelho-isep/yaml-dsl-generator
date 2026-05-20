/**
 */
package pt.isep.yamldslgen.github_actions;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Job</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.yamldslgen.github_actions.Job#getId <em>Id</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.Job#getRunsOn <em>Runs On</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.Job#getName <em>Name</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.Job#getNeeds <em>Needs</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.Job#getSteps <em>Steps</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.Job#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.Job#getEnvironment <em>Environment</em>}</li>
 * </ul>
 *
 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getJob()
 * @model
 * @generated
 */
public interface Job extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getJob_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link pt.isep.yamldslgen.github_actions.Job#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Runs On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runs On</em>' attribute.
	 * @see #setRunsOn(String)
	 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getJob_RunsOn()
	 * @model required="true"
	 * @generated
	 */
	String getRunsOn();

	/**
	 * Sets the value of the '{@link pt.isep.yamldslgen.github_actions.Job#getRunsOn <em>Runs On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runs On</em>' attribute.
	 * @see #getRunsOn()
	 * @generated
	 */
	void setRunsOn(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getJob_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pt.isep.yamldslgen.github_actions.Job#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Needs</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Needs</em>' attribute list.
	 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getJob_Needs()
	 * @model
	 * @generated
	 */
	EList<String> getNeeds();

	/**
	 * Returns the value of the '<em><b>Steps</b></em>' containment reference list.
	 * The list contents are of type {@link pt.isep.yamldslgen.github_actions.Step}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps</em>' containment reference list.
	 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getJob_Steps()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Step> getSteps();

	/**
	 * Returns the value of the '<em><b>Environment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' containment reference.
	 * @see #setEnvironment(Environment)
	 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getJob_Environment()
	 * @model containment="true"
	 * @generated
	 */
	Environment getEnvironment();

	/**
	 * Sets the value of the '{@link pt.isep.yamldslgen.github_actions.Job#getEnvironment <em>Environment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment</em>' containment reference.
	 * @see #getEnvironment()
	 * @generated
	 */
	void setEnvironment(Environment value);

	/**
	 * Returns the value of the '<em><b>Permissions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permissions</em>' containment reference.
	 * @see #setPermissions(Permissions)
	 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getJob_Permissions()
	 * @model containment="true"
	 * @generated
	 */
	Permissions getPermissions();

	/**
	 * Sets the value of the '{@link pt.isep.yamldslgen.github_actions.Job#getPermissions <em>Permissions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Permissions</em>' containment reference.
	 * @see #getPermissions()
	 * @generated
	 */
	void setPermissions(Permissions value);

} // Job
