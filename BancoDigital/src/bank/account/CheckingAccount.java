package bank.account;

public class CheckingAccount extends Account {

    public CheckingAccount(double balance) {
        super(balance);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Saldo da Conta Corrente: " + balance);
    }
}
