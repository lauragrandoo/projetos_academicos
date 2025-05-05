
package empresa;

public class Empresa {

    public static void main(String[] args) {
        
        Funcionario f1 = new Funcionario();
        f1.setNome("Jose Antonio");
        f1.setCpf("111111111");
        f1.setSalario(1000);
        System.out.println("Funcionario");
        System.out.println("Nome: "+f1.getNome());
        System.out.println("Cpf: "+ f1.getCpf());
        System.out.println("Salario: " + f1.getSalario());
        System.out.println("Bonificacao: " + f1.getBonificacao());

        Gerente f2 = new Gerente();
        f2.setNome("Pedro Henrique");
        f2.setCpf("222222222");
        f2.setSenha(4321);
        f2.setSalario(5000);
        
        if (f2.autentica(4321)) {
            System.out.println("Gerente");
            System.out.println("Nome: "+f2.getNome());
            System.out.println("Cpf: "+ f2.getCpf());
            System.out.println("Salario: " + f2.getSalario());
            System.out.println("Bonificacao: " + f2.getBonificacao());
            System.out.println("--------------------------------");
        } else {
            System.out.println("A senha esta incorreta");
            System.out.println("--------------------------------");
 
        }
        
        //Gerente gerente = new Gerente();
        //Funcionario funcionario = gerente;
        //funcionario.setSalario(5000.0);
        
        ControleDeBonificacoes controle = new ControleDeBonificacoes();
        controle.registra(f1);
        controle.registra(f2);
        System.out.println("--------------------------------");
        System.out.println("O total de bonificacoes eh: " +controle.getTotalDeBonificacoes());
    }
}
