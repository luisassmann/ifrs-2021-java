package ex2;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
		String m = "Informe 10 caracteres:";
		String r1 = JOptionPane.showInputDialog(null,m);
		String r2 = JOptionPane.showInputDialog(null,m);
		
		int caracteresIguais = 0;
		while ((r1.length() + r2.length()) != 20) {
			JOptionPane.showMessageDialog(null, "Devem ser 10 caracteres.");
			r1 = JOptionPane.showInputDialog(null,m);
			r2 = JOptionPane.showInputDialog(null,m);
		}
		
		for(int i=0; i<10; i++) {
			if(r1.charAt(i) == r2.charAt(i)) {
				caracteresIguais++;
			}
		}
		int percSimilaridade = caracteresIguais * 10;
		JOptionPane.showMessageDialog(null, percSimilaridade + "% de similaridade.");
		
	}

}
