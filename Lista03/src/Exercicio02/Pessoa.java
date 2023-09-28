package Exercicio02;
import java.util.ArrayList;
public class Pessoa {
    private int codigo;
    private String nome;
    private ArrayList<Automovel> listaAutomovel;

    public int getCodigo() {return codigo;}
    public void setCodigo(int codigo) {this.codigo = codigo;}
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public ArrayList<Automovel> getListaautomovel() {return listaAutomovel;}
    public void setListaautomovel(ArrayList<Automovel> listaautomovel) {this.listaAutomovel = listaAutomovel;}

    public Pessoa() {
        this.listaAutomovel = new ArrayList<>();
    }

    public Pessoa(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.listaAutomovel = new ArrayList<>();
    }

    public void inserirAutomovel(Automovel automovel) {
            listaAutomovel.add(automovel);
    }
    public void removerAutomovel(int index) {
        if (index >= 0 && index < listaAutomovel.size()) {
            listaAutomovel.remove(index);
        }
    }

    public String imprimir() {
        return "Código: " + this.codigo + "Nome: " + this.nome;
    }

    public String imprimirCompleto() {
        String impressao = this.imprimir();
        for(Automovel a: this.listaAutomovel) {
            impressao += a.imprimir() + "\n";
        }
        return impressao;
    }
}

