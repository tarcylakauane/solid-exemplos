package ocp_principio_aberto_fechado.Solucao;

public class Main {
    public static void main(String[] args) {
        // Criando instâncias das subclasses de desconto
        Desconto descontoAlimentos = new DescontoAlimentos();
        Desconto descontoEletronico = new DescontoEletronico();
        Desconto descontoRoupas = new DescontoRoupas();

        // Valores de exemplo
        double valorAlimentos = 100.0;
        double valorEletronico = 500.0;
        double valorRoupas = 300.0;

        // Calculando os descontos
        double descontoFinalAlimentos = descontoAlimentos.Calcular(valorAlimentos);
        double descontoFinalEletronico = descontoEletronico.Calcular(valorEletronico);
        double descontoFinalRoupas = descontoRoupas.Calcular(valorRoupas);

        // Exibindo os resultados
        System.out.println("Desconto para alimentos (5%): " + descontoFinalAlimentos);
        System.out.println("Desconto para eletrônicos (10%): " + descontoFinalEletronico);
        System.out.println("Desconto para roupas (20%): " + descontoFinalRoupas);
    }
}
