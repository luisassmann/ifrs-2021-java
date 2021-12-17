package ex1;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		FiguraGeometrica[] fgs = new FiguraGeometrica[0];
		
		int opt = 1;
		do {
			System.out.println("Formas Geométricas\n");
			System.out.println("Opções:");
			System.out.println("  - (1) Inserir;");
			System.out.println("  - (2) Remover;");
			System.out.println("  - (3) Listar;");
			System.out.println("  - (0) Sair;");
			System.out.print("> ");
			opt = Integer.parseInt(scan.nextLine());
			
			if (opt == 1) {
				System.out.print("Posição a inserir uma forma geométrica: ");
				int posicao = Integer.parseInt(scan.nextLine());
				
				fgs = new FiguraGeometrica[posicao];
				
				System.out.print("Qual FG?\n  - (1) Circulo;\n  - (2) Retângulo\n> ");
				
				
				
			}
			
		} while (opt != 0);
		
		scan.close();

	}

}
