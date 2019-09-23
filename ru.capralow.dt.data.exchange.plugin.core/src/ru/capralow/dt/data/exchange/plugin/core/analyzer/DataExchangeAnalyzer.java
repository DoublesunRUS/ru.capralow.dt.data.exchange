package ru.capralow.dt.data.exchange.plugin.core.analyzer;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.resource.DerivedStateAwareResource;
import org.eclipse.xtext.resource.IResourceServiceProvider;

import com._1c.g5.v8.dt.bm.index.emf.IBmEmfIndexManager;
import com._1c.g5.v8.dt.bm.index.emf.IBmEmfIndexProvider;
import com._1c.g5.v8.dt.bsl.common.IModuleExtensionService;
import com._1c.g5.v8.dt.bsl.common.IModuleExtensionServiceProvider;
import com._1c.g5.v8.dt.bsl.model.Conditional;
import com._1c.g5.v8.dt.bsl.model.DynamicFeatureAccess;
import com._1c.g5.v8.dt.bsl.model.EmptyStatement;
import com._1c.g5.v8.dt.bsl.model.Expression;
import com._1c.g5.v8.dt.bsl.model.FeatureAccess;
import com._1c.g5.v8.dt.bsl.model.FeatureEntry;
import com._1c.g5.v8.dt.bsl.model.FormalParam;
import com._1c.g5.v8.dt.bsl.model.IfStatement;
import com._1c.g5.v8.dt.bsl.model.Invocation;
import com._1c.g5.v8.dt.bsl.model.Method;
import com._1c.g5.v8.dt.bsl.model.Module;
import com._1c.g5.v8.dt.bsl.model.Pragma;
import com._1c.g5.v8.dt.bsl.model.SimpleStatement;
import com._1c.g5.v8.dt.bsl.model.SourceObjectLinkProvider;
import com._1c.g5.v8.dt.bsl.model.Statement;
import com._1c.g5.v8.dt.bsl.model.StaticFeatureAccess;
import com._1c.g5.v8.dt.bsl.model.StringLiteral;
import com._1c.g5.v8.dt.bsl.resource.DynamicFeatureAccessComputer;
import com._1c.g5.v8.dt.core.platform.IConfigurationProject;
import com._1c.g5.v8.dt.core.platform.IExtensionProject;
import com._1c.g5.v8.dt.core.platform.IV8Project;
import com._1c.g5.v8.dt.core.platform.IV8ProjectManager;
import com._1c.g5.v8.dt.mcore.Environmental;
import com._1c.g5.v8.dt.metadata.mdclass.CommonModule;
import com._1c.g5.v8.dt.metadata.mdclass.Configuration;
import com._1c.g5.v8.dt.metadata.mdclass.MdObject;
import com._1c.g5.v8.dt.metadata.mdclass.Subsystem;
import com._1c.g5.v8.dt.metadata.mdclass.XDTOPackage;

import ru.capralow.dt.data.exchange.plugin.core.dep.model.DataExchangeProject;
import ru.capralow.dt.data.exchange.plugin.core.dep.model.DepEnterpriseDataVersion;
import ru.capralow.dt.data.exchange.plugin.core.dep.model.DepProjectStatus;
import ru.capralow.dt.data.exchange.plugin.core.dep.model.depFactory;
import ru.capralow.dt.data.exchange.plugin.core.utils.DataExchangeUtils;
import ru.capralow.dt.data.exchange.plugin.internal.core.DataExchangeCorePlugin;

public class DataExchangeAnalyzer {

	private static class EnterpriseDataVersions {

		private static Boolean parseSubsystemExistsStatement(IfStatement ifStatement,
				IBmEmfIndexProvider bmEmfIndexProvider) {
			Boolean trueStatement = true;

			Conditional ifPart = ifStatement.getIfPart();
			Invocation predicate = (Invocation) ifPart.getPredicate();

			FeatureAccess methodAccess = predicate.getMethodAccess();
			DynamicFeatureAccess dynamicMethodAccess = (DynamicFeatureAccess) methodAccess;

			if (dynamicMethodAccess.getName().equals("ПодсистемаСуществует")) { //$NON-NLS-1$
				StringLiteral subsystemLiteral = (StringLiteral) predicate.getParams().get(0);

				StringBuilder subsystemName = new StringBuilder();
				subsystemName.append("Подсистема"); //$NON-NLS-1$

				for (String stringPart : subsystemLiteral.getLines().get(0).replace("\"", "").split("[.]")) //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
					subsystemName.append(".").append(stringPart); //$NON-NLS-1$

				Subsystem subsystem = (Subsystem) DataExchangeUtils.getConfigurationObject(subsystemName.toString(),
						bmEmfIndexProvider);

				trueStatement = subsystem != null;
			}

			return trueStatement;
		}

		private DataExchangeProject dataExchangeProject;
		private IProject mainProject;
		private IV8ProjectManager projectManager;

		private IBmEmfIndexManager bmEmfIndexManager;

		public EnterpriseDataVersions(DataExchangeProject dataExchangeProject, IProject mainProject,
				IV8ProjectManager projectManager, IBmEmfIndexManager bmEmfIndexManager) {
			this.dataExchangeProject = dataExchangeProject;
			this.mainProject = mainProject;
			this.projectManager = projectManager;
			this.bmEmfIndexManager = bmEmfIndexManager;
		}

		private Map<String, CommonModule> getModuleFormatVersions(CommonModule mdCommonModule, Method mdMethod) {
			if (mdMethod.getFormalParams().isEmpty())
				throw new NullPointerException("Список параметров у метода пустой: " + mdMethod.getName());

			IBmEmfIndexProvider bmEmfIndexProvider = bmEmfIndexManager.getEmfIndexProvider(mainProject);

			FormalParam mdParam = mdMethod.getFormalParams().get(0);
			String variableName = mdParam.getName();

			Map<String, CommonModule> formatVersions = new HashMap<>();

			Map<String, String> modulesAliases = new HashMap<>();

			for (Statement statement : mdMethod.getStatements()) {
				if (statement instanceof IfStatement) {
					IfStatement ifStatement = (IfStatement) statement;

					boolean trueStatement = parseSubsystemExistsStatement(ifStatement, bmEmfIndexProvider);

					if (!trueStatement)
						continue;

					Conditional ifPart = ifStatement.getIfPart();
					for (Statement ifPartStatement : ifPart.getStatements()) {
						parseModuleStatement(formatVersions,
								ifPartStatement,
								variableName,
								modulesAliases,
								mdCommonModule,
								mdMethod);

					}

				} else {
					parseModuleStatement(formatVersions,
							statement,
							variableName,
							modulesAliases,
							mdCommonModule,
							mdMethod);

				}

			}

			return formatVersions;
		}

		private Map<String, CommonModule> getProjectFormatVersions(CommonModule mdMainModule, Method mdMainMethod) {

			return parseMethod(mdMainModule, mdMainMethod);
		}

		private Map<String, CommonModule> parseMethod(CommonModule mdCommonModule, Method mdMethod) {

			EList<CommonModule> settingsModules = dataExchangeProject.getSettingsModules();

			settingsModules.add(mdCommonModule);

			Map<String, CommonModule> formatVersions = new HashMap<>();

			Map<String, CommonModule> beforeFormatVersions = new HashMap<>();
			Map<String, CommonModule> insteadFormatVersions = getModuleFormatVersions(mdCommonModule, mdMethod);
			Map<String, CommonModule> afterFormatVersions = new HashMap<>();

			if (projectManager.getProject(mdCommonModule) instanceof IConfigurationProject) {
				Collection<Module> extensionModules = moduleExtensionService
						.getExtensionModules(mdCommonModule.getModule());
				for (Module extensionModule : extensionModules) {
					IExtensionProject extensionProject = (IExtensionProject) projectManager.getProject(extensionModule);

					if (!extensionProject.getParentProject()
							.equals(projectManager.getProject(mdCommonModule).getProject())) {
						continue;
					}

					Map<Pragma, Method> extensionMethods = moduleExtensionService.getExtensionMethods(extensionModule,
							mdMethod.getName());

					for (Entry<Pragma, Method> extendedMethod : extensionMethods.entrySet()) {
						Map<String, CommonModule> extensionFormatVersions = parseMethod(
								(CommonModule) extensionModule.getOwner(),
								extendedMethod.getValue());

						if (extendedMethod.getKey().getSymbol().equalsIgnoreCase("До")) { //$NON-NLS-1$
							beforeFormatVersions.putAll(extensionFormatVersions);
						} else if (extendedMethod.getKey().getSymbol().equalsIgnoreCase("Вместо")) { //$NON-NLS-1$
							insteadFormatVersions.clear();
							insteadFormatVersions.putAll(extensionFormatVersions);
						} else if (extendedMethod.getKey().getSymbol().equalsIgnoreCase("После")) { //$NON-NLS-1$
							afterFormatVersions.putAll(extensionFormatVersions);
						}

					}

				}
			}

			formatVersions.putAll(beforeFormatVersions);
			formatVersions.putAll(insteadFormatVersions);
			formatVersions.putAll(afterFormatVersions);

			return formatVersions;

		}

		private void parseModuleStatement(Map<String, CommonModule> formatVersions, Statement statement,
				String variableName, Map<String, String> modulesAliases, CommonModule commonModule, Method method) {
			if (statement instanceof EmptyStatement)
				return;

			EList<CommonModule> settingsModules = dataExchangeProject.getSettingsModules();

			SimpleStatement simpleStatement = (SimpleStatement) statement;
			Expression leftStatement = simpleStatement.getLeft();

			if (leftStatement instanceof StaticFeatureAccess) {
				String moduleAlias = ((StaticFeatureAccess) leftStatement).getName();

				String moduleName = ((StringLiteral) ((Invocation) simpleStatement.getRight()).getParams().get(0))
						.getLines().get(0).replace("\"", ""); //$NON-NLS-1$ //$NON-NLS-2$

				modulesAliases.put(moduleAlias, moduleName);

			} else {
				Invocation leftInvocation = (Invocation) leftStatement;

				FeatureAccess methodAccess = leftInvocation.getMethodAccess();

				if (methodAccess instanceof DynamicFeatureAccess) {
					DynamicFeatureAccess dynamicMethodAccess = (DynamicFeatureAccess) methodAccess;
					StaticFeatureAccess source = (StaticFeatureAccess) dynamicMethodAccess.getSource();

					if (source.getName().equalsIgnoreCase(variableName))
						parseStatementWithFormatString(formatVersions,
								leftInvocation,
								dynamicMethodAccess,
								method,
								modulesAliases);

					else
						parseStatementMethodInAnotherModule(formatVersions,
								settingsModules,
								dynamicMethodAccess,
								source,
								commonModule);

				} else {
					StaticFeatureAccess staticMethodAccess = (StaticFeatureAccess) methodAccess;

					parseStatementMethodInSameModule(formatVersions, settingsModules, staticMethodAccess, commonModule);

				}
			}
		}

		private void parseStatementMethodInAnotherModule(Map<String, CommonModule> formatVersions,
				EList<CommonModule> settingsModules, DynamicFeatureAccess dynamicMethodAccess,
				StaticFeatureAccess source, CommonModule commonModule) {
			List<FeatureEntry> featureEntries = dynamicFeatureAccessComputer.resolveObject(dynamicMethodAccess,
					EcoreUtil2.getContainerOfType(dynamicMethodAccess, Environmental.class).environments());
			if (featureEntries.isEmpty())
				throw new NullPointerException(
						"При рекурсивном разборе процедуры ПриПолученииДоступныхВерсийФормата не удалось получить FeatureEntry для очередой вложенной процедуры.");

			FeatureEntry featureEntry = featureEntries.get(0);
			EObject feature = featureEntry.getFeature();

			EObject newObject = EcoreFactory.eINSTANCE.createEObject();
			((InternalEObject) newObject).eSetProxyURI(((SourceObjectLinkProvider) feature).getSourceUri());
			Method mdSubMethod = (Method) EcoreUtil.resolve(newObject, commonModule);
			if (mdSubMethod.eResource() instanceof DerivedStateAwareResource)
				((DerivedStateAwareResource) mdSubMethod.eResource()).installDerivedState(false);

			IBmEmfIndexProvider bmEmfIndexProvider = bmEmfIndexManager.getEmfIndexProvider(mainProject);
			String subModuleName = DataExchangeUtils.MD_COMMONMODULE.concat(".").concat(source.getName());
			CommonModule subCommonModule = (CommonModule) DataExchangeUtils.getConfigurationObject(subModuleName,
					bmEmfIndexProvider);
			if (subCommonModule == null) {
				bmEmfIndexProvider = bmEmfIndexManager
						.getEmfIndexProvider(projectManager.getProject(mdSubMethod).getProject());
				subCommonModule = (CommonModule) DataExchangeUtils.getConfigurationObject(subModuleName,
						bmEmfIndexProvider);
			}
			if (subCommonModule == null) {
				String msg = MessageFormat.format("Не найден объект конфигурации: \"{0}\"", subModuleName);
				throw new NullPointerException(msg);
			}
			settingsModules.add(subCommonModule);

			Map<String, CommonModule> moduleFormatVersions = parseMethod(subCommonModule, mdSubMethod);

			formatVersions.putAll(moduleFormatVersions);
		}

		private void parseStatementMethodInSameModule(Map<String, CommonModule> formatVersions,
				EList<CommonModule> settingsModules, StaticFeatureAccess staticMethodAccess,
				CommonModule commonModule) {
			List<FeatureEntry> featureEntries = dynamicFeatureAccessComputer.resolveObject(staticMethodAccess,
					EcoreUtil2.getContainerOfType(staticMethodAccess, Environmental.class).environments());
			if (featureEntries.isEmpty())
				return;

			FeatureEntry featureEntry = featureEntries.get(0);
			EObject feature = featureEntry.getFeature();

			Method mdSubMethod = (Method) feature;

			Map<String, CommonModule> moduleFormatVersions = parseMethod(commonModule, mdSubMethod);

			settingsModules.add(commonModule);
			formatVersions.putAll(moduleFormatVersions);
		}

		private void parseStatementWithFormatString(Map<String, CommonModule> formatVersions, Invocation leftInvocation,
				DynamicFeatureAccess dynamicMethodAccess, Method method, Map<String, String> modulesAliases) {
			if (!dynamicMethodAccess.getName().equalsIgnoreCase("Вставить"))
				throw new NullPointerException(
						"В процедуре ПриПолученииДоступныхВерсийФормата ожидалось выражение ВерсииФормата.Вставить, но что-то пошло не так.");

			EList<Expression> params = leftInvocation.getParams();
			String versionNumber = ((StringLiteral) params.get(0)).getLines().get(0);
			versionNumber = versionNumber.substring(1, versionNumber.length() - 1);
			String moduleAlias = ((StaticFeatureAccess) params.get(1)).getName();

			String moduleName = modulesAliases.get(moduleAlias);
			if (moduleName == null)
				moduleName = moduleAlias;

			IBmEmfIndexProvider bmEmfIndexProvider = bmEmfIndexManager.getEmfIndexProvider(mainProject);
			String formatModuleName = DataExchangeUtils.MD_COMMONMODULE.concat(".").concat(moduleName); //$NON-NLS-1$
			CommonModule mdFormatModule = (CommonModule) DataExchangeUtils.getConfigurationObject(formatModuleName,
					bmEmfIndexProvider);
			if (mdFormatModule == null) {
				bmEmfIndexProvider = bmEmfIndexManager
						.getEmfIndexProvider(projectManager.getProject(method).getProject());
				mdFormatModule = (CommonModule) DataExchangeUtils.getConfigurationObject(formatModuleName,
						bmEmfIndexProvider);
			}
			if (mdFormatModule == null) {
				String msg = MessageFormat.format("Не найден объект конфигурации: \"{0}\"", formatModuleName);
				throw new NullPointerException(msg);
			}

			formatVersions.put(versionNumber, mdFormatModule);

		}
	}

	private static IModuleExtensionService moduleExtensionService = IModuleExtensionServiceProvider.INSTANCE
			.getModuleExtensionService();

	private static DynamicFeatureAccessComputer dynamicFeatureAccessComputer = IResourceServiceProvider.Registry.INSTANCE
			.getResourceServiceProvider(URI.createURI("foo.bsl")).get(DynamicFeatureAccessComputer.class); //$NON-NLS-1$

	public static DataExchangeProject analyzeProjectAndSave(IConfigurationProject configurationProject, URI xmiURI,
			IV8ProjectManager projectManager, IBmEmfIndexManager bmEmfIndexManager) {
		DataExchangeProject dataExchangeProject = analyzeProject(configurationProject,
				projectManager,
				bmEmfIndexManager);
		saveResource(dataExchangeProject, xmiURI);

		return dataExchangeProject;
	}

	public static URI getResourceURIforPlugin(IProject project) {
		return DataExchangeUtils.getResourceURIforPlugin(project.getName(), "dataExchangeProject"); //$NON-NLS-1$
	}

	public static void saveResource(DataExchangeProject dataExchangeProject, URI xmiUri) {
		try {
			XMIResource xmiResource = new XMIResourceImpl(xmiUri);

			xmiResource.getContents().add(dataExchangeProject);
			final Map<Object, Object> saveOptions = xmiResource.getDefaultSaveOptions();
			saveOptions.put(XMLResource.OPTION_ENCODING, "UTF-8"); //$NON-NLS-1$
			xmiResource.save(saveOptions);

		} catch (IOException e) {
			String msg = "Не удалось сохранить вторичные данные для ExchangeProject. Перезапустите сборку проекта.";
			DataExchangeCorePlugin.log(DataExchangeCorePlugin.createErrorStatus(msg, e));

		}
	}

	private static void addFormatVersion(Map<String, CommonModule> formatVersions,
			DataExchangeProject dataExchangeProject, IProject mainProject, IV8ProjectManager projectManager) {
		EList<DepEnterpriseDataVersion> enterpriseDataVersions = dataExchangeProject.getEnterpriseDataVersions();

		List<String> sortedVersions = new ArrayList<>(formatVersions.keySet());
		Collections.sort(sortedVersions);
		for (String version : sortedVersions) {
			XDTOPackage xdtoPackage = findXdtoPackage(version, mainProject, projectManager);

			if (xdtoPackage == null)
				continue;

			DepEnterpriseDataVersion epFormatVersion = depFactory.eINSTANCE.createDepEnterpriseDataVersion();

			CommonModule formatModule = formatVersions.get(version);

			epFormatVersion.setVersion(version);
			if (projectManager.getProject(formatModule) instanceof IExtensionProject) {
				IExtensionProject formatProject = (IExtensionProject) projectManager.getProject(formatModule);

				epFormatVersion.setExtensionName(formatProject.getConfiguration().getName());
			}
			epFormatVersion.setModuleName(formatModule.getName());

			epFormatVersion.setModule(formatModule);
			epFormatVersion.setXdtoPackage(xdtoPackage);

			enterpriseDataVersions.add(epFormatVersion);
		}

	}

	private static DataExchangeProject analyzeProject(IConfigurationProject configurationProject,
			IV8ProjectManager projectManager, IBmEmfIndexManager bmEmfIndexManager) {
		DataExchangeProject dataExchangeProject = depFactory.eINSTANCE.createDataExchangeProject();

		IProject mainProject = configurationProject.getProject();
		dataExchangeProject.setName(mainProject.getName());

		Configuration mdConfiguration = configurationProject.getConfiguration();
		if (mdConfiguration == null) {
			dataExchangeProject.setStatus(DepProjectStatus.NO_CONFIGURATION);
			return dataExchangeProject;
		}

		IBmEmfIndexProvider bmEmfIndexProvider = bmEmfIndexManager.getEmfIndexProvider(mainProject);
		MdObject configurationObject = DataExchangeUtils
				.getConfigurationObject("Подсистема.СтандартныеПодсистемы.ОбменДанными", bmEmfIndexProvider); //$NON-NLS-1$
		if (configurationObject == null) {
			dataExchangeProject.setStatus(DepProjectStatus.NO_SUBSYSTEM);
			return dataExchangeProject;
		}

		String sslVersion = getSSLVersion(bmEmfIndexProvider);
		if (sslVersion.isEmpty()) {
			dataExchangeProject.setStatus(DepProjectStatus.NO_SSL_VERSION);
			return dataExchangeProject;
		}

		if (compareVersions(sslVersion, "2.4.1") == -1) //$NON-NLS-1$
			dataExchangeProject.setStoreVersion("1"); //$NON-NLS-1$
		else
			dataExchangeProject.setStoreVersion("2"); //$NON-NLS-1$

		configurationObject = DataExchangeUtils.getConfigurationObject(
				DataExchangeUtils.MD_COMMONMODULE.concat(".").concat("ОбменДаннымиПереопределяемый"), //$NON-NLS-1$//$NON-NLS-2$
				bmEmfIndexProvider);
		if (configurationObject == null) {
			dataExchangeProject.setStatus(DepProjectStatus.NO_COMMON_MODULE);
			return dataExchangeProject;
		}
		CommonModule mdModule = (CommonModule) configurationObject;

		Method mdMethod = DataExchangeUtils.getMethod(mdModule.getModule(), "ПриПолученииДоступныхВерсийФормата"); //$NON-NLS-1$
		if (mdMethod == null) {
			dataExchangeProject.setStatus(DepProjectStatus.NO_METHOD);
			return dataExchangeProject;
		}

		EnterpriseDataVersions projectFormatVersions = new EnterpriseDataVersions(dataExchangeProject,
				mainProject,
				projectManager,
				bmEmfIndexManager);

		Map<String, CommonModule> formatVersions = projectFormatVersions.getProjectFormatVersions(mdModule, mdMethod);
		if (formatVersions.size() == 0) {
			dataExchangeProject.setStatus(DepProjectStatus.EMPTY_METHOD);
			return dataExchangeProject;
		}

		addFormatVersion(formatVersions, dataExchangeProject, mainProject, projectManager);

		dataExchangeProject.setStatus(DepProjectStatus.READY);

		return dataExchangeProject;
	}

	private static Integer compareVersions(String version1, String version2) {

		String[] levels1 = version1.split("\\."); //$NON-NLS-1$
		String[] levels2 = version2.split("\\."); //$NON-NLS-1$

		Integer length = Math.max(levels1.length, levels2.length);
		for (Integer i = 0; i < length; i++) {
			Integer v1 = i < levels1.length ? Integer.parseInt(levels1[i]) : 0;
			Integer v2 = i < levels2.length ? Integer.parseInt(levels2[i]) : 0;
			Integer compare = v1.compareTo(v2);
			if (compare != 0) {
				return compare;
			}
		}

		return 0;
	}

	private static XDTOPackage findXdtoPackage(String version, IProject mainProject, IV8ProjectManager projectManager) {
		String namespace = "http://v8.1c.ru/edi/edi_stnd/EnterpriseData/" + version; //$NON-NLS-1$

		XDTOPackage xdtoPackage = getXDTOPackageByNamespace(mainProject, namespace, projectManager);
		if (xdtoPackage == null) {
			for (IExtensionProject extensionProject : projectManager.getProjects(IExtensionProject.class)) {
				if (!(extensionProject.getParentProject().equals(mainProject)))
					continue;

				xdtoPackage = getXDTOPackageByNamespace(extensionProject.getProject(), namespace, projectManager);
				if (xdtoPackage != null)
					return xdtoPackage;
			}
		}

		if (xdtoPackage == null) {
			String msg = MessageFormat.format("Не найден Пакет XDTO: \"{0}\"", namespace);
			DataExchangeCorePlugin.log(DataExchangeCorePlugin.createErrorStatus(msg));
			return null;
		}

		return xdtoPackage;
	}

	private static String getSSLVersion(IBmEmfIndexProvider bmEmfIndexProvider) {
		String version = ""; //$NON-NLS-1$

		MdObject configurationObject = DataExchangeUtils.getConfigurationObject(
				DataExchangeUtils.MD_COMMONMODULE.concat(".").concat("ОбновлениеИнформационнойБазыБСП"), //$NON-NLS-1$ //$NON-NLS-2$
				bmEmfIndexProvider);
		if (configurationObject == null)
			return version;

		CommonModule mdCommonModule = (CommonModule) configurationObject;

		Method mdMethod = DataExchangeUtils.getMethod(mdCommonModule.getModule(), "ПриДобавленииПодсистемы"); //$NON-NLS-1$
		if (mdMethod == null)
			return version;

		for (Statement mdStatement : mdMethod.getStatements()) {
			DynamicFeatureAccess methodAccess = (DynamicFeatureAccess) ((SimpleStatement) mdStatement).getLeft();

			if (methodAccess.getName().equalsIgnoreCase("Версия")) { //$NON-NLS-1$
				version = ((StringLiteral) ((SimpleStatement) mdStatement).getRight()).getLines().get(0);
				version = version.substring(1, version.length() - 1);
				break;
			}
		}

		return version;
	}

	private static XDTOPackage getXDTOPackageByNamespace(IProject project, String namespace,
			IV8ProjectManager projectManager) {
		IV8Project v8Project = projectManager.getProject(project);

		EList<XDTOPackage> xdtoPackages;
		if (v8Project instanceof IConfigurationProject)
			xdtoPackages = ((IConfigurationProject) v8Project).getConfiguration().getXDTOPackages();
		else
			xdtoPackages = ((IExtensionProject) v8Project).getConfiguration().getXDTOPackages();

		for (XDTOPackage xdtoPackage : xdtoPackages) {
			if (xdtoPackage.getNamespace().equals(namespace))
				return xdtoPackage;
		}

		return null;
	}

	private DataExchangeAnalyzer() {
		throw new IllegalStateException("Вспомогательный класс");
	}
}
