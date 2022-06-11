import java.util.Scanner;
import classes.Cliente;
import classes.Conta;
import classes.ContaEmpresa;
import classes.Funcionario;
import classes.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Pessoa pes1 = new Pessoa();        

        System.out.println("INFORME SEU NOME: ");        
        pes1.setNome(sc.nextLine());
        System.out.println("INFORME SUA IDADE: ");
        pes1.setIdade(sc.nextInt());
        System.out.println("INFORME SEU GÊNERO: ");
        pes1.setSexo(sc.next().charAt(0));
        System.out.println("INFORME SUA ALTURA: ");
        pes1.setAltura(sc.nextDouble());
        System.out.println("INFORME SEU PESO: ");
        pes1.setPeso(sc.nextDouble());
        System.out.println("INFORME SEU CPF: ");
        sc.nextLine();
        pes1.setCpf(sc.nextLine());        
        System.out.println(pes1);
        
        sc.close();

        /*
        Pessoa pes2 = new Pessoa("GILSON", 38,'M', 1.77, 98, "05212306407");
        Funcionario func1 = new Funcionario("GILSON2", 38, 'M', 1.77, 98, "05212306407", "123456", 
        3250.65, "PROFESSOR", "DOCENTE");
        Cliente cli1 = new Cliente("GILSON2", 38, 'M', 1.77, 98, "05212306407", "RUA 2 154, PAULISTA", 
        "gilson.damaso@unifg.edu.be", "81997210413");        

        Conta cont1 = new Conta("3214", pes1, 1000);
        ContaEmpresa contEmp1 = new ContaEmpresa("3215", pes1, 10000, 3000);
        */

        
    }
}