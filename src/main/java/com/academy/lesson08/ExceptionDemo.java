package com.academy.lesson08;

public class ExceptionDemo {
    public static void main(String[] args) {
        String[] array = {"one", "two"};

        try {
            System.out.println(array[2]);
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Error wrong index. Detail: " + exc.getMessage());
        }
        catch (Exception e) {
            System.out.println("Error: common");
        }

        try {
            div(1, 0);
        } catch (DivisionByZeroException e) {
            System.out.println(e.getMessage());
        }

        int n = 5;

        try {
            assert n == 4;
        } catch (AssertionError e) {
            System.out.println("n not equals 4. Actual: " + n);
        }

        System.out.println("finish");
    }

    private static double div(double x1, double x2) throws DivisionByZeroException {
        if (x2 == 0)
            throw new DivisionByZeroException("Division by zero");
        return x1/x2;
    }
}
