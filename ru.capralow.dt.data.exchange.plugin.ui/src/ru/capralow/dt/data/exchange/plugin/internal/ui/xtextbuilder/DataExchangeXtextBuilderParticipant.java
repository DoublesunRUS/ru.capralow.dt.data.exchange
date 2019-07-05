package ru.capralow.dt.data.exchange.plugin.internal.ui.xtextbuilder;

import java.text.MessageFormat;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.builder.IXtextBuilderParticipant;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescription.Delta;

import com._1c.g5.v8.dt.core.platform.IConfigurationProject;
import com._1c.g5.v8.dt.core.platform.IV8Project;
import com._1c.g5.v8.dt.core.platform.IV8ProjectManager;
import com._1c.g5.v8.dt.metadata.mdclass.Configuration;
import com.google.inject.Inject;

import ru.capralow.dt.data.exchange.plugin.internal.ui.DataExchangeUiPlugin;
import ru.capralow.dt.data.exchange.plugin.internal.ui.diagnostics.DataExchangeCommonCommandsSourcesDiagnostic;
import ru.capralow.dt.data.exchange.plugin.internal.ui.diagnostics.DataExchangeConfigurationPrefixDiagnostic;
import ru.capralow.dt.data.exchange.plugin.internal.ui.diagnostics.DataExchangeConfigurationRecepientNameDiagnostic;
import ru.capralow.dt.data.exchange.plugin.internal.ui.diagnostics.DataExchangeManagerModuleDiagnostic;
import ru.capralow.dt.data.exchange.plugin.internal.ui.diagnostics.ExchangePlanDataExchangeSettingsDiagnostic;
import ru.capralow.dt.data.exchange.plugin.internal.ui.diagnostics.ExchangePlanSourcesDiagnostic;
import ru.capralow.dt.data.exchange.plugin.internal.ui.diagnostics.ExchangePlanTemplatesAndFormsDiagnostic;

public class DataExchangeXtextBuilderParticipant implements IXtextBuilderParticipant {
	private static EObject getDeltaObject(Delta delta) {
		EObject object = null;

		IResourceDescription deltaDescription = delta.getNew();
		if (deltaDescription == null)
			return null;

		Iterator<IEObjectDescription> objectItr = deltaDescription.getExportedObjects().iterator();
		if (objectItr.hasNext()) {
			IEObjectDescription objectDescription = objectItr.next();
			object = objectDescription.getEObjectOrProxy();

			if (object == null) {
				String msg = MessageFormat.format(
						Messages.DataExchangeXtextBuilderParticipant_Unable_to_find_configuration_object_0,
						objectDescription.getName());
				DataExchangeUiPlugin.log(DataExchangeUiPlugin.createErrorStatus(msg));
				return null;
			}
		}

		return object;
	}

	@Inject
	private IV8ProjectManager projectManager;

	@Override
	public void build(IBuildContext context, IProgressMonitor monitor) throws CoreException {
		IProject project = context.getBuiltProject();
		IV8Project v8Project = projectManager.getProject(project);

		if (!(v8Project instanceof IConfigurationProject))
			return;

		Configuration configuration = ((IConfigurationProject) v8Project).getConfiguration();

		List<Delta> deltas = context.getDeltas();
		for (Delta delta : deltas) {
			EObject deltaObject = getDeltaObject(delta);
			if (deltaObject == null)
				continue;

			ExchangePlanDataExchangeSettingsDiagnostic.analyze(deltaObject, configuration);
			ExchangePlanTemplatesAndFormsDiagnostic.analyze(deltaObject, configuration);
			DataExchangeCommonCommandsSourcesDiagnostic.analyze(deltaObject, configuration);
			ExchangePlanSourcesDiagnostic.analyze(deltaObject, configuration);
			DataExchangeManagerModuleDiagnostic.analyze(deltaObject, configuration);
			DataExchangeConfigurationPrefixDiagnostic.analyze(deltaObject, configuration);
			DataExchangeConfigurationRecepientNameDiagnostic.analyze(deltaObject, configuration);
		}
	}

}
