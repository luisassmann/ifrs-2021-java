package exercicios01;

import java.util.Scanner;

public class Leitor2Int {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		// Input ¬
		
		// Pedir dois números inteiros.
		System.out.print("Digite um número inteiro: ");
		int numero1 = leitor.nextInt();
		
		System.out.print("Digite outro número inteiro: ");
		int numero2 = leitor.nextInt();
		
		// Output ¬
		
		// Imprimir a soma dos números.
		int soma = numero1 + numero2;
		System.out.println("Soma: "+ soma);
		
		// Imprimir a subtração.
		int subtracao = numero1 - numero2;
		System.out.println("Subtração: "+ subtracao);
		
		// Imprimir a multiplicação.
		int multiplicacao = numero1 * numero2;
		System.out.println("Multiplicação: "+ multiplicacao);
		
		// Imprimir a divisão.
		int divisao = numero1 / numero2;
		System.out.println("Divisão: "+ divisao);
		
		// Imprimir o resto da divisão.
		int resto = numero1 % numero2;
		System.out.println("Resto da divisão: "+ resto);
		
		leitor.close();
	}

}
