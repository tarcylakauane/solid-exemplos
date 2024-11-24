package Isp_principio_segregacao_interface.Solucao;

public class Main {
    public static void main(String[] args) {
        // Criando instância de Cachorro
        Cachorro cachorro = new Cachorro();
        System.out.println("Ações do Cachorro:");
        cachorro.Comer();
        cachorro.Nadar();

        // Criando instância de Passaro
        Passaro passaro = new Passaro();
        System.out.println("\nAções do Passaro:");
        passaro.Comer();
        passaro.Voar();
    }
}

