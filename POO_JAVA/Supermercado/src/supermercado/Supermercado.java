
package supermercado;

public class Supermercado {

    public static void main(String[] args) {
        Item i1 = new Item("001", "salame", 3, 10.0, 25.0);
        Item i2 = new Item("002", "queijo", 2, 10.0, 40.0);
        Item i3 = new Item("003", "pao", 5, 10.0, 10.0);
    
        System.out.println("cupom fiscal");
        System.out.println("ITEM            DESCRICAO       QTD     PRECO.UN        DESC%           PRECO.DESC");
        System.out.println(i1.codigo+"\t\t"+i1.descricao+"\t\t"+i1.quantidade+"\t"+i1.preco_unitario+"\t\t"+i1.desconto+"\t\t"+i1.calcular_desconto()); 
        System.out.println(i2.codigo+"\t\t"+i2.descricao+"\t\t"+i2.quantidade+"\t"+i2.preco_unitario+"\t\t"+i2.desconto+"\t\t"+i2.calcular_desconto()); 
        System.out.println(i3.codigo+"\t\t"+i3.descricao+"\t\t"+i3.quantidade+"\t"+i3.preco_unitario+"\t\t"+i3.desconto+"\t\t"+i3.calcular_desconto()); 
       
        System.out.println( "\no valor total eh: " + i1.calcular_total() + i2.calcular_total() + i2.calcular_total());
    }
    
}