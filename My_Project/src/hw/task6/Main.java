package com.itacademy.lesson11.hw.task6;

public class Main {
    public static void main(String[] args) {
        Time time = new Time(0, 0, 0);
        System.out.println(time.getHour() + " " + time.getMinuite() + " " + time.getSecond());
        System.out.println(time.getTimeFormatted());

        time.decreaseByValue(73,true,false,false);

        System.out.println(time.getTimeFormatted());
    }
}
