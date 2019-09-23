/**
 */
package ru.capralow.dt.data.exchange.plugin.core.dep.model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ru.capralow.dt.data.exchange.plugin.core.dep.model.depPackage
 * @generated
 */
public interface depFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	depFactory eINSTANCE = ru.capralow.dt.data.exchange.plugin.core.dep.model.impl.depFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Data Exchange Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Exchange Project</em>'.
	 * @generated
	 */
	DataExchangeProject createDataExchangeProject();

	/**
	 * Returns a new object of class '<em>Data Exchange Projects</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Exchange Projects</em>'.
	 * @generated
	 */
	DataExchangeProjects createDataExchangeProjects();

	/**
	 * Returns a new object of class '<em>Dep Extension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dep Extension</em>'.
	 * @generated
	 */
	DepExtension createDepExtension();

	/**
	 * Returns a new object of class '<em>Dep Enterprise Data Version</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dep Enterprise Data Version</em>'.
	 * @generated
	 */
	DepEnterpriseDataVersion createDepEnterpriseDataVersion();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	depPackage getdepPackage();

} //depFactory
