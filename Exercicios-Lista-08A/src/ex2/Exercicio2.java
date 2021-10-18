package ex2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Pessoa[] pessoas = new Pessoa[3];
		
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < pessoas.length; i++) {
			System.out.print("Primeiro nome: ");
			String nome = scan.nextLine();
			System.out.print("Sobrenome: ");
			String sobrenome = scan.nextLine();
			System.out.print("Idade: ");
			int idade = Integer.parseInt(scan.nextLine());
			
			pessoas[i] = new Pessoa(nome, sobrenome, idade);	
		}
		
		System.out.println("------------------");
		System.out.println("Nomes cadastrados:");
		for (Pessoa p : pessoas) {
			System.out.print(p.getNome() + " ");
			System.out.println(p.getSobrenome());
		}
		
		scan.close();

	}

}
