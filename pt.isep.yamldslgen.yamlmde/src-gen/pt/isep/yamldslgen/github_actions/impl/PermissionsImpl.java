/**
 */
package pt.isep.yamldslgen.github_actions.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import pt.isep.yamldslgen.github_actions.Permissions;
import pt.isep.yamldslgen.github_actions.YamlmdePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Permissions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.PermissionsImpl#getContents <em>Contents</em>}</li>
<<<<<<< Updated upstream
=======
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.PermissionsImpl#getSecurityEvents <em>Security Events</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.PermissionsImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.PermissionsImpl#getPages <em>Pages</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.PermissionsImpl#getIdToken <em>Id Token</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.PermissionsImpl#getPullRequests <em>Pull Requests</em>}</li>
>>>>>>> Stashed changes
 * </ul>
 *
 * @generated
 */
public class PermissionsImpl extends MinimalEObjectImpl.Container implements Permissions {
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
<<<<<<< Updated upstream
=======
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
>>>>>>> Stashed changes
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PermissionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return YamlmdePackage.Literals.PERMISSIONS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, YamlmdePackage.PERMISSIONS__CONTENTS, oldContents,
					contents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
<<<<<<< Updated upstream
=======
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
			eNotify(new ENotificationImpl(this, Notification.SET, YamlmdePackage.PERMISSIONS__SECURITY_EVENTS,
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
			eNotify(new ENotificationImpl(this, Notification.SET, YamlmdePackage.PERMISSIONS__ACTIONS, oldActions,
					actions));
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
			eNotify(new ENotificationImpl(this, Notification.SET, YamlmdePackage.PERMISSIONS__PAGES, oldPages, pages));
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
			eNotify(new ENotificationImpl(this, Notification.SET, YamlmdePackage.PERMISSIONS__ID_TOKEN, oldIdToken,
					idToken));
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
			eNotify(new ENotificationImpl(this, Notification.SET, YamlmdePackage.PERMISSIONS__PULL_REQUESTS,
					oldPullRequests, pullRequests));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
>>>>>>> Stashed changes
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case YamlmdePackage.PERMISSIONS__CONTENTS:
			return getContents();
<<<<<<< Updated upstream
=======
		case YamlmdePackage.PERMISSIONS__SECURITY_EVENTS:
			return getSecurityEvents();
		case YamlmdePackage.PERMISSIONS__ACTIONS:
			return getActions();
		case YamlmdePackage.PERMISSIONS__PAGES:
			return getPages();
		case YamlmdePackage.PERMISSIONS__ID_TOKEN:
			return getIdToken();
		case YamlmdePackage.PERMISSIONS__PULL_REQUESTS:
			return getPullRequests();
>>>>>>> Stashed changes
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
		case YamlmdePackage.PERMISSIONS__CONTENTS:
			setContents((String) newValue);
			return;
<<<<<<< Updated upstream
=======
		case YamlmdePackage.PERMISSIONS__SECURITY_EVENTS:
			setSecurityEvents((String) newValue);
			return;
		case YamlmdePackage.PERMISSIONS__ACTIONS:
			setActions((String) newValue);
			return;
		case YamlmdePackage.PERMISSIONS__PAGES:
			setPages((String) newValue);
			return;
		case YamlmdePackage.PERMISSIONS__ID_TOKEN:
			setIdToken((String) newValue);
			return;
		case YamlmdePackage.PERMISSIONS__PULL_REQUESTS:
			setPullRequests((String) newValue);
			return;
>>>>>>> Stashed changes
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
		case YamlmdePackage.PERMISSIONS__CONTENTS:
			setContents(CONTENTS_EDEFAULT);
			return;
<<<<<<< Updated upstream
=======
		case YamlmdePackage.PERMISSIONS__SECURITY_EVENTS:
			setSecurityEvents(SECURITY_EVENTS_EDEFAULT);
			return;
		case YamlmdePackage.PERMISSIONS__ACTIONS:
			setActions(ACTIONS_EDEFAULT);
			return;
		case YamlmdePackage.PERMISSIONS__PAGES:
			setPages(PAGES_EDEFAULT);
			return;
		case YamlmdePackage.PERMISSIONS__ID_TOKEN:
			setIdToken(ID_TOKEN_EDEFAULT);
			return;
		case YamlmdePackage.PERMISSIONS__PULL_REQUESTS:
			setPullRequests(PULL_REQUESTS_EDEFAULT);
			return;
>>>>>>> Stashed changes
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
		case YamlmdePackage.PERMISSIONS__CONTENTS:
			return CONTENTS_EDEFAULT == null ? contents != null : !CONTENTS_EDEFAULT.equals(contents);
<<<<<<< Updated upstream
=======
		case YamlmdePackage.PERMISSIONS__SECURITY_EVENTS:
			return SECURITY_EVENTS_EDEFAULT == null ? securityEvents != null
					: !SECURITY_EVENTS_EDEFAULT.equals(securityEvents);
		case YamlmdePackage.PERMISSIONS__ACTIONS:
			return ACTIONS_EDEFAULT == null ? actions != null : !ACTIONS_EDEFAULT.equals(actions);
		case YamlmdePackage.PERMISSIONS__PAGES:
			return PAGES_EDEFAULT == null ? pages != null : !PAGES_EDEFAULT.equals(pages);
		case YamlmdePackage.PERMISSIONS__ID_TOKEN:
			return ID_TOKEN_EDEFAULT == null ? idToken != null : !ID_TOKEN_EDEFAULT.equals(idToken);
		case YamlmdePackage.PERMISSIONS__PULL_REQUESTS:
			return PULL_REQUESTS_EDEFAULT == null ? pullRequests != null : !PULL_REQUESTS_EDEFAULT.equals(pullRequests);
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
=======
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
>>>>>>> Stashed changes
		result.append(')');
		return result.toString();
	}

} //PermissionsImpl
