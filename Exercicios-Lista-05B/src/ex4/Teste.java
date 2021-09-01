package ex4;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		// OBJETO p1
		System.out.println("-----------------------------");
		System.out.println("Informe os dados da partida 1");


		// Equipe A
		Equipe eA1 = new Equipe();
		System.out.print("Qual o nome do equipe A? ");
		eA1.nome = leitor.nextLine();

		Cidade cA1 = new Cidade();
		System.out.print("Qual o nome da cidade da equipe A? ");
		cA1.nome = leitor.nextLine();
		System.out.print("Qual o nome do estado da equipe A? ");
		cA1.estado = leitor.nextLine();
		System.out.print("Qual o nome do pais da equipe A? ");
		cA1.pais = leitor.nextLine();
		eA1.cidade = cA1;

		System.out.print("Qual o número de vitórias da equipe A? ");
		eA1.vitorias = Integer.parseInt(leitor.nextLine());
		System.out.print("Qual o número de empates da equipe A? ");
		eA1.empates = Integer.parseInt(leitor.nextLine());
		System.out.print("Qual o número de derrotas da equipe A? ");
		eA1.derrotas = Integer.parseInt(leitor.nextLine());



		// Equipe B
		Equipe eB1 = new Equipe();
		System.out.print("Qual o nome do equipe B? ");
		eB1.nome = leitor.nextLine();

		Cidade cB1 = new Cidade();
		System.out.print("Qual o nome da cidade da equipe B? ");
		cB1.nome = leitor.nextLine();
		System.out.print("Qual o nome do estado da equipe B? ");
		cB1.estado = leitor.nextLine();
		System.out.print("Qual o nome do pais da equipe B? ");
		cB1.pais = leitor.nextLine();
		eB1.cidade = cB1;

		System.out.print("Qual o número de vitórias da equipe B? ");
		eB1.vitorias = Integer.parseInt(leitor.nextLine());
		System.out.print("Qual o número de empates da equipe B? ");
		eB1.empates = Integer.parseInt(leitor.nextLine());
		System.out.print("Qual o número de derrotas da equipe B? ");
		eB1.derrotas = Integer.parseInt(leitor.nextLine());

		Cidade cP1 = new Cidade();
		System.out.print("Qual o nome da cidade da partida? ");
		cP1.nome = leitor.nextLine();
		System.out.print("Qual o nome do estado da partida? ");
		cP1.estado = leitor.nextLine();
		System.out.print("Qual o nome do pais da partida? ");
		cP1.pais = leitor.nextLine();
		

		Partida p1 = new Partida();
		p1.equipeA = eA1;
		p1.equipeB = eB1;
		p1.cidade = cP1;

		System.out.print("Qual o nome do arbitro da partida? ");
		p1.arbitro = leitor.nextLine();

		System.out.print("Quantos gols fez a equipe A? ");
		p1.placarA = Integer.parseInt(leitor.nextLine());
		
		System.out.print("Quantos gols fez a equipe B? ");
		p1.placarB = Integer.parseInt(leitor.nextLine());
		
		
		// Aqui termina o código da primeira partida.
		// Faça o código para a criação do objeto p2 representando a segunda partida.
		
		// ....
		
		leitor.close();
	}

}