package com.itacademy.lesson11.hw.task4;

import java.util.Random;

public class Train {
    private int number;
    private String destination;
    private Time departure_time;


    public Train() {
        Random rand = new Random();
        String[] dest = new String[]{"Warszawa","Katowice", "Sczecin", "Gdansk", "Krakow", "Wroclaw", "Bialystok"};
        this.number = rand.nextInt(0,999);
        this.destination = dest[rand.nextInt(0, dest.length)];
        this.departure_time = new Time();
    }
    public Train(int number, String destination, Time departure_time) {
        this.number = number;
        this.destination = destination;
        this.departure_time = departure_time;
    }

    public int getNumber() {
        return number;
    }

    public String getDestination() {
        return destination;
    }

    public Time getDeparture_time() {
        return departure_time;
    }

    @Override
    public String toString() {
        return "Train{ " +
                "number =\t" + number +
                ",\tdestination= '" + destination + '\'' +
                ",\tdeparture_time= " + departure_time.getTimeFormatted() +
                '}';
    }
}
