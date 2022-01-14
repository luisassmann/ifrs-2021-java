package ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Gerenciamento de pessoas:");
		
		int opt=10;
		do {
			System.out.println("\nOpções:");
			System.out.println("  (1) Inserir uma nova pessoa;");
			System.out.println("  (2) Remover através do CPF;");
			System.out.println("  (3) Remover todas as pessoas;");
			System.out.println("  (4) Mostrar as pessoas já inseridas;");
			System.out.println("  (5) Mostrar os dados através do CPF;");
			System.out.println("  (0) Sair do programa.\n");
			System.out.print(">>> ");
			opt = Integer.parseInt(scan.nextLine());
			
			switch (opt) {
				case 1: {
					System.out.print("\nNome: ");
					String nome = scan.nextLine();
					System.out.print("CPF: ");
					String cpf = scan.nextLine();
					System.out.print("Idade: ");
					int idade = Integer.parseInt(scan.nextLine());
					
					pessoas.add(new Pessoa(nome, cpf, idade));
					break;
				}
				case 2: {
					System.out.print("\nCPF da pessoa a ser removida: ");
					String cpf = scan.nextLine();
					
					for (int i=0; i < pessoas.size(); i++) {
						if (pessoas.get(i).getCpf() == cpf) {
							pessoas.remove(i);
						}
					}
					break;
				}
				case 3: {
					System.out.print("\nTodas pessoas serão removidas. Deseja prosseguir? [s/n] ");
					String certeza = scan.nextLine();
					
					if (certeza == "s") {
						for (int i=0; i < pessoas.size(); i++) {
							pessoas.remove(i);
						}
					} else {
						break;
					}
					
					break;
				}
				case 4: {
					System.out.println("\nLista das pessoas já cadastradas:");
					System.out.println("------------------");
					for ( Pessoa pessoa : pessoas ) {
						System.out.println("Nome: " + pessoa.getNome() + ".");
						System.out.println("CPF: " + pessoa.getCpf() + ".");
						System.out.println("Idade: " + pessoa.getIdade() + " anos.");
						System.out.println("------------------");
					}
					break;
				}
				case 5: {
					System.out.print("\nCPF da pessoa a ser consultada: ");
					String cpfBusca = scan.nextLine();
					
					boolean matchCPF;
					for (int i=0; i < pessoas.size(); i++) {
						matchCPF = Arrays.equals(pessoas.get(i).getCpf(), cpfBusca);
						if () {
							System.out.println("------------------");
							System.out.println("Nome: " + pessoas.get(i).getNome() + ".");
							System.out.println("CPF: " + pessoas.get(i).getCpf() + ".");
							System.out.println("Idade: " + pessoas.get(i).getIdade() + " anos.");
						}
					}
					break;
				}
			
			}
		} while (opt != 0);
		
		scan.close();
		
		System.out.println("\n\nPrograma finalizado.");
		
	}
}
