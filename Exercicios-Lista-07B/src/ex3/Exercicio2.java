package ex3;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o nome do correntista: ");
		String nome = scan.nextLine();
		
		System.out.print("Informe o saldo inicial: R$");
		double saldo = Double.parseDouble(scan.nextLine());
		
		Correntista c1 = new Correntista(nome, saldo);
		
		System.out.printf("Ola %s!\n", c1.getNome());
		
		int opt = 0;
		
		do {
			System.out.print("Ações:\n  1 Debito\n  2 Credito\n> ");
			opt = Integer.parseInt(scan.nextLine());
			
			if (opt == 1) {
				System.out.print("Valor: R$ ");
				double deb = Double.parseDouble(scan.nextLine());
				
				if (deb > c1.getSaldo()) {
					System.out.println("Voce nao tem saldo suficiente.");
				} else {
					c1.setSaldo(c1.getSaldo() - deb);
				}
			} 
			
			if (opt == 2) {
				System.out.print("Valor: R$ ");
				double cred = Double.parseDouble(scan.nextLine());
				
				c1.setSaldo(c1.getSaldo() + cred);
			}
			
			
		} while (opt != 3);
		
		System.out.printf("Saldo total pos sessao: R$ %.2f\n", c1.getSaldo());
		System.out.printf("Programa fechado, Ate mais, %s\n", c1.getNome());
		
		scan.close();
	}
}
