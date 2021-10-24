package ex2;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("PARTIDA DE FUTEBOL\n\n");
		
		System.out.print("Cidade da partida: ");
		String cidadePartida = scan.nextLine();
		System.out.print("Estado da partida: ");
		String estadoPartida = scan.nextLine();
		System.out.print("Pais da partida: ");
		String paisPartida = scan.nextLine();
		
		Cidade cidPart = new Cidade(cidadePartida, estadoPartida, paisPartida);
		
		
		System.out.println("Dados dos Times");
		
		Equipe[] equipes = new Equipe[2];
		
		// Time 1 ------
		System.out.print("Nome do time 1: ");
		String nomeTime1 = scan.nextLine();
		
		System.out.print("Cidade do time 1: ");
		String cidadeTime1 = scan.nextLine();
		System.out.print("Estado do time 1: ");
		String estadoTime1 = scan.nextLine();
		System.out.print("Pais do time 1: ");
		String paisTime1 = scan.nextLine();
		
		Cidade time1Cid = new Cidade(cidadeTime1, estadoTime1, paisTime1);
		
		System.out.print("Vitorias do time 1: ");
		int vitoriasTime1 = Integer.parseInt(scan.nextLine());
		System.out.print("Derrotas do time 1: ");
		int derrotasTime1 = Integer.parseInt(scan.nextLine());
		System.out.print("Empates do time 1: ");
		int empatesTime1 = Integer.parseInt(scan.nextLine());
		
		equipes[0] = new Equipe(nomeTime1, time1Cid, vitoriasTime1, derrotasTime1, empatesTime1);
		

		// Time 2 ------
		System.out.print("Nome do time 2: ");
		String nomeTime2 = scan.nextLine();
		
		System.out.print("Cidade do time 2: ");
		String cidadeTime2 = scan.nextLine();
		System.out.print("Estado do time 2: ");
		String estadoTime2 = scan.nextLine();
		System.out.print("Pais do time 2: ");
		String paisTime2 = scan.nextLine();
		
		Cidade time2Cid = new Cidade(cidadeTime2, estadoTime2, paisTime2);
		
		System.out.print("Vitorias do time 2: ");
		int vitoriasTime2 = Integer.parseInt(scan.nextLine());
		System.out.print("Derrotas do time 2: ");
		int derrotasTime2 = Integer.parseInt(scan.nextLine());
		System.out.print("Empates do time 2: ");
		int empatesTime2 = Integer.parseInt(scan.nextLine());
		
		equipes[1] = new Equipe(nomeTime2, time2Cid, vitoriasTime2, derrotasTime2, empatesTime2);
		
		int[] placar = new int[2];
		System.out.println("\nPlacares");
		System.out.print("Gols time 1 na partida: ");
		placar[0] = Integer.parseInt(scan.nextLine());
		System.out.print("Gols time 1 na partida: ");
		placar[1] = Integer.parseInt(scan.nextLine());
		
		scan.close();
		
		Partida p = new Partida(placar, cidPart, equipes);
		
		System.out.println("\n\nPartida Encerrada.");
		
		if (p.getPlacar()[0] > p.getPlacar()[1]) {
			
			int vit = equipes[0].getVitorias() + 1;
			equipes[0].setVitorias(vit);
			
			int der = equipes[1].getDerrotas() + 1;
			equipes[1].setDerrotas(der);
		
		}
		
		else if (p.getPlacar()[0] < p.getPlacar()[1]) {
			
			int vit = equipes[1].getVitorias() + 1;
			equipes[0].setVitorias(vit);
			
			int der = equipes[1].getDerrotas() + 1;
			equipes[1].setDerrotas(der);
		
		}
		
		else {
			
			int emp1 = equipes[0].getEmpates() + 1;
			equipes[0].setEmpates(emp1);
			
			int emp2 = equipes[1].getEmpates() + 1;
			equipes[1].setEmpates(emp2);
			
		}
		
		p.setEquipes(equipes);
		p.getEquipes()[0].calcPontos();
		p.getEquipes()[1].calcPontos();
		
		
		System.out.printf("\n\nPontuacao time 1: %d", p.getEquipes()[0].getPontuacao());
		System.out.printf("\nPontuacao time 2: %d", p.getEquipes()[1].getPontuacao());
	}

}
