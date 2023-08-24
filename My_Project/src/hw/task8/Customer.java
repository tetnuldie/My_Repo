package com.itacademy.lesson11.hw.task8;

import java.util.Random;

public class Customer {
    private String surname;
    private String name;
    private String fname;
    private String adress;
    private int card_no;
    private int account_no;

    public Customer(String surname, String name, String fname, String adress, int card_no, int account_no) {
        this.surname = surname;
        this.name = name;
        this.fname = fname;
        this.adress = adress;
        this.card_no = card_no;
        this.account_no = account_no;
    }

    public Customer() {
        Random rand = new Random();
        this.surname = generateRandomString(7);
        this.name = generateRandomString(7);
        this.fname = generateRandomString(7);
        this.adress = generateRandomString(7);
        this.card_no = rand.nextInt(9999);
        this.account_no = rand.nextInt(99);
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getCard_no() {
        return card_no;
    }

    public void setCard_no(int card_no) {
        this.card_no = card_no;
    }

    public int getAccount_no() {
        return account_no;
    }

    public void setAccount_no(int account_no) {
        this.account_no = account_no;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", fname='" + fname + '\'' +
                ", adress='" + adress + '\'' +
                ", card_no=" + card_no +
                ", account_no=" + account_no +
                '}';
    }

    public static String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        Random random = new Random();

        StringBuilder randomstring = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(characters.length());
            char randomChar = characters.charAt(randomIndex);
            randomstring.append(randomChar);

        }

        return randomstring.toString();
    }

}
