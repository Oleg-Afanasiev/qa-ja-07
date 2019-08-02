package com.academy.lesson02;

import java.util.Arrays;

public class Samples {
    public static void main(String[] args) {
        System.out.println("----Пример переполнения типа int----");
        long longNumber = 10000000000L; // суффикс 'L' для типа long
        int intNumber = (int)longNumber; // значение number не поместится в int => число исказится

        System.out.println("longNumber = " + longNumber);
        System.out.println("intNumber = " + intNumber); // ожидаем увидеть

        int maxInt = Integer.MAX_VALUE; // способ программно задать максимальное значение
        long maxIntPlusOne = maxInt + 1L; // для int значение уже переполнено
        System.out.println("maxInt = " + maxInt);
        System.out.println("maxInt + 1 = " + maxIntPlusOne); // выводим как long
        System.out.println("(int)(maxInt + 1) = " + (int)maxIntPlusOne); // выводим как int

        System.out.println("-------Потеря точности с типом double--------");
        double x = 1.1;
        double y = 3;
        double z = 5;
        double result = z - y - x;
        System.out.println("result = " + result);

        System.out.print("2-1.1 = ");
        System.out.println(2-1.1);
        System.out.println(0.9);

        System.out.println("Потеря точности с типом float");
        System.out.print("4.2f*100 = ");
        System.out.println(4.2f*100); // пример с типом float

        System.out.println("-----Коллизия приведения типов-----");
        System.out.println((int)(char)(byte)-1); // ???

        System.out.println("-----Коллизии сложения------");
        System.out.println("H" + "i"); // ОК
        System.out.println('H' + 'i'); // Складываются коды символов
        System.out.println((char)('H' + 'i')); //

        System.out.println("2+2 = " + 2 + 2); // склеиваются к строке
        System.out.println("2+2 = " + (2 + 2)); // ОК

        System.out.println("-----------");
        String localVar = ""; // Обязательно проинициализировать перед использованием
        System.out.println(localVar);

        System.out.println("-------Массивы------");
        int rows = 2;
        int cols = 3;
        int[][] array = new int[rows][cols]; // создали массив 2*3 => все элементы равны 0

        // 1 способ
        // создаем и инициализируем значениями
        // получаем массив 2 на 3
        int[][] arrayExc = {
                {1, 2, 3},
                {4, 5, 6}
        };

        // 2 способ
        // можно и так
        int[][] arrayExc2 = {
                new int[]{1, 2, 3},
                new int[3]
        };

        // инициализируем отдельные элементы массива
        arrayExc2[1][0] = 4;
        arrayExc2[1][1] = 5;
        arrayExc2[1][2] = 6;

        System.out.print("arrayExc = ");
        System.out.println(arrayExc); // так не работает вывод

        System.out.print("Arrays.deepToString(arrayExc) = ");
        System.out.println(Arrays.deepToString(arrayExc)); // так можно вывести многомерный массив
//        System.out.println(Arrays.toString(arrayExc2[0]));

        // Exc
        int size = 10; // размер массива
        int[] simpleArray = new int[size]; // создаем массив
        simpleArray[0] = -4; // первый элемент
        simpleArray[4] = 23; // пятый элемент
        simpleArray[simpleArray.length-1] = 12; // последний элемент
        simpleArray[size-1] = 13; // последний элемент

        // инициализируем значениями от 1 до 10
        for (int j = 0; j < size; j++) {
            simpleArray[j] = j + 1;
        }
        System.out.print("simpleArray = ");
        System.out.println(Arrays.toString(simpleArray));

        System.out.println("---Выводим в обратном порядке---");
        System.out.println("1-ый способ:");
        // 1 способ
        for (int j = size - 1; j >= 0; j--) {
            System.out.print(simpleArray[j]);
            System.out.print(" ");
        }

        System.out.println();
        System.out.println("2-ой способ:");
        // 2 способ
        for (int j = 0; j < size; j++) {
            System.out.print(simpleArray[size-j-1]);
            System.out.print(" ");
        }

        // Двумерный
        System.out.println("\n\n");
        System.out.println("----Двумерный массив----");
        int row = 3;
        int col = 5;
        int[][] arrayComplex = new int[row][col]; // создаем

        // 1 способ
        System.out.println("Инициализируем последовательными значениями");
        System.out.println("через вспомогательную переменную 'value'");
        int value = 1; // текущее значение
        for (int r = 0; r < arrayComplex.length; r++) {
            for (int c = 0; c < arrayComplex[r].length; c++) {
                arrayComplex[r][c] = value;
                value++;
            }
        }

        System.out.println();
        System.out.println("Вывод:");
        for (int r = 0; r < arrayComplex.length; r++) {
            for (int c = 0; c < arrayComplex[r].length; c++) {
                System.out.print(arrayComplex[r][c]);
                System.out.print(" ");
            }
            System.out.println();
        }

        // 2 способ
        System.out.println("-------------");
        System.out.println("Инициализируем последовательными значениями");
        System.out.println("без вспомогательной переменной");
        for (int r = 0; r < arrayComplex.length; r++) {
            for (int c = 0; c < arrayComplex[r].length; c++) {
                arrayComplex[r][c] = c + r*col + 1; // ВОТ ЭТА ФОРМУЛА
            }
        }

        System.out.println();
        System.out.println("Вывод (более аккуратный),");
        System.out.println("используя String.format:");
        for (int r = 0; r < arrayComplex.length; r++) {
            for (int c = 0; c < arrayComplex[r].length; c++) {
                System.out.print(String.format("%3d", arrayComplex[r][c]));
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
