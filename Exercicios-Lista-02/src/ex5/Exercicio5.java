package ex5;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// Calculador de fatorial
		// ex: fatorial de 3 é 6, 3x2x1=6.
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Numero para calcular o fatorial: ");
		int numero = leitor.nextInt();
		
		int n = numero;
		int resultado = n;
		if (n == 0) {
			resultado++;
		}
		while (n > 1) {
			resultado *= --n;
		}
		
		System.out.printf("O fatorial de %d é %d",
				numero,
				resultado);
		
		leitor.close();

	}

}
