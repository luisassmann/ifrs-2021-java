package ex1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		String[] produtos = {
			"Cachorro Quente",
			"Bauru Simples",
			"Bauru com Ovo",
			"Hamburguer",
			"Cheeseburguer",
			"Refrigerante"
		};
		
		double[] precoProdutos = {
			1.20, // Cachorro Quente
			1.20, // Bauru Simples
			1.50, // Bauru com Ovo
			1.20, // Hamburguer
			1.30, // Cheeseburguer
			1.00  // Refrigerante
		};
		
		int[] qtdePedidos = { 0,0,0,0,0,0 };
		
		System.out.printf("%-20s %-12s %-10s","Especificação","Código","Preço");
		System.out.println("\n--------------------------------------------");
		
		for(int i = 0; i < produtos.length; i++) {
			String precoOut = String.format("R$ %.2f", precoProdutos[i]);
			System.out.printf("%-20s %-12s R$ %-10s \n", produtos[i], i+1, precoOut);
		}
		System.out.println("--------------------------------------------");
		
		Scanner leitor = new Scanner(System.in);
		
		
		
		leitor.close();
		
	}

}
