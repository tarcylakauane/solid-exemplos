package srp_principio_responsabilidade_unica.Solucao;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("João", 2000.0);
        funcionario.calcularAumento(10.0); // Aumento salarial de 10%

        // Gerar o relatório em uma classe separada
        RelatorioFuncionario relatorio = new RelatorioFuncionario();
        relatorio.gerarRelatorio(funcionario);
    }
}
