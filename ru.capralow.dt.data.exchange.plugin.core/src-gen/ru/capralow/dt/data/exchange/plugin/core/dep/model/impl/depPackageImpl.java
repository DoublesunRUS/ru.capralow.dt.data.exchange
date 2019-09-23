/**
 */
package ru.capralow.dt.data.exchange.plugin.core.dep.model.impl;

import com._1c.g5.v8.dt.bsl.model.BslPackage;

import com._1c.g5.v8.dt.mcore.McorePackage;

import com._1c.g5.v8.dt.metadata.common.CommonPackage;

import com._1c.g5.v8.dt.metadata.dbview.DbViewPackage;

import com._1c.g5.v8.dt.metadata.mdclass.MdClassPackage;

import com._1c.g5.v8.dt.metadata.mdtype.MdTypePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import ru.capralow.dt.data.exchange.plugin.core.dep.model.DataExchangeProject;
import ru.capralow.dt.data.exchange.plugin.core.dep.model.DataExchangeProjects;
import ru.capralow.dt.data.exchange.plugin.core.dep.model.DepEnterpriseDataVersion;
import ru.capralow.dt.data.exchange.plugin.core.dep.model.DepExtension;
import ru.capralow.dt.data.exchange.plugin.core.dep.model.DepProjectStatus;
import ru.capralow.dt.data.exchange.plugin.core.dep.model.depFactory;
import ru.capralow.dt.data.exchange.plugin.core.dep.model.depPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class depPackageImpl extends EPackageImpl implements depPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataExchangeProjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataExchangeProjectsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass depExtensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass depEnterpriseDataVersionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum depProjectStatusEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ru.capralow.dt.data.exchange.plugin.core.dep.model.depPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private depPackageImpl() {
		super(eNS_URI, depFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link depPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static depPackage init() {
		if (isInited) return (depPackage)EPackage.Registry.INSTANCE.getEPackage(depPackage.eNS_URI);

		// Obtain or create and register package
		Object registereddepPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		depPackageImpl thedepPackage = registereddepPackage instanceof depPackageImpl ? (depPackageImpl)registereddepPackage : new depPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		MdClassPackage.eINSTANCE.eClass();
		McorePackage.eINSTANCE.eClass();
		CommonPackage.eINSTANCE.eClass();
		BslPackage.eINSTANCE.eClass();
		MdTypePackage.eINSTANCE.eClass();
		DbViewPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thedepPackage.createPackageContents();

		// Initialize created meta-data
		thedepPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thedepPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(depPackage.eNS_URI, thedepPackage);
		return thedepPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataExchangeProject() {
		return dataExchangeProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataExchangeProject_Name() {
		return (EAttribute)dataExchangeProjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataExchangeProject_StoreVersion() {
		return (EAttribute)dataExchangeProjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataExchangeProject_Extensions() {
		return (EReference)dataExchangeProjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataExchangeProject_Status() {
		return (EAttribute)dataExchangeProjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataExchangeProject_EnterpriseDataVersions() {
		return (EReference)dataExchangeProjectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataExchangeProject_SettingsModules() {
		return (EReference)dataExchangeProjectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataExchangeProject__GetVersions() {
		return dataExchangeProjectEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataExchangeProject__GetModuleFormatVersions__CommonModule() {
		return dataExchangeProjectEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataExchangeProject__GetFormatModules() {
		return dataExchangeProjectEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataExchangeProjects() {
		return dataExchangeProjectsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataExchangeProjects_Projects() {
		return (EReference)dataExchangeProjectsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataExchangeProjects__GetProject__String() {
		return dataExchangeProjectsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDepExtension() {
		return depExtensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDepExtension_Name() {
		return (EAttribute)depExtensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDepEnterpriseDataVersion() {
		return depEnterpriseDataVersionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDepEnterpriseDataVersion_Version() {
		return (EAttribute)depEnterpriseDataVersionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDepEnterpriseDataVersion_ExtensionName() {
		return (EAttribute)depEnterpriseDataVersionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDepEnterpriseDataVersion_ModuleName() {
		return (EAttribute)depEnterpriseDataVersionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDepEnterpriseDataVersion_Module() {
		return (EReference)depEnterpriseDataVersionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDepEnterpriseDataVersion_XdtoPackage() {
		return (EReference)depEnterpriseDataVersionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDepProjectStatus() {
		return depProjectStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public depFactory getdepFactory() {
		return (depFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		dataExchangeProjectEClass = createEClass(DATA_EXCHANGE_PROJECT);
		createEAttribute(dataExchangeProjectEClass, DATA_EXCHANGE_PROJECT__NAME);
		createEAttribute(dataExchangeProjectEClass, DATA_EXCHANGE_PROJECT__STORE_VERSION);
		createEReference(dataExchangeProjectEClass, DATA_EXCHANGE_PROJECT__EXTENSIONS);
		createEAttribute(dataExchangeProjectEClass, DATA_EXCHANGE_PROJECT__STATUS);
		createEReference(dataExchangeProjectEClass, DATA_EXCHANGE_PROJECT__ENTERPRISE_DATA_VERSIONS);
		createEReference(dataExchangeProjectEClass, DATA_EXCHANGE_PROJECT__SETTINGS_MODULES);
		createEOperation(dataExchangeProjectEClass, DATA_EXCHANGE_PROJECT___GET_VERSIONS);
		createEOperation(dataExchangeProjectEClass, DATA_EXCHANGE_PROJECT___GET_MODULE_FORMAT_VERSIONS__COMMONMODULE);
		createEOperation(dataExchangeProjectEClass, DATA_EXCHANGE_PROJECT___GET_FORMAT_MODULES);

		dataExchangeProjectsEClass = createEClass(DATA_EXCHANGE_PROJECTS);
		createEReference(dataExchangeProjectsEClass, DATA_EXCHANGE_PROJECTS__PROJECTS);
		createEOperation(dataExchangeProjectsEClass, DATA_EXCHANGE_PROJECTS___GET_PROJECT__STRING);

		depExtensionEClass = createEClass(DEP_EXTENSION);
		createEAttribute(depExtensionEClass, DEP_EXTENSION__NAME);

		depEnterpriseDataVersionEClass = createEClass(DEP_ENTERPRISE_DATA_VERSION);
		createEAttribute(depEnterpriseDataVersionEClass, DEP_ENTERPRISE_DATA_VERSION__VERSION);
		createEAttribute(depEnterpriseDataVersionEClass, DEP_ENTERPRISE_DATA_VERSION__EXTENSION_NAME);
		createEAttribute(depEnterpriseDataVersionEClass, DEP_ENTERPRISE_DATA_VERSION__MODULE_NAME);
		createEReference(depEnterpriseDataVersionEClass, DEP_ENTERPRISE_DATA_VERSION__MODULE);
		createEReference(depEnterpriseDataVersionEClass, DEP_ENTERPRISE_DATA_VERSION__XDTO_PACKAGE);

		// Create enums
		depProjectStatusEEnum = createEEnum(DEP_PROJECT_STATUS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		MdClassPackage theMdClassPackage = (MdClassPackage)EPackage.Registry.INSTANCE.getEPackage(MdClassPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(dataExchangeProjectEClass, DataExchangeProject.class, "DataExchangeProject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getDataExchangeProject_Name(), theEcorePackage.getEString(), "name", "", 0, 1, DataExchangeProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getDataExchangeProject_StoreVersion(), theEcorePackage.getEString(), "storeVersion", "", 0, 1, DataExchangeProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getDataExchangeProject_Extensions(), this.getDepExtension(), null, "extensions", null, 0, -1, DataExchangeProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getDataExchangeProject_Status(), this.getDepProjectStatus(), "status", null, 0, 1, DataExchangeProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getDataExchangeProject_EnterpriseDataVersions(), this.getDepEnterpriseDataVersion(), null, "enterpriseDataVersions", null, 0, -1, DataExchangeProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getDataExchangeProject_SettingsModules(), theMdClassPackage.getCommonModule(), null, "settingsModules", null, 0, -1, DataExchangeProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEOperation(getDataExchangeProject__GetVersions(), theEcorePackage.getEString(), "getVersions", 0, -1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		EOperation op = initEOperation(getDataExchangeProject__GetModuleFormatVersions__CommonModule(), this.getDepEnterpriseDataVersion(), "getModuleFormatVersions", 0, -1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theMdClassPackage.getCommonModule(), "module", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEOperation(getDataExchangeProject__GetFormatModules(), theMdClassPackage.getCommonModule(), "getFormatModules", 0, -1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(dataExchangeProjectsEClass, DataExchangeProjects.class, "DataExchangeProjects", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getDataExchangeProjects_Projects(), this.getDataExchangeProject(), null, "projects", null, 0, -1, DataExchangeProjects.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		op = initEOperation(getDataExchangeProjects__GetProject__String(), this.getDataExchangeProject(), "getProject", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theEcorePackage.getEString(), "name", 0, 1, !IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(depExtensionEClass, DepExtension.class, "DepExtension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getDepExtension_Name(), theEcorePackage.getEString(), "name", "", 0, 1, DepExtension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(depEnterpriseDataVersionEClass, DepEnterpriseDataVersion.class, "DepEnterpriseDataVersion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getDepEnterpriseDataVersion_Version(), theEcorePackage.getEString(), "version", "", 0, 1, DepEnterpriseDataVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getDepEnterpriseDataVersion_ExtensionName(), theEcorePackage.getEString(), "extensionName", "", 0, 1, DepEnterpriseDataVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getDepEnterpriseDataVersion_ModuleName(), theEcorePackage.getEString(), "moduleName", "", 0, 1, DepEnterpriseDataVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getDepEnterpriseDataVersion_Module(), theMdClassPackage.getCommonModule(), null, "module", null, 0, 1, DepEnterpriseDataVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getDepEnterpriseDataVersion_XdtoPackage(), theMdClassPackage.getXDTOPackage(), null, "xdtoPackage", null, 0, 1, DepEnterpriseDataVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		// Initialize enums and add enum literals
		initEEnum(depProjectStatusEEnum, DepProjectStatus.class, "DepProjectStatus"); //$NON-NLS-1$
		addEEnumLiteral(depProjectStatusEEnum, DepProjectStatus.NO_CONFIGURATION);
		addEEnumLiteral(depProjectStatusEEnum, DepProjectStatus.NO_SUBSYSTEM);
		addEEnumLiteral(depProjectStatusEEnum, DepProjectStatus.NO_SSL_VERSION);
		addEEnumLiteral(depProjectStatusEEnum, DepProjectStatus.NO_COMMON_MODULE);
		addEEnumLiteral(depProjectStatusEEnum, DepProjectStatus.NO_METHOD);
		addEEnumLiteral(depProjectStatusEEnum, DepProjectStatus.EMPTY_METHOD);
		addEEnumLiteral(depProjectStatusEEnum, DepProjectStatus.READY);

		// Create resource
		createResource(eNS_URI);
	}

} //depPackageImpl
