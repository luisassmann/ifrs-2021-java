package ex1;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		String m = "Digite um texto:";
		
		int numbStringsInput = 10;
		int tamanhoStrings = 0;
		
		for (int i=0; i < numbStringsInput; i++) {
			String r = JOptionPane.showInputDialog(null,m);
			tamanhoStrings += r.length();
		}
		
		double mediaTamanhoStrings = tamanhoStrings / numbStringsInput;
		
		m = "O tamanho médio das Strings é:\n" + Double.toString(mediaTamanhoStrings);
		JOptionPane.showMessageDialog(null, m);
	}

}
