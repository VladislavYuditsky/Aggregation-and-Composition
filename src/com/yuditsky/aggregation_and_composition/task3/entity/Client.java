package com.yuditsky.aggregation_and_composition.task3.entity;

import java.util.ArrayList;
import java.util.Objects;

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

    @Override
    public String toString() {
        return "Client{" +
                "bankAccounts=" + bankAccounts +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return bankAccounts.equals(client.bankAccounts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bankAccounts);
    }
}
