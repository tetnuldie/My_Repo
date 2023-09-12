package com.itacademy.lesson11.hw.lesson19;

import java.util.Comparator;
import java.util.Objects;

public class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private String position;
    private float salary;

    public Employee(int id, String name, String position, float salary) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return getId() == employee.getId() && Float.compare(employee.getSalary(), getSalary()) == 0 && Objects.equals(getName(), employee.getName()) && Objects.equals(getPosition(), employee.getPosition());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getPosition(), getSalary());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }


    @Override
    public int compareTo(Employee o) {
        return Float.compare(this.salary,o.salary);
    }
}
