package com.academy.lesson05.component;

public class Button implements Component {
    private String text = "NoName";

    @Override
    public void draw() {
        System.out.println("I'm Button");
    }

    public void print() {
        System.out.println("My text is next: " + text);
    }
}
