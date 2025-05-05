
package banco;
import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {
       
        Conta c1 = new Conta(1, "Dono1", 250.0);
        Conta c2 = new Conta(2, "Dono2", 200.0);
        
        System.out.println("------------------------------------------------");
        System.out.println("INFORMACOES DAS CONTAS DOS USUARIOS:");
        
        System.out.println("conta 1: " + c1.getNumero() + ", " + c1.getDono() + ", " + c1.getSaldo());
        System.out.println("conta 2: " + c2.getNumero() + ", " + c2.getDono() + ", " + c2.getSaldo());
        
        System.out.println("------------------------------------------------");
        System.out.println("SAQUE DE VALORES:");
        
        System.out.println("-- conta sem saldo para saque: ");
        c1.sacar(500.0);        
        
        System.out.println("-- conta com saldo: ");
        c2.sacar(100.0); 
    
        System.out.println("------------------------------------------------");
        System.out.println("DEPOSITO DE VALORES:");
        c2.depositar(1700.0); 
        
        
        System.out.println("------------------------------------------------");
        System.out.println("INSERCAO DE VALORES:");
        
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("digite o numero da conta: ");
        int num = leitor.nextInt();
        
        System.out.println("digite seu nome: ");
        String dono = leitor.next();
        
        System.out.println("digite seu saldo: ");
        double saldo = leitor.nextDouble();
        
        System.out.println("------------------------------------------------");             
           
    }
    
}
