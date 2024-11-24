package srp_principio_responsabilidade_unica.Solucao;

public class Main {
    public static void main(String[] args) {
        // Instanciando o gerador de relatório
        GeradorRelatorio gerador = new GeradorRelatorio();

        // Gerando o relatório e armazenando o conteúdo
        String conteudo = gerador.gerar();

        // Instanciando a classe responsável pela persistência do relatório
        RelatorioPersistencia persistencia = new RelatorioPersistencia();

        // Salvando o conteúdo do relatório
        persistencia.salvar(conteudo);

        // Mensagem final para o usuário
        System.out.println("Relatório gerado e salvo com sucesso!");
    }
}
