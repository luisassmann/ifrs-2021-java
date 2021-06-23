package exemplos;

import javax.swing.JOptionPane;

public class TesteDialog {

	public static void main(String[] args) {
		String m = "Informe um número:";
		String r = JOptionPane.showInputDialog(null, m);
		
		int n = Integer.parseInt(r);
		int quadrado = n*n;
		System.out.println("Quadrado de " + n + " é " + quadrado + ".");
	}

}
