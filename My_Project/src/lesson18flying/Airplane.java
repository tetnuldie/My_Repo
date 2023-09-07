package com.itacademy.lesson11.hw.lesson18flying;

import java.util.Objects;

public class Airplane implements Flyable{
    private String name;
    private int speed;
    private boolean isFlyingNow;

    public Airplane(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }


    @Override
    public void takeOff() {
        if(!isFlyingNow){
            System.out.println("Plane "+this.name+" has taken off");
            this.isFlyingNow = true;
        }else throw new RuntimeException("Plane "+ this.name+" alredy in the sky");
    }

    @Override
    public void land() {
        if(isFlyingNow){
            System.out.println("Plane "+this.name+" landing back to the ground");
            this.isFlyingNow = false;
        }else throw new RuntimeException("Plane "+ this.name+" alredy on the ground");
    }

    @Override
    public void fly() {
        if(isFlyingNow){
            System.out.println("Plane "+this.name+" flying in the sky with a speed of "+this.speed+" m/s");
        }else throw new RuntimeException("Plane "+ this.name+" is on the ground");
    }

    public void getStatus(){
        if(isFlyingNow){
            System.out.println("Plane "+this.name+" flying in the sky with a speed of "+this.speed+" m/s");
        } else{
            System.out.println("Plane "+this.name+" is on the ground");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Airplane airplane)) return false;
        return speed == airplane.speed && isFlyingNow == airplane.isFlyingNow && Objects.equals(name, airplane.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, speed, isFlyingNow);
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", isFlyingNow=" + isFlyingNow +
                '}';
    }
}
