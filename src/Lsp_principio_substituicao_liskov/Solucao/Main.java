package Lsp_principio_substituicao_liskov.Solucao;

public class Main {
    public static void main(String[] args) {
        // Criando um Retângulo
        Retangulo retangulo = new Retangulo();
        retangulo.setLargura(4.0);
        retangulo.setAltura(5.0);

        // Criando um Quadrado
        Quadrado quadrado = new Quadrado();
        quadrado.setLado(6.0);

        // Exibindo informações
        System.out.println("Retângulo:");
        System.out.println("Largura: " + retangulo.getLargura());
        System.out.println("Altura: " + retangulo.getAltura());
        System.out.println("Área: " + retangulo.Area());

        System.out.println();

        System.out.println("Quadrado:");
        System.out.println("Lado: " + quadrado.getLado());
        System.out.println("Área: " + quadrado.Area());

        System.out.println();

        // Usando polimorfismo
        Forma formaRetangulo = retangulo;
        Forma formaQuadrado = quadrado;

        System.out.println("Polimorfismo:");
        System.out.println("Área da forma Retângulo: " + formaRetangulo.Area());
        System.out.println("Área da forma Quadrado: " + formaQuadrado.Area());
    }
}
