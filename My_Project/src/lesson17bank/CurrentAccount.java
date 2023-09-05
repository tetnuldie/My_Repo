package com.itacademy.lesson11.hw.lesson17bank;

import java.util.Objects;
import java.util.Random;

public class CurrentAccount extends Account{
    private final float overdraftLimit;

    public CurrentAccount() {
        super();
        Random rand = new Random();
        this.overdraftLimit = rand.nextFloat(1000);
    }

    public float getOverdraftLimit() {
        return overdraftLimit;
    }

    public void withdraw(float amount){
        float f = balance - amount;
        if (f > 0 - overdraftLimit) {
            setBalance(f);
        } else {
            throw new RuntimeException("Insufficient balance. Not enough funds to proceed");
        }
    }

    @Override
    public String toString() {
        return "CurrentAccount{" +
                "id=" + id +
                ", balance=" + balance +
                ", overdraftLimit=" + overdraftLimit +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CurrentAccount that)) return false;
        if (!super.equals(o)) return false;
        return Float.compare(that.getOverdraftLimit(), getOverdraftLimit()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getOverdraftLimit());
    }
}
