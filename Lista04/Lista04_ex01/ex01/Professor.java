package ex01;

import java.util.ArrayList;

public class Professor extends Funcionario {
    private String urlCurriculoLates;
    private ArrayList<Disciplina> listadedisciplinas;

    public Professor() {
    }

    public Professor(String nome, String cpf, String urlCurriculoLates, int numeroCracha, double salario, ArrayList<Disciplina> listadedisciplinas) {
        super(nome, cpf, numeroCracha, salario);
        this.urlCurriculoLates = urlCurriculoLates;
        this.listadedisciplinas = listadedisciplinas;
    }

    public void addDisciplina(Disciplina disciplina) {
        this.listadedisciplinas.add(disciplina);
    }

    public String toString() {
        return super.toString() +
                "\nUrl currículo: " + this.urlCurriculoLates +
                "\nDisciplinas: \n" + listadedisciplinas;
    }
}
