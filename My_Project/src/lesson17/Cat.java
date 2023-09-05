package com.itacademy.lesson11.hw.lesson17;

import java.util.Objects;

public class Cat extends Animal{
    private String catName;

    public Cat(String catName) {
        super("Cat");
        this.catName = catName;
    }

    public Cat() {
        this.catName = "Unnamed Cat";
    }

    public void makeSound(){
        System.out.println(this.catName + " tells - Meow Meow");
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "catName='" + catName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat cat)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(getCatName(), cat.getCatName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getCatName());
    }
}
