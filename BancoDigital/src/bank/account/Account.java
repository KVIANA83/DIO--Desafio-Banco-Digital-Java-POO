package bank.account;

public abstract class Account {
    protected double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getSaldo() {
        return balance;
    }

    public void depositar(double quantia) {
        balance += quantia;
    }

    public void sacar(double quantia) {
        if (quantia <= balance) {
            balance -= quantia;
        } else {
            System.out.println("Fundos insuficientes");
        }
    }

    public abstract void imprimirExtrato();
}
