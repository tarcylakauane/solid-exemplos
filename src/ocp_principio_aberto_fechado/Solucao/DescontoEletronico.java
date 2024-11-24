package ocp_principio_aberto_fechado.Solucao;

public class DescontoEletronico extends Desconto {

    // Sobrescrevendo o método calcular para aplicar o desconto de 10%
    @Override
    public double Calcular(double valor)
    {
        return valor * 0.1; // Desconto de 10%
    }
}