
package objetosdehumor;

public class Humor {
    
    //retorna o humor
    protected String getHumor(){
        return "mal-humorado";
    }

    //escreve na tela como o objeto se sente
    public void escreveHumor(){
        System.out.println("eu me sinto "+ getHumor()+" hoje!");
    }

    
    
    
}
