package com.itacademy.lesson11.hw.lesson17;

import java.util.Objects;

public class Animal {
    private String name;

    public Animal(String name){
        this.name = name;
    }

    public Animal(){
        this.name = "Default";
    }

    public void makeSound(){
        System.out.println("DefaultSound");
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal animal)) return false;
        return Objects.equals(getName(), animal.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}
