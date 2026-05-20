/**
 */
package pt.isep.yamldslgen.github_actions;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link pt.isep.yamldslgen.github_actions.Step#getId <em>Id</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.Step#getIf <em>If</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.Step#getWorkingDirectory <em>Working Directory</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.Step#getShell <em>Shell</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.Step#getEnv <em>Env</em>}</li>
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
	 * @model
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
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getStep_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link pt.isep.yamldslgen.github_actions.Step#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>If</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If</em>' attribute.
	 * @see #setIf(String)
	 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getStep_If()
	 * @model
	 * @generated
	 */
	String getIf();

	/**
	 * Sets the value of the '{@link pt.isep.yamldslgen.github_actions.Step#getIf <em>If</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If</em>' attribute.
	 * @see #getIf()
	 * @generated
	 */
	void setIf(String value);

	/**
	 * Returns the value of the '<em><b>Working Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Working Directory</em>' attribute.
	 * @see #setWorkingDirectory(String)
	 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getStep_WorkingDirectory()
	 * @model
	 * @generated
	 */
	String getWorkingDirectory();

	/**
	 * Sets the value of the '{@link pt.isep.yamldslgen.github_actions.Step#getWorkingDirectory <em>Working Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Working Directory</em>' attribute.
	 * @see #getWorkingDirectory()
	 * @generated
	 */
	void setWorkingDirectory(String value);

	/**
	 * Returns the value of the '<em><b>Shell</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shell</em>' attribute.
	 * @see #setShell(String)
	 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getStep_Shell()
	 * @model
	 * @generated
	 */
	String getShell();

	/**
	 * Sets the value of the '{@link pt.isep.yamldslgen.github_actions.Step#getShell <em>Shell</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shell</em>' attribute.
	 * @see #getShell()
	 * @generated
	 */
	void setShell(String value);

	/**
	 * Returns the value of the '<em><b>With</b></em>' containment reference list.
	 * The list contents are of type {@link pt.isep.yamldslgen.github_actions.KeyValuePair}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>With</em>' containment reference list.
	 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getStep_With()
	 * @model containment="true"
	 * @generated
	 */
	EList<KeyValuePair> getWith();

	/**
	 * Returns the value of the '<em><b>Env</b></em>' containment reference list.
	 * The list contents are of type {@link pt.isep.yamldslgen.github_actions.KeyValuePair}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Env</em>' containment reference list.
	 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getStep_Env()
	 * @model containment="true"
	 * @generated
	 */
	EList<KeyValuePair> getEnv();

} // Step
