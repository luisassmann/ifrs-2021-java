package principal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TelaInicial {

	private JFrame frmJavaGuiApp;
	private JTextField textField;
	private JTextField textField_destino;
	private JScrollPane scrollPane;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial window = new TelaInicial();
					window.frmJavaGuiApp.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaInicial() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmJavaGuiApp = new JFrame();
		frmJavaGuiApp.setTitle("Java GUI App");
		frmJavaGuiApp.setBounds(100, 100, 450, 300);
		frmJavaGuiApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmJavaGuiApp.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ol\u00E1, tudo bem?");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(22, 22, 179, 22);
		frmJavaGuiApp.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(22, 86, 179, 22);
		frmJavaGuiApp.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_destino.setText(textField.getText());
				textArea.append(textField.getText() + "\n");
			}
		});
		btnNewButton.setBounds(22, 146, 89, 29);
		frmJavaGuiApp.getContentPane().add(btnNewButton);
		
		textField_destino = new JTextField();
		textField_destino.setBounds(22, 212, 179, 20);
		frmJavaGuiApp.getContentPane().add(textField_destino);
		textField_destino.setColumns(10);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(210, 22, 214, 210);
		frmJavaGuiApp.getContentPane().add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
	}
}
