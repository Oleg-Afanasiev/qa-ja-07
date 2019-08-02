package com.academy.lesson04;

public class Button {
    public String text;
    static String baseText;
    private int width;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width < 0)
            return;

        this.width = width;
    }

    void click() {
        text = "noName";
        System.out.println("Click button");
    }

    static void baseClick() {
        System.out.println("Click base " + baseText);
        // System.out.println("Click base " + text);
    }

    void init() { }
}
