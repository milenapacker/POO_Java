package Exercicio02;
import javax.swing.JOptionPane;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Object[] itens = {"Criar pessoa", "Criar automóvel", "Transferir automóvel", "Mostrar todas as pessoas", "Mostrar automóvel da pessoa", "Sair"};
        String selectedItem = (String) JOptionPane.showInputDialog(null, "Escolha um item", "Opção", JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);

        ArrayList<Pessoa> listapessoa = new ArrayList<>();

        while (!selectedItem.equals("Sair")) {
            switch (selectedItem) {
                case "Criar pessoa":
                    Pessoa novaPessoa = new Pessoa();
                    novaPessoa.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Informe o código")));
                    novaPessoa.setNome(JOptionPane.showInputDialog("Informe o nome"));
                    listapessoa.add(novaPessoa);
                    break;
                case "Criar automóvel":
                    Automovel novoAutomovel = new Automovel();
                    novoAutomovel.setMarca(JOptionPane.showInputDialog("Informe a marca"));
                    novoAutomovel.setModelo(JOptionPane.showInputDialog("Informe o modelo"));

                    if (!listapessoa.isEmpty()) {
                        String nomePessoa = JOptionPane.showInputDialog("Informe o nome da pessoa para associar o automóvel");
                        boolean pessoaEncontrada = false;
                        for (Pessoa pessoa : listapessoa) {
                            if (pessoa.getNome().equals(nomePessoa)) {
                                pessoa.inserirAutomovel(novoAutomovel);
                                pessoaEncontrada = true;
                            }
                        }
                        if (!pessoaEncontrada) {
                            JOptionPane.showMessageDialog(null, "Pessoa não encontrada.");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Não existem pessoas para associar o automóvel.");
                    }
                    break;
                case "Transferir automóvel":
                    String nomeOrigem = JOptionPane.showInputDialog("Informe o nome da pessoa de origem");
                    String nomeDestino = JOptionPane.showInputDialog("Informe o nome da pessoa de destino");
                    Pessoa pessoaOrigem = null;
                    Pessoa pessoaDestino = null;
                    for (Pessoa p : listapessoa) {
                        if (p.getNome().equals(nomeOrigem)) {
                            pessoaOrigem = p;
                            break;
                        }
                    }
                    for (Pessoa p : listapessoa) {
                        if (p.getNome().equals(nomeDestino)) {
                            pessoaDestino = p;
                            break;
                        }
                    }
                    if (pessoaOrigem != null && pessoaDestino != null) {
                        if (!pessoaOrigem.getListaautomovel().isEmpty()) {
                            Automovel automovel = pessoaOrigem.getListaautomovel().get(0);
                            pessoaOrigem.removerAutomovel(0);
                            pessoaDestino.inserirAutomovel(automovel);
                            JOptionPane.showMessageDialog(null, "Automóvel transferido com sucesso.");
                        } else {
                            JOptionPane.showMessageDialog(null, "A pessoa de origem não possui automóveis para transferir.");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Pessoa de origem ou destino não encontrada.");
                    }
                    break;
                case "Mostrar todas as pessoas":
                    String impressao = "";
                    for (Pessoa p : listapessoa) {
                        impressao += p.imprimir() + "\n";
                    }
                    JOptionPane.showMessageDialog(null, impressao);
                    break;
                case "Mostrar automóvel da pessoa":
                    String automovelSearch = JOptionPane.showInputDialog("Informe o nome da pessoa");
                    impressao = "";
                    for (int i = 0; i < listapessoa.size(); i++) {
                        if (listapessoa.get(i).getNome().equals(automovelSearch)) {
                            for (int j = 0; j < listapessoa.get(i).getListaautomovel().size(); j++) {
                                impressao += listapessoa.get(i).getListaautomovel().get(j).imprimir() + "\n";
                            }
                        }
                    }
                    JOptionPane.showMessageDialog(null, impressao);
                    break;
            }
            selectedItem = (String) JOptionPane.showInputDialog(null, "Escolha um item", "Opção", JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);
        }

    }
}
