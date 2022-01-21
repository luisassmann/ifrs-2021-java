package ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Cidade> cidades = new ArrayList<Cidade>();
		
		System.out.println("Cadastro de Cidades");
		
		int opt = 1;
		do {
			System.out.println("\nOpções:");
			System.out.println("  (1) Cadastrar nova cidade;");
			System.out.println("  (2) Remover cidade;");
			System.out.println("  (3) Listar as cidades;");
			System.out.println("  (0) Sair.");
			System.out.print("\nSua opção: ");
			opt = Integer.parseInt(scan.nextLine());
			
			switch (opt) {
				case 1: {
					System.out.print("\nNome da cidade a ser cadastrada: ");
					String nome = scan.nextLine();
					System.out.print("Estado: ");
					String estado = scan.nextLine();
					System.out.println("Sobre o prefeito:");
					System.out.print("Nome: ");
					String nomePrefeito = scan.nextLine();
					System.out.print("Partido: ");
					String partidoPrefeito = scan.nextLine();
					
					Prefeito prefeito = new Prefeito(nomePrefeito, partidoPrefeito);
					Cidade cidade = new Cidade(nome, estado, prefeito);
					cidades.add(cidade);
					System.out.printf("Cidade de %s adicionada.\n", nome);
					
					break;
				}
				case 2: {
					System.out.print("\nNome da cidade a ser removida: ");
					String nome = scan.nextLine();
					
					boolean cidadeEncontrada = false;
					for (int i = 0; i < cidades.size(); i++) {
						if (cidades.get(i).getNome().equals(nome)) {
							cidadeEncontrada = true;
							cidades.remove(i);
						}
					}
					if (cidadeEncontrada) System.out.println("Cidade removida com êxito.");
					else System.out.println("Cidade não encontrada.");
					
					break;
				}
				case 3: {
					System.out.println("\nLista das Cidades Cadastradas");
					for (int i = 0; i < cidades.size(); i++) {
						System.out.println("-----------------------------------");
						System.out.println("Cidade: " + cidades.get(i).getNome());
						System.out.println("Estado: " + cidades.get(i).getEstado());
						System.out.println("Prefeito: " + cidades.get(i).getPrefeito().getNome());
						System.out.println("Partido do prefeito: " + cidades.get(i).getPrefeito().getPartido());
					}
					System.out.println("-----------------------------------");
					
					break;
				}
				case 0: {
					break;
				}
			}
		} while (opt != 0);
		
		scan.close();
		
		System.out.println("\n\nPrograma finalizado.");
	}

}
