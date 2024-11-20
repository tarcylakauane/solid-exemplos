package srp_principio_responsabilidade_unica.Solucao;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void calcularAumento(double percentual) {
        salario += salario * (percentual / 100);
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }
}
