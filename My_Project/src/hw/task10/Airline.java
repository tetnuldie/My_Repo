package com.itacademy.lesson11.hw.task10;

import java.util.Random;

public class Airline {
    private int flight_n;
    private String destination;
    private String plain_type;
    private Time departure_time;
    private Days days;

    public Airline(int flight_n, String destination, String plain_type, Time departure_time, Days days) {
        this.flight_n = flight_n;
        this.destination = destination;
        this.plain_type = plain_type;
        this.departure_time = departure_time;
        this.days = days;
    }

    public Airline() {
        Random rand = new Random();
        String[] destinations = {"Warsaw WMI", "Rome CIA", "Lissabon LIS", "Budapest BUD", "London LHW", "Istanbul IST", "Tenerife TFS"};
        String[] plaintypes = {"Boeing 737", "Boeing 777", "Airbus A312", "Airbus A320", "Boeing 787", "Embraer E11", "Bombardier CRJ"};
        int n = rand.nextInt(7);

        this.flight_n = rand.nextInt(999);
        this.destination = destinations[rand.nextInt(7)];
        this.plain_type = plaintypes[rand.nextInt(7)];
        this.departure_time = new Time();
        this.days = new Days(rand.nextInt(1,4));
    }

    public int getFlight_n() {
        return flight_n;
    }

    public String getDestination() {
        return destination;
    }

    public String getPlain_type() {
        return plain_type;
    }

    public Time getDeparture_time() {
        return departure_time;
    }

    public Days getDays() {
        return days;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "flight_n= " + flight_n +
                ", destination= '" + destination + '\'' +
                ", plain_type= '" + plain_type + '\'' +
                ", departure_time= " + departure_time.toString() +
                ", days= " + days.toString() +
                '}';
    }
}
