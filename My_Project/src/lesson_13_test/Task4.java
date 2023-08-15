package com.itacademy.lesson_13_test;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {

        int n = 10;
        int[] points_x = arrayGen(n);
        int[] points_y = arrayGen(n);

        System.out.println(Arrays.toString(points_x));
        System.out.println(Arrays.toString(points_y));

        int count = 0;

        for (int i = 0; i < n; i++) {

            if ((points_x[i] >= -2 && points_y[i] <= 2) || (points_x[i] <= 2 && points_y[i] <= 1) ||
                    (points_x[i] <= 2 && points_y[i] >= -2)){
                count++;
            }
        }

        System.out.println("From "+n+" Points, "+count+" ones are fit a given area");
    }

    public static int[] arrayGen(int n) {
        int[] mas = new int[n];
        Random rand = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = rand.nextInt(0, 10);

        }
        return mas;
    }
}
