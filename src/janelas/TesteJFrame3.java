package janelas;

import java.awt.*;
import javax.swing.*;
public class TesteJFrame3 extends JFrame{
	JLabel nome;
	JTextField txtNome;
	
	public TesteJFrame3(){
		setTitle("Primeira Janela Swing");//Titulo da janela
		setSize(375,100);		//tamanho da janela		
		getContentPane().setLayout(null);// anula o layout padrao
		getContentPane().setBackground(new Color(242,198,238));
		nome = criarJLabel("Nome", 10 , 10, 270, 40);
		txtNome = criarTexto(10 , 50, 270, 5);
		centralizar();
		setVisible(true);//Exibindo a janela
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	private JTextField criarTexto(int desq, int dtopo, int larg, int alt) {
		JTextField jt = new JTextField();
		jt.setBounds(desq, dtopo, larg, alt);
		jt.setText("Insira texto aqui");
		jt.setHorizontalAlignment(JTextField.CENTER);
		add(jt);
		return jt;
	}
	public JLabel criarJLabel(String string, int desq, int dtopo, int larg, int alt){
		JLabel jl = new JLabel(string);
//		jl.setText("JLabel inserido");
		jl.setLocation(desq, dtopo);	//dist esq e topo
		jl.setSize(larg, alt);	//larg e alt do rótulo
//		jl.setOpaque(true);		//fundo opcao
//		jl.setBackground(new Color(255,255,255)); //cor fundo
		jl.setForeground(new Color(110,182,145));	//cor fonte
		jl.setFont(new Font("Courier new", Font.BOLD, 18));//nome, estilo e tamanho da fonte
//		jl.setToolTipText("JLabel Exemplo"); //dica de texto
//		jl.setHorizontalAlignment(SwingConstants.LEFT);//alinhamento horizontal
//		jl.setVerticalAlignment(SwingConstants.TOP);//alinhamento vertical
		add(jl);
		return jl;
	}
	
	public static void main(String [] args){
		new TesteJFrame3();
	}	
	public void centralizar(){
		Dimension screen = //obtém a altura e largura da resolução vídeo
				Toolkit.getDefaultToolkit().getScreenSize();		
		Dimension janela = getSize();//obtém a altura e largura da minha janela
		if (janela.height > screen.height)
			setSize(janela.width, screen.height);
		if (janela.width > screen.width)
			setSize(screen.width, janela.height);
		setLocation((screen.width - janela.width)/2, 
				(screen.height - janela.height)/2);
	}
}
