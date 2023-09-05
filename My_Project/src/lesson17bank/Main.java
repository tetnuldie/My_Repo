package com.itacademy.lesson11.hw.lesson17bank;

public class Main {
    public static void main(String[] args) {

        var regularAccount = new Account();
        var currentAccount = new CurrentAccount();
        var savingsAccount = new SavingsAccount();

        System.out.println(regularAccount);
        System.out.println(currentAccount);
        System.out.println(savingsAccount);

        try {
            regularAccount.deposit(100);
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
        try {
            regularAccount.withdraw(1000);
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        }

        try {
            currentAccount.deposit(100);
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
        try {
            currentAccount.withdraw(1000);
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        }

        try {
            savingsAccount.deposit(100);
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
        try {
            savingsAccount.withdraw(300);
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        }

        System.out.println(regularAccount);
        System.out.println(currentAccount);
        System.out.println(savingsAccount);

        try {
            savingsAccount.interestPayout();
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        }

        System.out.println(savingsAccount);

    }

}
