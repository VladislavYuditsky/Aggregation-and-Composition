package com.yuditsky.aggregation_and_composition.task3.entity;

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
