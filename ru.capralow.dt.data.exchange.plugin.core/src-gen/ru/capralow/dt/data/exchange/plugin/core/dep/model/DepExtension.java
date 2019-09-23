/**
 */
package ru.capralow.dt.data.exchange.plugin.core.dep.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dep Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.data.exchange.plugin.core.dep.model.DepExtension#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see ru.capralow.dt.data.exchange.plugin.core.dep.model.depPackage#getDepExtension()
 * @model
 * @generated
 */
public interface DepExtension extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ru.capralow.dt.data.exchange.plugin.core.dep.model.depPackage#getDepExtension_Name()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ru.capralow.dt.data.exchange.plugin.core.dep.model.DepExtension#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // DepExtension
