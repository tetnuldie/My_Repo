package com.itacademy.lesson11.hw.lesson18fly;

import java.util.Objects;
import java.util.Random;

public class Time {

    private int hour;
    private int minute;
    private int second;

    public Time(){
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
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

    public void resetTime(){
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    public void increaseByValue(int value) {
        if (value < 0) {
            throw new RuntimeException("Value can't be negative");
        }

        int thissecond, newsecond;

        thissecond = this.hour * 3600 + this.minute * 60 + this.second;

        newsecond = thissecond + value;

        this.hour = newsecond / 60 / 60 % 24;
        this.minute = newsecond / 60 % 60;
        this.second = newsecond % 60;
    }

    public int getTimeInSeconds(){
        return this.hour * 3600 + this.minute * 60 + this.second;
    }

    public void decreaseByValue(int value) {
        if (value < 0) {
            throw new RuntimeException("Value can't be negative");
        }

        int thissecond, newsecond;

        thissecond = this.hour * 3600 + this.minute * 60 + this.second;

        newsecond = thissecond - value;
        if (newsecond < 0) {
            this.hour = 0;
            this.minute = 0;
            this.second = 0;
        } else {
            this.hour = newsecond / 60 / 60 % 24;
            this.minute = newsecond / 60 % 60;
            this.second = newsecond % 60;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Time time)) return false;
        return getHour() == time.getHour() && getMinute() == time.getMinute() && getSecond() == time.getSecond();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHour(), getMinute(), getSecond());
    }

    @Override
    public String toString() {
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
}
