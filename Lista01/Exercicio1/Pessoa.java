package Exercicio1;
import javax.swing.JOptionPane;
public class Pessoa {

    private String nome;
    private String cpf;
    private Character sexo;
    private Integer idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String imprimir() {
        return "Nome: " + this.getNome() + "\nCpf: " + this.getCpf() + "\nSexo: " + this.getSexo() + "\nIdaade: " + this.getIdade();
    }

    public void menu() {
        Object[] itens = {"Criar pessoa", "Mostrar pessoa", "Sair"};
        Object selectedItem =
                JOptionPane.showInputDialog(null, "Escolha um item", "Opção", JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);

        while (selectedItem != "Sair") {
            if (selectedItem == "Criar pessoa") {
                String inputNome = JOptionPane.showInputDialog("Informe o nome");
                this.setNome(inputNome);

                String inputCpf = JOptionPane.showInputDialog("Insira o cpf");
                this.setCpf(inputCpf);

                Character inputSexo = JOptionPane.showInputDialog("Insira o sexo (F/M)").charAt(0);
                this.setSexo(inputSexo);

                Integer inputIdade = Integer.parseInt(JOptionPane.showInputDialog("Insira a idade"));
                this.setIdade(inputIdade);

            } else {
                if (selectedItem == "Mostrar pessoa") {
                    JOptionPane.showMessageDialog(null, this.imprimir());
                }
            }
            selectedItem = JOptionPane.showInputDialog(null, "Escolha um item", "Opção", JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);
        }
    }
}

