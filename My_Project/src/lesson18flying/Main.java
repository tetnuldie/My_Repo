package com.itacademy.lesson11.hw.lesson18flying;

public class Main {
    public static void main(String[] args) {
        var bird = new Bird("Seagull",37);
        var airplane = new Airplane("Bombardier n321", 700000);
        var drone = new Drone("Kozhedub", 1700);

        bird.getStatus();
        airplane.getStatus();
        drone.getStatus();

        try{
            bird.fly();
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }

        bird.takeOff();
        bird.getStatus();

        try{
            bird.fly();
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }


}
