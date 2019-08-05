package com.academy.lesson07;

import com.academy.lesson05.component.Button;
import com.academy.lesson05.component.Component;

public class InterfaceDemo {
    public static void main(String[] args) {
        Button btn = new Button();
        btn.draw();
        btn.print();
        // 2-способ
        System.out.println("-----");
        Component btn2 = new Button();
        btn2.draw();
        if (btn2 instanceof Component)
            ((Button)btn2).print();
    }
}
