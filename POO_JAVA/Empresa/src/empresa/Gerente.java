
package empresa;
    
    public class Gerente extends Funcionario {
    
    private int senha;
    private int numeroDeFuncionariosGerenciados;

    public double getBonificacao() {
        return this.salario * 0.15;
    }

    public boolean autentica(int senha) {
        if (this.getSenha() == senha) {
            System.out.println("Acesso Permitido!");
            System.out.println( "--------------------------------");
            return true;

        } else {
            System.out.println("Acesso Negado!");
            System.out.println( "--------------------------------");
            return false;
        }
    }

    public int getSenha() {
        return senha;
    }
    
    public void setSenha(int senha) {
        this.senha = senha;
    }
    
    public int getNumeroDeFuncionariosGerenciados() {
        return numeroDeFuncionariosGerenciados;
    }

    public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
        this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
    }
}
