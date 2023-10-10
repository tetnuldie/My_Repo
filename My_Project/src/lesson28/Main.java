package com.itacademy.lesson11.hw.lesson28;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        File file = new File("D:\\Notebook\\Final\\notebook_mv\\file.txt");

        Formula1 f1 = new Formula1(file);
        Formula2 f2 = new Formula2(file);
        Formula3 f3 = new Formula3(file);
        Formula4 f4 = new Formula4(file);
        Formula5 f5 = new Formula5(file);
        Reader reader = new Reader(file);

        wipe(file);

        f1.start();
        f2.start();
        f3.start();
        f4.start();
        f5.start();


        f5.join();
        f4.join();
        f3.join();
        f2.join();
        f1.join();

        reader.run();
        reader.join();




        System.out.println(reader.getRes());

    }

    public static void wipe(File file) {
        try {
            FileWriter fileWriter = new FileWriter(file, false);
            fileWriter.close();

        } catch (IOException e) {
            System.out.println(e);

        }
    }


}
