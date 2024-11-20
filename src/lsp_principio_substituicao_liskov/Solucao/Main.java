package lsp_principio_substituicao_liskov.Solucao;

public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        cachorro.fazerSom();  // "Latido"

        Animal gato = new Gato();
        gato.fazerSom();  // "Miau"
    }
}
