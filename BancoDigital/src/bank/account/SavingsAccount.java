package bank.account;

public class SavingsAccount extends Account {

    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Saldo da Conta Poupança: " + balance);
    }
}
