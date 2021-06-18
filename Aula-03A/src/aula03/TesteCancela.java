package aula03;

import javax.swing.JOptionPane;

public class TesteCancela {

	public static void main(String[] args) {
		
		// Se o usuario fechar a janela ou cancelar,
		// o metodo JOptionPane retorna null.
		
		String t = JOptionPane.showInputDialog("Nome: ");
		if(t == null) {
			System.out.println("Usuario cancelou!");
		} else {
			System.out.println("Digitou: " + t);
		}

	}

}
