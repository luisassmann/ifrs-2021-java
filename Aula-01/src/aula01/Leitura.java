package aula01;

import java.util.Scanner;

public class Leitura {
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Informe seu nome: ");
		String nome = leitor.nextLine();
		
		System.out.println("Seu nome é "+ nome +".");
		
		
		System.out.print("Informe a sua idade: ");
		int idade = Integer.parseInt(leitor.nextLine());
		
		System.out.println("Sua idade é "+ idade +" anos.");
		
		
		System.out.print("Informe sua altura: ");
		double altura = Double.parseDouble(leitor.nextLine());
		
		System.out.println("A sua altura é "+ altura +"m.");
		
		leitor.close();
	}
}
