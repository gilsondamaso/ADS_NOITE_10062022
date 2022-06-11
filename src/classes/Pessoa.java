package classes;
public class Pessoa {
    private String nome;
    private int idade;
    private char sexo;
    private double altura;
    private double peso;
    private String cpf;

    public Pessoa() {
    }

    public Pessoa(String nome, int idade, char sexo, double altura, double peso, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Pessoa [altura=" + altura + ", cpf=" + cpf + ", idade=" + idade + ", nome=" + nome + ", peso=" + peso
                + ", sexo=" + sexo + "]";
    }    

     
}
