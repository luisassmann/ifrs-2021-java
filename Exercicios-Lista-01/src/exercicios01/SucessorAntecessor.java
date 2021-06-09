package exercicios01;

import java.util.Scanner;

public class SucessorAntecessor {

	public static void main(String[] args) {
		// Exercicio 11
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int num = leitor.nextInt();
		
		System.out.printf("\nSucessor do número %d é %d.\n", num, num+1);
		System.out.printf("Antecessor do número %d é %d.", num, num-1);
		
		leitor.close();
	}

}
