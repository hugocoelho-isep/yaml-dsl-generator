/**
 */
package pt.isep.yamldslgen.docker_compose;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Healthcheck</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.Healthcheck#getTest <em>Test</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.Healthcheck#getInterval <em>Interval</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.Healthcheck#getRetries <em>Retries</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.Healthcheck#getStartPeriod <em>Start Period</em>}</li>
 *   <li>{@link pt.isep.yamldslgen.docker_compose.Healthcheck#getTimeout <em>Timeout</em>}</li>
 * </ul>
 *
 * @see pt.isep.yamldslgen.docker_compose.DockercomposePackage#getHealthcheck()
 * @model
 * @generated
 */
public interface Healthcheck extends EObject {
	/**
	 * Returns the value of the '<em><b>Test</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test</em>' attribute list.
	 * @see pt.isep.yamldslgen.docker_compose.DockercomposePackage#getHealthcheck_Test()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getTest();

	/**
	 * Returns the value of the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval</em>' attribute.
	 * @see #setInterval(String)
	 * @see pt.isep.yamldslgen.docker_compose.DockercomposePackage#getHealthcheck_Interval()
	 * @model required="true"
	 * @generated
	 */
	String getInterval();

	/**
	 * Sets the value of the '{@link pt.isep.yamldslgen.docker_compose.Healthcheck#getInterval <em>Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval</em>' attribute.
	 * @see #getInterval()
	 * @generated
	 */
	void setInterval(String value);

	/**
	 * Returns the value of the '<em><b>Retries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retries</em>' attribute.
	 * @see #setRetries(int)
	 * @see pt.isep.yamldslgen.docker_compose.DockercomposePackage#getHealthcheck_Retries()
	 * @model required="true"
	 * @generated
	 */
	int getRetries();

	/**
	 * Sets the value of the '{@link pt.isep.yamldslgen.docker_compose.Healthcheck#getRetries <em>Retries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retries</em>' attribute.
	 * @see #getRetries()
	 * @generated
	 */
	void setRetries(int value);

	/**
	 * Returns the value of the '<em><b>Start Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Period</em>' attribute.
	 * @see #setStartPeriod(String)
	 * @see pt.isep.yamldslgen.docker_compose.DockercomposePackage#getHealthcheck_StartPeriod()
	 * @model
	 * @generated
	 */
	String getStartPeriod();

	/**
	 * Sets the value of the '{@link pt.isep.yamldslgen.docker_compose.Healthcheck#getStartPeriod <em>Start Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Period</em>' attribute.
	 * @see #getStartPeriod()
	 * @generated
	 */
	void setStartPeriod(String value);

	/**
	 * Returns the value of the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeout</em>' attribute.
	 * @see #setTimeout(String)
	 * @see pt.isep.yamldslgen.docker_compose.DockercomposePackage#getHealthcheck_Timeout()
	 * @model
	 * @generated
	 */
	String getTimeout();

	/**
	 * Sets the value of the '{@link pt.isep.yamldslgen.docker_compose.Healthcheck#getTimeout <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout</em>' attribute.
	 * @see #getTimeout()
	 * @generated
	 */
	void setTimeout(String value);

} // Healthcheck
