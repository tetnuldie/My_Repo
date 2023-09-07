package com.itacademy.lesson11.hw.lesson17player;

import java.util.Objects;

public class FootballPlayer extends Player{
    private String team;

    public FootballPlayer(String name, String team) {
        super(name, "Football");
        this.team = team;
    }

    @Override
    public void play(){
        System.out.println("Player "+getName()+" plays "+getSportType()+" for "+this.team+" team");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FootballPlayer that)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(team, that.team);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), team);
    }

    @Override
    public String toString() {
        return "FootballPlayer{" +
                "name= '" + getName() + '\'' +
                ", sportType= '" + getSportType() + '\'' +
                "team='" + team + '\'' +
                "} ";
    }
}
