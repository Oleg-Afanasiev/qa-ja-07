package com.academy.lesson09.generic;

import com.academy.lesson07.sort.model.Person;

public class GenericDemo {
    public static void main(String[] args) {
        Container<String> stringContainer = new Container<>();
        stringContainer.setElement("Hello");
//        stringContainer.setElement(123);
        String str = stringContainer.getElement();
        System.out.println(str);

        Container<Integer> integerContainer = new Container<>();
        integerContainer.setElement(12);
//        integerContainer.setElement("Hello");
        int n = integerContainer.getElement();
        System.out.println(n);

        Container<Object> commonContainer = new Container<>();
        commonContainer.setElement("");
        commonContainer.setElement(123);

        Object obj = commonContainer.getElement();
        int  m = (Integer) commonContainer.getElement();

        PairContainer<String, Integer> pairContainer = new PairContainer<>();
        pairContainer.setKey("key_1");
        pairContainer.setValue(1);

        PairContainer<String, String> pairContainer2 = new PairContainer<>();
        pairContainer2.setKey("key_1");
        pairContainer2.setValue("1");

        PairContainer<String, Container<Integer>> pairContainer3 = new PairContainer<>();
        pairContainer3.setKey("key_1");
        pairContainer3.setValue(integerContainer);

        Integer el = pairContainer3.getValue().getElement();
        System.out.println(el);

        PairContainer<String, Person> pairContainer4 = new PairContainer<>();
    }
}
