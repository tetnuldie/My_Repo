package com.itacademy.lesson11.hw.lesson17player;

import java.util.Objects;

public class Player {
    private String name;
    private String sportType;

    public Player(String name, String sportType) {
        this.name = name;
        this.sportType = sportType;
    }

    public Player() {
        this.name = "Player";
        this.sportType = "SportType";
    }

    public String getName() {
        return name;
    }

    public String getSportType() {
        return sportType;
    }

    public void play(){
        System.out.println("Player "+this.name+" plays "+sportType);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Player player)) return false;
        return Objects.equals(name, player.name) && Objects.equals(sportType, player.sportType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sportType);
    }

    @Override
    public String toString() {
        return "Player{" +
                "name= '" + name + '\'' +
                ", sportType= '" + sportType + '\'' +
                '}';
    }
}
