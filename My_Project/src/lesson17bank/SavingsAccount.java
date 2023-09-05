package com.itacademy.lesson11.hw.lesson17bank;

import java.util.Random;

public class SavingsAccount extends Account{
    private final float interestRate;
    private final int depositTermMonth;


    public SavingsAccount() {
        super();
        Random rand = new Random();
        this.interestRate = rand.nextFloat(0.0f, 0.3f);
        depositTermMonth = rand.nextInt(1, 99);
    }

    public float getInterestRate() {
        return interestRate;
    }

    public int getDepositTermMonth() {
        return depositTermMonth;
    }

    public void interestPayout(){
        float amount = getBalance() * interestRate * depositTermMonth / 12;
        setBalance(amount);
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "Account id= " + id +
                ", Current balance= " + balance +
                ", interestRate= " + interestRate +
                ", depositTermMonth= " + depositTermMonth +
                '}';
    }
}
