
package escola;

// 1 - atributos da classe alunos
public class Aluno {

    private int codigo;
    private String nome;
    private int diaNascimento;
    private int mesNascimento;
    private int anoNascimento;
    private double notaUm;
    private double notaDois;

    // 2.a - metodo construtor    
    public Aluno(int codigo, String nome, int diaNascimento, int mesNascimento, int anoNascimento, double notaUm, double notaDois) {
        this.codigo = codigo;
        this.nome = nome;
        this.diaNascimento = diaNascimento;
        this.mesNascimento = mesNascimento;
        this.anoNascimento = anoNascimento;
        this.notaUm = notaUm;
        this.notaDois = notaDois;
    }

    // 2.b - metodo para calcular quantos anos o aluno tem
    public int idadeAnos() {
        return (2025 - anoNascimento);
    }

    // 2.c - metodo para calcular quantos meses de vida tem o aluno
    public int idadeMeses() {
        return (((2025 - anoNascimento) * 12) + (4 - mesNascimento));
    }

    // 2.d - metodo para calcular a media das notas do aluno
    public double mediaNotas() {
        return ((notaUm + notaDois) / 2);
    }

    // 2.e - metodo para escrever nna tela todos os dados do aluno
    public void dadosAluno() {
        System.out.println("informacoes sobre o aluno de codigo: " + codigo);
        System.out.println("");
        System.out.println("nome: " + nome);
        System.out.println("data de nascimento: " + diaNascimento + "/" + mesNascimento + "/" + anoNascimento);
        System.out.println("nota 1: " + notaUm);
        System.out.println("nota 2: " + notaDois);
        System.out.println("");
        System.out.println("idade em anos: " + idadeAnos());
        System.out.println("idade em meses: " + idadeMeses());
        System.out.println("media das notas: " + mediaNotas());
        System.out.println("");
        System.out.println("-----------------------------------------");
        System.out.println("");
    }
}

