package com.academy.lesson11;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class LoggerDemo {
    private static final Logger LOG = LogManager.getLogger(LoggerDemo.class);

    public static void main(String[] args) {
        System.out.println("Hello world!!!");

        // Вывести на консоль с помощью логера

        // Вывести в файл с помощью логера
        LOG.debug("Hello world direct to file logger");
        LOG.info("Hello world direct to console/file logger");

        String[] names = {"Kolya", "Lena", "Ira", "Valya"};

        try {
            Arrays.stream(names)
                    .sorted((s1, s2)-> {
                        LOG.debug("Comparing: s1='{}' with s2='{}'",
                                s1, s2);
                        return Integer.compare(s1.length(), s2.length());
                    })
                    .forEach(LOG::debug);
        } catch (Exception e) {
            LOG.error("Error while looping array. Details: {}", e.getMessage() );
//            throw e;
        }

        int n = 5;
        Util.assertWithLogging(n, 5);

        System.out.println("Finish");
    }
}
