/**
 */
package pt.isep.yamldslgen.docker_compose.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import pt.isep.yamldslgen.docker_compose.Db;
import pt.isep.yamldslgen.docker_compose.Depends_onObject;
import pt.isep.yamldslgen.docker_compose.DockercomposePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Depends on Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.impl.Depends_onObjectImpl#getDb <em>Db</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Depends_onObjectImpl extends Depends_onImpl implements Depends_onObject {
	/**
	 * The cached value of the '{@link #getDb() <em>Db</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDb()
	 * @generated
	 * @ordered
	 */
	protected Db db;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Depends_onObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DockercomposePackage.Literals.DEPENDS_ON_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Db getDb() {
		return db;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDb(Db newDb, NotificationChain msgs) {
		Db oldDb = db;
		db = newDb;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					DockercomposePackage.DEPENDS_ON_OBJECT__DB, oldDb, newDb);
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
	public void setDb(Db newDb) {
		if (newDb != db) {
			NotificationChain msgs = null;
			if (db != null)
				msgs = ((InternalEObject) db).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - DockercomposePackage.DEPENDS_ON_OBJECT__DB, null, msgs);
			if (newDb != null)
				msgs = ((InternalEObject) newDb).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - DockercomposePackage.DEPENDS_ON_OBJECT__DB, null, msgs);
			msgs = basicSetDb(newDb, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DockercomposePackage.DEPENDS_ON_OBJECT__DB, newDb,
					newDb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case DockercomposePackage.DEPENDS_ON_OBJECT__DB:
			return basicSetDb(null, msgs);
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
		case DockercomposePackage.DEPENDS_ON_OBJECT__DB:
			return getDb();
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
		case DockercomposePackage.DEPENDS_ON_OBJECT__DB:
			setDb((Db) newValue);
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
		case DockercomposePackage.DEPENDS_ON_OBJECT__DB:
			setDb((Db) null);
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
		case DockercomposePackage.DEPENDS_ON_OBJECT__DB:
			return db != null;
		}
		return super.eIsSet(featureID);
	}

} //Depends_onObjectImpl
