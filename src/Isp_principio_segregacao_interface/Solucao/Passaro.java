package Isp_principio_segregacao_interface.Solucao;

public class Passaro implements IComer, IVoar{

    @Override
    public void Comer() {
        System.out.println("Passaro comendo");
    }

    public void Voar() {
        System.out.println("Passaro Voando");
    }
}
