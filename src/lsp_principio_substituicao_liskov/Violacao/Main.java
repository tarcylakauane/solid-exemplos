package lsp_principio_substituicao_liskov.Violacao;

public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        cachorro.fazerSom();  // "Latido"

        Animal gato = new Gato();
        gato.fazerSom();  // Problema! Não está claro o que deveria acontecer
    }
}