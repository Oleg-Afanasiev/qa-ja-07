package com.academy.lesson09.collection;

import com.academy.lesson07.sort.model.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Exc {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person(1L, 10, "Helen"));
        list.add(new Person(3L, 16, "Kolya"));
        list.add(new Person(8L, 63, "Peter"));
        Person[] peopleArray = convertListToArray(list);
        System.out.println(Arrays.toString(peopleArray));
    }

    // TODO - конвертировать List в массив
    public static Person[] convertListToArray(List<Person> list) {
        Person[] array = list.toArray(new Person[]{});
        return array;
    }

    // TODO - конвертировать массив в List
    public static List<Person> convertArrayToList(Person[] array) {
        return null;
    }

    // TODO - конвертировать массив в Map в качестве ключа взять поле id
    public static Map<Long, Person> convertArrayToMap(Person[] array) {
        return null;
    }

    // TODO - проверить, равны ли два списка
    public static boolean checkEqualLists(List<Person> list1, List<Person> list2) {
        return false;
    }

    // TODO - конвертировать Map в List
    public static List<Person> convertMapToList(Map<Long, Person> map) {
        return null;
    }

    // TODO - конвертировать List в Массив (массив содержит только String - значения поля name)
    public static String[] convertListToModelArray(List<Person> list) {
        return null;
    }

    // TODO - конвертировать отфильтровать List, оставив только позиции по возрасту
    public static List<Person> filterByAge(List<Person> list, int age) {
        return null;
    }
}
