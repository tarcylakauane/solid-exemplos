package Lsp_principio_substituicao_liskov.Violacao;

public class Retangulo {
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

    // Método para calcular a área
    public double calcularArea() {
        return largura * altura;
    }
}
