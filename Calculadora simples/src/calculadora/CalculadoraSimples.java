package calculadora;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import java.awt.Label;
import javax.swing.SwingConstants;
import javax.swing.JLayeredPane;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class CalculadoraSimples extends JFrame {

	private JPanel contentPane; // Janela
	private JTextField textField; // Caixa de texto
	
	double primeiro_numero; // Primeiro número da conta
	double segundo_numero; // Segundo número da conta
	String operacao; // Operação da conta
	double resultado;  // Resultado da conta
	String resposta_tela; // Resultado da conta mostrado na caixa de texto

	/* Inicialização da calculadora */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraSimples frame = new CalculadoraSimples();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/* Interface da calculadora */
	
	public CalculadoraSimples() {
		
		/* Janela */
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 266, 329);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		/* --- BOTÕES --- */
		
		/* - Botão 9 - */
		
		JButton btn_09 = new JButton("9");
		
		btn_09.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Pega o valor do botão (que é uma string) e junta ao texto existente na caixa de texto, formando o número.
				
				String valor = textField.getText() + btn_09.getText();
				textField.setText(valor);
				
			}
		});
		
		btn_09.setBounds(110, 119, 49, 36);
		contentPane.add(btn_09);
		
		/* - Botão 8 - */
		
		JButton btn_08 = new JButton("8");
		
		btn_08.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Pega o valor do botão (que é uma string) e junta ao texto existente na caixa de texto, formando o número.
				
				String valor = textField.getText() + btn_08.getText();
				textField.setText(valor);
				
			}
		});
		
		btn_08.setBounds(60, 119, 49, 36);
		contentPane.add(btn_08);
		
		/* - Botão 7 - */
		
		JButton btn_07 = new JButton("7");
		
		btn_07.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Pega o valor do botão (que é uma string) e junta ao texto existente na caixa de texto, formando o número.
				
				String valor = textField.getText() + btn_07.getText();
				textField.setText(valor);
				
			}
		});
		
		btn_07.setBounds(10, 119, 49, 36);
		contentPane.add(btn_07);
		
		/* - Botão 6 - */
		
		JButton btn_06 = new JButton("6");
		
		btn_06.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Pega o valor do botão (que é uma string) e junta ao texto existente na caixa de texto, formando o número.
				
				String valor = textField.getText() + btn_06.getText();
				textField.setText(valor);
				
			}
		});
		
		btn_06.setBounds(110, 158, 49, 36);
		contentPane.add(btn_06);
		
		/* - Botão 5 - */
		
		JButton btn_05 = new JButton("5");
		
		btn_05.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Pega o valor do botão (que é uma string) e junta ao texto existente na caixa de texto, formando o número.
				
				String valor = textField.getText() + btn_05.getText();
				textField.setText(valor);
				
			}
		});
		
		btn_05.setBounds(60, 158, 49, 36);
		contentPane.add(btn_05);
		
		/* - Botão 4 - */
		
		JButton btn_04 = new JButton("4");
		
		btn_04.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Pega o valor do botão (que é uma string) e junta ao texto existente na caixa de texto, formando o número.
				
				String valor = textField.getText() + btn_04.getText();
				textField.setText(valor);
				
			}
		});
		
		btn_04.setBounds(10, 158, 49, 36);
		contentPane.add(btn_04);
		
		/* - Botão 3 - */
		
		JButton btn_03 = new JButton("3");
		
		btn_03.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Pega o valor do botão (que é uma string) e junta ao texto existente na caixa de texto, formando o número.
				
				String valor = textField.getText() + btn_03.getText();
				textField.setText(valor);
				
			}
		});
		
		btn_03.setBounds(110, 197, 49, 36);
		contentPane.add(btn_03);
		
		/* - Botão 2 - */
		
		JButton btn_02 = new JButton("2");
		
		btn_02.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Pega o valor do botão (que é uma string) e junta ao texto existente na caixa de texto, formando o número.
				
				String valor = textField.getText() + btn_02.getText();
				textField.setText(valor);
				
			}
		});
		
		btn_02.setBounds(60, 197, 49, 36);
		contentPane.add(btn_02);
		
		/* - Botão 1 - */
		
		JButton btn_01 = new JButton("1");
		
		btn_01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Pega o valor do botão (que é uma string) e junta ao texto existente na caixa de texto, formando o número.
				
				String valor = textField.getText() + btn_01.getText();
				textField.setText(valor);
				
			}
		});
		
		btn_01.setBounds(10, 197, 49, 36);
		contentPane.add(btn_01);
		
		/* - Botão 0 - */
		
		JButton btn_00 = new JButton("0");
		
		btn_00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Pega o valor do botão (que é uma string) e junta ao texto existente na caixa de texto, formando o número.
				
				String valor = textField.getText() + btn_00.getText();
				textField.setText(valor);
				
			}
		});
		
		btn_00.setBounds(60, 236, 49, 36);
		contentPane.add(btn_00);
		
		/* - Botão de ponto - */
		
		JButton btn_ponto = new JButton(".");
		
		btn_ponto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Pega o valor do botão (que é uma string) e junta ao texto existente na caixa de texto, formando o número.
				
				String valor = textField.getText() + btn_ponto.getText();
				textField.setText(valor);
				
			}
		});
		
		btn_ponto.setBounds(110, 236, 49, 36);
		contentPane.add(btn_ponto);
		
		/* - Botão de multiplicação - */
		
		JButton btn_multiplicacao = new JButton("x");
		
		btn_multiplicacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Armazena o primeiro número, zera a caixa de texto (a fim de o usuário fornecer outro número) e fornece a operação que será utilizada.
				
				String conversao; // Usado para contas sucessivas, pois o método parseDouble converte para vírgulas e não pontos, dando erro.
				conversao = textField.getText().replaceAll(",", ".");
				primeiro_numero = Double.parseDouble(conversao);
				textField.setText("");
				operacao = "x";
				
			}
		});
		
		btn_multiplicacao.setBounds(176, 80, 59, 36);
		contentPane.add(btn_multiplicacao);
		
		/* - Botão de divisão - */
		
		JButton btn_divisao = new JButton("/");
		
		btn_divisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Armazena o primeiro número, zera a caixa de texto (a fim de o usuário fornecer outro número) e fornece a operação que será utilizada.
				
				String conversao; // Usado para contas sucessivas, pois o método parseDouble converte para vírgulas e não pontos, dando erro.
				conversao = textField.getText().replaceAll(",", ".");
				primeiro_numero = Double.parseDouble(conversao);
				textField.setText("");
				operacao = "/";
				
			}
		});
		
		btn_divisao.setBounds(176, 119, 59, 36);
		contentPane.add(btn_divisao);
		
		/* - Botão de soma - */
		
		JButton btn_soma = new JButton("+");
		
		btn_soma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Armazena o primeiro número, zera a caixa de texto (a fim de o usuário fornecer outro número) e fornece a operação que será utilizada.
				
				String conversao; // Usado para contas sucessivas, pois o método parseDouble converte para vírgulas e não pontos, dando erro.
				conversao = textField.getText().replaceAll(",", ".");
				primeiro_numero = Double.parseDouble(conversao);
				textField.setText("");
				operacao = "+";
				
			}
		});
		
		btn_soma.setBounds(176, 158, 59, 36);
		contentPane.add(btn_soma);
		
		/* - Botão de subtração - */
		
		JButton btn_subtracao = new JButton("-");
		
		btn_subtracao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Armazena o primeiro número, zera a caixa de texto (a fim de o usuário fornecer outro número) e fornece a operação que será utilizada.
				
				String conversao; // Usado para contas sucessivas, pois o método parseDouble converte para vírgulas e não pontos, dando erro.
				conversao = textField.getText().replaceAll(",", ".");
				primeiro_numero = Double.parseDouble(conversao);
				textField.setText("");
				operacao = "-";
				
			}
		});
		
		btn_subtracao.setBounds(176, 197, 59, 36);
		contentPane.add(btn_subtracao);
		
		/* - Botão de troca de sinal - */
		
		JButton btn_maismenos = new JButton("+/-");
		
		btn_maismenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Pega o número e inverte o sinal (primeiro o número é fornecido e depois o botão é apertado para inverter o sinal).
				
				double inverte_sinal = Double.parseDouble(String.valueOf(textField.getText()));
				inverte_sinal = inverte_sinal * (-1);
				textField.setText(String.valueOf(inverte_sinal));
				
			}
		});
		
		btn_maismenos.setBounds(10, 236, 49, 36);
		contentPane.add(btn_maismenos);
		
		/* - Botão de igualdade - */
		
		JButton btn_igual = new JButton("=");
		
		btn_igual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Realiza de fato a conta e limita o resultado em duas casas decimais.
				
				segundo_numero = Double.parseDouble(textField.getText());
				
				switch (operacao) {
				case "+":
					
					resultado = primeiro_numero + segundo_numero;
					resposta_tela = String.format("%.2f", resultado);
					textField.setText(resposta_tela);
					break;
					
				case "-":
					
					resultado = primeiro_numero - segundo_numero;
					resposta_tela = String.format("%.2f", resultado);
					textField.setText(resposta_tela);
					break;
					
				case "x":
					
					resultado = primeiro_numero * segundo_numero;
					resposta_tela = String.format("%.2f", resultado);
					textField.setText(resposta_tela);
					break;
					
				case "/":
					
					resultado = primeiro_numero / segundo_numero;
					resposta_tela = String.format("%.2f", resultado);
					textField.setText(resposta_tela);
					break;

				default:
					
					break;
					
				}
			}
		});
		
		btn_igual.setBounds(176, 236, 59, 36);
		contentPane.add(btn_igual);
		
		/* - Botão de limpar a caixa de texto - */
		
		JButton btn_limpar = new JButton("C");
		
		btn_limpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(null);
				
			}
		});
		
		btn_limpar.setBounds(10, 80, 49, 36);
		contentPane.add(btn_limpar);
		
		/* - Botão para deletar um dígito - */
		
		JButton btn_deletar = new JButton("DEL");
		
		btn_deletar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Pega a string da caixa de texto e passa para outra string, diminuindo o tamanho em 1(deletando o último dígito).
				
				String deletar = null;
				
				if (textField.getText().length() > 0)
				{
					
					StringBuilder auxiliar = new StringBuilder();
					auxiliar.append(textField.getText());
					auxiliar.deleteCharAt(textField.getText().length() - 1);
					deletar = auxiliar.toString();
					textField.setText(deletar);
					
				}
			}
		});
		
		btn_deletar.setBounds(60, 80, 99, 36);
		contentPane.add(btn_deletar);
		
		/* --- Caixa de texto --- */
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 11, 225, 42);
		contentPane.add(textField);
		textField.setColumns(10);
		
		/* ---- Checkbox ON/OFF ---- */
		
		JCheckBox on_off = new JCheckBox("ON / OFF");
		
		on_off.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (on_off.isSelected())
				{
					
					btn_00.setEnabled(false);
					btn_01.setEnabled(false);
					btn_02.setEnabled(false);
					btn_03.setEnabled(false);
					btn_04.setEnabled(false);
					btn_05.setEnabled(false);
					btn_06.setEnabled(false);
					btn_07.setEnabled(false);
					btn_08.setEnabled(false);
					btn_09.setEnabled(false);
					btn_deletar.setEnabled(false);
					btn_igual.setEnabled(false);
					btn_soma.setEnabled(false);
					btn_subtracao.setEnabled(false);
					btn_multiplicacao.setEnabled(false);
					btn_divisao.setEnabled(false);
					btn_limpar.setEnabled(false);
					btn_ponto.setEnabled(false);
					btn_maismenos.setEnabled(false);
					textField.setText("");
					primeiro_numero = 0;
					segundo_numero = 0;
					
				}
				else
				{
					
					btn_00.setEnabled(true);
					btn_01.setEnabled(true);
					btn_02.setEnabled(true);
					btn_03.setEnabled(true);
					btn_04.setEnabled(true);
					btn_05.setEnabled(true);
					btn_06.setEnabled(true);
					btn_07.setEnabled(true);
					btn_08.setEnabled(true);
					btn_09.setEnabled(true);
					btn_deletar.setEnabled(true);
					btn_igual.setEnabled(true);
					btn_soma.setEnabled(true);
					btn_subtracao.setEnabled(true);
					btn_multiplicacao.setEnabled(true);
					btn_divisao.setEnabled(true);
					btn_limpar.setEnabled(true);
					btn_ponto.setEnabled(true);
					btn_maismenos.setEnabled(true);
					
				}
			}
		});
		
		on_off.setVerticalAlignment(SwingConstants.TOP);
		on_off.setBounds(6, 55, 76, 19);
		contentPane.add(on_off);
			
	}
}
