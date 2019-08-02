package com.academy.lesson06;

import java.util.Arrays;

public class EnumDemo {
    public static void main(String[] args) {
        String gender = "m";

//        if (gender.equals("m"))
            System.out.println("Мужчина");

        Gender g = Gender.FEMALE;
        g = Gender.MALE;

        if (g == Gender.FEMALE)
            System.out.println("Женщина");
        else
            System.out.println("Вы ошиблись дверью");

        System.out.println("----------");
        System.out.println(g);
        System.out.println(g.ordinal());
        System.out.println(g.name());
//        g.maxage = 120;
        System.out.println(g.getMaxage());
        System.out.println(Arrays.toString(Gender.values()));
    }
}
