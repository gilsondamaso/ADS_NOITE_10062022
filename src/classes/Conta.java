package classes;

public class Conta {
    private String numero;
    private Pessoa titular;
    private double saldo;

    public Conta() {
    }

    public Conta(String string, Pessoa titular, double saldo) {
        this.numero = string;
        this.titular = titular;
        deposito(saldo);
    }

    public void deposito(double valor){
        saldo += valor;
    }

    public void saque(double valor){
        saldo -= valor + 5;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Pessoa getTitular() {
        return titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    

    
}
