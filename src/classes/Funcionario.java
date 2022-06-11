package classes;

public class Funcionario extends Pessoa {
    private String matricula;
    private double salario;
    private String funcao;
    private String setorAlocado;

    public Funcionario() {
    }

    public Funcionario(String nome, int idade, char sexo, double altura, double peso, String cpf, String matricula, double salario, String funcao, String setorAlocado) {
        super(nome, idade, sexo, altura, peso, cpf);

        this.matricula = matricula;
        this.salario = salario;
        this.funcao = funcao;
        this.setorAlocado = setorAlocado;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getSetorAlocado() {
        return setorAlocado;
    }

    public void setSetorAlocado(String setorAlocado) {
        this.setorAlocado = setorAlocado;
    }

    @Override
    public String toString() {
        return "Funcionario [funcao=" + funcao + ", matricula=" + matricula + ", salario=" + salario + ", setorAlocado="
                + setorAlocado + "]";
    }

    
    

}
