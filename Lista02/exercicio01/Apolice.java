package exercicio01;
import javax.swing.JOptionPane;
public class Apolice {
    private int numero;
    private String nome;
    private int idade;
    private char sexo;
    private double valorAutomovel;

    public Apolice() {
    }

    public Apolice(int num, String nome, int idade, char sexo, double valorAutomovel) {
        this.numero = numero;
        this.nome = nome;
        this.sexo = sexo;
        this.valorAutomovel = valorAutomovel;
    }

    public double calcularValor() {
        if (sexo == 'M' && idade <= 25) {
            return valorAutomovel * 10 / 100;
        } else if (sexo == 'M' && idade > 25) {
            return valorAutomovel * 5 / 100;
        } else {
            return valorAutomovel * 2 / 100;
        }
    }

    public String imprimir() {
        return "Número " + this.getNumero() + "\nNome " + this.getNome() + "\nIdade " + this.getIdade() +
                "\nSexo " + this.getSexo() + "\nValor Automóvel " + this.getValorAutomovel() + "\nValor Apólice " +
                calcularValor();
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) { this.sexo = sexo; }
    public double getValorAutomovel() { return valorAutomovel; }
    public void setValorAutomovel(double valorAutomovel) { this.valorAutomovel = valorAutomovel; }

    public void menu() {
        Object[] itens = {"Criar apólice", "Ver dados da apolice", "Sair"};
        Object selectedItem = JOptionPane.showInputDialog(null, "Escolha um item", "Opção", JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);

        while (!"Sair".equals(selectedItem)) {
            if (selectedItem == "Criar apólice") {
                Integer inputNumero = Integer.parseInt(JOptionPane.showInputDialog("Insira o número:"));
                this.setNumero(inputNumero);
                String inputNome = JOptionPane.showInputDialog("Insira o nome");
                this.setNome(inputNome);
                Character inputSexo = JOptionPane.showInputDialog("Insira o sexo: M / F").charAt(0);
                this.setSexo(inputSexo);
                Double inputValorAutomovel = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do automóvel"));
                this.setValorAutomovel(inputValorAutomovel);
            } else {
                    JOptionPane.showMessageDialog(null, this.imprimir());
            }
            selectedItem = JOptionPane.showInputDialog(null, "Escolha um item", "Opção", JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);
        }
    }
}