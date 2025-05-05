
package bilhetes;

public class MaquinaBilhetes {
    
    private double preco_bilhete; //preco do bilhete unitario
    private double saldo_cliente; //saldo do cliente na maquina
    private double saldo_maquina; //quantia coletada pela maquina

    //metodo construtor
    public MaquinaBilhetes (double bilhete){
        this.preco_bilhete = bilhete;
        this.saldo_cliente = 0;
        this.saldo_maquina = 0;
    }

    public double getPreco_bilhete(){
        return this.preco_bilhete;
    }

    public double getSaldo_cliente(){
        return this.saldo_cliente;
    }

    public double getSaldo_maquina(){
        return this.saldo_maquina;
    }

    public void setPreco_bilhete (double preco_bilhete){
        this.preco_bilhete = preco_bilhete;
    }

    public void setSaldo_cliente (double saldo_cliente){
        this.saldo_cliente = saldo_cliente;
    }

    public void setSaldo_maquina (double saldo_maquina){
        this.saldo_maquina = saldo_maquina;
    }


    public void inserir_dinheiro(double valor_dinheiro){
        this.saldo_cliente = (this.saldo_cliente + valor_dinheiro);
    }

    public void imprimir_bilhete (){

        System.out.println("------------");
        System.out.println("venda de bilhete de trem");
        System.out.println("preco: R$" + this.preco_bilhete);

        this.saldo_maquina = (this.saldo_maquina + preco_bilhete);
        this.saldo_cliente = (this.saldo_cliente - preco_bilhete);
    }
}
