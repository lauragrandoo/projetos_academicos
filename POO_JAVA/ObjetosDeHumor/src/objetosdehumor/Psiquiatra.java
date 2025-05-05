package objetosdehumor;

public class Psiquiatra {
    
    //polimorfismo de inclusão para examinar todos os objetos de humor genericamente
    //pega qualquer instância de Humor e pergunta para ela como se sente e a instância vai responder como ela se sente

    public void examinar(Humor humor) {
        System.out.println("fale-me, objeto, como voce se sente hoje?");
        humor.escreveHumor();
        System.out.println("----------------------------------");
    }

    //usa a sobrecarga para observar objetos especificamente, mas com um método chamado genericamente
    public void observar(Triste triste) {
        triste.chorar();
        System.out.println("hum...muito interessante. Alguma coisa esta fazendo este objeto se sentir triste");
        System.out.println("----------------------------------");
    }

    public void observar(Feliz feliz) {
        feliz.rir();
        System.out.println("hum...muito interessante. Este objeto parece muito feliz");
        System.out.println("----------------------------------");
    }
}
