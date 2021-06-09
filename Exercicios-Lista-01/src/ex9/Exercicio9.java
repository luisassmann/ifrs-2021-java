package ex9;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in); 
		
		// 4 numeros
		double[] numeros = new double[4];
		
		// input de valores para o array numeros
		for (int c = 0; c < numeros.length; c++) {
			System.out.printf("%d º número: ", c+1);
			numeros [c] = leitor.nextDouble();
		}
		
		double maior = numeros[0];
		double menor = numeros[0];
		double soma = 0;
		
		// para cada numero do array numeros
		for (double n : numeros) {
			soma = soma + n;
			
			// se o numero for maior que o maior
			// (numero -> maior)
			if (n > maior) {
				maior = n;
			}
			// e se o numero for menor que o menor
			// (numero -> menor)
			else if (n < menor) {
				menor = n;
			}
		}
		
		double media = soma / numeros.length;
		
		System.out.printf("\n\nMédia dos números: %.2f\n", media);
		System.out.printf("Maior número: %.1f\n", maior);
		System.out.printf("Menor número: %.1f", menor);
		
		leitor.close();

	}

}
