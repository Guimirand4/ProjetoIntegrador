package janelas;
import java.awt.*;
import javax.swing.*;
public class TesteJFrame extends JFrame{
	public TesteJFrame(){
		setTitle("Primeira Janela Swing");//Titulo da janela
		setSize(375,100);		//tamanho da janela		
		getContentPane().setLayout(null);// anula o layout padrao
		//cor de fundo da janela no padrão RGB (Red Green Blue)
		getContentPane().setBackground(new Color(194,245,208));
		setVisible(true);//Exibindo a janela
		//provoca o termino da execução (encerra o programa)
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String [] args){
		new TesteJFrame();
	}
}
