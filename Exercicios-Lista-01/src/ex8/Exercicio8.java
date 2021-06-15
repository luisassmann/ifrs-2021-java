package ex8;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Calculador de Aumento do Salário\n");
		
		System.out.print("Informe seu salário: ");
		double salario = leitor.nextDouble();
		
		int aumento = 20;
		if (salario > 1000 && salario <= 2000) {
			aumento = 15;
		} else if (salario >= 2000) {
			aumento = 10;
		}
		
		double novoSalario = salario + (salario * aumento / 100);
		System.out.printf("\nPorcentagem de aumento do salário: %d %%\n", aumento);
		System.out.printf("Novo salário:  R$ %.2f", novoSalario);
		
		leitor.close();
	}

}
