package r01;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int n = 0;
		
		do {
			System.out.print("Informe o valor de n: ");
			n = Integer.parseInt(leitor.nextLine());
		} while (n <= 0);
		
		System.out.print("Saiu do While!");
		
		for (int i=0; i<n; i++) {
			
		}
		
		leitor.close();

	}

}
