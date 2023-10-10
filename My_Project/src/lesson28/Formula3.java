package com.itacademy.lesson11.hw.lesson28;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Formula3 extends Thread{
    private float result;
    private final File file;

    Formula3(File file){
        this.file = file;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
                result = i * 2;
                synchronized (this) {
                    bw.write((result) + " - Thrd_3 \n");
                }
          //      bw.write((result) + " - Thrd_3 \n");

            } catch (IOException e) {
                System.err.println(e);
            }

        }

    }

    public float getResult() {
        return result;
    }
}
