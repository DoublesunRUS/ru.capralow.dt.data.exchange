/**
 */
package ru.capralow.dt.data.exchange.plugin.core.dep.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ru.capralow.dt.data.exchange.plugin.core.dep.model.depFactory
 * @model kind="package"
 * @generated
 */
public interface depPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ru.capralow.dt.data.exchange.plugin.core.dep.model"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dep"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	depPackage eINSTANCE = ru.capralow.dt.data.exchange.plugin.core.dep.model.impl.depPackageImpl.init();

	/**
	 * The meta object id for the '{@link ru.capralow.dt.data.exchange.plugin.core.dep.model.impl.DataExchangeProjectImpl <em>Data Exchange Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.capralow.dt.data.exchange.plugin.core.dep.model.impl.DataExchangeProjectImpl
	 * @see ru.capralow.dt.data.exchange.plugin.core.dep.model.impl.depPackageImpl#getDataExchangeProject()
	 * @generated
	 */
	int DATA_EXCHANGE_PROJECT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXCHANGE_PROJECT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Store Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXCHANGE_PROJECT__STORE_VERSION = 1;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXCHANGE_PROJECT__EXTENSIONS = 2;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXCHANGE_PROJECT__STATUS = 3;

	/**
	 * The feature id for the '<em><b>Enterprise Data Versions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXCHANGE_PROJECT__ENTERPRISE_DATA_VERSIONS = 4;

	/**
	 * The feature id for the '<em><b>Settings Modules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXCHANGE_PROJECT__SETTINGS_MODULES = 5;

	/**
	 * The number of structural features of the '<em>Data Exchange Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXCHANGE_PROJECT_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Get Versions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXCHANGE_PROJECT___GET_VERSIONS = 0;

	/**
	 * The operation id for the '<em>Get Module Format Versions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXCHANGE_PROJECT___GET_MODULE_FORMAT_VERSIONS__COMMONMODULE = 1;

	/**
	 * The operation id for the '<em>Get Format Modules</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXCHANGE_PROJECT___GET_FORMAT_MODULES = 2;

	/**
	 * The number of operations of the '<em>Data Exchange Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXCHANGE_PROJECT_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link ru.capralow.dt.data.exchange.plugin.core.dep.model.impl.DataExchangeProjectsImpl <em>Data Exchange Projects</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.capralow.dt.data.exchange.plugin.core.dep.model.impl.DataExchangeProjectsImpl
	 * @see ru.capralow.dt.data.exchange.plugin.core.dep.model.impl.depPackageImpl#getDataExchangeProjects()
	 * @generated
	 */
	int DATA_EXCHANGE_PROJECTS = 1;

	/**
	 * The feature id for the '<em><b>Projects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXCHANGE_PROJECTS__PROJECTS = 0;

	/**
	 * The number of structural features of the '<em>Data Exchange Projects</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXCHANGE_PROJECTS_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Project</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXCHANGE_PROJECTS___GET_PROJECT__STRING = 0;

	/**
	 * The number of operations of the '<em>Data Exchange Projects</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXCHANGE_PROJECTS_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ru.capralow.dt.data.exchange.plugin.core.dep.model.impl.DepExtensionImpl <em>Dep Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.capralow.dt.data.exchange.plugin.core.dep.model.impl.DepExtensionImpl
	 * @see ru.capralow.dt.data.exchange.plugin.core.dep.model.impl.depPackageImpl#getDepExtension()
	 * @generated
	 */
	int DEP_EXTENSION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEP_EXTENSION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Dep Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEP_EXTENSION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Dep Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEP_EXTENSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ru.capralow.dt.data.exchange.plugin.core.dep.model.impl.DepEnterpriseDataVersionImpl <em>Dep Enterprise Data Version</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.capralow.dt.data.exchange.plugin.core.dep.model.impl.DepEnterpriseDataVersionImpl
	 * @see ru.capralow.dt.data.exchange.plugin.core.dep.model.impl.depPackageImpl#getDepEnterpriseDataVersion()
	 * @generated
	 */
	int DEP_ENTERPRISE_DATA_VERSION = 3;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEP_ENTERPRISE_DATA_VERSION__VERSION = 0;

	/**
	 * The feature id for the '<em><b>Extension Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEP_ENTERPRISE_DATA_VERSION__EXTENSION_NAME = 1;

	/**
	 * The feature id for the '<em><b>Module Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEP_ENTERPRISE_DATA_VERSION__MODULE_NAME = 2;

	/**
	 * The feature id for the '<em><b>Module</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEP_ENTERPRISE_DATA_VERSION__MODULE = 3;

	/**
	 * The feature id for the '<em><b>Xdto Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEP_ENTERPRISE_DATA_VERSION__XDTO_PACKAGE = 4;

	/**
	 * The number of structural features of the '<em>Dep Enterprise Data Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEP_ENTERPRISE_DATA_VERSION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Dep Enterprise Data Version</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEP_ENTERPRISE_DATA_VERSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ru.capralow.dt.data.exchange.plugin.core.dep.model.DepProjectStatus <em>Dep Project Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ru.capralow.dt.data.exchange.plugin.core.dep.model.DepProjectStatus
	 * @see ru.capralow.dt.data.exchange.plugin.core.dep.model.impl.depPackageImpl#getDepProjectStatus()
	 * @generated
	 */
	int DEP_PROJECT_STATUS = 4;


	/**
	 * Returns the meta object for class '{@link ru.capralow.dt.data.exchange.plugin.core.dep.model.DataExchangeProject <em>Data Exchange Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Exchange Project</em>'.
	 * @see ru.capralow.dt.data.exchange.plugin.core.dep.model.DataExchangeProject
	 * @generated
	 */
	EClass getDataExchangeProject();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.data.exchange.plugin.core.dep.model.DataExchangeProject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ru.capralow.dt.data.exchange.plugin.core.dep.model.DataExchangeProject#getName()
	 * @see #getDataExchangeProject()
	 * @generated
	 */
	EAttribute getDataExchangeProject_Name();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.data.exchange.plugin.core.dep.model.DataExchangeProject#getStoreVersion <em>Store Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Store Version</em>'.
	 * @see ru.capralow.dt.data.exchange.plugin.core.dep.model.DataExchangeProject#getStoreVersion()
	 * @see #getDataExchangeProject()
	 * @generated
	 */
	EAttribute getDataExchangeProject_StoreVersion();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.capralow.dt.data.exchange.plugin.core.dep.model.DataExchangeProject#getExtensions <em>Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Extensions</em>'.
	 * @see ru.capralow.dt.data.exchange.plugin.core.dep.model.DataExchangeProject#getExtensions()
	 * @see #getDataExchangeProject()
	 * @generated
	 */
	EReference getDataExchangeProject_Extensions();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.data.exchange.plugin.core.dep.model.DataExchangeProject#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see ru.capralow.dt.data.exchange.plugin.core.dep.model.DataExchangeProject#getStatus()
	 * @see #getDataExchangeProject()
	 * @generated
	 */
	EAttribute getDataExchangeProject_Status();

	/**
	 * Returns the meta object for the containment reference list '{@link ru.capralow.dt.data.exchange.plugin.core.dep.model.DataExchangeProject#getEnterpriseDataVersions <em>Enterprise Data Versions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enterprise Data Versions</em>'.
	 * @see ru.capralow.dt.data.exchange.plugin.core.dep.model.DataExchangeProject#getEnterpriseDataVersions()
	 * @see #getDataExchangeProject()
	 * @generated
	 */
	EReference getDataExchangeProject_EnterpriseDataVersions();

	/**
	 * Returns the meta object for the reference list '{@link ru.capralow.dt.data.exchange.plugin.core.dep.model.DataExchangeProject#getSettingsModules <em>Settings Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Settings Modules</em>'.
	 * @see ru.capralow.dt.data.exchange.plugin.core.dep.model.DataExchangeProject#getSettingsModules()
	 * @see #getDataExchangeProject()
	 * @generated
	 */
	EReference getDataExchangeProject_SettingsModules();

	/**
	 * Returns the meta object for the '{@link ru.capralow.dt.data.exchange.plugin.core.dep.model.DataExchangeProject#getVersions() <em>Get Versions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Versions</em>' operation.
	 * @see ru.capralow.dt.data.exchange.plugin.core.dep.model.DataExchangeProject#getVersions()
	 * @generated
	 */
	EOperation getDataExchangeProject__GetVersions();

	/**
	 * Returns the meta object for the '{@link ru.capralow.dt.data.exchange.plugin.core.dep.model.DataExchangeProject#getModuleFormatVersions(com._1c.g5.v8.dt.metadata.mdclass.CommonModule) <em>Get Module Format Versions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Module Format Versions</em>' operation.
	 * @see ru.capralow.dt.data.exchange.plugin.core.dep.model.DataExchangeProject#getModuleFormatVersions(com._1c.g5.v8.dt.metadata.mdclass.CommonModule)
	 * @generated
	 */
	EOperation getDataExchangeProject__GetModuleFormatVersions__CommonModule();

	/**
	 * Returns the meta object for the '{@link ru.capralow.dt.data.exchange.plugin.core.dep.model.DataExchangeProject#getFormatModules() <em>Get Format Modules</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Format Modules</em>' operation.
	 * @see ru.capralow.dt.data.exchange.plugin.core.dep.model.DataExchangeProject#getFormatModules()
	 * @generated
	 */
	EOperation getDataExchangeProject__GetFormatModules();

	/**
	 * Returns the meta object for class '{@link ru.capralow.dt.data.exchange.plugin.core.dep.model.DataExchangeProjects <em>Data Exchange Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Exchange Projects</em>'.
	 * @see ru.capralow.dt.data.exchange.plugin.core.dep.model.DataExchangeProjects
	 * @generated
	 */
	EClass getDataExchangeProjects();

	/**
	 * Returns the meta object for the reference list '{@link ru.capralow.dt.data.exchange.plugin.core.dep.model.DataExchangeProjects#getProjects <em>Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Projects</em>'.
	 * @see ru.capralow.dt.data.exchange.plugin.core.dep.model.DataExchangeProjects#getProjects()
	 * @see #getDataExchangeProjects()
	 * @generated
	 */
	EReference getDataExchangeProjects_Projects();

	/**
	 * Returns the meta object for the '{@link ru.capralow.dt.data.exchange.plugin.core.dep.model.DataExchangeProjects#getProject(java.lang.String) <em>Get Project</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Project</em>' operation.
	 * @see ru.capralow.dt.data.exchange.plugin.core.dep.model.DataExchangeProjects#getProject(java.lang.String)
	 * @generated
	 */
	EOperation getDataExchangeProjects__GetProject__String();

	/**
	 * Returns the meta object for class '{@link ru.capralow.dt.data.exchange.plugin.core.dep.model.DepExtension <em>Dep Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dep Extension</em>'.
	 * @see ru.capralow.dt.data.exchange.plugin.core.dep.model.DepExtension
	 * @generated
	 */
	EClass getDepExtension();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.data.exchange.plugin.core.dep.model.DepExtension#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ru.capralow.dt.data.exchange.plugin.core.dep.model.DepExtension#getName()
	 * @see #getDepExtension()
	 * @generated
	 */
	EAttribute getDepExtension_Name();

	/**
	 * Returns the meta object for class '{@link ru.capralow.dt.data.exchange.plugin.core.dep.model.DepEnterpriseDataVersion <em>Dep Enterprise Data Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dep Enterprise Data Version</em>'.
	 * @see ru.capralow.dt.data.exchange.plugin.core.dep.model.DepEnterpriseDataVersion
	 * @generated
	 */
	EClass getDepEnterpriseDataVersion();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.data.exchange.plugin.core.dep.model.DepEnterpriseDataVersion#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see ru.capralow.dt.data.exchange.plugin.core.dep.model.DepEnterpriseDataVersion#getVersion()
	 * @see #getDepEnterpriseDataVersion()
	 * @generated
	 */
	EAttribute getDepEnterpriseDataVersion_Version();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.data.exchange.plugin.core.dep.model.DepEnterpriseDataVersion#getExtensionName <em>Extension Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extension Name</em>'.
	 * @see ru.capralow.dt.data.exchange.plugin.core.dep.model.DepEnterpriseDataVersion#getExtensionName()
	 * @see #getDepEnterpriseDataVersion()
	 * @generated
	 */
	EAttribute getDepEnterpriseDataVersion_ExtensionName();

	/**
	 * Returns the meta object for the attribute '{@link ru.capralow.dt.data.exchange.plugin.core.dep.model.DepEnterpriseDataVersion#getModuleName <em>Module Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module Name</em>'.
	 * @see ru.capralow.dt.data.exchange.plugin.core.dep.model.DepEnterpriseDataVersion#getModuleName()
	 * @see #getDepEnterpriseDataVersion()
	 * @generated
	 */
	EAttribute getDepEnterpriseDataVersion_ModuleName();

	/**
	 * Returns the meta object for the reference '{@link ru.capralow.dt.data.exchange.plugin.core.dep.model.DepEnterpriseDataVersion#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Module</em>'.
	 * @see ru.capralow.dt.data.exchange.plugin.core.dep.model.DepEnterpriseDataVersion#getModule()
	 * @see #getDepEnterpriseDataVersion()
	 * @generated
	 */
	EReference getDepEnterpriseDataVersion_Module();

	/**
	 * Returns the meta object for the reference '{@link ru.capralow.dt.data.exchange.plugin.core.dep.model.DepEnterpriseDataVersion#getXdtoPackage <em>Xdto Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Xdto Package</em>'.
	 * @see ru.capralow.dt.data.exchange.plugin.core.dep.model.DepEnterpriseDataVersion#getXdtoPackage()
	 * @see #getDepEnterpriseDataVersion()
	 * @generated
	 */
	EReference getDepEnterpriseDataVersion_XdtoPackage();

	/**
	 * Returns the meta object for enum '{@link ru.capralow.dt.data.exchange.plugin.core.dep.model.DepProjectStatus <em>Dep Project Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Dep Project Status</em>'.
	 * @see ru.capralow.dt.data.exchange.plugin.core.dep.model.DepProjectStatus
	 * @generated
	 */
	EEnum getDepProjectStatus();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	depFactory getdepFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ru.capralow.dt.data.exchange.plugin.core.dep.model.impl.DataExchangeProjectImpl <em>Data Exchange Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.capralow.dt.data.exchange.plugin.core.dep.model.impl.DataExchangeProjectImpl
		 * @see ru.capralow.dt.data.exchange.plugin.core.dep.model.impl.depPackageImpl#getDataExchangeProject()
		 * @generated
		 */
		EClass DATA_EXCHANGE_PROJECT = eINSTANCE.getDataExchangeProject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_EXCHANGE_PROJECT__NAME = eINSTANCE.getDataExchangeProject_Name();

		/**
		 * The meta object literal for the '<em><b>Store Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_EXCHANGE_PROJECT__STORE_VERSION = eINSTANCE.getDataExchangeProject_StoreVersion();

		/**
		 * The meta object literal for the '<em><b>Extensions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_EXCHANGE_PROJECT__EXTENSIONS = eINSTANCE.getDataExchangeProject_Extensions();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_EXCHANGE_PROJECT__STATUS = eINSTANCE.getDataExchangeProject_Status();

		/**
		 * The meta object literal for the '<em><b>Enterprise Data Versions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_EXCHANGE_PROJECT__ENTERPRISE_DATA_VERSIONS = eINSTANCE.getDataExchangeProject_EnterpriseDataVersions();

		/**
		 * The meta object literal for the '<em><b>Settings Modules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_EXCHANGE_PROJECT__SETTINGS_MODULES = eINSTANCE.getDataExchangeProject_SettingsModules();

		/**
		 * The meta object literal for the '<em><b>Get Versions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_EXCHANGE_PROJECT___GET_VERSIONS = eINSTANCE.getDataExchangeProject__GetVersions();

		/**
		 * The meta object literal for the '<em><b>Get Module Format Versions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_EXCHANGE_PROJECT___GET_MODULE_FORMAT_VERSIONS__COMMONMODULE = eINSTANCE.getDataExchangeProject__GetModuleFormatVersions__CommonModule();

		/**
		 * The meta object literal for the '<em><b>Get Format Modules</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_EXCHANGE_PROJECT___GET_FORMAT_MODULES = eINSTANCE.getDataExchangeProject__GetFormatModules();

		/**
		 * The meta object literal for the '{@link ru.capralow.dt.data.exchange.plugin.core.dep.model.impl.DataExchangeProjectsImpl <em>Data Exchange Projects</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.capralow.dt.data.exchange.plugin.core.dep.model.impl.DataExchangeProjectsImpl
		 * @see ru.capralow.dt.data.exchange.plugin.core.dep.model.impl.depPackageImpl#getDataExchangeProjects()
		 * @generated
		 */
		EClass DATA_EXCHANGE_PROJECTS = eINSTANCE.getDataExchangeProjects();

		/**
		 * The meta object literal for the '<em><b>Projects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_EXCHANGE_PROJECTS__PROJECTS = eINSTANCE.getDataExchangeProjects_Projects();

		/**
		 * The meta object literal for the '<em><b>Get Project</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_EXCHANGE_PROJECTS___GET_PROJECT__STRING = eINSTANCE.getDataExchangeProjects__GetProject__String();

		/**
		 * The meta object literal for the '{@link ru.capralow.dt.data.exchange.plugin.core.dep.model.impl.DepExtensionImpl <em>Dep Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.capralow.dt.data.exchange.plugin.core.dep.model.impl.DepExtensionImpl
		 * @see ru.capralow.dt.data.exchange.plugin.core.dep.model.impl.depPackageImpl#getDepExtension()
		 * @generated
		 */
		EClass DEP_EXTENSION = eINSTANCE.getDepExtension();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEP_EXTENSION__NAME = eINSTANCE.getDepExtension_Name();

		/**
		 * The meta object literal for the '{@link ru.capralow.dt.data.exchange.plugin.core.dep.model.impl.DepEnterpriseDataVersionImpl <em>Dep Enterprise Data Version</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.capralow.dt.data.exchange.plugin.core.dep.model.impl.DepEnterpriseDataVersionImpl
		 * @see ru.capralow.dt.data.exchange.plugin.core.dep.model.impl.depPackageImpl#getDepEnterpriseDataVersion()
		 * @generated
		 */
		EClass DEP_ENTERPRISE_DATA_VERSION = eINSTANCE.getDepEnterpriseDataVersion();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEP_ENTERPRISE_DATA_VERSION__VERSION = eINSTANCE.getDepEnterpriseDataVersion_Version();

		/**
		 * The meta object literal for the '<em><b>Extension Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEP_ENTERPRISE_DATA_VERSION__EXTENSION_NAME = eINSTANCE.getDepEnterpriseDataVersion_ExtensionName();

		/**
		 * The meta object literal for the '<em><b>Module Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEP_ENTERPRISE_DATA_VERSION__MODULE_NAME = eINSTANCE.getDepEnterpriseDataVersion_ModuleName();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEP_ENTERPRISE_DATA_VERSION__MODULE = eINSTANCE.getDepEnterpriseDataVersion_Module();

		/**
		 * The meta object literal for the '<em><b>Xdto Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEP_ENTERPRISE_DATA_VERSION__XDTO_PACKAGE = eINSTANCE.getDepEnterpriseDataVersion_XdtoPackage();

		/**
		 * The meta object literal for the '{@link ru.capralow.dt.data.exchange.plugin.core.dep.model.DepProjectStatus <em>Dep Project Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ru.capralow.dt.data.exchange.plugin.core.dep.model.DepProjectStatus
		 * @see ru.capralow.dt.data.exchange.plugin.core.dep.model.impl.depPackageImpl#getDepProjectStatus()
		 * @generated
		 */
		EEnum DEP_PROJECT_STATUS = eINSTANCE.getDepProjectStatus();

	}

} //depPackage
