package ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Gerenciamento de pessoas:");
		
		int opt=0;
		do {
			System.out.println("\nOpções:");
			System.out.println("  (1) Inserir uma nova pessoa;");
			System.out.println("  (2) Remover através do CPF;");
			System.out.println("  (3) Remover todas as pessoas;");
			System.out.println("  (4) Mostrar as pessoas já inseridas;");
			System.out.println("  (5) Mostrar os dados através do CPF;");
			System.out.println("  (0) Sair do programa.\n");
			System.out.print("Sua escolha >>> ");
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
					System.out.println(nome + " adicionado(a).");
					break;
				}
				case 2: {
					System.out.print("\nCPF da pessoa a ser removida: ");
					String cpf = scan.nextLine();
					
					boolean encontrada = false;
					for (int i=0; i < pessoas.size(); i++) {
						if (pessoas.get(i).getCpf().equals(cpf)) {
							System.out.println(pessoas.get(i).getNome() + " removido(a).");
							pessoas.remove(i);
							encontrada = true;
						}
					}
					if (!encontrada) System.out.println("Não foi encontrada a pessoa com o CPF informado.");
					
					break;
				}
				case 3: {
					System.out.print("\nTodas pessoas serão removidas. Deseja prosseguir? [1 -> sim / 0 -> não] ");
					int certeza = Integer.parseInt(scan.nextLine());
					while (certeza != 1 || certeza != 0) {
						System.out.print("\nEntrada não reconhecida. Todas pessoas serão removidas. Deseja prosseguir? [s/n] ");
						certeza = Integer.parseInt(scan.nextLine());
					}
					
					if (certeza == 1) {
						for (int i=0; i < pessoas.size(); i++) {
							pessoas.remove(i);
						}
						System.out.println("Todas pessoas removidas.");
					} else {
						break;
					}
					
					break;
				}
				case 4: {
					System.out.println("\nLista das pessoas já cadastradas:");
					System.out.println("-------------------------------------------------------------");
					System.out.printf("%30s | %15s | %8s", "Nome", "CPF", "Idade");
					System.out.println("\n-------------------------------------------------------------");
					for ( Pessoa pessoa : pessoas ) {
						System.out.printf("%30s | %15s | %8s", pessoa.getNome(), pessoa.getCpf(), (pessoa.getIdade() + " anos\n"));
					}
					System.out.println("-------------------------------------------------------------");
					break;
				}
				case 5: {
					System.out.print("\nCPF da pessoa a ser consultada: ");
					String cpfBusca = scan.nextLine();
					
					boolean encontrada = false;
					for (int i=0; i < pessoas.size(); i++) {
						if (pessoas.get(i).getCpf().equals(cpfBusca)) {
							System.out.println("------------------");
							System.out.println("Nome: " + pessoas.get(i).getNome() + ".");
							System.out.println("CPF: " + pessoas.get(i).getCpf() + ".");
							System.out.println("Idade: " + pessoas.get(i).getIdade() + " anos.");
							encontrada = true;
						}
					}
					if (!encontrada) System.out.println("Não foi encontrada a pessoa com o CPF informado.");
					
					break;
				}
			
			}
		} while (opt != 0);
		
		scan.close();
		
		System.out.println("\n\nPrograma finalizado.");
		
	}
}
