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
		
		int pedido;
		int qtde;
		do {
			System.out.print("Informe o código do produto: [0 para sair] ");
			pedido = Integer.parseInt(leitor.nextLine());
			
			if (pedido > 0) {
				System.out.print("Unidades do produto: ");
				qtde = Integer.parseInt(leitor.nextLine());
				
				qtdePedidos[pedido-1] += qtde;
			}
			
		} while (pedido != 0);
		
		leitor.close();
		
		System.out.println("\nPEDIDO");
		System.out.printf("%-12s %-20s %-10s","Quantidade","Item","Preço");
		System.out.println("\n--------------------------------------------");
		
		double totalCompra = 0;
		for (int i = 0; i < qtdePedidos.length; i++) {
			if (qtdePedidos[i] > 0) {
				totalCompra += (precoProdutos[i] * qtdePedidos[i]);
				
				String precoOut = String.format("R$ %.2f", precoProdutos[i]);
				System.out.printf("%-12s %-20s R$ %-10s \n", qtdePedidos[i], produtos[i], precoOut);
			}
		}
		
		String precoOut = String.format("R$ %.2f", totalCompra);
		System.out.printf("\n%-12s %-10s", "TOTAL", precoOut);
		
	}

}
