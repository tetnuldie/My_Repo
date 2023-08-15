package com.itacademy.lesson_13_test;

public class Task3 {
    public static void main(String[] args) {
        double e = Math.E;
        double pi = Math.PI;

        double x = 0.5;
        double summ = 0;
        double n = 0;


        for (int i = 1; i <= 20; i++) {
            summ = summ + (Math.sin(x * i / 2) + Math.sin((i * x - 1) / 2)) / Math.pow(e, (x - 1.0 / i));
            n = i;
        }

        double res;
        res = Math.sqrt(n * pi) * summ;
        System.out.println(res);
    }
}
