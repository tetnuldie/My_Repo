package com.itacademy.lesson11.hw.task3_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Group g1 = new Group(listFill(), 1);
        Group g2 = new Group(listFill(), 2);
        Group g3 = new Group(listFill(), 3);

        var exc1 = g1.getExcellents(g1.getStudents());


        for(Student s : exc1){
            System.out.println(s.getName());
        }
    }

    public static List<Student> listFill(){
        Random rand = new Random();
        List<Student> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int[] perf = new int[5];

            for (int j = 0; j < perf.length; j++) {
                perf[j] = rand.nextInt(1, 11);
            }
            list.add(new Student("Student " + (i + 1), perf));

        }

        return list;
    }
}


