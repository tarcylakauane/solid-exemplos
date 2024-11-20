package srp_principio_responsabilidade_unica.Solucao;

public class RelatorioFuncionario {
    public void gerarRelatorio(Funcionario funcionario) {
        System.out.println("Relatório do Funcionário:");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Salário: " + funcionario.getSalario());
    }
}
