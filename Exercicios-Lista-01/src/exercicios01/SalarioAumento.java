package exercicios01;

import java.util.Scanner;
import java.text.DecimalFormat;

public class SalarioAumento {

	public static void main(String[] args) {
		// Exercicio 5
		
		Scanner leitor = new Scanner(System.in);
		
		
		System.out.print("Digite seu salário: R$ ");
		double salario = leitor.nextDouble();
		
		System.out.print("Digite a porcentagem de aumento do salário: ");
		int percentualAumento = leitor.nextInt();
		
		
		double aumento = (salario * percentualAumento) / 100;
		double salarioComAumento = salario + aumento;
		
		
		DecimalFormat df = new DecimalFormat("##,###.00");
		System.out.println();
		
		System.out.println("Salário: 			R$" + df.format(salario));
		System.out.println("Percentual de aumento:  	" + percentualAumento + "%");
		System.out.println("Valor do aumento: 		R$" + df.format(aumento));
		System.out.println("Novo salário: 			R$" + df.format(salarioComAumento));
		
		leitor.close();
	}

}
