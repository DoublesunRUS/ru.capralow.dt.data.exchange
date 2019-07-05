package ru.capralow.dt.data.exchange.plugin.internal.ui.diagnostics;

import org.eclipse.emf.ecore.EObject;

import com._1c.g5.v8.dt.bsl.validation.CustomValidationMessageAcceptor;
import com._1c.g5.v8.dt.metadata.mdclass.Configuration;

/*
ПрефиксИнформационнойБазыПоУмолчанию = "";
ОбщегоНазначения.ОбщийМодуль("ОбменДаннымиПереопределяемый").ПриОпределенииПрефиксаИнформационнойБазыПоУмолчанию(ПрефиксИнформационнойБазыПоУмолчанию);
Если ПустаяСтрока(ПрефиксИнформационнойБазыПоУмолчанию) Или СтрДлина(ПрефиксИнформационнойБазыПоУмолчанию) <> 2 Тогда
	ДобавитьОшибку(Метаданные.ОбщиеМодули.ОбменДаннымиПереопределяемый,
		НСтр("ru = 'Некорректно задан префикс ИБ по умолчанию'"),
		НСтр("ru = 'Неправильно задан префикс информационной по умолчанию.'"));
КонецЕсли;
*/

public class DataExchangeConfigurationPrefixDiagnostic implements BslDiagnostic {

	public static void analyze(EObject deltaObject, Configuration configuration) {
		// TODO Автоматически созданная заглушка метода
	}

	public static boolean needValidation(EObject object) {
		return false;
	}

	public static void validate(EObject object, CustomValidationMessageAcceptor messageAcceptor) {
		// TODO Автоматически созданная заглушка метода

	}

	private DataExchangeConfigurationPrefixDiagnostic() {
		throw new IllegalStateException(Messages.BslDiagnostic_InternalClass);
	}
}
