package exericio02;
import javax.swing.JOptionPane;
public class Vendedor {
    private int codigo;
    private String nome;
    private double percentualComissao;

    public Vendedor() {
    }

    public Vendedor(int codigo, String nome, double percentualComissao) {
        this.codigo = codigo;
        this.nome = nome;
        this.percentualComissao = percentualComissao;
    }

    public int getCodigo() {return codigo;}
    public void setCodigo(int codigo) {this.codigo = codigo;}
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public double getPercentualComissao() {return percentualComissao;}
    public void setPercentualComissao(double percentualComissao) {this.percentualComissao = percentualComissao;}

    public double calcularPagamentoComissao(double valorVenda) {
        return valorVenda * percentualComissao / 100;
    }

    public double calcularPagamentoComissao(double valorVenda, double desconto) {
        return calcularPagamentoComissao(valorVenda) - desconto;
    }

    public String imprimir(double valorVenda, double desconto) {
        return "Código: " + this.getCodigo() + "\nNome: " + this.getNome() + "\nValor venda: R$ " + valorVenda +
                "\n% Comissão: " + this.getPercentualComissao() + "\nDesconto: R$ " + desconto + "\nValor a pagar: R$ " + calcularPagamentoComissao(valorVenda, desconto);
    }

    public void menu() {
        Object[] itens = {"Cadastrar vendedor", "Calcular venda", "Sair"};
        Object selectedItem = JOptionPane.showInputDialog(null, "Escolha um item", "Opção", JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);

        while (!"Sair".equals(selectedItem)) {
            if (selectedItem == "Cadastrar vendedor") {
                Integer inputCodigo = Integer.parseInt(JOptionPane.showInputDialog("Insira o código do vendedor:"));
                this.setCodigo(inputCodigo);
                String inputNome = JOptionPane.showInputDialog("Insira o nome:");
                this.setNome(inputNome);
                Double inputpercentualComissao = Double.parseDouble(JOptionPane.showInputDialog("Insira a porcentagem da comissão:"));
                this.setPercentualComissao(inputpercentualComissao);
            } else {
                double valorVenda = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da venda: "));
                double desconto = Double.parseDouble(JOptionPane.showInputDialog("Insira o desconto: "));
                JOptionPane.showMessageDialog(null, this.imprimir(valorVenda, desconto));
            }
            selectedItem = JOptionPane.showInputDialog(null, "Escolha um item", "Opção", JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);
        }
    }
}
