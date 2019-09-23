# dt.data.exchange [![Build Status](https://travis-ci.com/DoublesunRUS/ru.capralow.dt.data.exchange.svg)](https://travis-ci.com/DoublesunRUS/ru.capralow.dt.data.exchange) [![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=DoublesunRUS_ru.capralow.dt.data.exchange&metric=alert_status)](https://sonarcloud.io/dashboard?id=DoublesunRUS_ru.capralow.dt.data.exchange) [![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=DoublesunRUS_ru.capralow.dt.data.exchange&metric=sqale_rating)](https://sonarcloud.io/dashboard?id=DoublesunRUS_ru.capralow.dt.data.exchange) [![Coverage](https://sonarcloud.io/api/project_badges/measure?project=DoublesunRUS_ru.capralow.dt.data.exchange&metric=coverage)](https://sonarcloud.io/dashboard?id=DoublesunRUS_ru.capralow.dt.data.exchange)


## Обмен данными для [1C:Enterprise Development Tools](http://v8.1c.ru/overview/IDE/) 1.13

Минимальная версия EDT: 1.13.0

Текущий релиз в ветке [master: 0.1.0](https://github.com/DoublesunRUS/ru.capralow.dt.data.exchange/tree/master).<br>
Разработка ведется в ветке [dev](https://github.com/DoublesunRUS/ru.capralow.dt.data.exchange/tree/dev).<br>

В данном репозитории хранятся только исходники.<br>

Плагин можно установить в EDT через пункт "Установить новое ПО" указав сайт обновления http://capralow.ru/edt/data.exchange/latest/ .<br>
Для самостоятельной сборки плагина необходимо иметь доступ к сайту https://releases.1c.ru и настроить соответствующим образом Maven. Подробности настройки написаны [здесь](https://github.com/1C-Company/dt-example-plugins/blob/master/simple-plugin/README.md).<br>

### Поддерживаемые версии БСП
3.0.1,3.0.2,3.0.3<br>
3.1.1,3.1.2<br>

### Возможности
Плагин проверяет правильность внедрения подсистемы Обмен данными БСП

### Правильность внедрения БСП
Реализованы проверки, аналогичные отчету ПроверкаВнедренияБСП:
* ПроверитьОбращениеКНесуществующимНастройкамПлановОбмена();
* ПроверитьНаличиеМакетовИФорм();
* ПроверитьСоставОбщихКоманд();
* ПроверитьСоставПлановОбмена();
* ПроверитьВставкиКодаМодулейМенеджераПлановОбмена();
* ПроверитьПрефиксИнформационнойБазыПоУмолчанию();
* ПроверитьУказаниеИмениКонфигурацииПриемника();
