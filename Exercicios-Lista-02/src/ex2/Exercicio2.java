package ex2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Informe um n�mero inteiro: ");
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
			System.out.printf("O n�mero %d � primo.", n);
		} else {
			System.out.printf("O n�mero %d n�o � primo.", n);
		}
		
		leitor.close();

	}

}
