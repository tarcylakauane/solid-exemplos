package ocp_principio_aberto_fechado.Solucao;

public class PagamentoCredito extends MetodoPagamento{
    @Override
    public void processar(double valor) {
        System.out.println("Processando pagamento com cartão de crédito: " + valor);
    }
}
