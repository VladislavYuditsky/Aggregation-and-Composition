package com.yuditsky.aggregation_and_composition.task3.entity;

import java.util.Objects;

public class BankAccount {
    private int number;
    private double amount;
    private boolean isBlocked;

    public BankAccount(int number) {
        this.number = number;
    }

    public BankAccount(int number, double amount, boolean isBlocked) {
        this.number = number;
        this.amount = amount;
        this.isBlocked = isBlocked;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "number=" + number +
                ", amount=" + amount +
                ", isBlocked=" + isBlocked +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount account = (BankAccount) o;
        return number == account.number &&
                Double.compare(account.amount, amount) == 0 &&
                isBlocked == account.isBlocked;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, amount, isBlocked);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }
}
