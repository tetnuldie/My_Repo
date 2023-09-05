package com.itacademy.lesson11.hw.lesson17bank;

import java.util.Objects;
import java.util.Random;

public class Account {
    protected int id;
    protected float balance;

    public Account() {
        Random rand = new Random();
        this.id = rand.nextInt(1111111, 9999999);
        this.balance = 0.0f;
    }

    public int getId() {
        return id;
    }

    public float getBalance() {
        return balance;
    }

    protected void setBalance(float balance) {
        this.balance = balance;
    }

    public void deposit(float amount){
        this.balance = balance + amount;
    }

    public void withdraw(float amount){
        float f = balance - amount;
        if (f > 0) {
            this.balance = f;
        } else {
            throw new RuntimeException("Insufficient balance. Not enough funds to proceed");
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "Account id= " + id +
                ", Current balance= " + balance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account account)) return false;
        return getId() == account.getId() && Float.compare(account.getBalance(), getBalance()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getBalance());
    }
}
