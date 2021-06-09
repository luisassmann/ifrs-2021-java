package ex1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int num1 = leitor.nextInt();
		
		System.out.print("Digite outro número inteiro: ");
		int num2 = leitor.nextInt();
		
		System.out.println("Soma: "+ (num1 + num2));
		System.out.println("Subtração: "+ (num1 - num2));
		System.out.println("Divisão: "+ ((double) num1/num2));
		System.out.println("Multiplicação: "+ (num1 * num2));
		
		leitor.close();
		
	}

}
