package com.example.essentialsjava;

import java.lang.reflect.Method;

public class AnnotationRunner {
    public static void run(Object obj) throws Exception {

        Class<?> clazz = obj.getClass();

        for(Method method : clazz.getDeclaredMethods()) {

            if(method.isAnnotationPresent(LogAnnotation.LogExecution.class)) {

                System.out.println("Executing method: " + method.getName());

                method.invoke(obj);
            }
        }
    }
}
