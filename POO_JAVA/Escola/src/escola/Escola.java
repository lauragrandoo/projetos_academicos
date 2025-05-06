
package escola;

public class Escola {

   // 3 - instanciar 3 objetos e mostrar eles na tela
    public static void main(String[] args) {
        
        Aluno a1 = new Aluno (001, "Aluno1", 27, 4, 2003, 10.0, 7.0);
        Aluno a2 = new Aluno (002, "Aluno2", 18, 9, 2000, 5.0, 9.0);
        Aluno a3 = new Aluno (003, "Aluno3", 21, 6, 1972, 3.0, 6.0);
        
        a1.dadosAluno();
        a2.dadosAluno();
        a3.dadosAluno();
        
    }
}
