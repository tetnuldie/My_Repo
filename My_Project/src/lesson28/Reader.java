package com.itacademy.lesson11.hw.lesson28;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Reader extends Thread{

   private float res;

    private final File file;

    Reader(File file){
        this.file = file;
    }
    public synchronized void run() {

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            String[] parts;
            while ((line = br.readLine()) != null) {
                parts = line.split("\\s+");
                res += Float.parseFloat(parts[0]);

            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public float getRes() {
        return res;
    }
}
