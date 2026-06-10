/**
 */
package pt.isep.yamldslgen.github_actions.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pt.isep.yamldslgen.github_actions.PermissionsObject;
import pt.isep.yamldslgen.github_actions.YamlmdePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Permissions Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.PermissionsObjectImpl#getContents <em>Contents</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.PermissionsObjectImpl#getSecurityEvents <em>Security Events</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.PermissionsObjectImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.PermissionsObjectImpl#getPages <em>Pages</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.PermissionsObjectImpl#getIdToken <em>Id Token</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.PermissionsObjectImpl#getPullRequests <em>Pull Requests</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.PermissionsObjectImpl#getIssues <em>Issues</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.PermissionsObjectImpl#getPackages <em>Packages</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.PermissionsObjectImpl#getModels <em>Models</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.PermissionsObjectImpl#getChecks <em>Checks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PermissionsObjectImpl extends PermissionsImpl implements PermissionsObject {
	/**
	 * The default value of the '{@link #getContents() <em>Contents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContents()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContents() <em>Contents</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContents()
	 * @generated
	 * @ordered
	 */
	protected String contents = CONTENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSecurityEvents() <em>Security Events</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityEvents()
	 * @generated
	 * @ordered
	 */
	protected static final String SECURITY_EVENTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecurityEvents() <em>Security Events</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityEvents()
	 * @generated
	 * @ordered
	 */
	protected String securityEvents = SECURITY_EVENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getActions() <em>Actions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected String actions = ACTIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPages() <em>Pages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPages()
	 * @generated
	 * @ordered
	 */
	protected static final String PAGES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPages() <em>Pages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPages()
	 * @generated
	 * @ordered
	 */
	protected String pages = PAGES_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdToken() <em>Id Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdToken()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_TOKEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdToken() <em>Id Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdToken()
	 * @generated
	 * @ordered
	 */
	protected String idToken = ID_TOKEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getPullRequests() <em>Pull Requests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPullRequests()
	 * @generated
	 * @ordered
	 */
	protected static final String PULL_REQUESTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPullRequests() <em>Pull Requests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPullRequests()
	 * @generated
	 * @ordered
	 */
	protected String pullRequests = PULL_REQUESTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getIssues() <em>Issues</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssues()
	 * @generated
	 * @ordered
	 */
	protected static final String ISSUES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIssues() <em>Issues</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssues()
	 * @generated
	 * @ordered
	 */
	protected String issues = ISSUES_EDEFAULT;

	/**
	 * The default value of the '{@link #getPackages() <em>Packages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackages()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKAGES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPackages() <em>Packages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackages()
	 * @generated
	 * @ordered
	 */
	protected String packages = PACKAGES_EDEFAULT;

	/**
	 * The default value of the '{@link #getModels() <em>Models</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModels()
	 * @generated
	 * @ordered
	 */
	protected static final String MODELS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModels() <em>Models</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModels()
	 * @generated
	 * @ordered
	 */
	protected String models = MODELS_EDEFAULT;

	/**
	 * The default value of the '{@link #getChecks() <em>Checks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChecks()
	 * @generated
	 * @ordered
	 */
	protected static final String CHECKS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChecks() <em>Checks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChecks()
	 * @generated
	 * @ordered
	 */
	protected String checks = CHECKS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PermissionsObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return YamlmdePackage.Literals.PERMISSIONS_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContents() {
		return contents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContents(String newContents) {
		String oldContents = contents;
		contents = newContents;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YamlmdePackage.PERMISSIONS_OBJECT__CONTENTS,
					oldContents, contents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSecurityEvents() {
		return securityEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecurityEvents(String newSecurityEvents) {
		String oldSecurityEvents = securityEvents;
		securityEvents = newSecurityEvents;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YamlmdePackage.PERMISSIONS_OBJECT__SECURITY_EVENTS,
					oldSecurityEvents, securityEvents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getActions() {
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActions(String newActions) {
		String oldActions = actions;
		actions = newActions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YamlmdePackage.PERMISSIONS_OBJECT__ACTIONS,
					oldActions, actions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPages() {
		return pages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPages(String newPages) {
		String oldPages = pages;
		pages = newPages;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YamlmdePackage.PERMISSIONS_OBJECT__PAGES, oldPages,
					pages));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIdToken() {
		return idToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdToken(String newIdToken) {
		String oldIdToken = idToken;
		idToken = newIdToken;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YamlmdePackage.PERMISSIONS_OBJECT__ID_TOKEN,
					oldIdToken, idToken));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPullRequests() {
		return pullRequests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPullRequests(String newPullRequests) {
		String oldPullRequests = pullRequests;
		pullRequests = newPullRequests;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YamlmdePackage.PERMISSIONS_OBJECT__PULL_REQUESTS,
					oldPullRequests, pullRequests));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIssues() {
		return issues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIssues(String newIssues) {
		String oldIssues = issues;
		issues = newIssues;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YamlmdePackage.PERMISSIONS_OBJECT__ISSUES, oldIssues,
					issues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPackages() {
		return packages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPackages(String newPackages) {
		String oldPackages = packages;
		packages = newPackages;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YamlmdePackage.PERMISSIONS_OBJECT__PACKAGES,
					oldPackages, packages));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getModels() {
		return models;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModels(String newModels) {
		String oldModels = models;
		models = newModels;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YamlmdePackage.PERMISSIONS_OBJECT__MODELS, oldModels,
					models));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getChecks() {
		return checks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChecks(String newChecks) {
		String oldChecks = checks;
		checks = newChecks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YamlmdePackage.PERMISSIONS_OBJECT__CHECKS, oldChecks,
					checks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case YamlmdePackage.PERMISSIONS_OBJECT__CONTENTS:
			return getContents();
		case YamlmdePackage.PERMISSIONS_OBJECT__SECURITY_EVENTS:
			return getSecurityEvents();
		case YamlmdePackage.PERMISSIONS_OBJECT__ACTIONS:
			return getActions();
		case YamlmdePackage.PERMISSIONS_OBJECT__PAGES:
			return getPages();
		case YamlmdePackage.PERMISSIONS_OBJECT__ID_TOKEN:
			return getIdToken();
		case YamlmdePackage.PERMISSIONS_OBJECT__PULL_REQUESTS:
			return getPullRequests();
		case YamlmdePackage.PERMISSIONS_OBJECT__ISSUES:
			return getIssues();
		case YamlmdePackage.PERMISSIONS_OBJECT__PACKAGES:
			return getPackages();
		case YamlmdePackage.PERMISSIONS_OBJECT__MODELS:
			return getModels();
		case YamlmdePackage.PERMISSIONS_OBJECT__CHECKS:
			return getChecks();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case YamlmdePackage.PERMISSIONS_OBJECT__CONTENTS:
			setContents((String) newValue);
			return;
		case YamlmdePackage.PERMISSIONS_OBJECT__SECURITY_EVENTS:
			setSecurityEvents((String) newValue);
			return;
		case YamlmdePackage.PERMISSIONS_OBJECT__ACTIONS:
			setActions((String) newValue);
			return;
		case YamlmdePackage.PERMISSIONS_OBJECT__PAGES:
			setPages((String) newValue);
			return;
		case YamlmdePackage.PERMISSIONS_OBJECT__ID_TOKEN:
			setIdToken((String) newValue);
			return;
		case YamlmdePackage.PERMISSIONS_OBJECT__PULL_REQUESTS:
			setPullRequests((String) newValue);
			return;
		case YamlmdePackage.PERMISSIONS_OBJECT__ISSUES:
			setIssues((String) newValue);
			return;
		case YamlmdePackage.PERMISSIONS_OBJECT__PACKAGES:
			setPackages((String) newValue);
			return;
		case YamlmdePackage.PERMISSIONS_OBJECT__MODELS:
			setModels((String) newValue);
			return;
		case YamlmdePackage.PERMISSIONS_OBJECT__CHECKS:
			setChecks((String) newValue);
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
		case YamlmdePackage.PERMISSIONS_OBJECT__CONTENTS:
			setContents(CONTENTS_EDEFAULT);
			return;
		case YamlmdePackage.PERMISSIONS_OBJECT__SECURITY_EVENTS:
			setSecurityEvents(SECURITY_EVENTS_EDEFAULT);
			return;
		case YamlmdePackage.PERMISSIONS_OBJECT__ACTIONS:
			setActions(ACTIONS_EDEFAULT);
			return;
		case YamlmdePackage.PERMISSIONS_OBJECT__PAGES:
			setPages(PAGES_EDEFAULT);
			return;
		case YamlmdePackage.PERMISSIONS_OBJECT__ID_TOKEN:
			setIdToken(ID_TOKEN_EDEFAULT);
			return;
		case YamlmdePackage.PERMISSIONS_OBJECT__PULL_REQUESTS:
			setPullRequests(PULL_REQUESTS_EDEFAULT);
			return;
		case YamlmdePackage.PERMISSIONS_OBJECT__ISSUES:
			setIssues(ISSUES_EDEFAULT);
			return;
		case YamlmdePackage.PERMISSIONS_OBJECT__PACKAGES:
			setPackages(PACKAGES_EDEFAULT);
			return;
		case YamlmdePackage.PERMISSIONS_OBJECT__MODELS:
			setModels(MODELS_EDEFAULT);
			return;
		case YamlmdePackage.PERMISSIONS_OBJECT__CHECKS:
			setChecks(CHECKS_EDEFAULT);
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
		case YamlmdePackage.PERMISSIONS_OBJECT__CONTENTS:
			return CONTENTS_EDEFAULT == null ? contents != null : !CONTENTS_EDEFAULT.equals(contents);
		case YamlmdePackage.PERMISSIONS_OBJECT__SECURITY_EVENTS:
			return SECURITY_EVENTS_EDEFAULT == null ? securityEvents != null
					: !SECURITY_EVENTS_EDEFAULT.equals(securityEvents);
		case YamlmdePackage.PERMISSIONS_OBJECT__ACTIONS:
			return ACTIONS_EDEFAULT == null ? actions != null : !ACTIONS_EDEFAULT.equals(actions);
		case YamlmdePackage.PERMISSIONS_OBJECT__PAGES:
			return PAGES_EDEFAULT == null ? pages != null : !PAGES_EDEFAULT.equals(pages);
		case YamlmdePackage.PERMISSIONS_OBJECT__ID_TOKEN:
			return ID_TOKEN_EDEFAULT == null ? idToken != null : !ID_TOKEN_EDEFAULT.equals(idToken);
		case YamlmdePackage.PERMISSIONS_OBJECT__PULL_REQUESTS:
			return PULL_REQUESTS_EDEFAULT == null ? pullRequests != null : !PULL_REQUESTS_EDEFAULT.equals(pullRequests);
		case YamlmdePackage.PERMISSIONS_OBJECT__ISSUES:
			return ISSUES_EDEFAULT == null ? issues != null : !ISSUES_EDEFAULT.equals(issues);
		case YamlmdePackage.PERMISSIONS_OBJECT__PACKAGES:
			return PACKAGES_EDEFAULT == null ? packages != null : !PACKAGES_EDEFAULT.equals(packages);
		case YamlmdePackage.PERMISSIONS_OBJECT__MODELS:
			return MODELS_EDEFAULT == null ? models != null : !MODELS_EDEFAULT.equals(models);
		case YamlmdePackage.PERMISSIONS_OBJECT__CHECKS:
			return CHECKS_EDEFAULT == null ? checks != null : !CHECKS_EDEFAULT.equals(checks);
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
		result.append(" (contents: ");
		result.append(contents);
		result.append(", securityEvents: ");
		result.append(securityEvents);
		result.append(", actions: ");
		result.append(actions);
		result.append(", pages: ");
		result.append(pages);
		result.append(", idToken: ");
		result.append(idToken);
		result.append(", pullRequests: ");
		result.append(pullRequests);
		result.append(", issues: ");
		result.append(issues);
		result.append(", packages: ");
		result.append(packages);
		result.append(", models: ");
		result.append(models);
		result.append(", checks: ");
		result.append(checks);
		result.append(')');
		return result.toString();
	}

} //PermissionsObjectImpl
