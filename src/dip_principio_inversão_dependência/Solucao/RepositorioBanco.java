package dip_principio_inversão_dependência.Solucao;

public class RepositorioBanco implements IRepositorio{

    @Override
    public void Salvar(String dados) {
        System.out.println("Dados salvos no banco de dados");
    }
}
