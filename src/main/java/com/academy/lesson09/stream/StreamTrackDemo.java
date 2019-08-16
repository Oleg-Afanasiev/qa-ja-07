package com.academy.lesson09.stream;

import java.util.Arrays;

public class StreamTrackDemo {
    public static void main(String[] args) {
        String[] tracks = {"Track_01", "_", "   track_03", "trACk_21", "track_15   ", "   tRAck_12   ","track_99", "track_11", "track_10"};

        // Используяю streamAPI
        // 1) обрезать пробелы
        // 2) фильтр от 10 до 15
        // 3) Вывести на консоль
        // 4)* Сумму номеров (последних двух цифр)
        int sum = Arrays.stream(tracks)
                .filter(s->s.length()>=2)
                .map(String::trim)
//                .filter(s->filterMapByRange(s, 10, 15))
                .filter(StreamTrackDemo::filterMapByRange)
                .peek(System.out::println)
                .mapToInt(s -> Integer.parseInt(s.substring(s.length() - 2)))
                .peek(System.out::println)
                .sum();

        System.out.println("Sum: " + sum);
    }

    private static boolean filterMapByRange(String track, int from, int to) {
        return true;
    }

    private static boolean filterMapByRange(String track) {
        return true;
    }
}
