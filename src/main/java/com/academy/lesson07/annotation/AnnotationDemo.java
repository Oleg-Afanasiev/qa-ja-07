package com.academy.lesson07.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnnotationDemo {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        DemoTests tests = new DemoTests();

        // Запуск вручную
        tests.test1();
        tests.test3();

        // Запуск по аннотациям (вникать необязательно)
        System.out.println("Запуск по аннотациям");
        Method[] methods = DemoTests.class.getDeclaredMethods();
        for (Method method : methods)
            if (method.isAnnotationPresent(RunTest.class))
                method.invoke(tests);
    }

}
