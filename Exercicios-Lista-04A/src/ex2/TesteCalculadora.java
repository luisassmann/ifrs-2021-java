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
			System.out.println("2 - Subtra��o");
			System.out.println("3 - Divis�o");
			System.out.println("4 - Multiplica��o");
			System.out.println("5 - M�dia de uma lista;");
			System.out.println("\n0 - Para sair...\n");
			System.out.print("Informe sua op��o: ");
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
				// Subtra��o;
				System.out.println("Subtra��o:");
				
				System.out.print("x = ");
				int x = Integer.parseInt(leitor.nextLine());
				System.out.print("y = ");
				int y = Integer.parseInt(leitor.nextLine());
				
				calc.subtracao(x, y);
			}
			else if (opt == 3) {
				// Divis�o;
				System.out.println("Divis�o:");
				
				System.out.print("x = ");
				int x = Integer.parseInt(leitor.nextLine());
				System.out.print("y = ");
				int y = Integer.parseInt(leitor.nextLine());
				
				calc.divisao(x, y);
			}
			else if (opt == 4) {
				// Multiplica��o;
				System.out.println("Multiplica��o:");
				
				System.out.print("x = ");
				int x = Integer.parseInt(leitor.nextLine());
				System.out.print("y = ");
				int y = Integer.parseInt(leitor.nextLine());
				
				calc.multiplicacao(x, y);
			}
			else if (opt == 5) {
				// M�dia;
				System.out.println("M�dia:");
				
				System.out.print("Informe o quantidade de n�meros a serem calculadas a m�dia: ");
				int qtde = Integer.parseInt(leitor.nextLine());
				
				int[] x = new int[qtde];
				
				for (int i = 0; i < x.length; i++) {
					System.out.printf("Informe o %d� n�mero: ", i+1);
					x[i] = Integer.parseInt(leitor.nextLine());
				}
				
				calc.media(x);
			}
			
		} while (opt != 0);
		
		System.out.println("\nFim.");
		
		leitor.close();		
	}

}
