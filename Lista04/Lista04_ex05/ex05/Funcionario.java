package ex05;

public class Funcionario {
    private static int quantidade;
    private int matricula;

    public Funcionario() {
        Funcionario.quantidade++;
        this.matricula = Funcionario.quantidade;
    }

    public static int getQuantidade() {
        return quantidade;
    }

    public static void setQuantidade(int quantidade) {
        Funcionario.quantidade = quantidade;
    }

    public int getMatricula() {
        return matricula;
    }
}

