package ex6;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Qtde. de numeros: ");
		int qtdeNumeros = leitor.nextInt();
		
		int[] numeros = new int[qtdeNumeros];
		
		for (int i=0; i<qtdeNumeros; i++) {
			System.out.print("Digite um numero: ");
			numeros[i] = leitor.nextInt();
		}
		
		int menor = numeros[0];
		int maior = numeros[0];
		
		for (int n : numeros) {
			if (n < menor) {
				menor = n;
			}
			if (n > maior) {
				maior = n;
			}
		}
		
		System.out.printf("O menor numero foi %d.\n", menor);
		System.out.printf("O maior numero foi %d.\n", maior);
		
		
		leitor.close();

	}

}
