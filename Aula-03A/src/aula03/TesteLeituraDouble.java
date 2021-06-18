package aula03;

import javax.swing.JOptionPane;

public class TesteLeituraDouble {
	
	public static void main(String[] args) {
		String t = JOptionPane.showInputDialog("Double:");
		double d = Double.parseDouble(t);
		System.out.println(d);
	}
}
