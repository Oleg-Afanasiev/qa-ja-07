package com.academy.lesson05.date;

public class Date {
    private int day = 21;
    private int month = 11;
    private int year = 2000;

    public void print() {
        System.out.println("01.01.2019");
    }

    public void print(DateFormat df) {
        if (df == DateFormat.RU)
            System.out.println(day + "." + month + "." + year);
//            System.out.println("01.01.2019");

        if (df == DateFormat.USA)
            System.out.println("01-01-2019");


    }
}
