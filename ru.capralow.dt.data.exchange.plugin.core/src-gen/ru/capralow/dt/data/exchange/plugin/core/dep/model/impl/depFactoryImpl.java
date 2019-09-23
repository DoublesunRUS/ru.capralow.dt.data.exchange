/**
 */
package ru.capralow.dt.data.exchange.plugin.core.dep.model.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ru.capralow.dt.data.exchange.plugin.core.dep.model.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class depFactoryImpl extends EFactoryImpl implements depFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static depFactory init() {
		try {
			depFactory thedepFactory = (depFactory)EPackage.Registry.INSTANCE.getEFactory(depPackage.eNS_URI);
			if (thedepFactory != null) {
				return thedepFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new depFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public depFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case depPackage.DATA_EXCHANGE_PROJECT: return createDataExchangeProject();
			case depPackage.DATA_EXCHANGE_PROJECTS: return createDataExchangeProjects();
			case depPackage.DEP_EXTENSION: return createDepExtension();
			case depPackage.DEP_ENTERPRISE_DATA_VERSION: return createDepEnterpriseDataVersion();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case depPackage.DEP_PROJECT_STATUS:
				return createDepProjectStatusFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case depPackage.DEP_PROJECT_STATUS:
				return convertDepProjectStatusToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataExchangeProject createDataExchangeProject() {
		DataExchangeProjectImpl dataExchangeProject = new DataExchangeProjectImpl();
		return dataExchangeProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataExchangeProjects createDataExchangeProjects() {
		DataExchangeProjectsImpl dataExchangeProjects = new DataExchangeProjectsImpl();
		return dataExchangeProjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DepExtension createDepExtension() {
		DepExtensionImpl depExtension = new DepExtensionImpl();
		return depExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DepEnterpriseDataVersion createDepEnterpriseDataVersion() {
		DepEnterpriseDataVersionImpl depEnterpriseDataVersion = new DepEnterpriseDataVersionImpl();
		return depEnterpriseDataVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DepProjectStatus createDepProjectStatusFromString(EDataType eDataType, String initialValue) {
		DepProjectStatus result = DepProjectStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDepProjectStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public depPackage getdepPackage() {
		return (depPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static depPackage getPackage() {
		return depPackage.eINSTANCE;
	}

} //depFactoryImpl
