package ex11;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int num = leitor.nextInt();
		
		System.out.printf("\nSucessor do número %d é %d.\n", num, num+1);
		System.out.printf("Antecessor do número %d é %d.", num, num-1);
		
		leitor.close();
		
	}

}
