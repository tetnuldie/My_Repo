package com.itacademy.lesson11.hw.task3;

import java.util.Arrays;

public class Student {
    private String name;
    private int group;
    private int[] performance;
    private String[][] students;

    public Student() {
        name = "Surname N.Fn";
        group = 0;
        performance = new int[]{0, 0, 0, 0, 0};
    }

    public Student(String _name, int _group, int[] _performance) {
        name = _name;
        group = _group;
        performance = _performance;
    }

    public String[][] getStudents() {
        return students;
    }

    public void setStudents(String[][] students) {
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int[] getPerformance() {
        return performance;
    }

    public void setPerformance(int[] performance) {
        this.performance = performance;
    }

    public String[] setStudentData() {
        String[] studentData = new String[]{name, String.valueOf(group), Arrays.toString(performance)};
        return studentData;
    }

    public String[][] excellents(String[][] all) {
        int index = 0;
        String[][] temp = new String[10][];
        for (int i = 0; i < all.length; i++) {
            if (all[i][2].contains("1") || all[i][2].contains("2") || all[i][2].contains("3")
                    || all[i][2].contains("4") || all[i][2].contains("5") || all[i][2].contains("6")
                    || all[i][2].contains("7") || all[i][2].contains("8")) {
                continue;
            } else {
                temp[index] = all[i];
                index += 1;
            }
        }
        if (index > 0) {
            String[][] excellents = new String[index][];

            for (int i = 0; i < excellents.length; i++) {
                excellents[i] = temp[i];
            }
            return excellents;
        } else {
            return null;
        }
    }
}
