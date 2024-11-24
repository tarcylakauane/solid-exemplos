package dip_principio_inversão_dependência.Violacao;

public class ServicoRelatorio {

    private Repositorio repositorio;

    public ServicoRelatorio() {
        this.repositorio = new Repositorio();
    }

    public void processar() {
        repositorio.Salvar("Relatório processando");
    }
}