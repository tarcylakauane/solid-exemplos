package srp_principio_responsabilidade_unica.Violacao;

public class Relatorio {
    private String conteudo;

    // Getter e Setter para 'conteudo'
    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    // Método para gerar o relatório
    public void gerarRelatorio() {
        System.out.println("Gerando Relatório...");
    }

    // Método para salvar o relatório
    public void salvarRelatorio() {
        System.out.println("Salvando Relatório no disco...");
    }
}
