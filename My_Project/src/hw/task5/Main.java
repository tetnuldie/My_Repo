package com.itacademy.lesson11.hw.task5;

public class Main {
    public static void main(String[] args) {
        Counter count = new Counter(Integer.MIN_VALUE);
        System.out.println("Initial state = " + count.getCounter());

        try {
            count.increase();
            System.out.println("Current state = " + count.getCounter());
        } catch (RuntimeException e) {
            System.out.println("Max value reached, increasing impossible");
        }

        try {
            count.decrease();
            System.out.println("Current state = " + count.getCounter());
        } catch (RuntimeException e) {
            System.out.println("Min value reached, increasing impossible");
        }

        count.reset();
        System.out.println("Current state = " + count.getCounter());
    }
}
