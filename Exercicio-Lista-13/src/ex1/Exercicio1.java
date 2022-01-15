package ex1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Heroi[] heroisUCM = new Heroi[5];
		
		for (int i = 0; i < heroisUCM.length; i++) {
			System.out.printf("Nome do %d° Super Herói: ", i+1);
			String nome = scan.nextLine();
			System.out.print("Poder: ");
			String poder = scan.nextLine();
			System.out.print("Idade: ");
			int idade = Integer.parseInt(scan.nextLine());
			System.out.print("Universo: ");
			String universo = scan.nextLine();
			
			heroisUCM[i] = new Heroi(nome, poder, idade, universo);
			System.out.println();
		}
		
		scan.close();
		
		for ( Heroi heroi : heroisUCM ) {
			System.out.println("--------------------------");
			System.out.print(heroi.getNome());
			System.out.print(" - " + heroi.getPoder() + "\n");
			System.out.print(heroi.getIdade() + " anos - ");
			System.out.println(heroi.getNomeUniverso());
		}

	}

}
