package com.itacademy.lesson_13_test;

public class Task7 {
    public static void main(String[] args) {
        int N, M;
        double X, HX;
        double Z, HZ;
        double y;
        int count = 1;

        N = 5;
        M = 7;

        X = 10.0;
        HX = 0.5;


        HZ = 0.3;

        System.out.println("=============================================");
        System.out.println("||\tNo\t||\t  X  \t||\t  Z  \t||\t  y  \t||");


        for(int i = 0; i < N; i++){
            Z = 3;
            for(int j = 0; j < M; j++){
                y = Math.sqrt(Z * Z + X * X) * Math.log(Z) + Math.abs(Math.log(Z))/Math.sqrt(X * X - Z * Z + 3.2);
                System.out.printf("||\t%d\t||\t%.2f\t||\t%.2f\t||\t%.2f\t||\n",count, X, Z, y);
                count++;
                Z = Z + HZ;
            }
            X = X + HX;

        }

        System.out.println("=============================================");
    }
}
