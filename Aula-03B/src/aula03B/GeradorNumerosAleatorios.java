package aula03B;

import java.util.Random;

public class GeradorNumerosAleatorios {

	public static void main(String[] args) {
		// Numeros aleatorios no Java;
		
		// Cria o gerador de numeros aleatorios;
		Random r = new Random();
		
		for(int i=0; i < 30; i++) {
			// Gera um numero aleatorio entre 0 e 5;
			int numero = r.nextInt(6);
			System.out.println(numero);
		}
		
	}

}
