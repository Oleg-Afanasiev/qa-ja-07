package com.academy.lesson06;

import com.academy.lesson05.component.Label;
import com.academy.lesson05.component.LabelExt;

public class PolymorphismDemo {
    public static void main(String[] args) {
        Object obj = new Object();
        String strObj = obj.toString();

        Label lbl = new Label();
        String strLbl = lbl.toString();

        Object objLbl = new Label();
        objLbl = lbl;
//        objLbl.setHeight(10);

//        Label lbl2 = new Object();
//        lbl2.setHeight(10);

        Object[] array = new Object[10];
        array[0] = new Label();
//        array[1] = new Object();
        array[2] = new LabelExt();
        array[3] = "Привет";
        array[4] = new PolymorphismDemo();
        array[5] = 1;

        int m = 1 + (Integer)array[5];

        if (array[3] instanceof Integer) {
            Integer n = (Integer) array[3];
            System.out.println(n);
        }

        if (array[2] instanceof String) {
            String str = (String) array[2];
            System.out.println(str);
        }



        System.out.println("----");
        Object obj3 = 4;
        System.out.println(obj3);
        obj3 = "Hi";
        System.out.println(obj3);
//        var someVar = 3;
    }
}
