package pi2808;

import javax.swing.*;

public class TestePessoa{
    public static void main(String[] args) {
        Pessoa joao = new Pessoa();
        joao.setSexo(Pessoa.MASCULINO);
        joao.setNome(JOptionPane.showInputDialog("Digite o nome: "));
        joao.setTelefone(JOptionPane.showInputDialog("Digite o telefone: "));
        joao.imprimir();
    }

}
