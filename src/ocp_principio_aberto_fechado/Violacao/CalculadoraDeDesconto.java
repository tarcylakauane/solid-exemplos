package ocp_principio_aberto_fechado.Violacao;

import ocp_principio_aberto_fechado.Solucao.Desconto;

public class CalculadoraDeDesconto {
    public double CalcularDesconto(String tipoProduto, double valor) {
        if (tipoProduto.equals("Eletronico")) {
            return valor * 0.1;
        } else if (tipoProduto.equals("Roupas")) {
            return valor * 0.2;
        } else {
            return 0;
        }
    }
}