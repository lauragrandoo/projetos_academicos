
package bilhetes;

public class Bilhetes {
    
    public static void main(String[] args) {
       
        System.out.println("");    
        System.out.println("------------------------------");    
        System.out.println("MAQUINA 1");
        System.out.println("------------------------------");

        MaquinaBilhetes m1 = new MaquinaBilhetes (12.5);
        System.out.println("preco: R$" + m1.getPreco_bilhete());

        m1.inserir_dinheiro(12.5);
        m1.inserir_dinheiro(12.5);

        System.out.println("saldo cliente: R$" + m1.getSaldo_cliente());
        System.out.println("saldo maquina: R$" + m1.getSaldo_maquina());

        m1.imprimir_bilhete();

        System.out.println("saldo cliente: R$" + m1.getSaldo_cliente());
        System.out.println("saldo maquina: R$" + m1.getSaldo_maquina());

        ////////////////////////////////////////////////////////////////////////////

        System.out.println("");
        System.out.println("");
        System.out.println("------------------------------");
        System.out.println("MAQUINA 2");
        System.out.println("------------------------------");

        MaquinaBilhetes m2 = new MaquinaBilhetes (25.0);
        System.out.println("preco: R$" + m2.getPreco_bilhete());

        m2.inserir_dinheiro(25.0);
        m2.inserir_dinheiro(25.0);

        System.out.println("saldo cliente: R$" + m2.getSaldo_cliente());
        System.out.println("saldo maquina: R$" + m2.getSaldo_maquina());

        m2.imprimir_bilhete();

        System.out.println("saldo cliente: R$" + m2.getSaldo_cliente());
        System.out.println("saldo maquina: R$" + m2.getSaldo_maquina());

        ////////////////////////////////////////////////////////////////////////////

        System.out.println("");
        System.out.println("");
        System.out.println("------------------------------");
        System.out.println("MAQUINA 3");
        System.out.println("------------------------------");

        MaquinaBilhetes m3 = m1;
        System.out.println("preco: R$" + m3.getPreco_bilhete());
        System.out.println("saldo cliente: R$" + m3.getSaldo_cliente());
        System.out.println("saldo maquina: R$" + m3.getSaldo_maquina());

        ////////////////////////////////////////////////////////////////////////////

        System.out.println("");
        System.out.println("");
        System.out.println("------------------------------");
        System.out.println("MAQUINAS 4 E 5");
        System.out.println("------------------------------");

        MaquinaBilhetes m4 = new MaquinaBilhetes(12.5);
        MaquinaBilhetes m5 = new MaquinaBilhetes(12.5);

        if (m4==m5){
            System.out.println("contas iguais");
            } else {
                System.out.println("contas diferentes");
                }

        System.out.println("");
        System.out.println("");
   
    }
    
}
