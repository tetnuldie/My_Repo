package com.itacademy.lesson_13_test;

public class Task8 {
    public static void main(String[] args) {
        double x, y;
        double e = Math.E;

        x = 0.1;
        double d = 0.1;

        do {
            y = x * x - Math.pow(e, 2 * x) + 4;
            System.out.printf("x = %.2f y = %.2f\n", x,y);

            x = x + d;

            if(y == 0 ){
                System.out.println("Null of function when x ="+ x);
                break;
            }
            if(x >= 10){
                System.out.printf("Calculation stopped when x = %.2f\n",x);
                break;
            }
        } while (true);
    }
}
