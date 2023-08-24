package com.itacademy.lesson11.hw.task4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        List<Train> schedule_1 = new ArrayList<>();

        Schedule sc = new Schedule(15);
        var schedule_1 = sc.getSchedule();

        for (int i = 0; i < schedule_1.size(); i++){//initial trains data
            System.out.println(schedule_1.get(i).toString());
        }
        System.out.println();

        sc.sortSchedule();//sort train schedule

        for (int i = 0; i < schedule_1.size(); i++){//sorted trains schedule
            System.out.println(schedule_1.get(i).toString());
        }
        System.out.println();

        try {//Get trains list by input number
            List<Train> sc2 = sc.getTrainByNumber(intInput());

            for (int i = 0; i < sc2.size(); i++) {
                System.out.println(sc2.get(i).toString());
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
