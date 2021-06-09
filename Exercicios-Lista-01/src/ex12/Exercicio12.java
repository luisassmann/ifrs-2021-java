package ex12;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		// array de 6 valores double
		double[] numeros = new double[6];
		
		// input de valores para o array numeros
		for (int c = 0; c < numeros.length; c++) {
			System.out.printf("%d º número: ", c+1);
			numeros [c] = leitor.nextDouble();
		}
		
		int somaTresPrimeiros = 0;
		int somaTresUltimos = 0;
		for (int c = 0; c < numeros.length; c++) {
			if (c < 3) {
				somaTresPrimeiros += numeros[c];
			} else {
				somaTresUltimos += numeros[c];
			}
		}
		
		int mediaPrimeiros = somaTresPrimeiros / 3;
		int mediaUltimos = somaTresUltimos / 3;
		int mediaDasMedias = (mediaPrimeiros + mediaUltimos) / 2;
		
		System.out.printf("\nSoma das médias dos 3 primeiros com os 3 últimos: %d",
				mediaPrimeiros + mediaUltimos);
		System.out.printf("\nMédia das médias: %d", mediaDasMedias);
		
		leitor.close();

	}

}
