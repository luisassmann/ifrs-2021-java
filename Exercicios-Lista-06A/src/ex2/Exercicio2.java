package ex2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Nome Correntista: ");
		String nome = scan.nextLine();
		
		System.out.print("Saldo: R$ ");
		double saldo = Double.parseDouble(scan.nextLine());
		
				
		Correntista c1 = new Correntista();
		c1.setNome(nome);
		c1.setSaldo(saldo);
		
		int opt;
		movPrint();
		opt = Integer.parseInt(scan.nextLine());
		
		do {
			if (opt == 1) {
				System.out.print("Valor do debito: R$ ");
				double debito = Double.parseDouble(scan.nextLine());
				saldo -= debito;
				System.out.println("Saldo atual: R$ " + saldo);
				
			} else if (opt == 2) {
				System.out.print("Valor do credito: R$ ");
				double credito = Double.parseDouble(scan.nextLine());
				saldo += credito;
				System.out.println("Saldo atual: R$ " + saldo);
			}
			
			movPrint();
			opt = Integer.parseInt(scan.nextLine());
			
		} while(opt != 3);
		
		System.out.println("Saldo final: R$ " + saldo);
		System.out.println("\n\nPrograma encerrado.");
		
		scan.close();
	}
	
	private static void movPrint() {
		System.out.println("\nFazer um movimento:");
		System.out.print("  1 Débito\n  2 Crédito\n  3 Encerrar\n> ");
	}

}
