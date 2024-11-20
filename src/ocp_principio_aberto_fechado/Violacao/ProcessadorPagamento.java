package ocp_principio_aberto_fechado.Violacao;

public class ProcessadorPagamento {

    public void processarPagamento(String tipoPagamento, double valor) {
        if (tipoPagamento.equals("Credito")) {
            System.out.println("Processando pagamento com cartão de crédito: " + valor);
        } else if (tipoPagamento.equals("Pix")) {
            System.out.println("Processando pagamento via Pix: " + valor);
        }
    }
}
