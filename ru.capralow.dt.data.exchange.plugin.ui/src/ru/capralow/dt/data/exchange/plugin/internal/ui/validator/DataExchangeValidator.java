package ru.capralow.dt.data.exchange.plugin.internal.ui.validator;

import org.eclipse.emf.ecore.EObject;

import com._1c.g5.v8.dt.bsl.validation.CustomValidationMessageAcceptor;
import com._1c.g5.v8.dt.bsl.validation.IExternalBslValidator;

import ru.capralow.dt.data.exchange.plugin.internal.ui.diagnostics.DataExchangeCommonCommandsSourcesDiagnostic;
import ru.capralow.dt.data.exchange.plugin.internal.ui.diagnostics.DataExchangeConfigurationPrefixDiagnostic;
import ru.capralow.dt.data.exchange.plugin.internal.ui.diagnostics.DataExchangeConfigurationRecepientNameDiagnostic;
import ru.capralow.dt.data.exchange.plugin.internal.ui.diagnostics.DataExchangeManagerModuleDiagnostic;
import ru.capralow.dt.data.exchange.plugin.internal.ui.diagnostics.ExchangePlanDataExchangeSettingsDiagnostic;
import ru.capralow.dt.data.exchange.plugin.internal.ui.diagnostics.ExchangePlanSourcesDiagnostic;
import ru.capralow.dt.data.exchange.plugin.internal.ui.diagnostics.ExchangePlanTemplatesAndFormsDiagnostic;

public class DataExchangeValidator implements IExternalBslValidator {

	@Override
	public boolean needValidation(EObject object) {

		if (ExchangePlanDataExchangeSettingsDiagnostic.needValidation(object)
				|| ExchangePlanTemplatesAndFormsDiagnostic.needValidation(object)
				|| DataExchangeCommonCommandsSourcesDiagnostic.needValidation(object)
				|| ExchangePlanSourcesDiagnostic.needValidation(object)
				|| DataExchangeManagerModuleDiagnostic.needValidation(object)
				|| DataExchangeConfigurationPrefixDiagnostic.needValidation(object)
				|| DataExchangeConfigurationRecepientNameDiagnostic.needValidation(object))
			return true;
		return false;
	}

	@Override
	public void validate(EObject object, CustomValidationMessageAcceptor messageAcceptor) {
		ExchangePlanDataExchangeSettingsDiagnostic.validate(object, messageAcceptor);
		ExchangePlanTemplatesAndFormsDiagnostic.validate(object, messageAcceptor);
		DataExchangeCommonCommandsSourcesDiagnostic.validate(object, messageAcceptor);
		ExchangePlanSourcesDiagnostic.validate(object, messageAcceptor);
		DataExchangeManagerModuleDiagnostic.validate(object, messageAcceptor);
		DataExchangeConfigurationPrefixDiagnostic.validate(object, messageAcceptor);
		DataExchangeConfigurationRecepientNameDiagnostic.validate(object, messageAcceptor);
	}

}
