package bank.service;

import bank.account.Conta;
import bank.account.ContaCorrente;
import bank.account.ContaPoupanca;
import bank.client.Client;

public class BankService {

    public static void main(String[] args) {
        Client client = new Client("Karine Viana");
        
        Conta contaCorrente = new ContaCorrente(1000);
        Conta contaPoupanca = new ContaPoupanca(2000);
        
        client.adicionarConta(contaCorrente);
        client.adicionarConta(contaPoupanca);

        contaCorrente.depositar(500);
        contaPoupanca.sacar(300);

        client.imprimirContas();
    }
}

