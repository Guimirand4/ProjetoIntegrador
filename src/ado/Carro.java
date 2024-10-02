package ado;

import javax.swing.JOptionPane;

public class Carro {
	String marca, modelo, anofabri,carroligado, carrodesligado;
	
	

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getAnofabri() {
		return anofabri;
	}

	public void setAnofabri(String anofabri) {
		this.anofabri = anofabri;
	}
	
	
	

	public void ligarcarro(int ligarcar) {
		if(ligarcar == 1) {
			JOptionPane.showMessageDialog(null, "Carro Ligado");
		}else {
			JOptionPane.showMessageDialog(null, "Carro Desligado");
		}
		
	}
	
	public void acelerar(int velocidade) {
		if(velocidade > 0 && velocidade <= 20) {
			JOptionPane.showMessageDialog(null, "Velocidade do carro : "+ velocidade + "\nMarcha 1");
		}else if(velocidade > 20 && velocidade <= 40) {
			JOptionPane.showMessageDialog(null, "Velocidade do carro : "+ velocidade + "\nMarcha 2");
		}else if(velocidade > 40 && velocidade <= 60) {
			JOptionPane.showMessageDialog(null, "Velocidade do carro : "+ velocidade + "\nMarcha 3");
		}else if(velocidade > 60 && velocidade <= 80) {
			JOptionPane.showMessageDialog(null, "Velocidade do carro : "+ velocidade + "\nMarcha 4");
		}else if(velocidade > 80 && velocidade <= 120) {
			JOptionPane.showMessageDialog(null, "Velocidade do carro : "+ velocidade + "\nMarcha 5");
		}else if(velocidade > 120) {
			JOptionPane.showMessageDialog(null, "Velocidade do carro : "+ velocidade + "\nVelocidade não permitida");
		}else if(velocidade == 0) {
			JOptionPane.showMessageDialog(null, "Velocidade do carro : "+ velocidade + "\nPonto morto");
		}
	}
	
	public void desacelerar(int velocidade) {
		if(velocidade > 0 && velocidade <= 20) {
			JOptionPane.showMessageDialog(null, "Velocidade do carro : "+ velocidade + "\nMarcha 1");
		}else if(velocidade > 20 && velocidade <= 40) {
			JOptionPane.showMessageDialog(null, "Velocidade do carro : "+ velocidade + "\nMarcha 2");
		}else if(velocidade > 40 && velocidade <= 60) {
			JOptionPane.showMessageDialog(null, "Velocidade do carro : "+ velocidade + "\nMarcha 3");
		}else if(velocidade > 60 && velocidade <= 80) {
			JOptionPane.showMessageDialog(null, "Velocidade do carro : "+ velocidade + "\nMarcha 4");
		}else if(velocidade > 80 && velocidade <= 120) {
			JOptionPane.showMessageDialog(null, "Velocidade do carro : "+ velocidade + "\nMarcha 5");
		}else if(velocidade > 120) {
			JOptionPane.showMessageDialog(null, "Velocidade do carro : "+ velocidade + "\nVelocidade não permitida");
		}else if(velocidade == 0) {
			JOptionPane.showMessageDialog(null, "Velocidade do carro : "+ velocidade + "\nPonto morto");
		}
	}
	
	public void desligarcarro() {
		JOptionPane.showMessageDialog(null, "Carro Desligado");
	}

	public void imprimir() {
		JOptionPane.showMessageDialog(null,"Marca do carro: " + getMarca() + " \nModelo do carro: " + getModelo() + 
				" \nAno de fabricação do carro: " + getAnofabri());
	}
	
	
}


