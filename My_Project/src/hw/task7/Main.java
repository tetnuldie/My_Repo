package com.itacademy.lesson11.hw.task7;

public class Main {
    public static void main(String[] args) {
        Coordinates a1 = new Coordinates(3, 0);
        Coordinates b1 = new Coordinates(0, 9);
        Coordinates c1 = new Coordinates(3, 90);

        Triangle t = new Triangle(a1, b1, c1);


        Coordinates m;
        m = t.medianPoint();

        System.out.println("A coordinates: " + t.getAx() + " " + t.getAy());
        System.out.println("B coordinates: " + t.getBx() + " " + t.getBy());
        System.out.println("C coordinates: " + t.getCx() + " " + t.getCy());


        System.out.println("Perimeter: " + t.perimeter());
        System.out.println("Square: " + t.square());

        System.out.println("Median coordinates: " + m.getX() + " " + m.getY());

    }
}
