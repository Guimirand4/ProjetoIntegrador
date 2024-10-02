package janelas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TesteJframe5 extends JFrame implements ActionListener{
	JLabel nome, cpf, rg, logradouro, end;
	JTextField txtNome, txtcpf, txtrg, txtlogradouro, txtend;
	JButton btnGravar, btnCancelar;
	
	public TesteJframe5() {
		 setTitle("Janela Cadastro");
		    setSize(400, 300);
		    getContentPane().setBackground(new Color(242, 198, 238));
		    setLayout(new GridLayout(6, 2)); // 6 linhas, 2 colunas

		    nome = criarJLabel("Nome", 0, 0, 0, 0);
		    txtNome = criarTexto(0, 0, 0, 0);
		    cpf = criarJLabel("Cpf", 0, 0, 0, 0);
		    txtcpf = criarTexto(0, 0, 0, 0);
		    rg = criarJLabel("Rg", 0, 0, 0, 0);
		    txtrg = criarTexto(0, 0, 0, 0);
		    logradouro = criarJLabel("logradouro", 0, 0, 0, 0);
		    txtlogradouro = criarTexto(0, 0, 0, 0);
		    
		    btnGravar = criarBotao("Gravar", 'G', 0, 0, 0, 0);
		    btnCancelar = criarBotao("Cancelar", 'C', 0, 0, 0, 0);

		    add(nome);
		    add(txtNome);
		    add(cpf);
		    add(txtcpf);
		    add(rg);
		    add(txtrg);
		    add(logradouro);
		    add(txtlogradouro);
		    add(btnGravar);
		    add(btnCancelar);
		    
		    centralizar();
		    setVisible(true);
		    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	private JButton criarBotao(String string, char c, int distEsq, int rodape, int larg, int altura) {
		JButton b1 = new JButton(string);
		b1.setBounds(distEsq, rodape-50, larg, altura); //D Esq, D Topo, larg, alt
		b1.setBackground(new Color(0,0,170));
		b1.setForeground(Color.YELLOW);
		b1.setFont(new Font("Helvetica", Font.BOLD, 18));
		b1.setToolTipText("Botão " + string);
		b1.setHorizontalAlignment(0);
		b1.setVerticalAlignment(0);
//		b1.setEnabled(false); //Botão desabilitado.
		b1.setMnemonic(c);  //Tecla de atalho
		b1.addActionListener(this);
		add(b1);
		return b1;
	}
	

	
	private JTextField criarTexto(int desq, int dtopo, int larg, int alt) {
		JTextField jt = new JTextField();
		jt.setBounds(desq, dtopo, larg, alt);
		jt.setForeground(Color.blue);
//		jt.setText("Insira texto aqui");
//		jt.setHorizontalAlignment(4);
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
		new TesteJframe5();
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
	

	@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==btnCancelar)	
				System.exit(0);		
			
		else if(e.getSource()==btnGravar)	
			JOptionPane.showMessageDialog(null, "Dados gravados com sucesso!!!");
			 setVisible(false);
		
		
	}
}
