package lsp_principio_substituicao_liskov.Violacao;

public class Cachorro extends Animal {
    @Override
    public void fazerSom() {
        System.out.println("Latido");
    }
}
