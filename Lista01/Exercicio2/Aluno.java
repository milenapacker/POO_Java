package Exercicio2;
import javax.swing.JOptionPane;
public class Aluno {
    public String ra;
    public String nome;
    public float ac1;
    public float ac2;
    public float ag;
    public float af;

    public String getRa() {return ra;}
    public void setRa(String ra) {this.ra = ra;}
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public float getAc1() {return ac1;}
    public void setAc1(float ac1) {this.ac1 = ac1;}
    public float getAc2() {return ac2;}
    public void setAc2(float ac2) {this.ac2 = ac2;}
    public float getAg() {return ag;}
    public void setAg(float ag) {this.ag = ag;}
    public float getAf() {return af;}
    public void setAf(float af) {this.af = af;}

    public String imprimir() {
        return "Ra: " + this.getRa() + "\nNome: " + this.getNome() + "\nAC1: " + this.getAc1() + "\nAC2: " + this.getAc2() + "\nAG: " + this.getAg() + "\nAF: " + this.getAf() +  "\nMédia: " + calcularMedia() + "\nSituação: " + verificarAprovacao();
    }
    public Float calcularMedia() {
        return (float) ((ac1*0.15) + (ac2*0.30) + (ag*0.10) + (af*0.45));
    }
    public String verificarAprovacao() {
        if (calcularMedia() >= 5) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }
    public void menu() {
        Object[] itens = {"Criar aluno", "Mostrar aluno", "Sair"};
        Object selectedItem = JOptionPane.showInputDialog(null, "Escolha um item", "Opção", JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);

        while (selectedItem != "Sair") {
            if(selectedItem == "Criar aluno"){
                String inputRa = JOptionPane.showInputDialog("Insira o RA");
                this.setRa(inputRa);

                String inputNome = JOptionPane.showInputDialog("Insira o nome");
                this.setNome(inputNome);

                Float inputAc1 = Float.parseFloat(JOptionPane.showInputDialog("Insira a nota da AC1"));
                this.setAc1(inputAc1);

                Float inputAc2 = Float.parseFloat(JOptionPane.showInputDialog("Insira a nota da AC2"));
                this.setAc2(inputAc2);

                Float inputAg = Float.parseFloat(JOptionPane.showInputDialog("Insira a nota da AG"));
                this.setAg(inputAg);

                Float inputAf = Float.parseFloat(JOptionPane.showInputDialog("Insira a nota da AF"));
                this.setAf(inputAf);
            } else {
                if ( selectedItem == "Mostrar aluno") {
                    JOptionPane.showMessageDialog(null, this.imprimir());
                }
            }
            selectedItem = JOptionPane.showInputDialog(null, "Escolha um item" , "Opção", JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);
        }
    }
}
