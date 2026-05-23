/**
 */
package pt.isep.yamldslgen.github_actions;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Github Actions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.yamldslgen.github_actions.GithubActions#getName <em>Name</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.GithubActions#getJobs <em>Jobs</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.GithubActions#getOn <em>On</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.GithubActions#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.GithubActions#getConcurrency <em>Concurrency</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.GithubActions#getDefaults <em>Defaults</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.GithubActions#getEnv <em>Env</em>}</li>
 * </ul>
 *
 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getGithubActions()
 * @model
 * @generated
 */
public interface GithubActions extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getGithubActions_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link pt.isep.yamldslgen.github_actions.GithubActions#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Jobs</b></em>' containment reference list.
	 * The list contents are of type {@link pt.isep.yamldslgen.github_actions.Job}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jobs</em>' containment reference list.
	 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getGithubActions_Jobs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Job> getJobs();

	/**
	 * Returns the value of the '<em><b>On</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On</em>' containment reference.
	 * @see #setOn(On)
	 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getGithubActions_On()
	 * @model containment="true" required="true"
	 * @generated
	 */
	On getOn();

	/**
	 * Sets the value of the '{@link pt.isep.yamldslgen.github_actions.GithubActions#getOn <em>On</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On</em>' containment reference.
	 * @see #getOn()
	 * @generated
	 */
	void setOn(On value);

	/**
	 * Returns the value of the '<em><b>Permissions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Permissions</em>' containment reference.
	 * @see #setPermissions(Permissions)
	 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getGithubActions_Permissions()
	 * @model containment="true"
	 * @generated
	 */
	Permissions getPermissions();

	/**
	 * Sets the value of the '{@link pt.isep.yamldslgen.github_actions.GithubActions#getPermissions <em>Permissions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Permissions</em>' containment reference.
	 * @see #getPermissions()
	 * @generated
	 */
	void setPermissions(Permissions value);

	/**
	 * Returns the value of the '<em><b>Concurrency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concurrency</em>' containment reference.
	 * @see #setConcurrency(Concurrency)
	 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getGithubActions_Concurrency()
	 * @model containment="true"
	 * @generated
	 */
	Concurrency getConcurrency();

	/**
	 * Sets the value of the '{@link pt.isep.yamldslgen.github_actions.GithubActions#getConcurrency <em>Concurrency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concurrency</em>' containment reference.
	 * @see #getConcurrency()
	 * @generated
	 */
	void setConcurrency(Concurrency value);

	/**
	 * Returns the value of the '<em><b>Defaults</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defaults</em>' containment reference.
	 * @see #setDefaults(Defaults)
	 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getGithubActions_Defaults()
	 * @model containment="true"
	 * @generated
	 */
	Defaults getDefaults();

	/**
	 * Sets the value of the '{@link pt.isep.yamldslgen.github_actions.GithubActions#getDefaults <em>Defaults</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defaults</em>' containment reference.
	 * @see #getDefaults()
	 * @generated
	 */
	void setDefaults(Defaults value);

	/**
	 * Returns the value of the '<em><b>Env</b></em>' containment reference list.
	 * The list contents are of type {@link pt.isep.yamldslgen.github_actions.KeyValuePair}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Env</em>' containment reference list.
	 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getGithubActions_Env()
	 * @model containment="true"
	 * @generated
	 */
	EList<KeyValuePair> getEnv();

} // GithubActions
