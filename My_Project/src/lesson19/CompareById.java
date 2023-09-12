package com.itacademy.lesson11.hw.lesson19;

import java.util.Comparator;

public class CompareById implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o1.getId(), o2.getId());
    }
}
