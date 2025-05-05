package objetosdehumor;

public class Feliz extends Humor {

    @Override
    protected String getHumor() {
        return "feliz";
    }

    //especialização
    public void rir() {
        System.out.println("***risos***");
    }
}
