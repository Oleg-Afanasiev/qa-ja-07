package com.academy.lesson07.sort;

import com.academy.lesson07.sort.comparator.PersonByAgeComparator;
import com.academy.lesson07.sort.comparator.PersonByNameThenByAgeComparator;
import com.academy.lesson07.sort.comparator.StringBy3LetterComparator;
import com.academy.lesson07.sort.model.Person;

import java.util.Arrays;
import java.util.Comparator;

public class SortDemo {
    public static void main(String[] args) {
        String[] array = {
                "Hello",
                "Bye",
                "Zero",
                "Main",
                "SortDemo",
                "lesson07"};

        System.out.println(Arrays.toString(array));
        // Сортируем, используя естественный порядок для String
        // 'Естественный' определяется уже реализованным методом
        // у класс String:
        // int compareTo(String anotherString) {...}
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        // Сортируем, используя нужный нам порядок.
        // 'Способ упорядочивания' мы объясняем через
        // реализацию интерфейса 'Comparator'
        Arrays.sort(array, new StringBy3LetterComparator());
        System.out.println(Arrays.toString(array));

        Person[] persons = {
                new Person(25, "Helen"),
                new Person(32, "Kolya"),
                new Person(27, "Kolya"),
                new Person(23, "Kolya"),
                new Person(27, "Kolya"),
                new Person(15, "Peter"),
                new Person(18, "Sasha"),
                new Person(74, "Boris"),
                new Person(27, "Kolya"),
                new Person(56, "Ivan"),
        };

        System.out.println(Arrays.toString(persons));

        System.out.println("---------Sorted persons-----");
        Arrays.sort(persons, new PersonByAgeComparator());
        System.out.println(Arrays.toString(persons));

        System.out.println("---------Sorted persons-----");
        Arrays.sort(persons);
        System.out.println(Arrays.toString(persons));

        System.out.println("---------Sort by name then by age persons-----");
        Arrays.sort(persons, new PersonByNameThenByAgeComparator());
        // 2
        Comparator<Person> byNameByAgeComparator = new PersonByNameThenByAgeComparator();
        Arrays.sort(persons, byNameByAgeComparator);
        System.out.println(Arrays.toString(persons));

        Arrays.sort(array, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(array));
    }
}
