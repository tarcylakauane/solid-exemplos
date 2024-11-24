package Lsp_principio_substituicao_liskov.Solucao;

public class Retangulo extends Forma {
    private double largura;
    private double altura;

    // Getters e setters
    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Implementação do método calcularArea
    @Override
    public double Area() {
        return largura * altura;
    }
}
