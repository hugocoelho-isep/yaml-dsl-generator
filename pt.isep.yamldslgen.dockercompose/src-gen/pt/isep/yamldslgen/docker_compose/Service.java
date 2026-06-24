/**
 */
package pt.isep.yamldslgen.docker_compose;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.Service#getId <em>Id</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.Service#getPorts <em>Ports</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.Service#getImage <em>Image</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.Service#getRestart <em>Restart</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.Service#getContainerName <em>Container Name</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.Service#getCommand <em>Command</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.Service#getStopSignal <em>Stop Signal</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.Service#getExpose <em>Expose</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.Service#getSecrets <em>Secrets</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.Service#getUser <em>User</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.Service#getHostname <em>Hostname</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.Service#getCapAdd <em>Cap Add</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.Service#getNetworkMode <em>Network Mode</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.Service#isStdinOpen <em>Stdin Open</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.Service#getLabels <em>Labels</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.Service#getPlatform <em>Platform</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.Service#getRuntime <em>Runtime</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.Service#getSysctls <em>Sysctls</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.Service#getBuild <em>Build</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.Service#getHealthcheck <em>Healthcheck</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.Service#getDeploy <em>Deploy</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.Service#getDependsOn <em>Depends On</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.Service#getVolumes <em>Volumes</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.Service#getNetworks <em>Networks</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.Service#getEnvironment <em>Environment</em>}</li>
 * </ul>
 *
 * @see pt.isep.yamldslgen.docker_compose.DockercomposePackage#getService()
 * @model
 * @generated
 */
public interface Service extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see pt.isep.yamldslgen.docker_compose.DockercomposePackage#getService_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link pt.isep.yamldslgen.docker_compose.Service#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Ports</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' attribute list.
	 * @see pt.isep.yamldslgen.docker_compose.DockercomposePackage#getService_Ports()
	 * @model
	 * @generated
	 */
	EList<String> getPorts();

	/**
	 * Returns the value of the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' attribute.
	 * @see #setImage(String)
	 * @see pt.isep.yamldslgen.docker_compose.DockercomposePackage#getService_Image()
	 * @model
	 * @generated
	 */
	String getImage();

	/**
	 * Sets the value of the '{@link pt.isep.yamldslgen.docker_compose.Service#getImage <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' attribute.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(String value);

	/**
	 * Returns the value of the '<em><b>Restart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restart</em>' attribute.
	 * @see #setRestart(String)
	 * @see pt.isep.yamldslgen.docker_compose.DockercomposePackage#getService_Restart()
	 * @model
	 * @generated
	 */
	String getRestart();

	/**
	 * Sets the value of the '{@link pt.isep.yamldslgen.docker_compose.Service#getRestart <em>Restart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restart</em>' attribute.
	 * @see #getRestart()
	 * @generated
	 */
	void setRestart(String value);

	/**
	 * Returns the value of the '<em><b>Container Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container Name</em>' attribute.
	 * @see #setContainerName(String)
	 * @see pt.isep.yamldslgen.docker_compose.DockercomposePackage#getService_ContainerName()
	 * @model
	 * @generated
	 */
	String getContainerName();

	/**
	 * Sets the value of the '{@link pt.isep.yamldslgen.docker_compose.Service#getContainerName <em>Container Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container Name</em>' attribute.
	 * @see #getContainerName()
	 * @generated
	 */
	void setContainerName(String value);

	/**
	 * Returns the value of the '<em><b>Command</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' attribute list.
	 * @see pt.isep.yamldslgen.docker_compose.DockercomposePackage#getService_Command()
	 * @model
	 * @generated
	 */
	EList<String> getCommand();

	/**
	 * Returns the value of the '<em><b>Stop Signal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop Signal</em>' attribute.
	 * @see #setStopSignal(String)
	 * @see pt.isep.yamldslgen.docker_compose.DockercomposePackage#getService_StopSignal()
	 * @model
	 * @generated
	 */
	String getStopSignal();

	/**
	 * Sets the value of the '{@link pt.isep.yamldslgen.docker_compose.Service#getStopSignal <em>Stop Signal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stop Signal</em>' attribute.
	 * @see #getStopSignal()
	 * @generated
	 */
	void setStopSignal(String value);

	/**
	 * Returns the value of the '<em><b>Expose</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expose</em>' attribute list.
	 * @see pt.isep.yamldslgen.docker_compose.DockercomposePackage#getService_Expose()
	 * @model
	 * @generated
	 */
	EList<Integer> getExpose();

	/**
	 * Returns the value of the '<em><b>Secrets</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secrets</em>' attribute list.
	 * @see pt.isep.yamldslgen.docker_compose.DockercomposePackage#getService_Secrets()
	 * @model
	 * @generated
	 */
	EList<String> getSecrets();

	/**
	 * Returns the value of the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' attribute.
	 * @see #setUser(String)
	 * @see pt.isep.yamldslgen.docker_compose.DockercomposePackage#getService_User()
	 * @model
	 * @generated
	 */
	String getUser();

	/**
	 * Sets the value of the '{@link pt.isep.yamldslgen.docker_compose.Service#getUser <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' attribute.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(String value);

	/**
	 * Returns the value of the '<em><b>Hostname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hostname</em>' attribute.
	 * @see #setHostname(String)
	 * @see pt.isep.yamldslgen.docker_compose.DockercomposePackage#getService_Hostname()
	 * @model
	 * @generated
	 */
	String getHostname();

	/**
	 * Sets the value of the '{@link pt.isep.yamldslgen.docker_compose.Service#getHostname <em>Hostname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hostname</em>' attribute.
	 * @see #getHostname()
	 * @generated
	 */
	void setHostname(String value);

	/**
	 * Returns the value of the '<em><b>Cap Add</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cap Add</em>' attribute list.
	 * @see pt.isep.yamldslgen.docker_compose.DockercomposePackage#getService_CapAdd()
	 * @model
	 * @generated
	 */
	EList<String> getCapAdd();

	/**
	 * Returns the value of the '<em><b>Network Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Mode</em>' attribute.
	 * @see #setNetworkMode(String)
	 * @see pt.isep.yamldslgen.docker_compose.DockercomposePackage#getService_NetworkMode()
	 * @model
	 * @generated
	 */
	String getNetworkMode();

	/**
	 * Sets the value of the '{@link pt.isep.yamldslgen.docker_compose.Service#getNetworkMode <em>Network Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network Mode</em>' attribute.
	 * @see #getNetworkMode()
	 * @generated
	 */
	void setNetworkMode(String value);

	/**
	 * Returns the value of the '<em><b>Stdin Open</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stdin Open</em>' attribute.
	 * @see #setStdinOpen(boolean)
	 * @see pt.isep.yamldslgen.docker_compose.DockercomposePackage#getService_StdinOpen()
	 * @model
	 * @generated
	 */
	boolean isStdinOpen();

	/**
	 * Sets the value of the '{@link pt.isep.yamldslgen.docker_compose.Service#isStdinOpen <em>Stdin Open</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stdin Open</em>' attribute.
	 * @see #isStdinOpen()
	 * @generated
	 */
	void setStdinOpen(boolean value);

	/**
	 * Returns the value of the '<em><b>Labels</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labels</em>' attribute list.
	 * @see pt.isep.yamldslgen.docker_compose.DockercomposePackage#getService_Labels()
	 * @model
	 * @generated
	 */
	EList<String> getLabels();

	/**
	 * Returns the value of the '<em><b>Platform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Platform</em>' attribute.
	 * @see #setPlatform(String)
	 * @see pt.isep.yamldslgen.docker_compose.DockercomposePackage#getService_Platform()
	 * @model
	 * @generated
	 */
	String getPlatform();

	/**
	 * Sets the value of the '{@link pt.isep.yamldslgen.docker_compose.Service#getPlatform <em>Platform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Platform</em>' attribute.
	 * @see #getPlatform()
	 * @generated
	 */
	void setPlatform(String value);

	/**
	 * Returns the value of the '<em><b>Runtime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runtime</em>' attribute.
	 * @see #setRuntime(String)
	 * @see pt.isep.yamldslgen.docker_compose.DockercomposePackage#getService_Runtime()
	 * @model
	 * @generated
	 */
	String getRuntime();

	/**
	 * Sets the value of the '{@link pt.isep.yamldslgen.docker_compose.Service#getRuntime <em>Runtime</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runtime</em>' attribute.
	 * @see #getRuntime()
	 * @generated
	 */
	void setRuntime(String value);

	/**
	 * Returns the value of the '<em><b>Sysctls</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sysctls</em>' attribute list.
	 * @see pt.isep.yamldslgen.docker_compose.DockercomposePackage#getService_Sysctls()
	 * @model
	 * @generated
	 */
	EList<String> getSysctls();

	/**
	 * Returns the value of the '<em><b>Build</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Build</em>' containment reference.
	 * @see #setBuild(Build)
	 * @see pt.isep.yamldslgen.docker_compose.DockercomposePackage#getService_Build()
	 * @model containment="true"
	 * @generated
	 */
	Build getBuild();

	/**
	 * Sets the value of the '{@link pt.isep.yamldslgen.docker_compose.Service#getBuild <em>Build</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Build</em>' containment reference.
	 * @see #getBuild()
	 * @generated
	 */
	void setBuild(Build value);

	/**
	 * Returns the value of the '<em><b>Healthcheck</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Healthcheck</em>' containment reference.
	 * @see #setHealthcheck(Healthcheck)
	 * @see pt.isep.yamldslgen.docker_compose.DockercomposePackage#getService_Healthcheck()
	 * @model containment="true"
	 * @generated
	 */
	Healthcheck getHealthcheck();

	/**
	 * Sets the value of the '{@link pt.isep.yamldslgen.docker_compose.Service#getHealthcheck <em>Healthcheck</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Healthcheck</em>' containment reference.
	 * @see #getHealthcheck()
	 * @generated
	 */
	void setHealthcheck(Healthcheck value);

	/**
	 * Returns the value of the '<em><b>Deploy</b></em>' containment reference list.
	 * The list contents are of type {@link pt.isep.yamldslgen.docker_compose.Resource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deploy</em>' containment reference list.
	 * @see pt.isep.yamldslgen.docker_compose.DockercomposePackage#getService_Deploy()
	 * @model containment="true"
	 * @generated
	 */
	EList<Resource> getDeploy();

	/**
	 * Returns the value of the '<em><b>Depends On</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depends On</em>' containment reference.
	 * @see #setDependsOn(Depends_on)
	 * @see pt.isep.yamldslgen.docker_compose.DockercomposePackage#getService_DependsOn()
	 * @model containment="true"
	 * @generated
	 */
	Depends_on getDependsOn();

	/**
	 * Sets the value of the '{@link pt.isep.yamldslgen.docker_compose.Service#getDependsOn <em>Depends On</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depends On</em>' containment reference.
	 * @see #getDependsOn()
	 * @generated
	 */
	void setDependsOn(Depends_on value);

	/**
	 * Returns the value of the '<em><b>Volumes</b></em>' containment reference list.
	 * The list contents are of type {@link pt.isep.yamldslgen.docker_compose.Volume}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volumes</em>' containment reference list.
	 * @see pt.isep.yamldslgen.docker_compose.DockercomposePackage#getService_Volumes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Volume> getVolumes();

	/**
	 * Returns the value of the '<em><b>Networks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Networks</em>' containment reference.
	 * @see #setNetworks(Networks)
	 * @see pt.isep.yamldslgen.docker_compose.DockercomposePackage#getService_Networks()
	 * @model containment="true"
	 * @generated
	 */
	Networks getNetworks();

	/**
	 * Sets the value of the '{@link pt.isep.yamldslgen.docker_compose.Service#getNetworks <em>Networks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Networks</em>' containment reference.
	 * @see #getNetworks()
	 * @generated
	 */
	void setNetworks(Networks value);

	/**
	 * Returns the value of the '<em><b>Environment</b></em>' containment reference list.
	 * The list contents are of type {@link pt.isep.yamldslgen.docker_compose.KeyValuePair}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' containment reference list.
	 * @see pt.isep.yamldslgen.docker_compose.DockercomposePackage#getService_Environment()
	 * @model containment="true"
	 * @generated
	 */
	EList<KeyValuePair> getEnvironment();

} // Service
