package ex04;

public class AlunoGrad extends Aluno {
    private String anoconclusaoem;

    public AlunoGrad() {
    }

    public AlunoGrad(String ra, String nome, String curso, String anoconclusaoem) {
        super(ra, nome, curso);
        this.anoconclusaoem = anoconclusaoem;
    }

    public String getAnoconclusaoem() {
        return anoconclusaoem;
    }

    public void setAnoconclusaoem(String anoconclusaoem) {
        this.anoconclusaoem = anoconclusaoem;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Ano conclusão Ensino Médio: " + anoconclusaoem;
    }
}
