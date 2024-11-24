package dip_principio_inversão_dependência.Solucao;

public class ServicoRelatorio {

    private final IRepositorio repositorio;

    public ServicoRelatorio(IRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    public void processar() {
        repositorio.Salvar("Relatório processado");
    }
}
