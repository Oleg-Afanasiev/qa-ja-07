package com.academy.lesson05.component;

public interface Component {
    void draw();
    default void drawTransparent() {
        System.out.println("Draw default");
    }
}
