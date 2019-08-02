package com.academy.lesson03;

import java.util.Arrays;

public class Samples03 {
    public static void main(String[] args) {
        String[] tracks={"track_01", "track_03", "track_21", "track_15", "track_12","track_99", "track_11", "track_10"};

        // 1 способ
        System.out.println("---Выводим массив 'tracks', используя for----");
        for (int i = 0; i < tracks.length; i++) {
            System.out.println(tracks[i]);
        }

        // 2 способ
        System.out.println("---Выводим массив 'tracks', используя foreach----");
        System.out.println("2-ой способ");
        for (String element : tracks) {
            System.out.println(element);
        }

        System.out.println("---Выводим массив 'numbers', используя foreach----");
        int[] numbers = {1, 4, 6};
        for (int item: numbers) {
            System.out.println(item);
        }

        System.out.println("---Сортируем и выводим массив 'tracks'---");
        Arrays.sort(tracks);
        System.out.println();

        System.out.println("---Фильтруем и выводим массив 'tracks'---");
        System.out.println("Filter from 10 to 15");
        System.out.println("Монолитом");
        for (int i = 0; i < tracks.length; i++) {
            String currentTrack = tracks[i];
            String lastDigits = currentTrack.substring(6);
            int currentNumber = Integer.parseInt(lastDigits);
            if (currentNumber >= 10 && currentNumber <= 15)
                System.out.println(currentTrack);
        }

        System.out.println("Filter from 10 to 15");
        System.out.println("Через вспомогательный метод");
        // Вызываем метод
        String[] filteredTracks = filterByRange(tracks, 11, 15);
        System.out.println(Arrays.toString(filteredTracks));


        System.out.println("-------equals-------");
        String str1 = new String("Hello");
        String str2 = "Hello";
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        if (str1.equals(str2))
            System.out.println("equal");
        else
            System.out.println("differ");
//        System.out.println(str1 == str2);
        System.out.println("---Integer equality----");
        Integer n1 = 128;
        int n2 = 128;
        if ( n1 == n2)
            System.out.println("equal");
        else
            System.out.println("differ");

        System.out.println("---split---");
        String sentence = "Hello Helen. How are you";
        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));

    }

    /**
     * Метод фильтруем исходный массив, в котором хранятся строки формата
     * "track_34", где префикс "track_" и последние два символа - цифры.
     * Возвращает отфильтрованный массив, в который попадают треки, значения
     * цифр которых из указанного диапазона.
     * @param tracks исходный массив типа String
     * @param rangeFrom диапазон значений 'от'
     * @param rangeTo диапазон значений 'до'
     * @return исходный массив типа String
     */
    public static String[] filterByRange(String[] tracks, int rangeFrom, int rangeTo) {
        int size = 0;
        for (int i = 0; i < tracks.length; i++) {
//            String currentTrack = tracks[i];
//            String lastDigits = currentTrack.substring(6);
//            int currentNumber = Integer.parseInt(lastDigits);
            int currentNumber = parseDigits(tracks[i]);
            if (currentNumber >= rangeFrom && currentNumber <= rangeTo) {
                size++; // size = size + 1;
            }
        }

        String[] result = new String[size];
        int k = 0;
        for (int i = 0; i < tracks.length; i++) {
//            String currentTrack = tracks[i];
//            String lastDigits = currentTrack.substring(6);
//            int currentNumber = Integer.parseInt(lastDigits);
            // Вызываем метод
            int currentNumber = parseDigits(tracks[i]);
            if (currentNumber >= rangeFrom && currentNumber <= rangeTo) {
                result[k] = tracks[i];
                k++;
            }
        }

        return result;
    }

    /**
     *
     * @param track Строка формата "track_04"
     * @return число типа int, которое парсится из последних двух цифр.
     */
    public static int parseDigits(String track) {
        String lastDigits = track.substring(6);
        int currentNumber = Integer.parseInt(lastDigits);
        return currentNumber;
    }

}
