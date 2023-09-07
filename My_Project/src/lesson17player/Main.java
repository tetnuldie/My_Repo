package com.itacademy.lesson11.hw.lesson17player;

public class Main {
    public static void main(String[] args) {
        var footballer = new FootballPlayer("Cristiano","Sharm-el-sheikh");
        var basketballer = new BasketballPlayer("Bryant", "LA Lakers");
        var hockeyman = new HockeyPlayer("Panarin", "NY Rangers");

        System.out.println(footballer);
        System.out.println(basketballer);
        System.out.println(hockeyman);
        System.out.println();

        footballer.play();
        basketballer.play();
        hockeyman.play();
    }
}
