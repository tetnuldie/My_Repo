package com.itacademy.lesson11.hw.task7;

public class Coordinates {
    private float x;
    private float y;

    public Coordinates(){
        this.x = 0;
        this.y = 0;
    }

    public Coordinates(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
}
