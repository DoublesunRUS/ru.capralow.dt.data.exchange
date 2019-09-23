/**
 */
package ru.capralow.dt.data.exchange.plugin.core.dep.model.impl;

import com._1c.g5.v8.dt.metadata.mdclass.CommonModule;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.emf.ecore.xcore.lib.XcoreCollectionLiterals;

import ru.capralow.dt.data.exchange.plugin.core.dep.model.DataExchangeProject;
import ru.capralow.dt.data.exchange.plugin.core.dep.model.DepEnterpriseDataVersion;
import ru.capralow.dt.data.exchange.plugin.core.dep.model.DepExtension;
import ru.capralow.dt.data.exchange.plugin.core.dep.model.DepProjectStatus;
import ru.capralow.dt.data.exchange.plugin.core.dep.model.depPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Exchange Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.capralow.dt.data.exchange.plugin.core.dep.model.impl.DataExchangeProjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link ru.capralow.dt.data.exchange.plugin.core.dep.model.impl.DataExchangeProjectImpl#getStoreVersion <em>Store Version</em>}</li>
 *   <li>{@link ru.capralow.dt.data.exchange.plugin.core.dep.model.impl.DataExchangeProjectImpl#getExtensions <em>Extensions</em>}</li>
 *   <li>{@link ru.capralow.dt.data.exchange.plugin.core.dep.model.impl.DataExchangeProjectImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link ru.capralow.dt.data.exchange.plugin.core.dep.model.impl.DataExchangeProjectImpl#getEnterpriseDataVersions <em>Enterprise Data Versions</em>}</li>
 *   <li>{@link ru.capralow.dt.data.exchange.plugin.core.dep.model.impl.DataExchangeProjectImpl#getSettingsModules <em>Settings Modules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataExchangeProjectImpl extends MinimalEObjectImpl.Container implements DataExchangeProject {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = ""; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getStoreVersion() <em>Store Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoreVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String STORE_VERSION_EDEFAULT = ""; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getStoreVersion() <em>Store Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoreVersion()
	 * @generated
	 * @ordered
	 */
	protected String storeVersion = STORE_VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExtensions() <em>Extensions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensions()
	 * @generated
	 * @ordered
	 */
	protected EList<DepExtension> extensions;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final DepProjectStatus STATUS_EDEFAULT = DepProjectStatus.NO_CONFIGURATION;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected DepProjectStatus status = STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEnterpriseDataVersions() <em>Enterprise Data Versions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnterpriseDataVersions()
	 * @generated
	 * @ordered
	 */
	protected EList<DepEnterpriseDataVersion> enterpriseDataVersions;

	/**
	 * The cached value of the '{@link #getSettingsModules() <em>Settings Modules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSettingsModules()
	 * @generated
	 * @ordered
	 */
	protected EList<CommonModule> settingsModules;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataExchangeProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return depPackage.Literals.DATA_EXCHANGE_PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, depPackage.DATA_EXCHANGE_PROJECT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStoreVersion() {
		return storeVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStoreVersion(String newStoreVersion) {
		String oldStoreVersion = storeVersion;
		storeVersion = newStoreVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, depPackage.DATA_EXCHANGE_PROJECT__STORE_VERSION, oldStoreVersion, storeVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DepExtension> getExtensions() {
		if (extensions == null) {
			extensions = new EObjectContainmentEList<DepExtension>(DepExtension.class, this, depPackage.DATA_EXCHANGE_PROJECT__EXTENSIONS);
		}
		return extensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DepProjectStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(DepProjectStatus newStatus) {
		DepProjectStatus oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, depPackage.DATA_EXCHANGE_PROJECT__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DepEnterpriseDataVersion> getEnterpriseDataVersions() {
		if (enterpriseDataVersions == null) {
			enterpriseDataVersions = new EObjectContainmentEList<DepEnterpriseDataVersion>(DepEnterpriseDataVersion.class, this, depPackage.DATA_EXCHANGE_PROJECT__ENTERPRISE_DATA_VERSIONS);
		}
		return enterpriseDataVersions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CommonModule> getSettingsModules() {
		if (settingsModules == null) {
			settingsModules = new EObjectResolvingEList<CommonModule>(CommonModule.class, this, depPackage.DATA_EXCHANGE_PROJECT__SETTINGS_MODULES);
		}
		return settingsModules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getVersions() {
		final BasicEList<String> result = XcoreCollectionLiterals.<String>newBasicEList();
		EList<DepEnterpriseDataVersion> _enterpriseDataVersions = this.getEnterpriseDataVersions();
		for (final DepEnterpriseDataVersion formatVersion : _enterpriseDataVersions) {
			result.add(formatVersion.getVersion());
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DepEnterpriseDataVersion> getModuleFormatVersions(final CommonModule module) {
		final BasicEList<DepEnterpriseDataVersion> result = XcoreCollectionLiterals.<DepEnterpriseDataVersion>newBasicEList();
		EList<DepEnterpriseDataVersion> _enterpriseDataVersions = this.getEnterpriseDataVersions();
		for (final DepEnterpriseDataVersion formatVersion : _enterpriseDataVersions) {
			boolean _equals = formatVersion.getModule().equals(module);
			if (_equals) {
				result.add(formatVersion);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CommonModule> getFormatModules() {
		final BasicEList<CommonModule> result = XcoreCollectionLiterals.<CommonModule>newBasicEList();
		EList<DepEnterpriseDataVersion> _enterpriseDataVersions = this.getEnterpriseDataVersions();
		for (final DepEnterpriseDataVersion formatVersion : _enterpriseDataVersions) {
			boolean _contains = result.contains(formatVersion.getModule());
			boolean _not = (!_contains);
			if (_not) {
				result.add(formatVersion.getModule());
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case depPackage.DATA_EXCHANGE_PROJECT__EXTENSIONS:
				return ((InternalEList<?>)getExtensions()).basicRemove(otherEnd, msgs);
			case depPackage.DATA_EXCHANGE_PROJECT__ENTERPRISE_DATA_VERSIONS:
				return ((InternalEList<?>)getEnterpriseDataVersions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case depPackage.DATA_EXCHANGE_PROJECT__NAME:
				return getName();
			case depPackage.DATA_EXCHANGE_PROJECT__STORE_VERSION:
				return getStoreVersion();
			case depPackage.DATA_EXCHANGE_PROJECT__EXTENSIONS:
				return getExtensions();
			case depPackage.DATA_EXCHANGE_PROJECT__STATUS:
				return getStatus();
			case depPackage.DATA_EXCHANGE_PROJECT__ENTERPRISE_DATA_VERSIONS:
				return getEnterpriseDataVersions();
			case depPackage.DATA_EXCHANGE_PROJECT__SETTINGS_MODULES:
				return getSettingsModules();
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
			case depPackage.DATA_EXCHANGE_PROJECT__NAME:
				setName((String)newValue);
				return;
			case depPackage.DATA_EXCHANGE_PROJECT__STORE_VERSION:
				setStoreVersion((String)newValue);
				return;
			case depPackage.DATA_EXCHANGE_PROJECT__EXTENSIONS:
				getExtensions().clear();
				getExtensions().addAll((Collection<? extends DepExtension>)newValue);
				return;
			case depPackage.DATA_EXCHANGE_PROJECT__STATUS:
				setStatus((DepProjectStatus)newValue);
				return;
			case depPackage.DATA_EXCHANGE_PROJECT__ENTERPRISE_DATA_VERSIONS:
				getEnterpriseDataVersions().clear();
				getEnterpriseDataVersions().addAll((Collection<? extends DepEnterpriseDataVersion>)newValue);
				return;
			case depPackage.DATA_EXCHANGE_PROJECT__SETTINGS_MODULES:
				getSettingsModules().clear();
				getSettingsModules().addAll((Collection<? extends CommonModule>)newValue);
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
			case depPackage.DATA_EXCHANGE_PROJECT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case depPackage.DATA_EXCHANGE_PROJECT__STORE_VERSION:
				setStoreVersion(STORE_VERSION_EDEFAULT);
				return;
			case depPackage.DATA_EXCHANGE_PROJECT__EXTENSIONS:
				getExtensions().clear();
				return;
			case depPackage.DATA_EXCHANGE_PROJECT__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case depPackage.DATA_EXCHANGE_PROJECT__ENTERPRISE_DATA_VERSIONS:
				getEnterpriseDataVersions().clear();
				return;
			case depPackage.DATA_EXCHANGE_PROJECT__SETTINGS_MODULES:
				getSettingsModules().clear();
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
			case depPackage.DATA_EXCHANGE_PROJECT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case depPackage.DATA_EXCHANGE_PROJECT__STORE_VERSION:
				return STORE_VERSION_EDEFAULT == null ? storeVersion != null : !STORE_VERSION_EDEFAULT.equals(storeVersion);
			case depPackage.DATA_EXCHANGE_PROJECT__EXTENSIONS:
				return extensions != null && !extensions.isEmpty();
			case depPackage.DATA_EXCHANGE_PROJECT__STATUS:
				return status != STATUS_EDEFAULT;
			case depPackage.DATA_EXCHANGE_PROJECT__ENTERPRISE_DATA_VERSIONS:
				return enterpriseDataVersions != null && !enterpriseDataVersions.isEmpty();
			case depPackage.DATA_EXCHANGE_PROJECT__SETTINGS_MODULES:
				return settingsModules != null && !settingsModules.isEmpty();
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
			case depPackage.DATA_EXCHANGE_PROJECT___GET_VERSIONS:
				return getVersions();
			case depPackage.DATA_EXCHANGE_PROJECT___GET_MODULE_FORMAT_VERSIONS__COMMONMODULE:
				return getModuleFormatVersions((CommonModule)arguments.get(0));
			case depPackage.DATA_EXCHANGE_PROJECT___GET_FORMAT_MODULES:
				return getFormatModules();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: "); //$NON-NLS-1$
		result.append(name);
		result.append(", storeVersion: "); //$NON-NLS-1$
		result.append(storeVersion);
		result.append(", status: "); //$NON-NLS-1$
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //DataExchangeProjectImpl
