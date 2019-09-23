/**
 */
package ru.capralow.dt.data.exchange.plugin.core.dep.model.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import ru.capralow.dt.data.exchange.plugin.core.dep.model.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ru.capralow.dt.data.exchange.plugin.core.dep.model.depPackage
 * @generated
 */
public class depAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static depPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public depAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = depPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected depSwitch<Adapter> modelSwitch =
		new depSwitch<Adapter>() {
			@Override
			public Adapter caseDataExchangeProject(DataExchangeProject object) {
				return createDataExchangeProjectAdapter();
			}
			@Override
			public Adapter caseDataExchangeProjects(DataExchangeProjects object) {
				return createDataExchangeProjectsAdapter();
			}
			@Override
			public Adapter caseDepExtension(DepExtension object) {
				return createDepExtensionAdapter();
			}
			@Override
			public Adapter caseDepEnterpriseDataVersion(DepEnterpriseDataVersion object) {
				return createDepEnterpriseDataVersionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link ru.capralow.dt.data.exchange.plugin.core.dep.model.DataExchangeProject <em>Data Exchange Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.capralow.dt.data.exchange.plugin.core.dep.model.DataExchangeProject
	 * @generated
	 */
	public Adapter createDataExchangeProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.capralow.dt.data.exchange.plugin.core.dep.model.DataExchangeProjects <em>Data Exchange Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.capralow.dt.data.exchange.plugin.core.dep.model.DataExchangeProjects
	 * @generated
	 */
	public Adapter createDataExchangeProjectsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.capralow.dt.data.exchange.plugin.core.dep.model.DepExtension <em>Dep Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.capralow.dt.data.exchange.plugin.core.dep.model.DepExtension
	 * @generated
	 */
	public Adapter createDepExtensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ru.capralow.dt.data.exchange.plugin.core.dep.model.DepEnterpriseDataVersion <em>Dep Enterprise Data Version</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ru.capralow.dt.data.exchange.plugin.core.dep.model.DepEnterpriseDataVersion
	 * @generated
	 */
	public Adapter createDepEnterpriseDataVersionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //depAdapterFactory
