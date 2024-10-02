package ado;

import javax.swing.JOptionPane;

public class CadastroCarro {
	public static void main(String[] args) {
		
		int resp = 1;
		int respon = 0;
		//String marca = JOptionPane.showInputDialog("Digite a marca do carro: ");
		//String modelo = JOptionPane.showInputDialog("Digite o modelo do carro: ");
		//String anofabri = JOptionPane.showInputDialog("Digite o ano do carro: ");
		
		Carro carro = new Carro();
		//carro.setMarca(marca);
		//carro.setModelo(modelo);
		//carro.setAnofabri(anofabri);
				
		//carro.imprimir();
		
		
		int carroligado = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para ligar o carro: "));
		carro.ligarcarro(carroligado);
		if(carroligado != 1) {
			JOptionPane.showMessageDialog(null, "Programa encerrado");
		}else {
				int acelerarcarro = Integer.parseInt(JOptionPane.showInputDialog("Insira a velocidade do carro: "));
				carro.acelerar(acelerarcarro);
				do {	
			resp = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para aumentar a velocidade ou 0 diminuir a velocidade: "));
			int acelerarcarromais = Integer.parseInt(JOptionPane.showInputDialog("Insira o aumento de velocidade do carro: "));
			carro.acelerar(acelerarcarro + acelerarcarromais);
				}while(resp== 0);
				int velocidadeatual = Integer.parseInt(JOptionPane.showInputDialog("Insira a velocidade atual do carro: "));
				int diminuircarro = Integer.parseInt(JOptionPane.showInputDialog("Insira o quanto quer diminuir: "));
				carro.desacelerar(velocidadeatual - diminuircarro); 				
		
				}
		}
}	
		
