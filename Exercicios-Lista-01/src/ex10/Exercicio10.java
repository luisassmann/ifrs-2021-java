package ex10;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Valor do salário mínimo: R$ ");
		double salarioMinimo = leitor.nextDouble();
		
		System.out.print("Informe seu salário: R$ ");
		double salario = leitor.nextDouble();
		
		double salarios = salario / salarioMinimo;
		
		System.out.printf("\nVocê recebe %.1f salários mínimos.",
				salarios);
		
		leitor.close();

	}

}
