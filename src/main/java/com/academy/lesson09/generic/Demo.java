package com.academy.lesson09.generic;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        char[] array = {'H', 'e', 'l', 'l', 'o'};
//        String str = Arrays.toString(array);
        int n = 123;
        String str = new String(array);
        String str2 = String.valueOf(array);
        String nPresentation = "" + n;
        String nPresentation2 = String.valueOf(n);

        String likeNumber = "456o";
        try {
            int numberFromString = Integer.parseInt(likeNumber);
            System.out.println(numberFromString);
        } catch (NumberFormatException e) {
            System.out.println("Wrong number. Detail: " + e.getMessage());
        }

        System.out.println(str);

        assert str.equals("Hello");
        assert str2.equals("Hello");
    }
}
