package com.academy.lesson09.stream;

import java.util.Comparator;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        System.out.println("--1--");
        Stream.of(1, 3, 5, 5)
            .forEach(System.out::println);

        System.out.println("--2--");
        long countNumbers = Stream.of(1, 3, 5, 5)
                .count();
        System.out.println(countNumbers);

        System.out.println("--3a--");
        int[] array = {1, 3, 8, 5, 5, 10, 5, 2, 6, 7};
        Predicate<Integer> predicateImpl = new PredicateImpl();
        for (int e : array) {
            if (predicateImpl.test(e))
                System.out.println(e);
        }

        System.out.println("--3b--");
        Stream.of(1, 3, 8, 5, 5, 10, 5, 2, 6, 7)
                .filter(predicateImpl)
                .forEach(System.out::println);

        System.out.println("--3c--");
        long countAfterFilter = Stream.of(1, 3, 8, 5, 5, 10, 5, 2, 6, 7)
                .filter(e -> e >= 1 && e <= 5)
                .count();

        System.out.println(countAfterFilter);

        System.out.println("--4--");
        Stream.of(1, 3, 8, 5, 5, 10, 5, 2, 6, 7)
                .limit(2)
                .map(e -> e*10)
                .peek(System.out::println)
                .map(e-> e+1)
                .peek(System.out::println)
                .map(e-> "Element: " + e)
                .forEach(System.out::println)
        ;

        System.out.println("--5--");
        Stream.of(1, 3, 8, 5, 5, 10, 5, 2, 6, 7)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println)
        ;

        System.out.println("--6a--");
        String minString = Stream.of("one", "two", "three")
                .max(String::compareTo)
                .get();

        System.out.println(minString);

        System.out.println("--7a--");
        String reduced = Stream.of("one", "two", "three")
                .reduce((s1, s2) -> s1 + s2)
                .get();

        System.out.println(reduced);
    }
}
