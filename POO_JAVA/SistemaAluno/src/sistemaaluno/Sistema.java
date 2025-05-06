
package sistemaaluno;
import java.util.Scanner;

public class Sistema {
    private Aluno [] vetorCadastroAluno;
    private int maximo = 100;
    private int contador = 0;
    
    Scanner scanner = new Scanner(System.in);
    
    public int Menu(){
        System.out.println("");
        System.out.println("-----------------------------------------");
        System.out.println("MENU:");
        System.out.println("");
        System.out.println("1- cadastrar aluno");
        System.out.println("2- exibir a lista de alunos");
        System.out.println("3- buscar pelo nome");
        System.out.println("4- sair");
        System.out.println("");
        System.out.println("escolha uma das opcoes acima: ");
       
        int opcao = scanner.nextInt();
        return opcao;
        
    }
                     
    public void executar(){
        int opcao;
        vetorCadastroAluno = new Aluno[maximo];
        
        do {
            opcao = Menu();
            
            switch(opcao){
                
                case 1:
                    if (maximo<101){
                        
                        System.out.println("");
                        System.out.println("-----------------------------------------");
                        System.out.println("CADASTRO DE ALUNO:");
                        System.out.println("");
                        
                        System.out.println("digite o nome do aluno: ");
                        String nome = scanner.next();

                        System.out.println("digite a nota 1: ");
                        double nota1 = scanner.nextDouble();

                        System.out.println("digite a nota 2: ");
                        double nota2 = scanner.nextDouble();

                        vetorCadastroAluno[contador] = new Aluno(nome, nota1, nota2);
                        contador++;
                        
                        //outra opcao de fazer a atribuicao abaixo do vetor
                        //Aluno a1 = new Aluno(nome, nota1, nota2);
                        //vetorCadastroAluno[contador] = a1;
                        //contador++;
         
                    } else {
                        System.out.println("o sistema atingiu o limite de cadastros");
                    }
                    break;
                                        
                case 2:
                    
                    System.out.println("");
                    System.out.println("-----------------------------------------");
                    System.out.println("LISTA DE ALUNOS:");
                    System.out.println("");
                    
                    for(int i=0; i<contador; i++){
                        
                        System.out.println(vetorCadastroAluno[i].getNome());
                        System.out.println("nota 1: " + vetorCadastroAluno[i].getNota1());
                        System.out.println("nota 2: " + vetorCadastroAluno[i].getNota2());
                        System.out.println("media: " + vetorCadastroAluno[i].mediaAluno());
                        
                        if (vetorCadastroAluno[i].aprovado()){
                            System.out.println("resultado: aprovado");
                        } else {
                            System.out.println("resultado: reprovado");
                        }                     
                        
                        System.out.println("");
                    }
                    
                    break;
                
                case 3:
                    
                    System.out.println("");
                    System.out.println("acao nao pode ser concluida, aguardando implementacoes");
                    System.out.println("");
                    break;
                                      
                case 4:
                    System.out.println("operacao finalizada");
                    break;
            }
            
        } while (opcao != 4);
        
    }
    
    
    
    
    
    
    
    
}
