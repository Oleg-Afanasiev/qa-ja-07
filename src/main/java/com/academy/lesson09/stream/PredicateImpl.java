package com.academy.lesson09.stream;

import java.util.function.Predicate;

public class PredicateImpl implements Predicate<Integer> {

    @Override
    public boolean test(Integer e) {
//        if (e >= 1 && e <=5)
//            return true;
//        else
//            return false;

        return e >= 1 && e <= 5;
    }
}
