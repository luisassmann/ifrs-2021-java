package ex2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Dados do Carro:");
		System.out.print("Marca: ");
		String marcaCarro = scan.nextLine();
		System.out.print("Modelo: ");
		String modeloCarro = scan.nextLine();
		System.out.println("Capacidade do porta malas [L]: ");
		int capacPortaMalas = Integer.parseInt(scan.nextLine());
		
		Carro carro = new Carro(marcaCarro, modeloCarro, capacPortaMalas);
		
		
		System.out.println("Dados do Caminhão:");
		System.out.print("Marca: ");
		String marcaCaminhao = scan.nextLine();
		System.out.print("Modelo: ");
		String modeloCaminhao = scan.nextLine();
		System.out.println("Capacidade da caçamba [m3]: ");
		int capacCacamba = Integer.parseInt(scan.nextLine());
		
		Caminhao caminhao = new Caminhao(marcaCaminhao, modeloCaminhao, capacCacamba);
		
		scan.close();
		
		System.out.println();
		
		System.out.println("Carro:");
		carro.imprimirDados();
		System.out.println("Caminhão:");
		caminhao.imprimirDados();

	}

}
