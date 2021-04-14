package com.freeit.additionaltasks.annotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class VersionProcessor {

    public void getVersion(Class<? extends MyService> clazz) throws Exception {

        boolean annotationPresent = clazz.isAnnotationPresent(Version.class);

        if (annotationPresent) {
            Version annotation = clazz.getAnnotation(Version.class);
            System.out.println(" versionNumber = " + annotation.versionNumber());
            System.out.println(" versionName = " + annotation.versionName());

            Constructor<?> constructor = clazz.getConstructor();
            MyService myService = (MyService) constructor.newInstance();

            Method method = clazz.getDeclaredMethod("thisClassInfo");
            System.out.println(method);

            method.setAccessible(true);
            method.invoke(myService);
        } else System.out.println("Not available true data");
    }
}

