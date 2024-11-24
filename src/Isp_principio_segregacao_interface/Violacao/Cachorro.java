package Isp_principio_segregacao_interface.Violacao;

public class Cachorro implements IAcoesAnimal {

    @Override
    public void Comer() {
        System.out.println("Cachorro comendo");
    }

    @Override
    public void Voar() {
        throw new UnsupportedOperationException("Esta ação não é implementada.");
    }

    @Override
    public void Nadar() {
        System.out.println("Cachorro nadando.");
    }
}




