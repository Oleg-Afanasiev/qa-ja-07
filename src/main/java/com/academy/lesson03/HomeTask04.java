package com.academy.lesson03;

public class HomeTask04 {
    public static void main(String[] args) {
        String origin = "com.academy.lesson03HomeTask04";
        String converted = origin.replaceAll("\\d", "");
        String deleted = origin.replaceAll("[^\\d]", "");

        System.out.println("Origin: " + origin);
        System.out.println("converted: " + converted);
        System.out.println("deleted: " + deleted);

        int n = 5;
        int m = -5;
        String strFlagPositive1 = n > 0 ? "Positive" : "Negative";
        String strFlagPositive2 = m > 0 ? "Positive" : "Negative";
        System.out.println(strFlagPositive1);
        System.out.println(strFlagPositive2);
    }
}
