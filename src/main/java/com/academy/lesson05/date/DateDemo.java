package com.academy.lesson05.date;

public class DateDemo {
    public static void main(String[] args) {
        Date date = new Date();
        date.print();
        date.print(DateFormat.RU);
        date.print(DateFormat.USA);
    }
}
