package ex2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio2 {

	private JFrame frmExerccio;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio2 window = new Exercicio2();
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
	public Exercicio2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmExerccio = new JFrame();
		frmExerccio.setTitle("Exerc\u00EDcio 2 - An\u00E1lise de Palavras");
		frmExerccio.setBounds(100, 100, 450, 245);
		frmExerccio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmExerccio.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField.setBounds(10, 47, 414, 29);
		frmExerccio.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Frase");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 22, 414, 20);
		frmExerccio.getContentPane().add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_1.setColumns(10);
		textField_1.setBounds(10, 155, 414, 29);
		frmExerccio.getContentPane().add(textField_1);
		
		JButton btnNewButton = new JButton("Analisar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String frase = textField.getText().strip();
				
				String[] palavras = frase.split(" ");
				
				int caracteres=0;
				for (int i = 0; i < palavras.length; i++) {
					caracteres+=palavras[i].length();
				}
				int qtdePalavras = palavras.length;
				
				textField_1.setText(caracteres + " caracteres e " + qtdePalavras + " palavras");
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(139, 98, 136, 29);
		frmExerccio.getContentPane().add(btnNewButton);
	}
}
