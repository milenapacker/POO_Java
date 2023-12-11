package ex01;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Exercicio01 {
    public static void main(String[] args) {
        Object[] itens = {"Inserir Disciplina", "Inserir Professor", "Inserir Atendente", "Inserir Aluno", "Adicionar Disciplina ao professor", "Mostrar Pessoas", "Sair"};
        String selectedItem = (String) JOptionPane.showInputDialog(null, "Escolha um item", "Opção", JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);

        ArrayList<Disciplina> listadedisciplinas = new ArrayList<>();
        ArrayList<Professor> listadeprofessores = new ArrayList<>();
        ArrayList<Funcionario> listadefuncionarios = new ArrayList<>();
        ArrayList<Atendente> listadeatendentes = new ArrayList<>();
        ArrayList<Aluno> listadealunos = new ArrayList<>();

        while (selectedItem != "Sair") {
            switch (selectedItem) {
                case "Inserir Disciplina":
                    int cod = Integer.parseInt(JOptionPane.showInputDialog("Digite o código da disciplina"));
                    String ndis = JOptionPane.showInputDialog("Digite o nome da disciplina");
                    Disciplina newdisciplina = new Disciplina(cod, ndis);
                    listadedisciplinas.add(newdisciplina);
                    JOptionPane.showMessageDialog(null, "Disciplina cadastrada com sucesso!");
                    break;
                case "Inserir Professor":
                    String nprof = JOptionPane.showInputDialog("Digite o nome do professor(a)");
                    String cpfprof = JOptionPane.showInputDialog("Digite o cpf do professor(a)");
                    String urlprof = JOptionPane.showInputDialog("Digite a url do currículo do professor(a)");
                    int ncracha = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do crachá do professor(a)"));
                    double sprof = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do professor(a)"));
                    ArrayList<Disciplina> listadediscprof = new ArrayList<>();
                    Professor prof = new Professor(nprof, cpfprof, urlprof, ncracha, sprof, listadediscprof);
                    listadeprofessores.add(prof);
                    JOptionPane.showMessageDialog(null, "Professor(a) cadastrada com sucesso!");
                    break;
                case "Inserir Atendente":
                    String naten = JOptionPane.showInputDialog("Digite o nome do(a) atendente");
                    String cpfaten = JOptionPane.showInputDialog("Digite o cpf do(a) atendente");
                    int ncrachaaten = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do crachá do(a) atendente"));
                    double saten = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do(a) atendente"));
                    String setaten = JOptionPane.showInputDialog("Digite o setor do(a) atendente");
                    String faten = JOptionPane.showInputDialog("Digite a função do(a) atendente");
                    Atendente aten = new Atendente(naten, cpfaten, ncrachaaten, saten, setaten, faten);
                    listadeatendentes.add(aten);
                    JOptionPane.showMessageDialog(null, "Atendente cadastrado(a) com sucesso!");
                    break;
                case "Inserir Aluno":
                    String nalun = JOptionPane.showInputDialog("Digite o nome do aluno(a)");
                    String cpfalun = JOptionPane.showInputDialog("Digite o cpf do aluno(a)");
                    String raalun = JOptionPane.showInputDialog("Digite o ra do aluno(a)");
                    String calun = JOptionPane.showInputDialog("Digite o curso do aluno(a)");
                    Aluno alu = new Aluno(nalun, cpfalun, raalun, calun);
                    listadealunos.add(alu);
                    JOptionPane.showMessageDialog(null, "Aluno(a) cadastrado(a) com sucesso!");
                    break;
                case "Adicionar Disciplina ao professor":
                    String nomdisc = JOptionPane.showInputDialog("Digite o nome da disciplina");
                    boolean discencontrada = false;

                    for (Disciplina disciplina : listadedisciplinas) {
                        if (disciplina.getNomedis().equals(nomdisc)) {
                            discencontrada = true;

                            String nomprof = JOptionPane.showInputDialog("Digite o nome do professor(a)");
                            boolean profencontrado = false;

                            for (Professor professor : listadeprofessores) {
                                if (professor.getNome().equals(nomprof)) {
                                    professor.addDisciplina(disciplina);
                                    JOptionPane.showMessageDialog(null, "Disciplina adicionada com sucesso!");
                                    profencontrado = true;
                                    break;
                                }
                            }
                            if (!profencontrado) {
                                JOptionPane.showMessageDialog(null, "Professor(a) não encontrado(a). Tenta de novo.");
                            }
                        }
                    }
                    if (!discencontrada) {
                        JOptionPane.showMessageDialog(null, "Disciplina não encontrada. Tenta de novo");
                    }
                    break;
                case "Mostrar Pessoas":
                    String todas = "Pessoas cadastradas: (se chegou até aqui -> parabéns Milena, você conseguiu!)\n\n";
                    for (Professor professor : listadeprofessores) {
                        todas += professor.toString() + "\n\n";
                    }
                    for (Atendente atendente : listadeatendentes) {
                        todas += atendente.toString() + "\n\n";
                    }
                    for (Aluno aluno : listadealunos) {
                        todas += aluno.toString() + "\n\n";
                    }
                    JOptionPane.showMessageDialog(null, todas, "Pessoas Cadastradas", JOptionPane.INFORMATION_MESSAGE);
                    break;
            }
            selectedItem = (String) JOptionPane.showInputDialog(null, "Escolha um item", "Opção", JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);
        }
    }
}
