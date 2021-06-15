package ex3;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);

		System.out.print("Digite um número inteiro: ");
		int numero1 = leitor.nextInt();
		
		System.out.print("Digite outro número inteiro: ");
		int numero2 = leitor.nextInt();

		if (numero1 == numero2) {
			System.out.println("Os números são iguais.");
		} else
			if (numero1 > numero2) {
				System.out.println("O número "+numero1+" é maior que "+numero2+".");
			} else {
				System.out.println("O número "+numero2+" é maior que "+numero1+".");
			}
		
		leitor.close();
		
	}

}
