package ocp_principio_aberto_fechado.solucao;

import ocp_principio_aberto_fechado.Solucao.MetodoPagamento;

public class ProcessadorPagamento {

    public void processarPagamento(MetodoPagamento pagamento, double valor) {
        pagamento.processar(valor);
    }
}
