package ex1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio1 {

	private JFrame frmExerccio;
	private JTextField textField_numA;
	private JTextField textField_numB;
	private JTextField textField_soma;
	private JTextField textField_diferenca;
	private JTextField textField_multiplic;
	private JTextField textField_divisao;
	private JButton btnLimpar;
	private JButton btnCalc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio1 window = new Exercicio1();
					window.frmExerccio.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Exercicio1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmExerccio = new JFrame();
		frmExerccio.setTitle("Exerc\u00EDcio 1 - Calculadora");
		frmExerccio.setBounds(100, 100, 450, 300);
		frmExerccio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmExerccio.getContentPane().setLayout(null);
		
		textField_numA = new JTextField();
		textField_numA.setBounds(10, 39, 181, 20);
		frmExerccio.getContentPane().add(textField_numA);
		textField_numA.setColumns(10);
		
		textField_numB = new JTextField();
		textField_numB.setBounds(216, 39, 208, 20);
		frmExerccio.getContentPane().add(textField_numB);
		textField_numB.setColumns(10);
		
		JLabel lbl_numA = new JLabel("N\u00FAmero A");
		lbl_numA.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl_numA.setBounds(10, 22, 181, 14);
		frmExerccio.getContentPane().add(lbl_numA);
		
		JLabel lbl_numB = new JLabel("N\u00FAmero B");
		lbl_numB.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl_numB.setBounds(216, 22, 208, 14);
		frmExerccio.getContentPane().add(lbl_numB);
		
		btnCalc = new JButton("Calcular");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num_A=0;
				int num_B=0;
				boolean numbsAreInteger = false;
				
				try {
					num_A = Integer.parseInt(textField_numA.getText());
					num_B = Integer.parseInt(textField_numB.getText());
					
					numbsAreInteger = true;
				} catch (NumberFormatException errorWhileParsingNumbers) {
					JOptionPane.showMessageDialog(
						btnCalc,
						"Não foi possível efetuar o cálculo.\n\nObs: Somente são aceitos números inteiros.",
						"Erro", JOptionPane.INFORMATION_MESSAGE
					);
				}
				
				if (numbsAreInteger) {
					// Soma dos números A e B;
					int soma = num_A + num_B;
					textField_soma.setText(Integer.toString(soma));
					
					// Diferença dos números A e B;
					int diferenca = num_A - num_B;
					textField_diferenca.setText(Integer.toString(diferenca));
					
					// Multiplicação dos números A e B;
					int multiplicacao = num_A * num_B;
					textField_multiplic.setText(Integer.toString(multiplicacao));
					
					// Divisão dos números A e B;
					int divisao = num_A / num_B;
					textField_divisao.setText(Integer.toString(divisao));
				}
				
			}
		});
		btnCalc.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCalc.setBounds(10, 92, 181, 27);
		frmExerccio.getContentPane().add(btnCalc);
		
		btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField_numA.setText("");
				textField_numB.setText("");
				textField_soma.setText("");
				textField_diferenca.setText("");
				textField_multiplic.setText("");
				textField_divisao.setText("");
				
			}
		});
		btnLimpar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnLimpar.setBounds(216, 92, 208, 27);
		frmExerccio.getContentPane().add(btnLimpar);
		
		textField_soma = new JTextField();
		textField_soma.setBounds(10, 157, 181, 20);
		frmExerccio.getContentPane().add(textField_soma);
		textField_soma.setColumns(10);
		
		textField_diferenca = new JTextField();
		textField_diferenca.setBounds(216, 157, 208, 20);
		frmExerccio.getContentPane().add(textField_diferenca);
		textField_diferenca.setColumns(10);
		
		textField_multiplic = new JTextField();
		textField_multiplic.setBounds(10, 230, 181, 20);
		frmExerccio.getContentPane().add(textField_multiplic);
		textField_multiplic.setColumns(10);
		
		textField_divisao = new JTextField();
		textField_divisao.setBounds(216, 230, 208, 20);
		frmExerccio.getContentPane().add(textField_divisao);
		textField_divisao.setColumns(10);
		
		JLabel lblSoma = new JLabel("Soma");
		lblSoma.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSoma.setBounds(10, 141, 181, 14);
		frmExerccio.getContentPane().add(lblSoma);
		
		JLabel lblDiferenca = new JLabel("Diferen\u00E7a");
		lblDiferenca.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDiferenca.setBounds(216, 141, 208, 16);
		frmExerccio.getContentPane().add(lblDiferenca);
		
		JLabel lblMultiplicacao = new JLabel("Multiplica\u00E7\u00E3o");
		lblMultiplicacao.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMultiplicacao.setBounds(10, 211, 181, 20);
		frmExerccio.getContentPane().add(lblMultiplicacao);
		
		JLabel lblDivisao = new JLabel("Divis\u00E3o");
		lblDivisao.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDivisao.setBounds(216, 211, 181, 20);
		frmExerccio.getContentPane().add(lblDivisao);
	}

}
