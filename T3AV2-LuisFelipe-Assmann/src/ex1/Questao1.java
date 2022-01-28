package ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Banda> bandas = new ArrayList<Banda>();
		
		System.out.println("Cadastro de Bandas-------------------------------");
		
		int opt = 0;
		do {
			System.out.println("\nMenu de opções:");
			System.out.println("   (1) Inserir uma banda;");
			System.out.println("   (2) Remover uma banda através do seu índice;");
			System.out.println("   (3) Mostrar os dados de todas as bandas;");
			System.out.println("   (4) Sair;");
			
			System.out.print("Sua opção: ");
			opt = Integer.parseInt(scan.nextLine());
			
			if (opt == 1) {
				System.out.print("\nNome da banda: ");
				String nomeBanda = scan.nextLine();
				
				// Músicos
				System.out.println("Vocalista:");
				System.out.print("   Nome: ");
				String nomeVoc = scan.nextLine();
				System.out.print("   Sobrenome: ");
				String sobrenomeVoc = scan.nextLine();
				
				Musico vocalista = new Musico(nomeVoc, sobrenomeVoc);
				
				System.out.println("Baterista:");
				System.out.print("   Nome: ");
				String nomeBat = scan.nextLine();
				System.out.print("   Sobrenome: ");
				String sobrenomeBat = scan.nextLine();
				
				Musico baterista = new Musico(nomeBat, sobrenomeBat);
				
				System.out.println("Guitarrista");
				System.out.print("   Nome: ");
				String nomeGuit = scan.nextLine();
				System.out.print("   Sobrenome: ");
				String sobrenomeGuit = scan.nextLine();
				
				Musico guitarrista = new Musico(nomeGuit, sobrenomeGuit);
				
				Banda banda = new Banda(nomeBanda, vocalista, baterista, guitarrista);
				bandas.add(banda);
				System.out.printf("\nBanda %s inserida.\n", banda.getNomeBanda());
				
			} else if (opt == 2) {
				if (bandas.size() == 0) System.out.println("\nNenhuma banda cadastrada até então.");
				
				else {
					System.out.print("\nInforme o índice da banda que desejas remover: ");
					int indexToRemove = Integer.parseInt(scan.nextLine());
					
					while (indexToRemove > bandas.size()-1) {
						System.out.println("Índice inválido. (Lembre-se de que o índice se inicia em zero).");
						System.out.print("Informe o índice da banda que desejas remover: ");
						indexToRemove = Integer.parseInt(scan.nextLine());
					}
					
					String nomeBandaR = bandas.get(indexToRemove).getNomeBanda();
					
					bandas.remove(indexToRemove);
					
					System.out.printf("Banda %s removida.\n", nomeBandaR);
				}
				
			} else if (opt == 3) {
				if (bandas.size() == 0) System.out.println("\nNenhuma banda cadastrada até então.");
				
				else {
					System.out.println("\nLista de todas as bandas-------------------------");
					System.out.println("-------------------------------------------------");
					
					for (int i = 0; i < bandas.size(); i++) {
						System.out.println("Banda: " + bandas.get(i).getNomeBanda() + ".");
						
						System.out.print("    Vocalista: " + bandas.get(i).getVocalista().getNome() + " ");
						System.out.println(bandas.get(i).getVocalista().getSobrenome() + ".");
						
						System.out.print("    Baterista: " + bandas.get(i).getBaterista().getNome() + " ");
						System.out.println(bandas.get(i).getBaterista().getSobrenome() + ".");
						
						System.out.print("    Guitarrista: " + bandas.get(i).getGuitarrista().getNome() + " ");
						System.out.println(bandas.get(i).getGuitarrista().getSobrenome() + ".");
						
						System.out.println("-------------------------------------------------");
					}
				}
				
			}
			
		} while (opt != 4);
		
		System.out.println("\n\nPrograma finalizado.");
		scan.close();
	}

}
