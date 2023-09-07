package com.itacademy.lesson11.hw.lesson18fly;

public class Main {
    public static void main(String[] args) {
        var mp3 = new Mp3();
        var podcast = new Podcast();
        var video = new Video();

        mp3.getStatus();
        mp3.play();
        mp3.getStatus();

        try {
            mp3.play();
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        }

        try {
            mp3.pause();
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
        mp3.getStatus();
    }
}
