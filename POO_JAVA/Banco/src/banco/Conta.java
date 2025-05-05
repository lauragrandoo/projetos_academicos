
package banco;

public class Conta {
    
    private int numero;
    private String dono;
    private double saldo;

    // construtor 
    public Conta(int numero, String dono, double saldo) {
        this.numero = numero;
        this.dono = dono;
        this.saldo = saldo;
    }

    // metodo acessor GET
    public int getNumero() {
        return this.numero;
    }

    public String getDono() {
        return this.dono;
    }

    public double getSaldo() {
        return this.saldo;
    }

    // metodo mutante SET
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //
    public void sacar(double valor) {
        if (saldo < valor) {
            System.out.println("saldo insuficiente para saque de valor informado");
        } else {
            this.saldo = (this.saldo - valor);
            System.out.println("saldo apos saque: R$" + saldo);
        }
    }

    public void depositar(double valor) {
        this.saldo = (this.saldo + valor);
        System.out.println("saldo apos deposito: R$" + saldo);
    }
}
