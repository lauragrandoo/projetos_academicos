
package metodos;

public class Metodos {
    
    public static void main (String[] args){
        
        //chamando o primeiro metodo
        Media m1 = new Media ();
        System.out.println(m1.calcular_Media1());
        
        //chamando o segundo metodo
        m1.calcular_Media2(97, 56);
    
        //chamando o terceiro metodo
        m1.escreve();
        
        //chamando o quarto metodo
        System.out.println(m1.calcular_Media3(44,22));
    }
    
}