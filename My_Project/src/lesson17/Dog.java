package com.itacademy.lesson11.hw.lesson17;

import java.util.Objects;

public class Dog extends Animal{

    private String dogName;

    public Dog(String dogName) {
        super("Dog");
        this.dogName = dogName;
    }

    public Dog() {
        this.dogName = "Unnamed Doge";
    }

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public void makeSound(){
        System.out.println(this.dogName+" tells - Гаў Гаў");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "dogName='" + dogName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog dog)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(getDogName(), dog.getDogName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getDogName());
    }
}
