package com.yuditsky.aggregation_and_composition.task3.logic;

import com.yuditsky.aggregation_and_composition.task3.entity.BankAccount;
import com.yuditsky.aggregation_and_composition.task3.entity.Client;

import java.util.ArrayList;
import java.util.Comparator;

public class Banking {

    public static BankAccount findBankAccount(Client client, int number) {
        for (BankAccount account : client.getBankAccounts()) {
            if (account.getNumber() == number) {
                if (!account.isBlocked()) {
                    return account;
                }
            }
        }
        return null;
    }

    public static ArrayList<BankAccount> sortByNumber(Client client) {
        ArrayList<BankAccount> sortedAccounts = new ArrayList<>(client.getBankAccounts());
        sortedAccounts.sort(Comparator.comparing(BankAccount::getNumber));
        return sortedAccounts;
    }

    public static double totalAmount(Client client) {
        double totalAmount = 0;

        for (BankAccount account : client.getBankAccounts()) {
            if (!account.isBlocked()) {
                totalAmount += account.getAmount();
            }
        }

        return totalAmount;
    }

    public static double positiveAmount(Client client) {
        double positiveAmount = 0;

        for (BankAccount account : client.getBankAccounts()) {
            if (!account.isBlocked() && account.getAmount() > 0) {
                positiveAmount += account.getAmount();
            }
        }

        return positiveAmount;
    }

    public static double negativeAmount(Client client) {
        double positiveAmount = 0;

        for (BankAccount account : client.getBankAccounts()) {
            if (!account.isBlocked() && account.getAmount() < 0) {
                positiveAmount += account.getAmount();
            }
        }

        return positiveAmount;
    }
}
