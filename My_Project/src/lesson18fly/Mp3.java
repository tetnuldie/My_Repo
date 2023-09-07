package com.itacademy.lesson11.hw.lesson18fly;

import java.util.Objects;
import java.util.Random;

public class Mp3 extends Player implements PlayMode {
    private Time playtime;
    private String name;
    private boolean isPlaying;

    public Mp3(String name) {
        this.playtime = new Time();
        this.name = name;
        this.isPlaying = false;
    }

    public Mp3() {
        this.playtime = new Time();
        this.name = "Song Name";
        this.isPlaying = false;
    }

    public void getStatus(){
        if(isPlaying){
            System.out.println("Playing "+this.name+"; "+"at "+playtime.toString());
        }else{
            System.out.println("Paused/Stopped "+this.name+"; "+"at "+playtime.toString());
        }
    }


    @Override
    public void play() {
        Random rand = new Random();
        if (!this.isPlaying) {
            this.isPlaying = true;
            System.out.println("Music Plays");
            playtime.increaseByValue(rand.nextInt(1, 600));
        } else throw new RuntimeException("Alredy playing");
    }

    @Override
    public void pause() {
        if (this.isPlaying) {
            this.isPlaying = false;
            System.out.println("Paused at" + playtime.toString());
        } else throw new RuntimeException("Non played; Cant be paused");
    }

    @Override
    public void stop() {
        this.isPlaying = false;
        System.out.println("Playback stopped");
        playtime.resetTime();
    }

    @Override
    public void rewind() {
        if (playtime.getTimeInSeconds() == 0){
            throw new RuntimeException("You cant rewind a song not being played");
        }
        if (!this.isPlaying) {
            Random rand = new Random();
            playtime.decreaseByValue(rand.nextInt(1,600));
            System.out.println("Rewinded to" + playtime.toString());
        } else throw new RuntimeException("Pause a song to proceed rewind");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mp3 mp3)) return false;
        return isPlaying == mp3.isPlaying && Objects.equals(playtime, mp3.playtime) && Objects.equals(name, mp3.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playtime, name, isPlaying);
    }

    @Override
    public String toString() {
        return "Mp3{" +
                " name='" + name + '\'' +
                ", isPlaying=" + isPlaying +
                ", playtime=" + playtime.toString() +
                '}';
    }
}
