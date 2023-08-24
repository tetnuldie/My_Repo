package com.itacademy.lesson11.hw.task5;

public class Counter {
    private int counter;
    private int counterDefault;
    private int max;
    private int min;

    public Counter(){
        counter = 0;
        counterDefault = 0;
        max = Integer.MAX_VALUE;
        min = Integer.MIN_VALUE;
    }

    public Counter(int initial, int maximum, int minimum){
        counter = initial;
        counterDefault = initial;
        max = maximum;
        min = minimum;
    }

    public Counter(int initial){
        counter = initial;
        counterDefault = initial;
        max = Integer.MAX_VALUE;
        min = Integer.MIN_VALUE;
    }

    public int getCounter() {
        return counter;
    }

    public void increase(){
        if(counter < max){
            counter++;
        }else{
            throw new RuntimeException("Counter have max value. Increasing impossible");
        }
    }

    public void decrease(){
        if(counter > min){
            counter--;
        }else{
            throw new RuntimeException("Counter have min value. Decreasing impossible");
        }
    }

    public void reset(){
        counter = counterDefault;
    }
}
