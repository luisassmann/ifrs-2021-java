package ex2;

import java.util.Scanner;

public class TesteCalculadora {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Calculadora");
		Calculadora calc = new Calculadora();
		
		int opt;
		do {
			System.out.println("\n1 - Soma");
			System.out.println("2 - Subtração");
			System.out.println("3 - Divisão");
			System.out.println("4 - Multiplicação");
			System.out.println("5 - Média de uma lista;");
			System.out.println("\n0 - Para sair...\n");
			System.out.print("Informe sua opção: ");
			opt = Integer.parseInt(leitor.nextLine());
			
			if (opt == 1) {
				// Soma;
				System.out.println("Soma:");
				
				System.out.print("x = ");
				int x = Integer.parseInt(leitor.nextLine());
				System.out.print("y = ");
				int y = Integer.parseInt(leitor.nextLine());
				
				calc.soma(x, y);
			}
			else if (opt == 2) {
				// Subtração;
				System.out.println("Subtração:");
				
				System.out.print("x = ");
				int x = Integer.parseInt(leitor.nextLine());
				System.out.print("y = ");
				int y = Integer.parseInt(leitor.nextLine());
				
				calc.subtracao(x, y);
			}
			else if (opt == 3) {
				// Divisão;
				System.out.println("Divisão:");
				
				System.out.print("x = ");
				int x = Integer.parseInt(leitor.nextLine());
				System.out.print("y = ");
				int y = Integer.parseInt(leitor.nextLine());
				
				calc.divisao(x, y);
			}
			else if (opt == 4) {
				// Multiplicação;
				System.out.println("Multiplicação:");
				
				System.out.print("x = ");
				int x = Integer.parseInt(leitor.nextLine());
				System.out.print("y = ");
				int y = Integer.parseInt(leitor.nextLine());
				
				calc.multiplicacao(x, y);
			}
			else if (opt == 5) {
				// Média;
				System.out.println("Média:");
				
				System.out.print("Informe o quantidade de números a serem calculadas a média: ");
				int qtde = Integer.parseInt(leitor.nextLine());
				
				int[] x = new int[qtde];
				
				for (int i = 0; i < x.length; i++) {
					System.out.printf("Informe o %d° número: ", i+1);
					x[i] = Integer.parseInt(leitor.nextLine());
				}
				
				calc.media(x);
			}
			
		} while (opt != 0);
		
		System.out.println("\nFim.");
		
		leitor.close();		
	}

}
