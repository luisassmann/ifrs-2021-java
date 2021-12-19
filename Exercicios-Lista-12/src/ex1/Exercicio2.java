package ex1;

import java.util.Random;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		FiguraGeometrica[] fgs = null;
		FiguraGeometrica[] copFgs = null;
		
		int opt = 9;
		do {
			System.out.println("\nTrabalhando com Formas Geométricas\n");
			System.out.println("Opções:");
			System.out.println("  - (1) Inserir;");
			System.out.println("  - (2) Remover;");
			System.out.println("  - (3) Listar;");
			System.out.println("  - (0) Sair;");
			System.out.print("> ");
			opt = Integer.parseInt(scan.nextLine());
			
			switch (opt) {
				case 1: {
					System.out.print("Posição a inserir uma forma geométrica: ");
					int posicao = Integer.parseInt(scan.nextLine());
					
					if (fgs != null) {
						if (posicao > fgs.length) {
							copFgs = fgs;
							fgs = new FiguraGeometrica[posicao];
							for (int i = 0; i < copFgs.length; i++) {
								fgs[i] = copFgs[i];
							}
						}
					} else {
						fgs = new FiguraGeometrica[posicao];
					}
					
					System.out.print("Qual FG?\n  - (1) Circulo;\n  - (2) Retângulo\n> ");
					int figura = Integer.parseInt(scan.nextLine());
					
					if (figura == 1) {
						int raioC = random.nextInt(11);
						String nomeC = String.format("Circulo %d", posicao);
						fgs[posicao-1] = new Circulo(nomeC,raioC);
					} else if (figura == 2) {
						int lado1R = random.nextInt(11);
						int lado2R = random.nextInt(11);
						String nomeR = String.format("Retangulo %d", posicao);
						fgs[posicao-1] = new Retangulo(nomeR, lado1R, lado2R);
					}
					break;
				}
				case 2: {
					System.out.print("Posição a remover a forma geométrica: ");
					int posicaoR = Integer.parseInt(scan.nextLine());
					
					if (fgs[posicaoR-1] == null) {
						System.out.println("Espaço em branco removido.");
					} else {
						if (fgs[posicaoR-1].getClass().getName() == "ex1.Circulo") {
							String nomeC = String.format("Circulo %d", posicaoR);
							
							System.out.printf("%s removido.\n", nomeC);
								
						} else if (fgs[posicaoR-1].getClass().getName() == "ex1.Retangulo") {
							String nomeR = String.format("Retangulo %d", posicaoR);

							System.out.printf("%s removido.\n", nomeR);
						}
					}

					
					fgs[posicaoR-1] = null;
					copFgs = fgs;
					fgs = new FiguraGeometrica[copFgs.length-1];
					int iF = 0;
					for (int i = 0; i < copFgs.length; i++) {
						if (copFgs[i] != null) {
							fgs[iF] = copFgs[i];
							iF++;
						}
					}
					break;
				}
				case 3: {
					System.out.println("Listagem das Formas Geométricas:");
					
					System.out.println("-----------------------");
					for (int i = 0; i < fgs.length; i++) {
						if (fgs[i] != null) {
							System.out.printf("  %s\n", fgs[i].getNome());
							System.out.printf("  - Perímetro: %.1f\n", fgs[i].calculaPerimetro());
							System.out.printf("  - Área: %.1f\n", fgs[i].calculaArea());
							System.out.println("-----------------------");
						}
					}
					
				}
					
			}
			
		} while (opt != 0);
		
		
		scan.close();

	}

}
