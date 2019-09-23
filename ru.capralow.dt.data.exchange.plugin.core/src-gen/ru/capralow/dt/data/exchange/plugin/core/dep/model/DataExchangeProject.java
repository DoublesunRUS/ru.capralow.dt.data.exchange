/**
 */
package ru.capralow.dt.data.exchange.plugin.core.dep.model;

import com._1c.g5.v8.dt.metadata.mdclass.CommonModule;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Exchange Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.data.exchange.plugin.core.dep.model.DataExchangeProject#getName <em>Name</em>}</li>
 *   <li>{@link ru.capralow.dt.data.exchange.plugin.core.dep.model.DataExchangeProject#getStoreVersion <em>Store Version</em>}</li>
 *   <li>{@link ru.capralow.dt.data.exchange.plugin.core.dep.model.DataExchangeProject#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link ru.capralow.dt.data.exchange.plugin.core.dep.model.DataExchangeProject#getStatus <em>Status</em>}</li>
 *   <li>{@link ru.capralow.dt.data.exchange.plugin.core.dep.model.DataExchangeProject#getEnterpriseDataVersions <em>Enterprise Data Versions</em>}</li>
 *   <li>{@link ru.capralow.dt.data.exchange.plugin.core.dep.model.DataExchangeProject#getSettingsModules <em>Settings Modules</em>}</li>
 * </ul>
 *
 * @see ru.capralow.dt.data.exchange.plugin.core.dep.model.depPackage#getDataExchangeProject()
 * @model
 * @generated
 */
public interface DataExchangeProject extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ru.capralow.dt.data.exchange.plugin.core.dep.model.depPackage#getDataExchangeProject_Name()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.data.exchange.plugin.core.dep.model.DataExchangeProject#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Store Version</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Store Version</em>' attribute.
	 * @see #setStoreVersion(String)
	 * @see ru.capralow.dt.data.exchange.plugin.core.dep.model.depPackage#getDataExchangeProject_StoreVersion()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getStoreVersion();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.data.exchange.plugin.core.dep.model.DataExchangeProject#getStoreVersion <em>Store Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Store Version</em>' attribute.
	 * @see #getStoreVersion()
	 * @generated
	 */
	void setStoreVersion(String value);

	/**
	 * Returns the value of the '<em><b>Extensions</b></em>' containment reference list.
	 * The list contents are of type {@link ru.capralow.dt.data.exchange.plugin.core.dep.model.DepExtension}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extensions</em>' containment reference list.
	 * @see ru.capralow.dt.data.exchange.plugin.core.dep.model.depPackage#getDataExchangeProject_Extensions()
	 * @model containment="true"
	 * @generated
	 */
	EList<DepExtension> getExtensions();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link ru.capralow.dt.data.exchange.plugin.core.dep.model.DepProjectStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see ru.capralow.dt.data.exchange.plugin.core.dep.model.DepProjectStatus
	 * @see #setStatus(DepProjectStatus)
	 * @see ru.capralow.dt.data.exchange.plugin.core.dep.model.depPackage#getDataExchangeProject_Status()
	 * @model unique="false"
	 * @generated
	 */
	DepProjectStatus getStatus();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.data.exchange.plugin.core.dep.model.DataExchangeProject#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see ru.capralow.dt.data.exchange.plugin.core.dep.model.DepProjectStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(DepProjectStatus value);

	/**
	 * Returns the value of the '<em><b>Enterprise Data Versions</b></em>' containment reference list.
	 * The list contents are of type {@link ru.capralow.dt.data.exchange.plugin.core.dep.model.DepEnterpriseDataVersion}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enterprise Data Versions</em>' containment reference list.
	 * @see ru.capralow.dt.data.exchange.plugin.core.dep.model.depPackage#getDataExchangeProject_EnterpriseDataVersions()
	 * @model containment="true"
	 * @generated
	 */
	EList<DepEnterpriseDataVersion> getEnterpriseDataVersions();

	/**
	 * Returns the value of the '<em><b>Settings Modules</b></em>' reference list.
	 * The list contents are of type {@link com._1c.g5.v8.dt.metadata.mdclass.CommonModule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Settings Modules</em>' reference list.
	 * @see ru.capralow.dt.data.exchange.plugin.core.dep.model.depPackage#getDataExchangeProject_SettingsModules()
	 * @model
	 * @generated
	 */
	EList<CommonModule> getSettingsModules();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	EList<String> getVersions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" moduleUnique="false"
	 * @generated
	 */
	EList<DepEnterpriseDataVersion> getModuleFormatVersions(CommonModule module);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	EList<CommonModule> getFormatModules();

} // DataExchangeProject
