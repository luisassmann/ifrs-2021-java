package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {

		ArrayList<Carro> carros = new ArrayList<Carro>();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Cadastro de carros\n");
		System.out.println("[Para sair do programa, deixe um (ou dois) dos campos de preenchimento vazio].");
		
		String marca = null;
		String modelo = null;
		do {
			System.out.print("Marca do carro: ");
			marca = scan.nextLine();
			
			System.out.print("Modelo do carro: ");
			modelo = scan.nextLine();
			
			if (!marca.isEmpty() && !modelo.isEmpty()) {
				carros.add(new Carro(marca, modelo));
				System.out.println("Carro adicionado.");
			}
			
		} while (!marca.isEmpty() && !modelo.isEmpty());
		
		scan.close();

		System.out.println("\nCarros cadastrados:\n----------------------");
		for ( Carro carro : carros ) {
			System.out.println("- Marca: " + carro.getMarca() + ".");
			System.out.println("- Modelo: " + carro.getModelo() + ".");
			System.out.println();
		}
		System.out.println("----------------------");
		
	}

}
