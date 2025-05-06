
package supermercado;

public class Item {
    
    String codigo;
    String descricao;
    int quantidade;
    double desconto;
    double preco_unitario;

    //assinatura do metodo
    public Item (String cod, String descri, int quant, double desco, double pre){ 

        // corpo do metodo
        this.codigo = cod;
        this.descricao = descri;
        this.quantidade = quant;
        this.desconto = desco;
        this.preco_unitario = pre;
    }

    public double calcular_desconto(){
        double vdesconto = ((quantidade * preco_unitario * desconto)/100);
        return vdesconto;
    }

    public double calcular_total(){
        double total = ((preco_unitario * quantidade) - calcular_desconto());
        return total;
    }
}