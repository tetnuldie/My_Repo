package com.itacademy.lesson11.hw.task4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Schedule sc = new Schedule(15);
        var schedule_1 = sc.getSchedule();

        for (Train t : schedule_1){//initial trains data
            System.out.println(t.toString());
        }
        System.out.println();

        sc.sortSchedule();//sort train schedule

        for (Train t : schedule_1){//sorted trains schedule
            System.out.println(t.toString());
        }
        System.out.println();

        try {//Get trains list by input number
            var sc2 = sc.getTrainByNumber(intInput());

            for (Train t : sc2) {
                System.out.println(t.toString());
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        System.out.println();

    }

    public static int intInput() {//Scanner for ints
        Scanner sc = new Scanner(System.in);

        System.out.print(":> ");

        while (!sc.hasNextInt()) {
            String s = sc.nextLine();
            System.out.println("incorrect value");
            System.out.print(":> ");
        }

        int x = sc.nextInt();
        sc.nextLine();

        return x;

    }

}
