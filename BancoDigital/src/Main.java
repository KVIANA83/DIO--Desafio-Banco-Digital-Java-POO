package bank;

import bank.account.Account;
import bank.account.CheckingAccount;
import bank.account.SavingsAccount;
import bank.client.Client;

public class Main {

    public static void main(String[] args) {
        Client client = new Client("Karine Caldas");
        
        Account checkingAccount = new CheckingAccount(1000);
        Account savingsAccount = new SavingsAccount(2000);
        
        client.adicionarConta(checkingAccount);
        client.adicionarConta(savingsAccount);

        checkingAccount.depositar(500);
        savingsAccount.sacar(300);

