package com.itacademy.lesson11.hw.lesson19;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Employee> employees = new TreeSet<>();

        employees.add(new Employee(111,"Vasily", "Psition 1",10.99f));
        employees.add(new Employee(222,"Peter", "Psition 2",17.99f));
        employees.add(new Employee(333,"Ivan", "Psition 3",37.99f));
        employees.add(new Employee(444,"Boris", "Psition 2",29.99f));
        employees.add(new Employee(555,"Siarhei", "Psition 1",101.99f));

        for (Employee e : employees){
            System.out.println(e.getName());
        }
    }
}
