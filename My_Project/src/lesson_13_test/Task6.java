package com.itacademy.lesson_13_test;

public class Task6 {
    public static void main(String[] args) {

        double A, B, M;

        A = 3 * Math.pow(10, 3);
        B = 6 * Math.pow(10, 4);
        M = 4;

        double T1, T2, T3, T4;

        T1 = Math.sqrt(A + B + M);
        T2 = M * Math.sqrt(A + B);
        T3 = Math.sqrt(A * B * M);
        T4 = M * Math.sqrt(A * B);

        double fK;
        int count = 0;


        for (double K = -30; K < 60; K += 4.5) {
            if(K % 1 != 0){
                continue;
            }
            fK = Math.pow(K, 3) - 25 * K * K + 50 * K + 1000;

            if((fK >= T1 && fK <= T2) || (fK >= T3 && fK <= T4)){
                System.out.printf("For K = %.0f f(K) = %.0f\n", K, fK);
            }else {
                count++;
            }

        }
        System.out.println("Amount of valid values of f(K) = "+count);

    }
}
