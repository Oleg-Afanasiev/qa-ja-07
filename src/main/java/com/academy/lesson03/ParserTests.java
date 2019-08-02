package com.academy.lesson03;

public class ParserTests {
    public static void main(String[] args) {
        int number = Samples03.parseDigits("track_03");
        // Для работы assert нужно запускать с ключем -ea
        assert number == 3;

//        if (number == 3)
//            System.out.println("Ok");
//        else
//            System.out.println("Fail");
    }
}
