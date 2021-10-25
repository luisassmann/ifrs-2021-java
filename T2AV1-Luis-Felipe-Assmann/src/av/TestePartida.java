package av;

import java.util.Scanner;

public class TestePartida {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Dados da partida\n");
		
		System.out.print("Cidade da partida: ");
		String cidade = leitor.nextLine();
		System.out.print("Estado da partida: ");
		String estado = leitor.nextLine();
		System.out.print("Pais da partida: ");
		String pais = leitor.nextLine();
		
		Cidade cidadeP = new Cidade(cidade, estado, pais);
		
		
		System.out.println("==========================================");
		
		
		System.out.println("\nInformacoes das equipes\n");
		
		Equipe[] equipes = new Equipe[2];
		
		System.out.println("Equipe 1");
		System.out.print("Nome da equipe 1: ");
		String equipe1 = leitor.nextLine();
		
		System.out.print("Cidade da equipe 1: ");
		String nomeCidadeE1 = leitor.nextLine();
		System.out.print("Estado da equipe 1: ");
		String estadoE1 = leitor.nextLine();
		System.out.print("Pais da equipe 1: ");
		String paisE1 = leitor.nextLine();
		
		Cidade cidadeE1 = new Cidade(nomeCidadeE1, estadoE1, paisE1);
		
		System.out.print("Numero de vitorias: ");
		int vitoriasE1 = Integer.parseInt(leitor.nextLine());
		System.out.print("Numero de derrotas: ");
		int derrotasE1 = Integer.parseInt(leitor.nextLine());
		System.out.print("Numero de empates: ");
		int empatesE1 = Integer.parseInt(leitor.nextLine());
		
		equipes[0] = new Equipe(equipe1, cidadeE1, vitoriasE1, derrotasE1, empatesE1);
		

		System.out.println("\nEquipe 2");
		System.out.print("Nome da equipe 2: ");
		String equipe2 = leitor.nextLine();
		
		System.out.print("Cidade da equipe 2: ");
		String nomeCidadeE2 = leitor.nextLine();
		System.out.print("Estado da equipe 2: ");
		String estadoE2 = leitor.nextLine();
		System.out.print("Pais da equipe 2: ");
		String paisE2 = leitor.nextLine();
		
		Cidade cidadeE2 = new Cidade(nomeCidadeE2, estadoE2, paisE2);
		
		System.out.print("Numero de vitorias: ");
		int vitoriasE2 = Integer.parseInt(leitor.nextLine());
		System.out.print("Numero de derrotas: ");
		int derrotasE2 = Integer.parseInt(leitor.nextLine());
		System.out.print("Numero de empates: ");
		int empatesE2 = Integer.parseInt(leitor.nextLine());
		
		equipes[1] = new Equipe(equipe2, cidadeE2, vitoriasE2, derrotasE2, empatesE2);
		
		
		System.out.println("==========================================");
		
		
		System.out.println("\nDesfecho da partida\n");
		
		
		int[] placar = new int[2];
		
		System.out.print("Gols do "+ equipes[0].getNome() +": ");
		placar[0] = Integer.parseInt(leitor.nextLine());
		System.out.print("Gols do "+ equipes[1].getNome() +": ");
		placar[1] = Integer.parseInt(leitor.nextLine());
		
		System.out.println("Placar final:\n"+equipes[0].getNome()+" [ " + placar[0] + " x " + placar[1] + " ] "+equipes[1].getNome());

		leitor.close();
		
		if (placar[0] > placar[1]) {
			equipes[0].setVitorias( equipes[0].getVitorias() + 1 );
			equipes[1].setDerrotas( equipes[1].getDerrotas() + 1 );
			
		} else if (placar[0] < placar[1]) {
			equipes[1].setVitorias( equipes[1].getVitorias() + 1 );
			equipes[0].setDerrotas( equipes[0].getDerrotas() + 1 );
			
		} else {
			equipes[0].setEmpates( equipes[0].getEmpates() + 1 );
			equipes[1].setEmpates( equipes[1].getEmpates() + 1 );
			
		}

		
		System.out.println("==========================================");
		
		
		Partida p = new Partida(placar, cidadeP, equipes);
		
		p.getEquipes()[0].calcPontuacao();
		p.getEquipes()[1].calcPontuacao();
		
		System.out.println("\nPontuação geral das equipes no campeonato:\n");
		
		System.out.println(p.getEquipes()[0].getNome()+": " + p.getEquipes()[0].getPontuacao() + " pts");
		System.out.println(p.getEquipes()[1].getNome()+": " + p.getEquipes()[1].getPontuacao() + " pts");
		
	}

}
