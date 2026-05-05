/**
 */
package pt.isep.yamldslgen.github_actions.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import pt.isep.yamldslgen.github_actions.On;
import pt.isep.yamldslgen.github_actions.Pull_request;
import pt.isep.yamldslgen.github_actions.Push;
import pt.isep.yamldslgen.github_actions.YamlmdePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>On</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.OnImpl#getPush <em>Push</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.OnImpl#getPullRequest <em>Pull Request</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OnImpl extends MinimalEObjectImpl.Container implements On {
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case YamlmdePackage.ON__PUSH:
			return basicSetPush(null, msgs);
		case YamlmdePackage.ON__PULL_REQUEST:
			return basicSetPullRequest(null, msgs);
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
		case YamlmdePackage.ON__PUSH:
			return getPush();
		case YamlmdePackage.ON__PULL_REQUEST:
			return getPullRequest();
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
		case YamlmdePackage.ON__PUSH:
			setPush((Push) newValue);
			return;
		case YamlmdePackage.ON__PULL_REQUEST:
			setPullRequest((Pull_request) newValue);
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
		case YamlmdePackage.ON__PUSH:
			setPush((Push) null);
			return;
		case YamlmdePackage.ON__PULL_REQUEST:
			setPullRequest((Pull_request) null);
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
		case YamlmdePackage.ON__PUSH:
			return push != null;
		case YamlmdePackage.ON__PULL_REQUEST:
			return pullRequest != null;
		}
		return super.eIsSet(featureID);
	}

} //OnImpl
