package ex2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Informe um número inteiro: ");
		int n = leitor.nextInt();
		
		int div = 2;
		boolean primo = true;
		
		while (div <= n/2) {
			if (n % 2 == 0) {
				primo = false;
				break;
			}
			
			div += div;
		}
		
		if (primo) {
			System.out.printf("O número %d é primo.", n);
		} else {
			System.out.printf("O número %d não é primo.", n);
		}
		
		leitor.close();

	}

}
