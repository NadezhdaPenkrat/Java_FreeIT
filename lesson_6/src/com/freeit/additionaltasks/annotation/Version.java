package com.freeit.additionaltasks.annotation;

/*
Придумать и написать собственную аннотацию @Version,
которая бует хранить информацию о версии класса сервиса
(поле обязательное) MyService
 и кодовое название версии (поле не обязательное) -
 (например номер версии = 7.1, а кодовое название версии = Nougat).
*/

import java.lang.annotation.*;

@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)

public @interface Version {

    double versionNumber();

    String versionName();

}
