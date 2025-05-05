package objetosdehumor;

public class Triste extends Humor {

    //redefine o humor
    protected String getHumor() {
        return "triste";
    }

    //especialização
    public void chorar() {
        System.out.println("***choros***");
    }

}
