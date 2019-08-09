package com.academy.lesson08;

public class DivisionByZeroException extends Exception {

    private String name;

    public DivisionByZeroException(String name) {
        this.name = name;
    }

    @Override
    public String getMessage() {
        return "What are you doing, " + name + "?";
    }
}
