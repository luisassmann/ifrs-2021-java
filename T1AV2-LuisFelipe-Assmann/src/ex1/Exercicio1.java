package ex1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		
		Atleta a1 = new Atleta();
		
		System.out.print("Nome do Atleta: ");
		a1.nome = leitor.nextLine();
		System.out.print("Modalidade: ");
		a1.modalidade = leitor.nextLine();
		System.out.print("Idade: ");
		a1.idade = Integer.parseInt(leitor.nextLine());
		
		leitor.close();
		
		
		a1.ganhou();
	}

}
