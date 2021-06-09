package ex1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Número de turmas: ");
		int turmas = leitor.nextInt();
		
		int totalAlunos = 0;
		int alunos;
		
		for (int i=turmas; i>0; i--) {
			System.out.printf("Números de alunos na turma %d: ", i);
			alunos = leitor.nextInt();
			
			while (alunos > 32) {
				System.out.printf("Número muito alto! Números de alunos na turma %d: ", i);
				alunos = leitor.nextInt();
			}
			
			totalAlunos += alunos;
		}
		
		System.out.println("Média de alunos por turma: " + (totalAlunos / turmas));
		
		leitor.close();

	}

}
