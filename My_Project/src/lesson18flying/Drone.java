package com.itacademy.lesson11.hw.lesson18flying;

import java.util.Objects;

public class Drone implements Flyable{
    private String name;
    private int speed;
    private boolean isFlyingNow;

    public Drone(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public void getStatus(){
        if(isFlyingNow){
            System.out.println("Drone "+this.name+" flying in the sky with a speed of "+this.speed+" m/s");
        } else{
            System.out.println("Drone "+this.name+" is on the ground");
        }
    }


    @Override
    public void takeOff() {
        if(!isFlyingNow){
            System.out.println("Drone "+this.name+" has taken off");
            this.isFlyingNow = true;
        }else throw new RuntimeException("Drone "+ this.name+" alredy in the sky");
    }

    @Override
    public void land() {
        if(isFlyingNow){
            System.out.println("Drone "+this.name+" landing back to the ground");
            this.isFlyingNow = false;
        }else throw new RuntimeException("Drone "+ this.name+" alredy on the ground");
    }

    @Override
    public void fly() {
        if(isFlyingNow){
            System.out.println("Drone "+this.name+" flying in the sky with a speed of "+this.speed+" m/s");
        }else throw new RuntimeException("Drone "+ this.name+" is on the ground");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Drone drone)) return false;
        return speed == drone.speed && isFlyingNow == drone.isFlyingNow && Objects.equals(name, drone.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, speed, isFlyingNow);
    }

    @Override
    public String toString() {
        return "Drone{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", isFlyingNow=" + isFlyingNow +
                '}';
    }
}
