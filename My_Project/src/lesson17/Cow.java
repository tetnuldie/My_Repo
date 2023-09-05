package com.itacademy.lesson11.hw.lesson17;

import java.util.Objects;

public class Cow extends Animal{
    private String cowName;

    public Cow(String cowName) {
        super("Cow");
        this.cowName = cowName;
    }

    public Cow() {
        this.cowName = "Unnamed Cow";
    }

    public String getCowName() {
        return cowName;
    }

    public void setCowName(String cowName) {
        this.cowName = cowName;
    }

    public void makeSound(){
        System.out.println(this.cowName+ " tells - Mooooooooooooo");
    }

    @Override
    public String toString() {
        return "Cow{" +
                "cowName='" + cowName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cow cow)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(getCowName(), cow.getCowName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getCowName());
    }
}
