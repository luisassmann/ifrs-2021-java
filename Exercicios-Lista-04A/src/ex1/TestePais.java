package ex1;

import java.util.Scanner;

public class TestePais {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		
		Pais p1 = new Pais();
		
		System.out.print("Nome do país: ");
		p1.nome = leitor.nextLine();
		
		System.out.print("Nome da capital de " + p1.nome + ": ");
		p1.capital = leitor.nextLine();
		
		System.out.print("Número de habitantes: ");
		p1.habitantes = Integer.parseInt(leitor.nextLine());
		
		
		leitor.close();
		
		
		System.out.println(p1.nome);
		System.out.println(p1.capital);
		System.out.println(p1.habitantes);
	}

}
