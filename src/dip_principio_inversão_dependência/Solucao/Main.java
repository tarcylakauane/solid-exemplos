package dip_principio_inversão_dependência.Solucao;

public class Main {
    public static void main(String[] args) {
        // Criando uma instância de RepositorioBanco que implementa IRepositorio
        IRepositorio repositorioBanco = new RepositorioBanco();

        // Criando o serviço de relatório com o repositório injetado
        ServicoRelatorio servicoRelatorio = new ServicoRelatorio(repositorioBanco);

        // Processando o relatório
        servicoRelatorio.processar();
    }
}
