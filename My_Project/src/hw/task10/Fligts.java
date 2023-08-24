package com.itacademy.lesson11.hw.task10;

import com.itacademy.lesson11.hw.task9.Book;

import java.util.ArrayList;
import java.util.List;

public class Fligts {
    private List<Airline> flights;

    public Fligts(List<Airline> flights) {
        this.flights = flights;
    }

    public Fligts(){
        List<Airline> flights = new ArrayList<>();
        flights.add(new Airline());
        this.flights = flights;
    }

    public Fligts(int n){
        List<Airline> flights = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            flights.add(new Airline());
        }
        this.flights = flights;
    }

    public List<Airline> getFlights() {
        return flights;
    }

    public List<Airline> findByDestination(String destination) {
        List<Airline> result = new ArrayList<>();

        for (int i = 0; i < flights.size(); i++) {
            if (flights.get(i).getDestination().contains(destination)) {
                result.add(flights.get(i));
            }
        }
        if (result.size() > 0) {
            return result;
        } else {
            throw new RuntimeException("findByDestination - No flights found");
        }
    }

    public List<Airline> findByDay(String day) {
        List<Airline> result = new ArrayList<>();

        for (int i = 0; i < flights.size(); i++) {
            if (flights.get(i).getDays().toString().contains(day)) {
                result.add(flights.get(i));
            }
        }
        if (result.size() > 0) {
            return result;
        } else {
            throw new RuntimeException("findByDay - No flights found");
        }
    }

    public List<Airline> findByDayAndTime(String day, Time t) {
        List<Airline> result = new ArrayList<>();

        for (int i = 0; i < flights.size(); i++) {
            if (flights.get(i).getDays().toString().contains(day) && flights.get(i).getDeparture_time().CompareThisTime(t)) {
                result.add(flights.get(i));
            }
        }
        if (result.size() > 0) {
            return result;
        } else {
            throw new RuntimeException("findByDayAndTime - No flights found");
        }
    }

    public String toString(){
        StringBuilder s = new StringBuilder();

        for(Airline a : flights){
            s.append(a.toString()+"\n");
        }
        s.append("\n");
        return s.toString();
    }
}
