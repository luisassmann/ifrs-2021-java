package ex5;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite seu salário: R$ ");
		double salario = leitor.nextDouble();
		
		System.out.print("Digite a porcentagem de aumento do salário: ");
		int percentualAumento = leitor.nextInt();
		
		double aumento = (salario * percentualAumento) / 100;
		double salarioComAumento = salario + aumento;
		
		System.out.printf("\n%-23s R$%10.2f\n", "Salário:", salario);
		System.out.printf("%-23s %d%%\n", "Percentual de aumento:", percentualAumento);
		System.out.printf("%-23s R$%10.2f\n", "Valor do aumento", aumento);
		System.out.printf("%-23s R$%10.2f\n", "Novo Salário:", salarioComAumento);
		
		leitor.close();

	}

}
