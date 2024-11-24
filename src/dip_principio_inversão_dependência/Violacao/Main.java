package dip_principio_inversão_dependência.Violacao;

public class Main {
    public static void main(String[] args) {
        ServicoRelatorio servicoRelatorio = new ServicoRelatorio();
        servicoRelatorio.processar();
    }
}
