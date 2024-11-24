package ocp_principio_aberto_fechado.Violacao;

public class Main {
    public static void main(String[] args) {
        // Instancia a calculadora de desconto
        CalculadoraDeDesconto calculadora = new CalculadoraDeDesconto();

        // Define os valores de entrada
        String tipoProduto1 = "Eletronico";
        double valor1 = 1000.0;

        String tipoProduto2 = "Roupas";
        double valor2 = 500.0;

        String tipoProduto3 = "Outro";
        double valor3 = 200.0;

        // Calcula os descontos
        double desconto1 = calculadora.CalcularDesconto(tipoProduto1, valor1);
        double desconto2 = calculadora.CalcularDesconto(tipoProduto2, valor2);
        double desconto3 = calculadora.CalcularDesconto(tipoProduto3, valor3);

        // Exibe os resultados
        System.out.println("Desconto para " + tipoProduto1 + ": R$ " + desconto1);
        System.out.println("Desconto para " + tipoProduto2 + ": R$ " + desconto2);
        System.out.println("Desconto para " + tipoProduto3 + ": R$ " + desconto3);
    }
}
