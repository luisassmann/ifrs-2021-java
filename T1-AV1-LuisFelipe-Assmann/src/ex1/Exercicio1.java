package ex1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Informe a nota 1: ");
		double nota1 = leitor.nextDouble();
		System.out.print("Informe a nota 2: ");
		double nota2 = leitor.nextDouble();
		System.out.print("Informe a nota 3: ");
		double nota3 = leitor.nextDouble();
		
		while ((nota1 < 0 || nota1 > 30) ||
				(nota2 < 0 || nota2 > 30) ||
				(nota3 < 0 || nota3 > 40))
		{
			System.out.println("\nNota(s) incorreta.");
			System.out.println("A nota 1 e 2 deve ser entre 0 e 30.");
			System.out.println("E a nota 3 deve ser entre 0 e 40.\n");
			
			System.out.print("Informe a nota 1: ");
			nota1 = leitor.nextDouble();
			System.out.print("Informe a nota 2: ");
			nota2 = leitor.nextDouble();
			System.out.print("Informe a nota 3: ");
			nota3 = leitor.nextDouble();
		}
		
		double somaDasNotas = nota1 + nota2 + nota3;
		
		if (somaDasNotas >= 60) {
			System.out.println("O Aluno está aprovado.");
		} else {
			System.out.println("O Aluno está reprovado.");
		}
		
		leitor.close();

	}

}
