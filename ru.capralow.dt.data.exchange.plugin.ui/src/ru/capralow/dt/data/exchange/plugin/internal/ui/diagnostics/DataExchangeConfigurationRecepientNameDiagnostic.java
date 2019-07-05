package ru.capralow.dt.data.exchange.plugin.internal.ui.diagnostics;

import org.eclipse.emf.ecore.EObject;

import com._1c.g5.v8.dt.bsl.validation.CustomValidationMessageAcceptor;
import com._1c.g5.v8.dt.metadata.mdclass.Configuration;

/*
МодульОбменДаннымиПовтИсп = ОбщегоНазначения.ОбщийМодуль("ОбменДаннымиПовтИсп");
МодульОбменДаннымиСервер  = ОбщегоНазначения.ОбщийМодуль("ОбменДаннымиСервер");

Для Каждого ПланОбмена Из Метаданные.ПланыОбмена Цикл
	Если Не ПланОбмена.РаспределеннаяИнформационнаяБаза
		И МодульОбменДаннымиПовтИсп.ПланОбменаИспользуетсяВМоделиСервиса(ПланОбмена.Имя)
		И МодульОбменДаннымиСервер.ЭтоРазделенныйПланОбменаБСП(ПланОбмена.Имя) Тогда
		
		НастройкиОбмена = МодульОбменДаннымиСервер.ЗначениеНастройкиПланаОбмена(ПланОбмена.Имя, "ЭтоПланОбменаXDTO, ИмяКонфигурацииПриемника");
		Если НастройкиОбмена.ЭтоПланОбменаXDTO Тогда
			Продолжить;
		КонецЕсли;
		
		Если Не ЗначениеЗаполнено(НастройкиОбмена.ИмяКонфигурацииПриемника)
			Или НастройкиОбмена.ИмяКонфигурацииПриемника.Количество() = 0 Тогда
			МетаданныеПланаОбмена = Метаданные.ПланыОбмена[ПланОбмена.Имя];
			ДобавитьОшибку(МетаданныеПланаОбмена, НСтр("ru = 'Отсутствует обязательная настройка плана обмена'"),
				НСтр("ru = 'В процедуре ""ПриПолученииНастроек"" модуля менеджера плана обмена
					|не задано значение обязательного свойства ""ИмяКонфигурацииПриемника""'"));
		КонецЕсли;
	КонецЕсли;
КонецЦикла;
*/

public class DataExchangeConfigurationRecepientNameDiagnostic implements BslDiagnostic {

	public static void analyze(EObject deltaObject, Configuration configuration) {
		// TODO Автоматически созданная заглушка метода
	}

	public static boolean needValidation(EObject object) {
		return false;
	}

	public static void validate(EObject object, CustomValidationMessageAcceptor messageAcceptor) {
		// TODO Автоматически созданная заглушка метода

	}

	private DataExchangeConfigurationRecepientNameDiagnostic() {
		throw new IllegalStateException(Messages.BslDiagnostic_InternalClass);
	}
}