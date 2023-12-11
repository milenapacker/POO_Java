package ex05;

import javax.swing.JOptionPane;

public class Exercicio05 {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario();
        JOptionPane.showMessageDialog(null, funcionario1.getMatricula());

        Funcionario funcionario2 = new Funcionario();
        JOptionPane.showMessageDialog(null, funcionario2.getMatricula());

        Funcionario funcionario3 = new Funcionario();
        JOptionPane.showMessageDialog(null, funcionario3.getMatricula());

        JOptionPane.showMessageDialog(null, Funcionario.getQuantidade());
    }
}

