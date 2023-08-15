package com.itacademy.lesson_13_test;

public class Task2 {
    public static void main(String[] args) {
        double e = Math.E;
        double pi = Math.PI;
        double x, y;

        for (x = 0.5; x <= 1.0; x += 0.05) {
            if(x == 0.5){
                System.out.println("===========================");
                System.out.println("||\tx\t\t||\ty\t\t||");
                System.out.println("===========================");
            }

            y = Math.sqrt(Math.pow(e, 2.2 * x)) - Math.abs(Math.sin(pi * x / (x + (2. / 3.)))) + 1.7;
            System.out.printf("||\t%.3f\t||\t%.3f\t||\n",x,y);

        }
        System.out.println("===========================");
    }

}
