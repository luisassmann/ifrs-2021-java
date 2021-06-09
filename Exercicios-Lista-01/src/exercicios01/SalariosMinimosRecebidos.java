package exercicios01;

import java.util.Scanner;

public class SalariosMinimosRecebidos {

	public static void main(String[] args) {
		// Exercicio 10
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Valor do salário mínimo: R$ ");
		double salarioMinimo = leitor.nextDouble();
		
		System.out.print("Informe seu salário: R$ ");
		double salario = leitor.nextDouble();
		
		double salarios = salario / salarioMinimo;
		
		System.out.printf("\nO salário de R$ %.2f vale %.1f salários mínimos.",
				salario,
				salarios);
		
		leitor.close();
	}

}
