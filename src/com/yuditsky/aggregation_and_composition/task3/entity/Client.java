package com.yuditsky.aggregation_and_composition.task3.entity;

import java.util.ArrayList;

public class Client {
    private ArrayList<BankAccount> bankAccounts;

    public Client(ArrayList<BankAccount> bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    public ArrayList<BankAccount> getBankAccounts() {
        return bankAccounts;
    }

    public void setBankAccounts(ArrayList<BankAccount> bankAccounts) {
        this.bankAccounts = bankAccounts;
    }
}
