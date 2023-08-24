package com.itacademy.lesson11.hw.task3;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Student s = new Student();

        String[][] students = new String[10][];

        for (int i = 0; i < students.length; i++){
            int[] p = new int[5];
            for (int j = 0; j < p.length; j++){

                p[j] = rand.nextInt(1,10);
            }
            String n = "Student "+(i+1);
            int g = rand.nextInt(1,5);

            s.setName(n);
            s.setGroup(g);
            s.setPerformance(p);

            students[i] = s.setStudentData();

        }

        s.setStudents(students);

        System.out.println(Arrays.deepToString(s.getStudents()));

        System.out.println("Excellents listed below:");
        System.out.println(Arrays.deepToString(s.excellents(s.getStudents())));

    }
}
