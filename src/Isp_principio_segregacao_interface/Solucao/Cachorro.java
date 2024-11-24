package Isp_principio_segregacao_interface.Solucao;

public class Cachorro implements IComer, INadar {

    @Override
    public void Comer() {
        System.out.println("Cachorro comendo");
    }
    public void Nadar() {
        System.out.println("Cachorro nadando");
    }
}
