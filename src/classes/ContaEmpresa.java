package classes;

public class ContaEmpresa extends Conta {
    private double limiteEmprestimo;

    public ContaEmpresa() {
        
    }

    public ContaEmpresa(String string, Pessoa titular, double saldo, double limiteEmprestimo) {
        super(string, titular, saldo);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public double getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void setLimiteEmprestimo(double limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }

    
}
