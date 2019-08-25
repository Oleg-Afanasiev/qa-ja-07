package com.academy.lesson11;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

public class CollectionDemo {
    private static final Logger LOG = LogManager.getLogger(CollectionDemo.class);

    public static void main(String[] args) {
        Map<Long, String> map = new HashMap<>();
        map.put(1L, "one");
        map.put(2L, "thwo");
        map.put(6L, "Hello");
        map.put(8L, "");
        map.put(9L, "!");

        for (Map.Entry<Long, String> entry: map.entrySet()) {
//            map.put(3L, "ten");
            LOG.info("Key={}, Value={}", entry.getKey(), entry.getValue());
        }

        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("one");
        list.add("two");
        list.add("two");
        list.add("two");
        list.add("two");
        list.add("five");
        list.add("zero");
        list.add("zero");

        Map<String, Integer> mapCounter = new TreeMap<>();
        for(String element : list) {
            if (mapCounter.containsKey(element))
                mapCounter.put(element, mapCounter.get(element) + 1) ;
            else
                mapCounter.put(element, 1);
        }

        for (Map.Entry<String, Integer> entry: mapCounter.entrySet()) {
//            map.put(3L, "ten");
            LOG.info("Key={}, Value={}", entry.getKey(), entry.getValue());
        }
    }
}
