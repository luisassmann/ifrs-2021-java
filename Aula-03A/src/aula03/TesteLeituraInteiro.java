package aula03;

import javax.swing.JOptionPane;

public class TesteLeituraInteiro {

	public static void main(String[] args) {
		
		// Se o texto na String t for um numero inteiro,
		// usar o metodo Integer.parseInt(...).
		
		String t = JOptionPane.showInputDialog("Inteiro: ");
		int i = Integer.parseInt(t);
		System.out.println(i);
	}

}
