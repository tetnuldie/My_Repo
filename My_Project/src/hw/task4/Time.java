package com.itacademy.lesson11.hw.task4;

import java.util.Random;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(){
        Random rand = new Random();
        this.hour = rand.nextInt(0,24);
        this.minute = rand.nextInt(0,60);
        this.second = rand.nextInt(0,60);
    }

    public Time(int hour, int minute, int second){
        if (hour < 0 || minute < 0 || second < 0) {
            throw new RuntimeException("Value can't be negative");
        }
        if (hour > 23) {
            this.hour = hour % 24;
        } else {
            this.hour = hour;
        }
        if (minute > 59) {
            this.minute = minute % 60;
        } else {
            this.minute = minute;
        }
        if (second > 59) {
            this.second = second % 60;
        } else {
            this.second = second;
        }
    }
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }
    public String getTimeFormatted() {
        String ftime;
        String fhour = String.valueOf(hour);
        String fminuite = String.valueOf(minute);
        String fsecond = String.valueOf(second);

        if (hour <= 9) {
            fhour = "0" + hour;
        }
        if (minute <= 9) {
            fminuite = "0" + minute;
        }
        if (second <= 9) {
            fsecond = "0" + second;
        }
        ftime = fhour + ":" + fminuite + ":" + fsecond;
        return ftime;
    }

    public boolean compareTime(Time t1, Time t2){
        int t1second, t2second;

        t1second = t1.getHour() * 3600 + t1.getMinute() * 60 + t1.getSecond();
        t2second = t2.getHour() * 3600 + t2.getMinute() * 60 + t2.getSecond();

        return t1second <= t2second;
    }

}
