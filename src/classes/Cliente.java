package classes;

public class Cliente extends Pessoa {
    private String endereco;
    private String email;
    private String telefone;

    public Cliente(){
        
    }

    public Cliente(String nome, int idade, char sexo, double altura, double peso, String cpf, String endereco,
            String email, String telefone) {
        super(nome, idade, sexo, altura, peso, cpf);
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
    }
    public Cliente(String nome, int idade, char sexo, double altura, double peso, String cpf, String endereco) {
        super(nome, idade, sexo, altura, peso, cpf);
        this.endereco = endereco;        
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Cliente [email=" + email + ", endereco=" + endereco + ", telefone=" + telefone + "]";
    }
    
}
