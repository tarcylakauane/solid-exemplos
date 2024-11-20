package ocp_principio_aberto_fechado.Solucao;

public class PagamentoPix extends MetodoPagamento{
    @Override
    public void processar(double valor) {
        System.out.println("Processando pagamento via Pix: " + valor);
    }
}
