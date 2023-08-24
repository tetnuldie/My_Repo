package com.itacademy.lesson11.hw.task10;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Days {
    private List<String> days;

    public Days(List<String> days) {
        this.days = days;
    }

    public Days() {
        List<String> days = new ArrayList<>();
        days.add("Mon");
        this.days = days;
    }

    public Days(int n) {
        Random rand = new Random();
        String[] week = {"Mon", "Tue", "Wen", "Thu", "Fr", "Sat", "Sun"};
        List<String> days = new ArrayList<>();

        for (int i = 0; i < n; i++){
            days.add(week[rand.nextInt(0, week.length)]);
        }

        this.days = days;
    }

    @Override
    public String toString() {
        String result;
        StringBuilder sb = new StringBuilder();
        for(String s : days){
            sb.append(s+",");
        }
        return sb.toString();
    }
}
