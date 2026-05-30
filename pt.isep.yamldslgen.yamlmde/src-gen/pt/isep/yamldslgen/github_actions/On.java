/**
 */
package pt.isep.yamldslgen.github_actions;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link pt.isep.yamldslgen.github_actions.On#getBranchProtectionRule <em>Branch Protection Rule</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.On#getPush <em>Push</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.On#getPullRequest <em>Pull Request</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.On#getSchedule <em>Schedule</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.On#getWorkflowDispatch <em>Workflow Dispatch</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.On#getWorkflowCall <em>Workflow Call</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.On#getPullRequestTarget <em>Pull Request Target</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.On#getRelease <em>Release</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.On#getIssues <em>Issues</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.On#getMergeGroup <em>Merge Group</em>}</li>
 * </ul>
 *
 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getOn()
 * @model
 * @generated
 */
public interface On extends EObject {
	/**
	 * Returns the value of the '<em><b>Branch Protection Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branch Protection Rule</em>' attribute.
	 * @see #setBranchProtectionRule(String)
	 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getOn_BranchProtectionRule()
	 * @model
	 * @generated
	 */
	String getBranchProtectionRule();

	/**
	 * Sets the value of the '{@link pt.isep.yamldslgen.github_actions.On#getBranchProtectionRule <em>Branch Protection Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Branch Protection Rule</em>' attribute.
	 * @see #getBranchProtectionRule()
	 * @generated
	 */
	void setBranchProtectionRule(String value);

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

	/**
	 * Returns the value of the '<em><b>Schedule</b></em>' containment reference list.
	 * The list contents are of type {@link pt.isep.yamldslgen.github_actions.Schedule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedule</em>' containment reference list.
	 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getOn_Schedule()
	 * @model containment="true"
	 * @generated
	 */
	EList<Schedule> getSchedule();

	/**
	 * Returns the value of the '<em><b>Workflow Dispatch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workflow Dispatch</em>' containment reference.
	 * @see #setWorkflowDispatch(Workflow_dispatch)
	 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getOn_WorkflowDispatch()
	 * @model containment="true"
	 * @generated
	 */
	Workflow_dispatch getWorkflowDispatch();

	/**
	 * Sets the value of the '{@link pt.isep.yamldslgen.github_actions.On#getWorkflowDispatch <em>Workflow Dispatch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workflow Dispatch</em>' containment reference.
	 * @see #getWorkflowDispatch()
	 * @generated
	 */
	void setWorkflowDispatch(Workflow_dispatch value);

	/**
	 * Returns the value of the '<em><b>Workflow Call</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workflow Call</em>' containment reference.
	 * @see #setWorkflowCall(Workflow_call)
	 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getOn_WorkflowCall()
	 * @model containment="true"
	 * @generated
	 */
	Workflow_call getWorkflowCall();

	/**
	 * Sets the value of the '{@link pt.isep.yamldslgen.github_actions.On#getWorkflowCall <em>Workflow Call</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workflow Call</em>' containment reference.
	 * @see #getWorkflowCall()
	 * @generated
	 */
	void setWorkflowCall(Workflow_call value);

	/**
	 * Returns the value of the '<em><b>Pull Request Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pull Request Target</em>' containment reference.
	 * @see #setPullRequestTarget(Pull_request)
	 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getOn_PullRequestTarget()
	 * @model containment="true"
	 * @generated
	 */
	Pull_request getPullRequestTarget();

	/**
	 * Sets the value of the '{@link pt.isep.yamldslgen.github_actions.On#getPullRequestTarget <em>Pull Request Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pull Request Target</em>' containment reference.
	 * @see #getPullRequestTarget()
	 * @generated
	 */
	void setPullRequestTarget(Pull_request value);

	/**
	 * Returns the value of the '<em><b>Release</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Release</em>' containment reference.
	 * @see #setRelease(Release)
	 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getOn_Release()
	 * @model containment="true"
	 * @generated
	 */
	Release getRelease();

	/**
	 * Sets the value of the '{@link pt.isep.yamldslgen.github_actions.On#getRelease <em>Release</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Release</em>' containment reference.
	 * @see #getRelease()
	 * @generated
	 */
	void setRelease(Release value);

	/**
	 * Returns the value of the '<em><b>Issues</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issues</em>' containment reference.
	 * @see #setIssues(Issues)
	 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getOn_Issues()
	 * @model containment="true"
	 * @generated
	 */
	Issues getIssues();

	/**
	 * Sets the value of the '{@link pt.isep.yamldslgen.github_actions.On#getIssues <em>Issues</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issues</em>' containment reference.
	 * @see #getIssues()
	 * @generated
	 */
	void setIssues(Issues value);

	/**
	 * Returns the value of the '<em><b>Merge Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Merge Group</em>' containment reference.
	 * @see #setMergeGroup(Merge_group)
	 * @see pt.isep.yamldslgen.github_actions.YamlmdePackage#getOn_MergeGroup()
	 * @model containment="true"
	 * @generated
	 */
	Merge_group getMergeGroup();

	/**
	 * Sets the value of the '{@link pt.isep.yamldslgen.github_actions.On#getMergeGroup <em>Merge Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Merge Group</em>' containment reference.
	 * @see #getMergeGroup()
	 * @generated
	 */
	void setMergeGroup(Merge_group value);

} // On
