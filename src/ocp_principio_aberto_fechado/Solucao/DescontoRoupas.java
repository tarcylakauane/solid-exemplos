package ocp_principio_aberto_fechado.Solucao;

public class DescontoRoupas extends Desconto{
    @Override
    public double Calcular(double valor)
    {
        return valor * 0.2;
    }
}
