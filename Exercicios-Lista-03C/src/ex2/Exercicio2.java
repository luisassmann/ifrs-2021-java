package ex2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Informe o nome do atleta: ");
		String nome = leitor.nextLine();
		
		double[] saltos = new double[5];
		
		double somaSaltos = 0;
		for (int i=0; i < saltos.length; i++) {
			System.out.print("Distancia salto: ");
			saltos[i] = Double.parseDouble(leitor.nextLine());
			
			somaSaltos += saltos[i];
		}
		
		double mediaSaltos = somaSaltos / saltos.length;
		
		System.out.println("\nRESULTADO FINAL");
		System.out.printf("Atleta: %s\n", nome);
		System.out.print("Saltos: ");
		for (double i : saltos) {
			System.out.printf("%.1f ", i);
		}
		System.out.printf("\nMédia dos saltos: %.1f\n", mediaSaltos);
		
		leitor.close();

	}

}
