package com.academy.lesson04.track;

public class TrackCorrectorDemo {
    public static void main(String[] args) {
        String[] tracks={"Track_01", "   track_03", "trACk_21", "track_15   ", "   tRAck_12   ","track_99", "track_11", "track_10"};
        Corrector corrector = new Corrector(tracks);
        // обрезаны пробелы в начале в конце
        corrector.trimSpaces();
        // символ в верхний регистр
        corrector.firstSymbolsToUpperCase();
        // остальные в нижнем
        corrector.lastToLowerCase();
        // фильтруем по диапазону
        corrector.filterByRange(10, 15);
        // выводим на консоль лезультат
        corrector.println();
//        System.out.println(Arrays.toString(corrector.getArray()));

        String[] convertedTracks =
                new Corrector(tracks)
                        .firstly()
                        .trimSpaces()
                        .then()
                        .firstSymbolsToUpperCase()
                        .and()
                        .lastToLowerCase()
                        .then()
                        .filterByRange(12, 20)
                        .and()
                        .println()
                        .last()
                        .getArray();
    }
}
