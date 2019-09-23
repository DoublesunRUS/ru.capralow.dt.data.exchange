/**
 */
package ru.capralow.dt.data.exchange.plugin.core.dep.model.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import ru.capralow.dt.data.exchange.plugin.core.dep.model.DataExchangeProject;
import ru.capralow.dt.data.exchange.plugin.core.dep.model.DataExchangeProjects;
import ru.capralow.dt.data.exchange.plugin.core.dep.model.depPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Exchange Projects</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.data.exchange.plugin.core.dep.model.impl.DataExchangeProjectsImpl#getProjects <em>Projects</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataExchangeProjectsImpl extends MinimalEObjectImpl.Container implements DataExchangeProjects {
	/**
	 * The cached value of the '{@link #getProjects() <em>Projects</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjects()
	 * @generated
	 * @ordered
	 */
	protected EList<DataExchangeProject> projects;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataExchangeProjectsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return depPackage.Literals.DATA_EXCHANGE_PROJECTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataExchangeProject> getProjects() {
		if (projects == null) {
			projects = new EObjectResolvingEList<DataExchangeProject>(DataExchangeProject.class, this, depPackage.DATA_EXCHANGE_PROJECTS__PROJECTS);
		}
		return projects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataExchangeProject getProject(final String name) {
		EList<DataExchangeProject> _projects = this.getProjects();
		for (final DataExchangeProject project : _projects) {
			boolean _equals = name.equals(project.getName());
			if (_equals) {
				return project;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case depPackage.DATA_EXCHANGE_PROJECTS__PROJECTS:
				return getProjects();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case depPackage.DATA_EXCHANGE_PROJECTS__PROJECTS:
				getProjects().clear();
				getProjects().addAll((Collection<? extends DataExchangeProject>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case depPackage.DATA_EXCHANGE_PROJECTS__PROJECTS:
				getProjects().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case depPackage.DATA_EXCHANGE_PROJECTS__PROJECTS:
				return projects != null && !projects.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case depPackage.DATA_EXCHANGE_PROJECTS___GET_PROJECT__STRING:
				return getProject((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //DataExchangeProjectsImpl
