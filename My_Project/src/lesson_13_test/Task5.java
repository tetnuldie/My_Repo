package com.itacademy.lesson_13_test;

public class Task5 {
    public static void main(String[] args) {
        double e = Math.E;
        double A = 1.0;
        int N = 20;

        double x, y, dx;

        x = -2 * A;
        dx = A / 5;

        for(int i = 0; i < N; i++){
            if(x <= 0){
                y =  (A / 2) * (Math.pow(e, x / A) + Math.pow(e, -x / A));
            } else{
                y = 4 * Math.pow(A, 3) / (x * x + 4 * A * A);
            }
            x += dx;

            System.out.printf("For X = %.3f Y = %.3f\n", x, y);
        }
    }
}
