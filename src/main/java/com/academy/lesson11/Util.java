package com.academy.lesson11;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Util {
    private static final Logger LOG = LogManager.getLogger(Util.class);

    public static void assertWithLogging(int actual, int expected) {
        try {
            assert actual == expected;
        } catch (Throwable e) {
            LOG.error("Error expected={}, actual={}",expected, actual);
        }
    }
}
