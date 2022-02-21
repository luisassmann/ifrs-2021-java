package aula;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class App0 {

	private JFrame frmAppZero;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App0 window = new App0();
					window.frmAppZero.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public App0() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAppZero = new JFrame();
		frmAppZero.setTitle("App Zero");
		frmAppZero.setBounds(100, 100, 450, 300);
		frmAppZero.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
