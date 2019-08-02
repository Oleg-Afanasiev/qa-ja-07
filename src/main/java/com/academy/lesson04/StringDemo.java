package com.academy.lesson04;

public class StringDemo {
    public static void main(String[] args) {
        String str = "d1";
        char digit = str.charAt(1);
        System.out.println(digit);
        System.out.println((int)digit);
        System.out.println(Character.isDigit(digit));
        char digitBeng = '\u0F69';
        System.out.println(digitBeng);
        System.out.println(Character.isDigit(digitBeng));

        // Найдем кол-во вхождений строки 'target' в исходной строке 'sentence'
        String sentence = "Hefinishedllo,finished worlfinishedd.finished Byfinished.";
        String target = "finished";
        int index = sentence.indexOf(target);
        int count = 0;
        while(index != -1) {
            count++;
            System.out.println(index);
            index = sentence.indexOf(target, index+1);
        }
        System.out.println("count: " + count);
        //===============================
        // Демонстрация работы button
//        int indexNext = sentence.indexOf(target, 33);

//        System.out.println(indexNext);
        Button btn = new Button();
        Button btnCancel = new Button();
        btn.text = "Login";
        btnCancel.text = "Cancel";

        System.out.println("btn.text " + btn.text);
        System.out.println("btnCancel.text " + btnCancel.text);
        System.out.println(btn);
        btn.click();

        Button.baseText = "Demo button";
        Button.baseText = "Demo button Cancel";
        System.out.println(Button.baseText);
        btn.baseClick(); //
        Button.baseClick();
    }
}
