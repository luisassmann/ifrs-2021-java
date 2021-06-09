package ex7;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Calculador de Aumento do Salário\n");
		
		System.out.print("Informe seu salário: ");
		double salario = leitor.nextDouble();
		
		int aumento = 10;
		if (salario <= 2000) {
			aumento = 15;
		} if (salario <= 1000) {
			aumento = 20;
		}
		
		double novoSalario = salario + (salario * aumento / 100);
		System.out.printf("\nPorcentagem de aumento do salário: %d %%\n", aumento);
		System.out.printf("Novo salário:  R$ %.2f", novoSalario);
		
		leitor.close();

	}

}
