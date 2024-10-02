package aulapi;

import javax.swing.JOptionPane;

public class Aluno {

	String nome;
	String ra;
	double nota1, nota2;
	
	
//metodo de leitura
		public String getNome() {
		return nome;
	}

		public String getRa() {
			return ra;
		}
		
		

	public double getNota1() {
			return nota1;
		}
	
	public double getNota2() {
		return nota2;
	}
	
	//metodo de gravação
		public void setNota1(double nota1) {
			this.nota1 = nota1;
		}



		public void setNota2(double nota2) {
			this.nota2 = nota2;
		}

		public void setNome(String nome) {
		this.nome = nome;
		}

		public void setRa(String ra) {
		this.ra = ra;
		}
		
		private double calcularMedia() {
			double media = (getNota1()+getNota2())/2;
			return media;
		}
	
	
	
	public void imprimir() { //null deixa a caixa centralizada
		JOptionPane.showMessageDialog(null,"Ra: " + getRa() + " \tNome: " + getNome() + " \tNota 1: " + getNota1() + " \tNota 2: " + getNota2() + 
				" \nMedia: " + calcularMedia());
	}
		
	
}