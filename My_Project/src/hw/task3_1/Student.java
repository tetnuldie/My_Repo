package com.itacademy.lesson11.hw.task3_1;

public class Student {
    private String name;
    private int[] performance;

    public Student(String name, int[] performance) {
        this.name = name;
        this.performance = performance;
    }

    public Student() {
        this.name = "Random Student";
        this.performance = new int[]{0, 0, 0, 0, 0};
    }

    public String getName() {
        return name;
    }


    public int[] getPerformance() {
        return performance;
    }
}
