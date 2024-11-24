package srp_principio_responsabilidade_unica.Violacao;

public class Main {
    public static void main(String[] args) {
        // Criação de um objeto da classe Relatorio
        Relatorio relatorio = new Relatorio();

        // Definindo o conteúdo do relatório
        relatorio.setConteudo("Este é o conteúdo do relatório.");

        // Gerando o relatório
        relatorio.gerarRelatorio();

        // Salvando o relatório
        relatorio.salvarRelatorio();

        // Exibindo o conteúdo do relatório
        System.out.println("Conteúdo do Relatório: " + relatorio.getConteudo());
    }
}
