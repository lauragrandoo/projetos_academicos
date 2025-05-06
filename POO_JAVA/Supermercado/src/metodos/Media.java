
package metodos;

public class Media {
    
    //1 metodo que retorna um valor
    public double calcular_Media1(){
        double m;
        m = ((3.0+4.0)/2.0);
        return m;
    }
        
    //2 metodo que calcula a media de 2 valores que eu ainda não sei o valor, com parametros
    //usa o void pra nao ter o return
    public void calcular_Media2(int num1, int num2){
        double m;
        m = ((num1+num2)/2);
        System.out.println("a media eh: " + m);
    }
    
    //3 metodo sem parametro
    public void escreve(){
        System.out.println("a media eh: " + 4);
    }
    
    //4 metodo que tem return e recebe parametro, segundo o professor eh oq mais faz sentido pra calculo de media
    public double calcular_Media3(int num1, int num2){
        double m;
        m = ((num1+num2)/2);
        return m;
    }
   
}
