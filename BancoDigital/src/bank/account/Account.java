package bank.account;

public abstract class Account {
    protected double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double quantia) {
        saldo += quantia;
    }

    public void sacar(double quantia) {
        if(quantia <= saldo) {
            saldo -= quantia;
        } else {
            System.out.println("Fundos insuficientes");
        }
    }

    public abstract void imprimirExtrato();
}
