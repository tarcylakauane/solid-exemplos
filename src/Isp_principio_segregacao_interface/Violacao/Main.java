package Isp_principio_segregacao_interface.Violacao;

public class Main {
    public static void main(String[] args) {
        IAcoesAnimal cachorro = new Cachorro();

        cachorro.Comer();

        try {
            cachorro.Voar();
        } catch (UnsupportedOperationException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        cachorro.Nadar();
    }
}
