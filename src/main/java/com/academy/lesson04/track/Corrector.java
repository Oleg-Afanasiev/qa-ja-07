package com.academy.lesson04.track;

import java.util.Arrays;

/**
 *  Через этот класс мы выполним все преобразования над массивом стром,
 *  в частном случае содержащем 'track'
 */
public class Corrector {
    private String[] array; // рабочий массив хранится здесь

    // Todo
    /**
     * Конструктор класса. Через конструктор мы сразу инициализируем
     * рабочий массив. Его недостаток в том, что все преобразования
     * будут видимы и для исходного массива.
     */
    public Corrector(String[] array) {
        this.array = array;
    }

    /**
     *
     * @return возвращает преобразованный массив
     */
    public String[] getArray() {
        return array;
    }

    /**
     * Переводит первый символ в верхний регистр
     * для каждого элемента массива
     */
    public Corrector firstSymbolsToUpperCase() {
        for (int i = 0; i < array.length; i++) {
            array[i] = toUpperCase(array[i]);
        }

        return this;
    }

    public Corrector lastToLowerCase() {
        for (int i = 0; i < array.length; i++){
            array[i] = toLowerCase(array[i]);
        }

        return this;
    }

    /**
     * Метод обрезает пробелы (начальные и конечные) для каждого
     * элемента массива
     */
    public Corrector trimSpaces() {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].trim();
        }
        return this;
    }

    /**
     * Вспомогательный метод, который переводит первый символ в верхний регистр
     * текущего элемента массива.
     * @param rawTrack
     * @return
     * @Example toUpperCase("track_23") => "Track_23"
     */
    private String toUpperCase(String rawTrack) {
        String first = Character.toString(rawTrack.charAt(0));
        String last = rawTrack.substring(1);
        String result = first.toUpperCase() + last;
        return result;
    }
    private String toLowerCase(String rawTrack) {
        String first = Character.toString(rawTrack.charAt(0));
        String last = rawTrack.substring(1);
        String result = first + last.toLowerCase();
        return result;
    }

    public Corrector filterByRange(int from, int to) {
        int size = 0;
        for (int i = 0; i < array.length; i++) {
            int currentNumber = parseDigits(array[i]);
            if (currentNumber >= from && currentNumber <= to) {
                size++; // size = size + 1;
            }
        }

        String[] result = new String[size];
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            // Вызываем метод
            int currentNumber = parseDigits(array[i]);
            if (currentNumber >= from && currentNumber <= to) {
                result[k] = array[i];
                k++;
            }
        }

        array = result;
        return this;
    }

    private int parseDigits(String track) {
        String lastDigits = track.substring(6);
        int currentNumber = Integer.parseInt(lastDigits);
        return currentNumber;
    }

    public Corrector println() {
        System.out.println(Arrays.toString(array));
        return this;
    }

    public Corrector firstly() {
        return this;
    }

    public Corrector then() {
        return this;
    }

    public Corrector and() {
        return this;
    }

    public Corrector last() {
        return this;
    }

    public Corrector вначале() {
        return this;
    }

    public Corrector давайте_попробуем() {
        return this;
    }

    @Override
    public String toString() {
        return "Corrector{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
