package ru.capralow.dt.data.exchange.plugin.internal.ui.diagnostics;

import org.eclipse.emf.ecore.EObject;

import com._1c.g5.v8.dt.bsl.validation.CustomValidationMessageAcceptor;
import com._1c.g5.v8.dt.metadata.mdclass.Configuration;

/*
Для Каждого ИмяПланаОбмена Из ОбщегоНазначения.ОбщийМодуль("ОбменДаннымиПовтИсп").ПланыОбменаБСП() Цикл
	
	МетаданныеПланаОбмена = Метаданные.ПланыОбмена[ИмяПланаОбмена];
	ЕстьМакет = МетаданныеПланаОбмена.Макеты.Найти("ПравилаРегистрации") <> Неопределено;
	
	Если ЕстьМакет Тогда
		Продолжить;
	Иначе
		ТекстОшибки = НСтр("ru = 'Отсутствует макет ""ПравилаРегистрации""'");
	КонецЕсли;
	
	ДобавитьОшибку(МетаданныеПланаОбмена, НСтр("ru = 'Отсутствуют правила регистрации'"), ТекстОшибки);
	
КонецЦикла;
*/

public class ExchangePlanTemplatesAndFormsDiagnostic implements BslDiagnostic {

	public static void analyze(EObject deltaObject, Configuration configuration) {
		// TODO Автоматически созданная заглушка метода

	}

	public static boolean needValidation(EObject object) {
		return false;
	}

	public static void validate(EObject object, CustomValidationMessageAcceptor messageAcceptor) {
		// TODO Автоматически созданная заглушка метода

	}

	private ExchangePlanTemplatesAndFormsDiagnostic() {
		throw new IllegalStateException(Messages.BslDiagnostic_InternalClass);
	}
}
