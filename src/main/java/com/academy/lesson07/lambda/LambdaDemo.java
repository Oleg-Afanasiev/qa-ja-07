package com.academy.lesson07.lambda;

public class LambdaDemo {
    public static void main(String[] args) {
        // 1 способ
        CalcAPI calculator = new CalcImpl();
        double result = calculator.add(1.0, 2.0);
        System.out.println(result);

        // 2 способ - через анонимный класс
        CalcAPI calculator2 = new CalcAPI() {

            @Override
            public double add(double x1, double x2) {
                return x1 + x2;
                // return Double.sum(x1, x2);
            }
        };

        double result2 = calculator2.add(4.0, 2.1);
        System.out.println(result2);

        // 3а способ - через лямбду
        CalcAPI calculator3 = (x1, x2) -> x1 + x2;
        double result3 = calculator3.add(10, 1);
        System.out.println(result3);

        // 3b способ - через лямбду - cсылка на метод
        CalcAPI calculator4 = Double::sum;
        double result4 = calculator3.add(3, 4);
        System.out.println(result4);
    }
}
