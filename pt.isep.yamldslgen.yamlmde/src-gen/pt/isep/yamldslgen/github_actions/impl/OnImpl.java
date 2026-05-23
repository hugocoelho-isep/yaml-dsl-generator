/**
 */
package pt.isep.yamldslgen.github_actions.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pt.isep.yamldslgen.github_actions.Issues;
import pt.isep.yamldslgen.github_actions.Merge_group;
import pt.isep.yamldslgen.github_actions.On;
import pt.isep.yamldslgen.github_actions.Pull_request;
import pt.isep.yamldslgen.github_actions.Push;
import pt.isep.yamldslgen.github_actions.Release;
import pt.isep.yamldslgen.github_actions.Schedule;
import pt.isep.yamldslgen.github_actions.Workflow_call;
import pt.isep.yamldslgen.github_actions.Workflow_dispatch;
import pt.isep.yamldslgen.github_actions.YamlmdePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>On</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.OnImpl#getBranchProtectionRule <em>Branch Protection Rule</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.OnImpl#getPush <em>Push</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.OnImpl#getPullRequest <em>Pull Request</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.OnImpl#getSchedule <em>Schedule</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.OnImpl#getWorkflowDispatch <em>Workflow Dispatch</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.OnImpl#getWorkflowCall <em>Workflow Call</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.OnImpl#getPullRequestTarget <em>Pull Request Target</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.OnImpl#getRelease <em>Release</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.OnImpl#getIssues <em>Issues</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.OnImpl#getMergeGroup <em>Merge Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OnImpl extends MinimalEObjectImpl.Container implements On {
	/**
	 * The default value of the '{@link #getBranchProtectionRule() <em>Branch Protection Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBranchProtectionRule()
	 * @generated
	 * @ordered
	 */
	protected static final String BRANCH_PROTECTION_RULE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBranchProtectionRule() <em>Branch Protection Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBranchProtectionRule()
	 * @generated
	 * @ordered
	 */
	protected String branchProtectionRule = BRANCH_PROTECTION_RULE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPush() <em>Push</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPush()
	 * @generated
	 * @ordered
	 */
	protected Push push;

	/**
	 * The cached value of the '{@link #getPullRequest() <em>Pull Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPullRequest()
	 * @generated
	 * @ordered
	 */
	protected Pull_request pullRequest;

	/**
	 * The cached value of the '{@link #getSchedule() <em>Schedule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedule()
	 * @generated
	 * @ordered
	 */
	protected EList<Schedule> schedule;

	/**
	 * The cached value of the '{@link #getWorkflowDispatch() <em>Workflow Dispatch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkflowDispatch()
	 * @generated
	 * @ordered
	 */
	protected Workflow_dispatch workflowDispatch;

	/**
	 * The cached value of the '{@link #getWorkflowCall() <em>Workflow Call</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkflowCall()
	 * @generated
	 * @ordered
	 */
	protected Workflow_call workflowCall;

	/**
	 * The cached value of the '{@link #getPullRequestTarget() <em>Pull Request Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPullRequestTarget()
	 * @generated
	 * @ordered
	 */
	protected Pull_request pullRequestTarget;

	/**
	 * The cached value of the '{@link #getRelease() <em>Release</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelease()
	 * @generated
	 * @ordered
	 */
	protected Release release;

	/**
	 * The cached value of the '{@link #getIssues() <em>Issues</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssues()
	 * @generated
	 * @ordered
	 */
	protected Issues issues;

	/**
	 * The cached value of the '{@link #getMergeGroup() <em>Merge Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMergeGroup()
	 * @generated
	 * @ordered
	 */
	protected Merge_group mergeGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return YamlmdePackage.Literals.ON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBranchProtectionRule() {
		return branchProtectionRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBranchProtectionRule(String newBranchProtectionRule) {
		String oldBranchProtectionRule = branchProtectionRule;
		branchProtectionRule = newBranchProtectionRule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YamlmdePackage.ON__BRANCH_PROTECTION_RULE,
					oldBranchProtectionRule, branchProtectionRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Issues getIssues() {
		return issues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIssues(Issues newIssues, NotificationChain msgs) {
		Issues oldIssues = issues;
		issues = newIssues;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, YamlmdePackage.ON__ISSUES,
					oldIssues, newIssues);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIssues(Issues newIssues) {
		if (newIssues != issues) {
			NotificationChain msgs = null;
			if (issues != null)
				msgs = ((InternalEObject) issues).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - YamlmdePackage.ON__ISSUES, null, msgs);
			if (newIssues != null)
				msgs = ((InternalEObject) newIssues).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - YamlmdePackage.ON__ISSUES, null, msgs);
			msgs = basicSetIssues(newIssues, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YamlmdePackage.ON__ISSUES, newIssues, newIssues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Push getPush() {
		return push;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPush(Push newPush, NotificationChain msgs) {
		Push oldPush = push;
		push = newPush;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, YamlmdePackage.ON__PUSH,
					oldPush, newPush);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPush(Push newPush) {
		if (newPush != push) {
			NotificationChain msgs = null;
			if (push != null)
				msgs = ((InternalEObject) push).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - YamlmdePackage.ON__PUSH,
						null, msgs);
			if (newPush != null)
				msgs = ((InternalEObject) newPush).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - YamlmdePackage.ON__PUSH,
						null, msgs);
			msgs = basicSetPush(newPush, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YamlmdePackage.ON__PUSH, newPush, newPush));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pull_request getPullRequest() {
		return pullRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPullRequest(Pull_request newPullRequest, NotificationChain msgs) {
		Pull_request oldPullRequest = pullRequest;
		pullRequest = newPullRequest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					YamlmdePackage.ON__PULL_REQUEST, oldPullRequest, newPullRequest);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPullRequest(Pull_request newPullRequest) {
		if (newPullRequest != pullRequest) {
			NotificationChain msgs = null;
			if (pullRequest != null)
				msgs = ((InternalEObject) pullRequest).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - YamlmdePackage.ON__PULL_REQUEST, null, msgs);
			if (newPullRequest != null)
				msgs = ((InternalEObject) newPullRequest).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - YamlmdePackage.ON__PULL_REQUEST, null, msgs);
			msgs = basicSetPullRequest(newPullRequest, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YamlmdePackage.ON__PULL_REQUEST, newPullRequest,
					newPullRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Schedule> getSchedule() {
		if (schedule == null) {
			schedule = new EObjectContainmentEList<Schedule>(Schedule.class, this, YamlmdePackage.ON__SCHEDULE);
		}
		return schedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Workflow_dispatch getWorkflowDispatch() {
		return workflowDispatch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWorkflowDispatch(Workflow_dispatch newWorkflowDispatch, NotificationChain msgs) {
		Workflow_dispatch oldWorkflowDispatch = workflowDispatch;
		workflowDispatch = newWorkflowDispatch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					YamlmdePackage.ON__WORKFLOW_DISPATCH, oldWorkflowDispatch, newWorkflowDispatch);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkflowDispatch(Workflow_dispatch newWorkflowDispatch) {
		if (newWorkflowDispatch != workflowDispatch) {
			NotificationChain msgs = null;
			if (workflowDispatch != null)
				msgs = ((InternalEObject) workflowDispatch).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - YamlmdePackage.ON__WORKFLOW_DISPATCH, null, msgs);
			if (newWorkflowDispatch != null)
				msgs = ((InternalEObject) newWorkflowDispatch).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - YamlmdePackage.ON__WORKFLOW_DISPATCH, null, msgs);
			msgs = basicSetWorkflowDispatch(newWorkflowDispatch, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YamlmdePackage.ON__WORKFLOW_DISPATCH,
					newWorkflowDispatch, newWorkflowDispatch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Workflow_call getWorkflowCall() {
		return workflowCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWorkflowCall(Workflow_call newWorkflowCall, NotificationChain msgs) {
		Workflow_call oldWorkflowCall = workflowCall;
		workflowCall = newWorkflowCall;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					YamlmdePackage.ON__WORKFLOW_CALL, oldWorkflowCall, newWorkflowCall);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkflowCall(Workflow_call newWorkflowCall) {
		if (newWorkflowCall != workflowCall) {
			NotificationChain msgs = null;
			if (workflowCall != null)
				msgs = ((InternalEObject) workflowCall).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - YamlmdePackage.ON__WORKFLOW_CALL, null, msgs);
			if (newWorkflowCall != null)
				msgs = ((InternalEObject) newWorkflowCall).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - YamlmdePackage.ON__WORKFLOW_CALL, null, msgs);
			msgs = basicSetWorkflowCall(newWorkflowCall, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YamlmdePackage.ON__WORKFLOW_CALL, newWorkflowCall,
					newWorkflowCall));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pull_request getPullRequestTarget() {
		return pullRequestTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPullRequestTarget(Pull_request newPullRequestTarget, NotificationChain msgs) {
		Pull_request oldPullRequestTarget = pullRequestTarget;
		pullRequestTarget = newPullRequestTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					YamlmdePackage.ON__PULL_REQUEST_TARGET, oldPullRequestTarget, newPullRequestTarget);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPullRequestTarget(Pull_request newPullRequestTarget) {
		if (newPullRequestTarget != pullRequestTarget) {
			NotificationChain msgs = null;
			if (pullRequestTarget != null)
				msgs = ((InternalEObject) pullRequestTarget).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - YamlmdePackage.ON__PULL_REQUEST_TARGET, null, msgs);
			if (newPullRequestTarget != null)
				msgs = ((InternalEObject) newPullRequestTarget).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - YamlmdePackage.ON__PULL_REQUEST_TARGET, null, msgs);
			msgs = basicSetPullRequestTarget(newPullRequestTarget, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YamlmdePackage.ON__PULL_REQUEST_TARGET,
					newPullRequestTarget, newPullRequestTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Release getRelease() {
		return release;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelease(Release newRelease, NotificationChain msgs) {
		Release oldRelease = release;
		release = newRelease;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, YamlmdePackage.ON__RELEASE,
					oldRelease, newRelease);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelease(Release newRelease) {
		if (newRelease != release) {
			NotificationChain msgs = null;
			if (release != null)
				msgs = ((InternalEObject) release).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - YamlmdePackage.ON__RELEASE, null, msgs);
			if (newRelease != null)
				msgs = ((InternalEObject) newRelease).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - YamlmdePackage.ON__RELEASE, null, msgs);
			msgs = basicSetRelease(newRelease, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YamlmdePackage.ON__RELEASE, newRelease, newRelease));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Merge_group getMergeGroup() {
		return mergeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMergeGroup(Merge_group newMergeGroup, NotificationChain msgs) {
		Merge_group oldMergeGroup = mergeGroup;
		mergeGroup = newMergeGroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					YamlmdePackage.ON__MERGE_GROUP, oldMergeGroup, newMergeGroup);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMergeGroup(Merge_group newMergeGroup) {
		if (newMergeGroup != mergeGroup) {
			NotificationChain msgs = null;
			if (mergeGroup != null)
				msgs = ((InternalEObject) mergeGroup).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - YamlmdePackage.ON__MERGE_GROUP, null, msgs);
			if (newMergeGroup != null)
				msgs = ((InternalEObject) newMergeGroup).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - YamlmdePackage.ON__MERGE_GROUP, null, msgs);
			msgs = basicSetMergeGroup(newMergeGroup, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YamlmdePackage.ON__MERGE_GROUP, newMergeGroup,
					newMergeGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case YamlmdePackage.ON__PUSH:
			return basicSetPush(null, msgs);
		case YamlmdePackage.ON__PULL_REQUEST:
			return basicSetPullRequest(null, msgs);
		case YamlmdePackage.ON__SCHEDULE:
			return ((InternalEList<?>) getSchedule()).basicRemove(otherEnd, msgs);
		case YamlmdePackage.ON__WORKFLOW_DISPATCH:
			return basicSetWorkflowDispatch(null, msgs);
		case YamlmdePackage.ON__WORKFLOW_CALL:
			return basicSetWorkflowCall(null, msgs);
		case YamlmdePackage.ON__PULL_REQUEST_TARGET:
			return basicSetPullRequestTarget(null, msgs);
		case YamlmdePackage.ON__RELEASE:
			return basicSetRelease(null, msgs);
		case YamlmdePackage.ON__ISSUES:
			return basicSetIssues(null, msgs);
		case YamlmdePackage.ON__MERGE_GROUP:
			return basicSetMergeGroup(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case YamlmdePackage.ON__BRANCH_PROTECTION_RULE:
			return getBranchProtectionRule();
		case YamlmdePackage.ON__PUSH:
			return getPush();
		case YamlmdePackage.ON__PULL_REQUEST:
			return getPullRequest();
		case YamlmdePackage.ON__SCHEDULE:
			return getSchedule();
		case YamlmdePackage.ON__WORKFLOW_DISPATCH:
			return getWorkflowDispatch();
		case YamlmdePackage.ON__WORKFLOW_CALL:
			return getWorkflowCall();
		case YamlmdePackage.ON__PULL_REQUEST_TARGET:
			return getPullRequestTarget();
		case YamlmdePackage.ON__RELEASE:
			return getRelease();
		case YamlmdePackage.ON__ISSUES:
			return getIssues();
		case YamlmdePackage.ON__MERGE_GROUP:
			return getMergeGroup();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case YamlmdePackage.ON__BRANCH_PROTECTION_RULE:
			setBranchProtectionRule((String) newValue);
			return;
		case YamlmdePackage.ON__PUSH:
			setPush((Push) newValue);
			return;
		case YamlmdePackage.ON__PULL_REQUEST:
			setPullRequest((Pull_request) newValue);
			return;
		case YamlmdePackage.ON__SCHEDULE:
			getSchedule().clear();
			getSchedule().addAll((Collection<? extends Schedule>) newValue);
			return;
		case YamlmdePackage.ON__WORKFLOW_DISPATCH:
			setWorkflowDispatch((Workflow_dispatch) newValue);
			return;
		case YamlmdePackage.ON__WORKFLOW_CALL:
			setWorkflowCall((Workflow_call) newValue);
			return;
		case YamlmdePackage.ON__PULL_REQUEST_TARGET:
			setPullRequestTarget((Pull_request) newValue);
			return;
		case YamlmdePackage.ON__RELEASE:
			setRelease((Release) newValue);
			return;
		case YamlmdePackage.ON__ISSUES:
			setIssues((Issues) newValue);
			return;
		case YamlmdePackage.ON__MERGE_GROUP:
			setMergeGroup((Merge_group) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case YamlmdePackage.ON__BRANCH_PROTECTION_RULE:
			setBranchProtectionRule(BRANCH_PROTECTION_RULE_EDEFAULT);
			return;
		case YamlmdePackage.ON__PUSH:
			setPush((Push) null);
			return;
		case YamlmdePackage.ON__PULL_REQUEST:
			setPullRequest((Pull_request) null);
			return;
		case YamlmdePackage.ON__SCHEDULE:
			getSchedule().clear();
			return;
		case YamlmdePackage.ON__WORKFLOW_DISPATCH:
			setWorkflowDispatch((Workflow_dispatch) null);
			return;
		case YamlmdePackage.ON__WORKFLOW_CALL:
			setWorkflowCall((Workflow_call) null);
			return;
		case YamlmdePackage.ON__PULL_REQUEST_TARGET:
			setPullRequestTarget((Pull_request) null);
			return;
		case YamlmdePackage.ON__RELEASE:
			setRelease((Release) null);
			return;
		case YamlmdePackage.ON__ISSUES:
			setIssues((Issues) null);
			return;
		case YamlmdePackage.ON__MERGE_GROUP:
			setMergeGroup((Merge_group) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case YamlmdePackage.ON__BRANCH_PROTECTION_RULE:
			return BRANCH_PROTECTION_RULE_EDEFAULT == null ? branchProtectionRule != null
					: !BRANCH_PROTECTION_RULE_EDEFAULT.equals(branchProtectionRule);
		case YamlmdePackage.ON__PUSH:
			return push != null;
		case YamlmdePackage.ON__PULL_REQUEST:
			return pullRequest != null;
		case YamlmdePackage.ON__SCHEDULE:
			return schedule != null && !schedule.isEmpty();
		case YamlmdePackage.ON__WORKFLOW_DISPATCH:
			return workflowDispatch != null;
		case YamlmdePackage.ON__WORKFLOW_CALL:
			return workflowCall != null;
		case YamlmdePackage.ON__PULL_REQUEST_TARGET:
			return pullRequestTarget != null;
		case YamlmdePackage.ON__RELEASE:
			return release != null;
		case YamlmdePackage.ON__ISSUES:
			return issues != null;
		case YamlmdePackage.ON__MERGE_GROUP:
			return mergeGroup != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (branchProtectionRule: ");
		result.append(branchProtectionRule);
		result.append(')');
		return result.toString();
	}

} //OnImpl
