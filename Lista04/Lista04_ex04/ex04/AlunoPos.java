package ex04;

public class AlunoPos extends Aluno {
    private String anoconclusaograd;

    public AlunoPos() {
    }

    public AlunoPos(String ra, String nome, String curso, String anoconclusao) {
        super(ra, nome, curso);
        this.anoconclusaograd = anoconclusao;
    }

    public String getAnoconclusao() {
        return anoconclusaograd;
    }

    public void setAnoconclusao(String anoconclusao) {
        this.anoconclusaograd = anoconclusao;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Ano de consluão da Pós Graduação: " + anoconclusaograd;
    }
}
