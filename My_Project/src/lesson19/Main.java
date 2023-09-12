package com.itacademy.lesson11.hw.lesson19;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Employee> employees = new TreeSet<>();

        var e1 = new Employee(111,"Vasily", "Psition 1",10.99f);
        var e2 = new Employee(222,"Peter", "Psition 2",17.99f);
        var e3 = new Employee(333,"Ivan", "Psition 3",37.99f);
        var e4 = new Employee(444,"Boris", "Psition 2",29.99f);
        var e5 = new Employee(555,"Siarhei", "Psition 1",101.99f);

        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);

        for (Employee e : employees){
            System.out.println(e.getName());
        }

        TreeSet<Employee> byName = new TreeSet<>(new CompareByName());

        byName.add(e1);
        byName.add(e2);
        byName.add(e3);
        byName.add(e4);
        byName.add(e5);

        for (Employee e : byName){
            System.out.println(e.getName());
        }
    }
}
