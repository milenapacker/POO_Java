package ex02;

import java.util.ArrayList;

public class AlunoGrad extends Aluno {
    private String anoConclusaoEm;
    private Double ac1;
    private Double ac2;
    private Double af;
    private Double ag;
    private ArrayList<Aluno> listaalunosgrad;

    public AlunoGrad() {
    }

    public AlunoGrad(String ra, String nome, String curso, String anoConclusaoEm, Double ac1, Double ac2, Double af, Double ag) {
        super(ra, nome, curso);
        this.anoConclusaoEm = anoConclusaoEm;
        this.ac1 = ac1;
        this.ac2 = ac2;
        this.af = af;
        this.ag = ag;
    }

    @Override
    public Double calcularMedia() {
        return ((ac1 * 0.1) + (ac2 * 0.3) + (af * 0.4) + (ag * 0.2));
    }

    public String verificarAprovacao() {
        if (calcularMedia() >= 7.0) {
            return "APROVADO(A)";
        } else {
            return "REPROVADO(A)";
        }
    }

    @Override
    public String toString() {
        return "\nRa: " + getRa() +
                "\nNome: " + getNome() +
                "\nCurso: " + getCurso() +
                "\nAno de conclusão do Ensino Médio: " + anoConclusaoEm +
                "\nNota da AC1: " + ac1 +
                "\nNota da AC2: " + ac2 +
                "\nNota da AF: " + af +
                "\nNota da AG: " + ag +
                "\nMédia: " + calcularMedia() +
                "\nSituação: " + verificarAprovacao();
    }

    public String getAnoConclusaoEm() {
        return anoConclusaoEm;
    }

    public void setAnoConclusaoEm(String anoConclusaoEm) {
        this.anoConclusaoEm = anoConclusaoEm;
    }

    public Double getAc1() {
        return ac1;
    }

    public void setAc1(Double ac1) {
        this.ac1 = ac1;
    }

    public Double getAc2() {
        return ac2;
    }

    public void setAc2(Double ac2) {
        this.ac2 = ac2;
    }

    public Double getAf() {
        return af;
    }

    public void setAf(Double af) {
        this.af = af;
    }

    public Double getAg() {
        return ag;
    }

    public void setAg(Double ag) {
        this.ag = ag;
    }
}
