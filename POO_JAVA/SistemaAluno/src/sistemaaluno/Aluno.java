
package sistemaaluno;

public class Aluno {
    
    private String nome;
    private double nota1;
    private double nota2;
    
    //metodo construtor
    public Aluno(String nome, double nota1, double nota2){
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        }
    
    //metodo construtor 
    public Aluno(){
        this.nome = "";
        this.nota1 = 0;
        this.nota2 = 0;
        }

    //gets
    public String getNome() {
        return nome;
        }

    public double getNota1() {
        return nota1;
        }

    public double getNota2() {
        return nota2;
        }

    //sets
    public void setNome(String nome) {
        this.nome = nome;
        }
    
    public void setNota1(double nota1) {
        this.nota1 = nota1;
        }
    
    public void setNota2(double nota2) {
        this.nota2 = nota2;
        }
    
    //metodo que calcula a media das duas notas
    public double mediaAluno(){
        return ((nota1+nota2)/2);
        }
    
    //metodo para validar se o aluno esta aprovado ou nao
    public boolean aprovado(){
        if (mediaAluno() >= 5){
            return true;
        } else {
            return false;
            }
        }
    
    //metodo para imprimir na tela os resultados
    public void retornoAluno(){
        System.out.println("nome: " + nome);
        System.out.println("nota1: " + nota1);
        System.out.println("nota2: " + nota2);
        System.out.println("media: " + mediaAluno());
        System.out.println("-----------------------------------------");
        }
    
}
