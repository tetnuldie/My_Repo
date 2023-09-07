package com.itacademy.lesson11.hw.lesson17player;

import java.util.Objects;

public class BasketballPlayer extends Player{
    private String team;

    public BasketballPlayer(String name, String team) {
        super(name, "Basketball");
        this.team = team;
    }
    @Override
    public void play(){
        System.out.println("Player "+getName()+" plays "+getSportType()+" better than leBron for "+this.team+" team");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BasketballPlayer that)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(team, that.team);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), team);
    }

    @Override
    public String toString() {
        return "BasketballPlayer{" +
                "name= '" + getName() + '\'' +
                ", sportType= '" + getSportType() + '\'' +
                "team='" + team + '\'' +
                "} ";
    }

}
