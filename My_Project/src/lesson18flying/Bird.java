package com.itacademy.lesson11.hw.lesson18flying;

import java.util.Objects;

public class Bird implements Flyable{
    private String name;
    private int speed;
    private boolean isFlyingNow;

    public Bird(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public void getStatus(){
        if(isFlyingNow){
            System.out.println("Bird "+this.name+" flying in the sky with a speed of "+this.speed+" m/s");
        } else{
            System.out.println("Bird "+this.name+" is on the ground");
        }
    }


    @Override
    public void takeOff() {
        if(!isFlyingNow){
            System.out.println("Bird "+this.name+" has taken off");
            this.isFlyingNow = true;
        }else throw new RuntimeException("Bird "+ this.name+" alredy in the sky");
    }

    @Override
    public void land() {
        if(isFlyingNow){
            System.out.println("Bird "+this.name+" landing back to the ground");
            this.isFlyingNow = false;
        }else throw new RuntimeException("Bird "+ this.name+" alredy on the ground");
    }

    @Override
    public void fly() {
        if(isFlyingNow){
            System.out.println("Bird "+this.name+" flying in the sky with a speed of "+this.speed+" m/s");
        }else throw new RuntimeException("Bird "+ this.name+" is on the ground");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bird bird)) return false;
        return speed == bird.speed && isFlyingNow == bird.isFlyingNow && Objects.equals(name, bird.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, speed, isFlyingNow);
    }

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", isFlyingNow=" + isFlyingNow +
                '}';
    }
}
