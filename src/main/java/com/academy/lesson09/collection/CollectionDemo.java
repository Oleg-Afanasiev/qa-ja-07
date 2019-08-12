package com.academy.lesson09.collection;

import com.academy.lesson07.sort.model.Person;

import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {
        String[] arrayNames = {"Oleg", "Lena", "Peter"};

        List<String> listNames = new ArrayList<>();
        listNames.add("Alex");
        listNames.add("Kolya");
        listNames.add("Ivan");

        System.out.println(Arrays.toString(arrayNames));
        System.out.println(listNames);

        System.out.println(arrayNames[2]);
        System.out.println(listNames.get(2));

        if (arrayNames.length > 3)
            System.out.println(arrayNames[3]);

        if (listNames.size() > 3)
            System.out.println(listNames.get(3));

        listNames.remove(0);
        System.out.println(listNames);

        listNames.add(1, "Наташа");
        System.out.println(listNames);
        listNames.sort(String::compareTo);

        listNames = new ArrayList<>(Arrays.asList(arrayNames)); // Коллекцию из листа
        // listNames = Arrays.asList(arrayNames); //*** Почем так делать плохо?
        System.out.println(listNames);
        String[] arrayFromList = listNames.toArray(new String[0]); // hardcore на уровне java

        //--------------
        List<Integer> listInt1 = new ArrayList<>();
        listInt1.add(1);
        listInt1.add(2);
        listInt1.add(13);
        System.out.println(listInt1);

        List<Integer> listInt2 = new ArrayList<>();
        listInt2.add(2);
        listInt2.add(1);
        listInt2.add(13);
        System.out.println(listInt2);

        System.out.println(listInt1 == listInt2);

        listInt1.sort(Integer::compareTo);
        listInt2.sort(Integer::compareTo);
        System.out.println(listInt1.equals(listInt2));
        System.out.println("List2: " + listInt2);

        Set<Person> setOfPersons = new HashSet<>(); // необходим
        setOfPersons.add(new Person(20, "Peter"));
        setOfPersons.add(new Person(21, "Peter"));
        System.out.println(setOfPersons);

        Set<Integer> setOfNumbers1 = new HashSet<>();
        setOfNumbers1.add(1);
        setOfNumbers1.add(2);
        setOfNumbers1.add(13);
        System.out.println(setOfNumbers1);

        Set<Integer> setOfNumbers2 = new HashSet<>();
        setOfNumbers2.add(2);
        setOfNumbers2.add(1);
        setOfNumbers2.add(13);
        System.out.println(setOfNumbers2);

        System.out.println(setOfNumbers1.equals(setOfNumbers2));
        listInt1.add(5);
        listInt1.add(2);
        Set<Integer> setFromList = new HashSet<>(listInt1);
        System.out.println(setFromList);

        // for list
        System.out.println("For  list: ");
        for (int element : listInt1)
            System.out.println(element);

        System.out.println("For set: ");
        for (int element : setFromList) {
            System.out.println(element);
        }

        Iterator<Integer> iterator = setFromList.iterator();

        System.out.println("Iterator set: ");
        while (iterator.hasNext()) {
            int element = iterator.next();
            System.out.println(element);
        }

        System.out.println(setFromList.contains(5));

        Map<Long, String> map = new HashMap<>();

        map.put(5L, "five");
        map.put(10L, "ten");
        map.put(5L, "zero"); // перезаписали

        System.out.println(map.get(5L));
        System.out.println(map.get(6L));

        System.out.println("For map:");
        Set<Long> keys = map.keySet();
        for (Long key : keys) {
            String value = map.get(key);
            System.out.println(
                    String.format("Key-> %s, value-> %s", key, value));
        }

        Collection<String> values = map.values();
        // for

        System.out.println("For map:");
        for (Map.Entry<Long, String> item :map.entrySet()){
            System.out.println(
                    String.format("Key-> %s, value-> %s", item.getKey(), item.getValue()));
        }
    }
}
