package Lsp_principio_substituicao_liskov.Violacao;

public class Main {
    public static void main(String[] args) {
        // Criando um Retângulo
        Retangulo retangulo = new Retangulo();
        retangulo.setLargura(4.0);
        retangulo.setAltura(6.0);
        System.out.println("Retângulo:");
        System.out.println("Largura: " + retangulo.getLargura());
        System.out.println("Altura: " + retangulo.getAltura());
        System.out.println("Área: " + retangulo.calcularArea());

        System.out.println();

        // Criando um Quadrado
        Quadrado quadrado = new Quadrado();
        quadrado.setLargura(5.0); // Define largura e altura ao mesmo tempo
        System.out.println("Quadrado:");
        System.out.println("Largura: " + quadrado.getLargura());
        System.out.println("Altura: " + quadrado.getAltura());
        System.out.println("Área: " + quadrado.calcularArea());
    }
}
