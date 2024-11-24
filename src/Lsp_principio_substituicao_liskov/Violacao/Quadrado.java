package Lsp_principio_substituicao_liskov.Violacao;

public class Quadrado extends Retangulo {

    @Override
    public void setLargura(double largura) {
        super.setLargura(largura);
        super.setAltura(largura); // Mantém a altura igual à largura
    }

    @Override
    public void setAltura(double altura) {
        super.setAltura(altura);
        super.setLargura(altura); // Mantém a largura igual à altura
    }
}
