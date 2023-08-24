package com.itacademy.lesson11.hw.task9;

public class Main {
    public static void main(String[] args) {
        var store_1 = new Store(5);

        for(Book b : store_1.getBookstore()){
            System.out.println(b.toString());
        }
        System.out.println();

        try {
            var store_2 = store_1.findByAuthor("Bulgakov");

            for (Book b : store_2) {
                System.out.println(b.toString());
            }
            System.out.println();
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
            System.out.println();
        }

        try {
            var store_3 = store_1.findByPublisher("Eksmo");

            for (Book b : store_3) {
                System.out.println(b.toString());
            }
            System.out.println();
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
            System.out.println();
        }

        try {
            var store_4 = store_1.findByYear(1977);

            for (Book b : store_4) {
                System.out.println(b.toString());
            }
            System.out.println();
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
            System.out.println();
        }

    }
}
