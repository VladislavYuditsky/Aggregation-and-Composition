// Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
// Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по всем счетам,
// имеющим положительный и отрицательный балансы отдельно.

package com.yuditsky.aggregation_and_composition.task3;

import com.yuditsky.aggregation_and_composition.task3.entity.BankAccount;
import com.yuditsky.aggregation_and_composition.task3.entity.Client;
import com.yuditsky.aggregation_and_composition.task3.logic.Banking;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        ArrayList<BankAccount> accounts = new ArrayList<>();

        accounts.add(new BankAccount(123, 5000, false));
        accounts.add(new BankAccount(964, 10000, false));
        accounts.add(new BankAccount(833, -9000, true));
        accounts.add(new BankAccount(34, -500, false));

        client.setBankAccounts(accounts);

        for (BankAccount account : client.getBankAccounts()) {
            System.out.println("Number: " + account.getNumber() + ", amount: " + account.getAmount() + ", blocked: "
                    + account.isBlocked());
        }

        System.out.println("\nFind by number");
        int accNumber = 111;
        System.out.println("Number: " + accNumber);
        BankAccount foundAcc = Banking.findBankAccount(client, accNumber);
        if (foundAcc != null) {
            System.out.println("Number: " + foundAcc.getNumber() + ", amount: " + foundAcc.getAmount()
                    + ", blocked: " + foundAcc.isBlocked());
        } else {
            System.out.println("Nothing found");
        }

        accNumber = 123;
        System.out.println("Number: " + accNumber);
        foundAcc = Banking.findBankAccount(client, accNumber);
        if (foundAcc != null) {
            System.out.println("Number: " + foundAcc.getNumber() + ", amount: " + foundAcc.getAmount()
                    + ", blocked: " + foundAcc.isBlocked());
        } else {
            System.out.println("Nothing found");
        }

        System.out.println("\nSort by Number");
        ArrayList<BankAccount> sortedAccounts = Banking.sortByNumber(client);
        for (BankAccount account : sortedAccounts) {
            System.out.println("Number: " + account.getNumber() + ", amount: " + account.getAmount() + ", blocked: "
                    + account.isBlocked());
        }

        System.out.println("\nTotal amount: " + Banking.totalAmount(client));

        System.out.println("\nPositive amount: " + Banking.positiveAmount(client));

        System.out.println("\nNegative amount: " + Banking.negativeAmount(client));
    }
}
