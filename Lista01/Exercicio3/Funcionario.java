package Exercicio3;
import javax.swing.JOptionPane;
public class Funcionario {

    private Integer cracha;
    private String nome;
    private Character tipoVinculo;
    private Float valorHora;
    private Float qtdeHora;
    private Float salario;
    private Float valorDesconto;

    public Integer getCracha() {return cracha;}
    public void setCracha(Integer cracha) {this.cracha = cracha;}
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public Character getTipoVinculo() {return tipoVinculo;}
    public void setTipoVinculo(Character tipoVinculo) {this.tipoVinculo = tipoVinculo;}
    public Float getValorHora() {return valorHora;}
    public void setValorHora(Float valorHora) {this.valorHora = valorHora;}
    public Float getQtdeHora() {return qtdeHora;}
    public void setQtdeHora(Float qtdeHora) {this.qtdeHora = qtdeHora;}
    public Float getSalario() {return salario;}
    public void setSalario(Float salario) {this.salario = salario;}
    public Float getValorDesconto() {return valorDesconto;}
    public void setValorDesconto(Float valorDesconto) {this.valorDesconto = valorDesconto;}



    public Float CalcularValorSalario() {
        if(tipoVinculo == 'H') {
            return (valorHora * qtdeHora) - valorDesconto;
        } else {
            return salario - valorDesconto;
        }
    }


    public Float Salarios(){
        if (tipoVinculo == 'H') {
            return valorHora * qtdeHora;
        } else {
            return salario;
        }
    }

    public String imprimir() {
        return "Crachá: " + this.getCracha() + "\nNome: " + this.getNome() + "\nTipo Vínculo: "
                + this.getTipoVinculo() + "\nSalário: " + Salarios() + "\nDesconto: " + this.getValorDesconto() + "\nValor a receber:" + CalcularValorSalario();
    }



    public void menu() {
        Object[] itens = {"Criar funcionário", "Mostrar folha de pagamento", "Alterar remuneração", "Sair"};
        Object selectedItem = JOptionPane.showInputDialog(null, "Escolha um item", "Opção", JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);

        while(selectedItem != "Sair"){
            if(selectedItem == "Criar funcionário") {
                Integer inputCracha = Integer.parseInt(JOptionPane.showInputDialog("Insira o número do seu crachá"));
                this.setCracha(inputCracha);

                String inputNome = JOptionPane.showInputDialog("Insira o nome");
                this.setNome(inputNome);

                Character inputTipoVinculo = JOptionPane.showInputDialog("Insira o tipo de vínculo").charAt(0);
                this.setTipoVinculo(inputTipoVinculo);
                    if (tipoVinculo == 'H') {

                        Float inputValorHora = Float.parseFloat(JOptionPane.showInputDialog("Insira o valor da hora"));
                        this.setValorHora(inputValorHora);

                        Float inputQtdeHora = Float.parseFloat(JOptionPane.showInputDialog("Insira a quantidade de horas"));
                        this.setQtdeHora(inputQtdeHora);

                    } else {
                        Float inputSalario = Float.parseFloat(JOptionPane.showInputDialog("Insira o salário"));
                        this.setSalario(inputSalario);
                    }
                Float inputValorDesconto = Float.parseFloat(JOptionPane.showInputDialog("Insira o desconto"));
                this.setValorDesconto(inputValorDesconto);

            } else if(selectedItem == "Alterar remuneração"){
                if (tipoVinculo == 'H'){
                    Float inputValorHora = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor da hora"));
                    this.setValorHora(inputValorHora);

                    Float inputQtdeHora = Float.parseFloat(JOptionPane.showInputDialog("Informe a quantidade de horas"));
                    this.setQtdeHora(inputQtdeHora);

                } else {
                    Float inputSalario = Float.parseFloat(JOptionPane.showInputDialog("Insira o salário"));
                    this.setSalario(inputSalario);
                }

                Float inputValorDesconto = Float.parseFloat(JOptionPane.showInputDialog("Insira o desconto"));
                this.setValorDesconto(inputValorDesconto);

            } else {
                if (selectedItem == "Mostrar folha de pagamento") {
                    JOptionPane.showMessageDialog(null, imprimir());
                }
            }
            selectedItem = JOptionPane.showInputDialog(null, "Escolha um item" , "Opção", JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);
        }
    }
}

