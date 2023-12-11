package ex01;

public class Disciplina {
    private int codigo;
    private String nomedis;

    public Disciplina() {
    }

    public Disciplina(int codigo, String nomedis) {
        this.codigo = codigo;
        this.nomedis = nomedis;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomedis() {
        return nomedis;
    }

    public void setNomedis(String nomedis) {
        this.nomedis = nomedis;
    }

    @Override
    public String toString() {
        return "Código: " + codigo +
                "\n Nome da discplina: " + nomedis;
    }
}
