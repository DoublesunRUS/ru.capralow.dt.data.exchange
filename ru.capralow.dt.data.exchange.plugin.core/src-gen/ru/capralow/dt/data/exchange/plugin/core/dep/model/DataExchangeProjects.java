/**
 */
package ru.capralow.dt.data.exchange.plugin.core.dep.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Exchange Projects</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.data.exchange.plugin.core.dep.model.DataExchangeProjects#getProjects <em>Projects</em>}</li>
 * </ul>
 *
 * @see ru.capralow.dt.data.exchange.plugin.core.dep.model.depPackage#getDataExchangeProjects()
 * @model
 * @generated
 */
public interface DataExchangeProjects extends EObject {
	/**
	 * Returns the value of the '<em><b>Projects</b></em>' reference list.
	 * The list contents are of type {@link ru.capralow.dt.data.exchange.plugin.core.dep.model.DataExchangeProject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projects</em>' reference list.
	 * @see ru.capralow.dt.data.exchange.plugin.core.dep.model.depPackage#getDataExchangeProjects_Projects()
	 * @model
	 * @generated
	 */
	EList<DataExchangeProject> getProjects();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" nameUnique="false"
	 * @generated
	 */
	DataExchangeProject getProject(String name);

} // DataExchangeProjects
