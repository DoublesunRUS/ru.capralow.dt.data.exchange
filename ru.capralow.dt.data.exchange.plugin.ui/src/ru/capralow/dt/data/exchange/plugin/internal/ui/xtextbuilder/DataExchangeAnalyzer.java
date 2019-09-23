package ru.capralow.dt.data.exchange.plugin.internal.ui.xtextbuilder;

import com._1c.g5.v8.dt.bm.index.emf.IBmEmfIndexProvider;
import com._1c.g5.v8.dt.bsl.model.DynamicFeatureAccess;
import com._1c.g5.v8.dt.bsl.model.Method;
import com._1c.g5.v8.dt.bsl.model.SimpleStatement;
import com._1c.g5.v8.dt.bsl.model.Statement;
import com._1c.g5.v8.dt.bsl.model.StringLiteral;
import com._1c.g5.v8.dt.metadata.mdclass.CommonModule;
import com._1c.g5.v8.dt.metadata.mdclass.MdObject;

public class DataExchangeAnalyzer {

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

}
