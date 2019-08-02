package com.academy.lesson04.internal;

import com.academy.lesson04.Button;

public class DemoButton {
    public static void main(String[] args) {
        Button btn = new Button();
        btn.text = "SignIn";
        System.out.println(btn.text);
//        btn.width = -10;
        btn.setWidth(10);
        System.out.println(btn.getWidth());
    }
}
