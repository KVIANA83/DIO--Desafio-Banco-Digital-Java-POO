package bank;

import bank.account.Account;
import bank.account.CheckingAccount;
import bank.account.SavingsAccount;
import bank.client.Client;

public class Main {

    public static void main(String[] args) {
        Client client = new Client("John Doe");
        
        Account checkingAccount = new CheckingAccount(1000);
        Account savingsAccount = new SavingsAccount(2000);
        
        client.addAccount(checkingAccount);
        client.addAccount(savingsAccount);

        checkingAccount.deposit(500);
        savingsAccount.withdraw(300);

        client.printAccounts();
    }
}
