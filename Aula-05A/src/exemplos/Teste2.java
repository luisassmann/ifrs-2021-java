package exemplos;

import java.util.Scanner;

public class Teste2 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		ContaBancaria c1 = new ContaBancaria();
		System.out.print("Conta Simples ou Conta Tradicional. 0 para simples / 1 para tradicional:  ");
		int opt = Integer.parseInt(leitor.nextLine());
		
		if (opt == 0) {
			System.out.print("Nome: ");
			String nome = leitor.nextLine();
			
			c1.abreContaSimples(nome);
		} else {
			System.out.print("Nome: ");
			String nome = leitor.nextLine();
			
			System.out.print("Depósito: R$ ");
			double deposito = Double.parseDouble(leitor.nextLine());
			
			System.out.print("Conta Especial? 1 para Sim / 0 para Não ");
			int contEsp = Integer.parseInt(leitor.nextLine());
			
			boolean contaEspecial = false;
			if (contEsp == 1) {
				contaEspecial = true;
			}
			

			c1.abreConta(nome, deposito, contaEspecial);
			
		}
		
		c1.mostraDados();
		
		
		int operacao;
		while (true) {
			System.out.print("\n\nOperação:\n[1] retirar;\n[2] depositar;\n[9] Sair\n: ");
			operacao = Integer.parseInt(leitor.nextLine());
			
			if (operacao == 9) {
				break;
			}
			
			if (operacao == 1) {
				if (c1.especial) {
					System.out.print("Valor a retirar: R$ ");
					double valor = Double.parseDouble(leitor.nextLine());
					
					c1.saldo = c1.saldo - valor;
				} else {
					while (true) {
						System.out.print("Valor a retirar: R$ ");
						double valor = Double.parseDouble(leitor.nextLine());
						if (valor <= c1.saldo) {
							c1.saldo = c1.saldo - valor;
							break;
						} else {
							System.out.println("Você não tem esse dinheiro.");
						}
					}
				}
			}
			
			else if (operacao == 2) {
				System.out.print("Valor a depositar: R$ ");
				double valor = Double.parseDouble(leitor.nextLine());
				c1.saldo += valor;
			}
			
		}
		
		c1.mostraDados();
		
		leitor.close();
	}
}
