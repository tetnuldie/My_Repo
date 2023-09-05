package com.itacademy.lesson11.hw.lesson17;

public class Main {
    public static void main(String[] args) {
        var animal = new Animal("Lion");
        var cat = new Cat("Murka");
        var cow = new Cow("Łaciata");
        var dog = new Dog("Tuzik");
        
        animal.makeSound();
        cat.makeSound();
        cow.makeSound();
        dog.makeSound();
    }
}
