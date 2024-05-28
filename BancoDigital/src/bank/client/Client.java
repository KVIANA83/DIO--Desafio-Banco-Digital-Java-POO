package bank.client;

import java.util.ArrayList;
import java.util.List;
import bank.account.Account;

public class Client {
    private String name;
    private List<Account> accounts;

    public Client(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void adicionarConta(Account account) {
        accounts.add(account);
    }

    public void imprimirContas() {
        System.out.println("Cliente: " + name);
        for (Account account : accounts) {
            account.imprimirExtrato();
        }
    }
}

