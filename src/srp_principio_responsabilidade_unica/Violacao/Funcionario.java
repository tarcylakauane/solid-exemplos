package srp_principio_responsabilidade_unica.Violacao;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    // Método que calcula o aumento salarial
    public void calcularAumento(double percentual) {
        salario += salario * (percentual / 100);
    }

    // Método que gera o relatório do funcionário (violando o srp_principio_responsabilidade_unica)
    public void gerarRelatorio() {
        System.out.println("Relatório do Funcionário:");
        System.out.println("Nome: " + nome);
        System.out.println("Salário: " + salario);
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }
}

