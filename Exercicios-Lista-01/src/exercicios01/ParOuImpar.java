package exercicios01;

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		// Input ¬
		
		// Pedir um número.
		System.out.print("Digite um número: ");
		int numero = leitor.nextInt();
		
		// Output ¬
		
		// Verificar se o número é par ou ímpar.
		if (numero % 2 == 0) {
			System.out.println("O número é par.");
		} else {
			System.out.println("O número é ímpar.");
		}
		
		leitor.close();
	}

}
