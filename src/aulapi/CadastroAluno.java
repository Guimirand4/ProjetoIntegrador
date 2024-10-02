package aulapi;

import javax.swing.JOptionPane;

public class CadastroAluno {

	public static void main(String[] args) {
		
		int resp = 0;
		do {
		String ra = JOptionPane.showInputDialog("Digite o RA: ");
		String nome = JOptionPane.showInputDialog("Digite o Nome: ");
		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Insira a primeira nota: "));
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Insira a segunda nota: "));
		
		aulapi.Aluno aluno = new Aluno(); //criando o objeto aluno
		aluno.setNome(nome);
		aluno.setRa(ra);
		aluno.setNota1(nota1);
		aluno.setNota2(nota2);
		
		aluno.imprimir();
		resp=JOptionPane.showConfirmDialog(null,"Deseja continuar?");
		}while(resp == 0);
	}

}

