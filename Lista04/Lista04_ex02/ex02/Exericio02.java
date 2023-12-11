package ex02;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Exericio02 {
    public static void main(String[] args) {

        ArrayList<AlunoGrad> listadealunosgrad = new ArrayList<>();
        ArrayList<AlunoPos> listadealunospos = new ArrayList<>();

        Object[] itens = {"Inserir Aluno", "Exibir Aluno", "Sair"};
        String selectedItem = (String) JOptionPane.showInputDialog(null, "Escolha um item", "Opção", JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);

        while (selectedItem != "Sair") {
            switch (selectedItem) {

                case "Inserir Aluno":
                    Object[] subItens = {"Aluno de Graduação", "Aluno de Pós Graduação", "Voltar"}; // isso é demais! Aprendi a colocar um menu dentro do outro :D
                    String subSelectedItem = (String) JOptionPane.showInputDialog(null, "Escolha um item", "Opção", JOptionPane.INFORMATION_MESSAGE, null, subItens, subItens[0]);

                    while (!subSelectedItem.equals("Voltar")) {
                        if (subSelectedItem.equals("Aluno de Graduação")) {
                            String ralun = JOptionPane.showInputDialog("Digite o ra do aluno(a)");
                            String nomeal = JOptionPane.showInputDialog("Digite o nome do aluno(a)");
                            String cursoal = JOptionPane.showInputDialog("Digite o nome do curso");
                            String anoc = JOptionPane.showInputDialog("Digite o ano de conclusão do Ensino Médio");
                            Double primeiranota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da AC1"));
                            Double segundanota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da AC2"));
                            Double terceitanota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da AF"));
                            Double quartanota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da AG"));
                            AlunoGrad newalunograd = new AlunoGrad(ralun, nomeal, cursoal, anoc, primeiranota, segundanota, terceitanota, quartanota);
                            listadealunosgrad.add(newalunograd);
                            JOptionPane.showMessageDialog(null, "Aluno(a) inserido(a) com sucesso!");
                        } else {
                            String ralun = JOptionPane.showInputDialog("Digite o ra do aluno(a)");
                            String nomeal = JOptionPane.showInputDialog("Digite o nome do aluno(a)");
                            String cursoal = JOptionPane.showInputDialog("Digite o nome do curso de Pós Graduação");
                            String anoc = JOptionPane.showInputDialog("Digite o ano de conclusão da Graduação");
                            Double primeiranota = Double.parseDouble(JOptionPane.showInputDialog("Digite a Nota 1"));
                            Double segundanota = Double.parseDouble(JOptionPane.showInputDialog("Digite a Nota 2"));
                            AlunoPos newalunopos = new AlunoPos(ralun, nomeal, cursoal, anoc, primeiranota, segundanota);
                            listadealunospos.add(newalunopos);
                            JOptionPane.showMessageDialog(null, "Aluno(a) inserido(a) com sucesso!");
                        }
                        subSelectedItem = (String) JOptionPane.showInputDialog(null, "Escolha um item", "Opção", JOptionPane.INFORMATION_MESSAGE, null, subItens, subItens[0]);
                    }
                    break;

                case "Exibir Aluno":
                    String todososlaunos = "Alunos(as) cadastrados(as): \n\n";
                    String alunosdagrad = "Alunos(as) da Graduação:\n";
                    for (AlunoGrad alunograd : listadealunosgrad) {
                        alunosdagrad += alunograd.toString() + "\n";
                    }

                    String alunosdapos = "Alunos(as) da Pós Graduação:\n";
                    for (AlunoPos alunopos : listadealunospos) {
                        alunosdapos += alunopos.toString() + "\n";
                    }

                    todososlaunos += alunosdagrad + "\n" + alunosdapos;
                    JOptionPane.showMessageDialog(null, todososlaunos, "Alunos(as) Cadastrados(as)", JOptionPane.INFORMATION_MESSAGE);
                    break;
            }
            selectedItem = (String) JOptionPane.showInputDialog(null, "Escolha um item", "Opção", JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);
        }
    }
}
