/**
 */
package pt.isep.yamldslgen.github_actions.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import pt.isep.yamldslgen.github_actions.With;
import pt.isep.yamldslgen.github_actions.YamlmdePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>With</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.WithImpl#getJavaVersion <em>Java Version</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.WithImpl#getDistribution <em>Distribution</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.WithImpl#getName <em>Name</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.WithImpl#getPath <em>Path</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.WithImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.WithImpl#getToken <em>Token</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.WithImpl#getFiles <em>Files</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.github_actions.impl.WithImpl#isGenerateReleaseNotes <em>Generate Release Notes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WithImpl extends MinimalEObjectImpl.Container implements With {
	/**
	 * The default value of the '{@link #getJavaVersion() <em>Java Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String JAVA_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJavaVersion() <em>Java Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaVersion()
	 * @generated
	 * @ordered
	 */
	protected String javaVersion = JAVA_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDistribution() <em>Distribution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistribution()
	 * @generated
	 * @ordered
	 */
	protected static final String DISTRIBUTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDistribution() <em>Distribution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistribution()
	 * @generated
	 * @ordered
	 */
	protected String distribution = DISTRIBUTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getTarget() <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected String target = TARGET_EDEFAULT;

	/**
	 * The default value of the '{@link #getToken() <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected static final String TOKEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToken() <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected String token = TOKEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getFiles() <em>Files</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiles()
	 * @generated
	 * @ordered
	 */
	protected static final String FILES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFiles() <em>Files</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiles()
	 * @generated
	 * @ordered
	 */
	protected String files = FILES_EDEFAULT;

	/**
	 * The default value of the '{@link #isGenerateReleaseNotes() <em>Generate Release Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateReleaseNotes()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATE_RELEASE_NOTES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGenerateReleaseNotes() <em>Generate Release Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateReleaseNotes()
	 * @generated
	 * @ordered
	 */
	protected boolean generateReleaseNotes = GENERATE_RELEASE_NOTES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WithImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return YamlmdePackage.Literals.WITH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJavaVersion() {
		return javaVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJavaVersion(String newJavaVersion) {
		String oldJavaVersion = javaVersion;
		javaVersion = newJavaVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YamlmdePackage.WITH__JAVA_VERSION, oldJavaVersion,
					javaVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDistribution() {
		return distribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDistribution(String newDistribution) {
		String oldDistribution = distribution;
		distribution = newDistribution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YamlmdePackage.WITH__DISTRIBUTION, oldDistribution,
					distribution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YamlmdePackage.WITH__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YamlmdePackage.WITH__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(String newTarget) {
		String oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YamlmdePackage.WITH__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getToken() {
		return token;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToken(String newToken) {
		String oldToken = token;
		token = newToken;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YamlmdePackage.WITH__TOKEN, oldToken, token));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFiles() {
		return files;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFiles(String newFiles) {
		String oldFiles = files;
		files = newFiles;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YamlmdePackage.WITH__FILES, oldFiles, files));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isGenerateReleaseNotes() {
		return generateReleaseNotes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGenerateReleaseNotes(boolean newGenerateReleaseNotes) {
		boolean oldGenerateReleaseNotes = generateReleaseNotes;
		generateReleaseNotes = newGenerateReleaseNotes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, YamlmdePackage.WITH__GENERATE_RELEASE_NOTES,
					oldGenerateReleaseNotes, generateReleaseNotes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case YamlmdePackage.WITH__JAVA_VERSION:
			return getJavaVersion();
		case YamlmdePackage.WITH__DISTRIBUTION:
			return getDistribution();
		case YamlmdePackage.WITH__NAME:
			return getName();
		case YamlmdePackage.WITH__PATH:
			return getPath();
		case YamlmdePackage.WITH__TARGET:
			return getTarget();
		case YamlmdePackage.WITH__TOKEN:
			return getToken();
		case YamlmdePackage.WITH__FILES:
			return getFiles();
		case YamlmdePackage.WITH__GENERATE_RELEASE_NOTES:
			return isGenerateReleaseNotes();
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
		case YamlmdePackage.WITH__JAVA_VERSION:
			setJavaVersion((String) newValue);
			return;
		case YamlmdePackage.WITH__DISTRIBUTION:
			setDistribution((String) newValue);
			return;
		case YamlmdePackage.WITH__NAME:
			setName((String) newValue);
			return;
		case YamlmdePackage.WITH__PATH:
			setPath((String) newValue);
			return;
		case YamlmdePackage.WITH__TARGET:
			setTarget((String) newValue);
			return;
		case YamlmdePackage.WITH__TOKEN:
			setToken((String) newValue);
			return;
		case YamlmdePackage.WITH__FILES:
			setFiles((String) newValue);
			return;
		case YamlmdePackage.WITH__GENERATE_RELEASE_NOTES:
			setGenerateReleaseNotes((Boolean) newValue);
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
		case YamlmdePackage.WITH__JAVA_VERSION:
			setJavaVersion(JAVA_VERSION_EDEFAULT);
			return;
		case YamlmdePackage.WITH__DISTRIBUTION:
			setDistribution(DISTRIBUTION_EDEFAULT);
			return;
		case YamlmdePackage.WITH__NAME:
			setName(NAME_EDEFAULT);
			return;
		case YamlmdePackage.WITH__PATH:
			setPath(PATH_EDEFAULT);
			return;
		case YamlmdePackage.WITH__TARGET:
			setTarget(TARGET_EDEFAULT);
			return;
		case YamlmdePackage.WITH__TOKEN:
			setToken(TOKEN_EDEFAULT);
			return;
		case YamlmdePackage.WITH__FILES:
			setFiles(FILES_EDEFAULT);
			return;
		case YamlmdePackage.WITH__GENERATE_RELEASE_NOTES:
			setGenerateReleaseNotes(GENERATE_RELEASE_NOTES_EDEFAULT);
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
		case YamlmdePackage.WITH__JAVA_VERSION:
			return JAVA_VERSION_EDEFAULT == null ? javaVersion != null : !JAVA_VERSION_EDEFAULT.equals(javaVersion);
		case YamlmdePackage.WITH__DISTRIBUTION:
			return DISTRIBUTION_EDEFAULT == null ? distribution != null : !DISTRIBUTION_EDEFAULT.equals(distribution);
		case YamlmdePackage.WITH__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case YamlmdePackage.WITH__PATH:
			return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
		case YamlmdePackage.WITH__TARGET:
			return TARGET_EDEFAULT == null ? target != null : !TARGET_EDEFAULT.equals(target);
		case YamlmdePackage.WITH__TOKEN:
			return TOKEN_EDEFAULT == null ? token != null : !TOKEN_EDEFAULT.equals(token);
		case YamlmdePackage.WITH__FILES:
			return FILES_EDEFAULT == null ? files != null : !FILES_EDEFAULT.equals(files);
		case YamlmdePackage.WITH__GENERATE_RELEASE_NOTES:
			return generateReleaseNotes != GENERATE_RELEASE_NOTES_EDEFAULT;
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
		result.append(" (javaVersion: ");
		result.append(javaVersion);
		result.append(", distribution: ");
		result.append(distribution);
		result.append(", name: ");
		result.append(name);
		result.append(", path: ");
		result.append(path);
		result.append(", target: ");
		result.append(target);
		result.append(", token: ");
		result.append(token);
		result.append(", files: ");
		result.append(files);
		result.append(", generateReleaseNotes: ");
		result.append(generateReleaseNotes);
		result.append(')');
		return result.toString();
	}

} //WithImpl
