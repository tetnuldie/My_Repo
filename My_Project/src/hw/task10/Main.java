package com.itacademy.lesson11.hw.task10;

public class Main {
    public static void main(String[] args) {
        var flights_1 = new Fligts(7);

        System.out.println(flights_1);

        try{
        Fligts flights_2 = new Fligts(flights_1.findByDay("Thu"));
        System.out.println(flights_2);
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
            System.out.println();
        }

        try{
            Fligts flights_3 = new Fligts(flights_1.findByDestination("Rome"));
            System.out.println(flights_3);
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
            System.out.println();
        }

        try{
            Fligts flights_4 = new Fligts(flights_1.findByDayAndTime("Thu",new Time(11,0,0)));
            System.out.println(flights_4);
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
            System.out.println();
        }

    }

}
