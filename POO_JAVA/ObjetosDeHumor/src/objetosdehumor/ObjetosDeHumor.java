
package objetosdehumor;

public class ObjetosDeHumor {

    public static void main(String[] args) {

        Humor humor = new Humor();
        Feliz feliz = new Feliz();
        Triste triste = new Triste();
        
        System.out.println("como o objeto humor se sente hoje?");
        humor.escreveHumor();
        System.out.println("----------------------------------");
        
        
        System.out.println("Como o objeto Triste se sente hoje?");
        triste.escreveHumor();
        triste.chorar();
        System.out.println("----------------------------------");
        
        
        System.out.println("Como o objeto Feliz se sente hoje?");
        feliz.escreveHumor();
        feliz.rir();
        System.out.println("----------------------------------");

        
        Psiquiatra p = new Psiquiatra();
        
        //usa polimorfismo de inclusão
        p.examinar(humor);
        p.examinar(triste);
        p.examinar(feliz);

        //usa a sobrecarga para o psiquiatra observar os objetos
        p.observar(triste);
        p.observar(feliz);

    }

}


