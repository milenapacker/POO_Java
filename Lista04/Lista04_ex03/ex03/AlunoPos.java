package ex03;

public class AlunoPos implements Aluno {
    private String ra;
    private String nome;
    private String curso;
    private String anoConclusaoGrad;
    private Double nota1;
    private Double nota2;

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

    public AlunoPos(String ra, String nome, String curso, String anoConclusaoGrad, Double nota1, Double nota2) {
        this.ra = ra;
        this.nome = nome;
        this.curso = curso;
        this.anoConclusaoGrad = anoConclusaoGrad;
        this.nota1 = nota1;
        this.nota2 = nota2;
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

    public String getRa() {
        return this.ra;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCurso(String curso) {
        this.curso = curso;
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
