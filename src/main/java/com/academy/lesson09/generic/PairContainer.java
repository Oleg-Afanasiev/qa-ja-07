package com.academy.lesson09.generic;

public class PairContainer<T, U> {
    private T key;
    private U value;

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    public U getValue() {
        return value;
    }

    public void setValue(U value) {
        this.value = value;
    }
}
