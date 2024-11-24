package Lsp_principio_substituicao_liskov.Solucao;

public class Quadrado extends Forma {
    private double lado;

    // Getter e setter para o lado
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    // Implementação do método calcularArea
    @Override
    public double Area() {
        return lado * lado;
    }
}