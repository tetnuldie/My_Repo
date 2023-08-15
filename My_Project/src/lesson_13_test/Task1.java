package com.itacademy.lesson_13_test;

public class Task1 {
    public static void main(String[] args) {
        double e = Math.E;
        double pi = Math.PI;
        double x, y;

        x = 0.5;

        y = Math.sqrt(Math.pow(e, 2.2 * x)) - Math.abs(Math.sin(pi * x / (x + (2. / 3.)))) + 1.7;

        System.out.println(y);
    }
}
