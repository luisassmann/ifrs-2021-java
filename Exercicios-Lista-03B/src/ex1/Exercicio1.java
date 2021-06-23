package ex1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		int[] valores = new int[5];
		
		Scanner leitor = new Scanner(System.in);
		
		for (int i = 0; i < valores.length; i++) {
			System.out.print("Informe um valor: ");
			valores[i] = leitor.nextInt();
		}
		leitor.close();

		int negativos = 0;
		for (int i = 0; i < valores.length; i++) {
			if (valores[i] < 0) {
				negativos += 1;
			}
		}
		System.out.println("\nQuantid. de n° negativos: " + negativos + ".");
		
		System.out.println("\nPositivos:");
		for (int i = 0; i < valores.length; i++) {
			if(valores[i] > 0) {
				System.out.println(valores[i]);
			}
		}
	}

}
