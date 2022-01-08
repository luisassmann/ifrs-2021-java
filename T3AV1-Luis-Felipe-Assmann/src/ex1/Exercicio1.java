package ex1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		FoneOuvido[] fones = new FoneOuvido[2];
		
		
		System.out.println("Fone de Ouvido 1");
		System.out.print("Modelo: ");
		String modeloFone1 = scan.nextLine();
		System.out.print("Nome do fabricante: ");
		String fabricanteFone1 = scan.nextLine();
		System.out.print("País de origem: ");
		String paisFone1 = scan.nextLine();
		
		Fabricante fabFone1 = new Fabricante(fabricanteFone1, paisFone1);
		
		
		System.out.println("Fone de Ouvido 2");
		System.out.print("Modelo: ");
		String modeloFone2 = scan.nextLine();
		System.out.print("Nome do fabricante: ");
		String fabricanteFone2 = scan.nextLine();
		System.out.print("País de origem: ");
		String paisFone2 = scan.nextLine();
		
		Fabricante fabFone2 = new Fabricante(fabricanteFone2, paisFone2);
		
		fones[0] = new FoneOuvido(modeloFone1, fabFone1);
		fones[1] = new FoneOuvido(modeloFone2, fabFone2);
		
		scan.close();

	}

}
