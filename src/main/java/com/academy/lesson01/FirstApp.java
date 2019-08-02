package com.academy.lesson01;

//import java.util.Scanner;

import java.util.Scanner;

// Первое приложение
public class FirstApp {
    // Точка входа
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Integer age = scanner.nextInt();
        System.out.print("Hello " + name + " age " + age);

        // 2 - ой спосок
//        Scanner scanner = new Scanner(System.in);
//        String name = scanner.nextLine();
//        Object age = scanner.nextLine();
//        if (age instanceof Integer)
//            System.out.print("Hello " + name + " age " + age);
//        else
//            System.out.println("Ошибка");
    }
}
