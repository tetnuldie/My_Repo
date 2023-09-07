package com.itacademy.lesson11.hw.lesson18fly;

import java.util.Objects;
import java.util.Random;

public class Video extends Player implements PlayMode{
    private Time playtime;
    private String name;
    private boolean isPlaying;

    public Video(String name) {
        this.playtime = new Time();
        this.name = name;
        this.isPlaying = false;
    }

    public Video() {
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
            throw new RuntimeException("You cant rewind a video not being played");
        }
        if (!this.isPlaying) {
            Random rand = new Random();
            playtime.decreaseByValue(rand.nextInt(1,600));
            System.out.println("Rewinded to" + playtime.toString());
        } else throw new RuntimeException("Pause a video to proceed rewind");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Video video)) return false;
        return isPlaying == video.isPlaying && Objects.equals(playtime, video.playtime) && Objects.equals(name, video.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playtime, name, isPlaying);
    }

    @Override
    public String toString() {
        return "Video{" +
                "name='" + name + '\'' +
                ", isPlaying=" + isPlaying +
                ", playtime=" + playtime +
                '}';
    }
}
