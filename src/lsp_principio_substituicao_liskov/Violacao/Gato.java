package lsp_principio_substituicao_liskov.Violacao;

public class Gato extends Animal {
    @Override
    public void fazerSom() {
        // Suponhamos que Gato não emita som
        // Isso viola o comportamento esperado, pois `fazerSom()` deveria ser implementado
    }
}