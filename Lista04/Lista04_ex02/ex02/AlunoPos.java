package ex02;

import java.util.ArrayList;

public class AlunoPos extends Aluno {
    private String anoConclusaoGrad;
    private Double nota1;
    private Double nota2;
    private ArrayList<Aluno> listaalunospos;

    public String toString() {
        return "\nRa: " + getRa() +
                "\nNome: " + getNome() +
                "\nCurso: " + getCurso() +
                "\n Ano de conclusão da Graduação: " + anoConclusaoGrad +
                "\nNota 1: " + nota1 +
                "\nNota 2: " + nota2 +
                "\nMédia: " + calcularMedia() +
                "\nSituação: " + verificarAprovacao();
    }

    public AlunoPos() {
    }

    @Override
    public Double calcularMedia() {
        return ((nota1 + nota2) / 2);
    }

    public String verificarAprovacao() {
        if (calcularMedia() >= 7.0) {
            return "APROVADO(A)";
        } else {
            return "REPROVADO(A)";
        }
    }

    public AlunoPos(String ra, String nome, String curso, String anoConclusaoGrad, Double nota1, Double nota2) {
        super(ra, nome, curso);
        this.anoConclusaoGrad = anoConclusaoGrad;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getAnoConclusaoGrad() {
        return anoConclusaoGrad;
    }

    public void setAnoConclusaoGrad(String anoConclusaoGrad) {
        this.anoConclusaoGrad = anoConclusaoGrad;
    }

    public Double getNota1() {
        return nota1;
    }

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }
}
