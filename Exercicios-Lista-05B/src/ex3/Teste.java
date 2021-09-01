package ex3;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		// OBJETO f1
		System.out.println("---------------------------");
		System.out.println("Informe os dados do filme 1");

		Filme f1 = new Filme();
		System.out.print("Qual o nome do filme? ");
		f1.nome = leitor.nextLine();

		Diretor d1 = new Diretor();
		System.out.print("Qual o nome do diretor? ");
		d1.nome = leitor.nextLine();
		System.out.print("Qual o sobrenome do diretor? ");
		d1.sobrenome = leitor.nextLine();
		System.out.print("Quantos prêmios o diretor possui? ");
		d1.numeroPremios = Integer.parseInt(leitor.nextLine());

		Cidade c1 = new Cidade();
		System.out.print("Qual o nome da cidade? ");
		c1.nome = leitor.nextLine();
		System.out.print("Qual o nome do estado? ");
		c1.estado = leitor.nextLine();
		System.out.print("Qual o nome do pais? ");
		c1.pais = leitor.nextLine();
		System.out.print("Quantos habitantes a cidade possui? ");
		c1.numeroHabitantes = Integer.parseInt(leitor.nextLine());

		f1.diretor = d1;
		f1.cidade = c1;





		// OBJETO f2
		System.out.println("---------------------------");
		System.out.println("Informe os dados do filme 2");

		Filme f2 = new Filme();
		System.out.print("Qual o nome do filme? ");
		f2.nome = leitor.nextLine();

		Diretor d2 = new Diretor();
		System.out.print("Qual o nome do diretor? ");
		d2.nome = leitor.nextLine();
		System.out.print("Qual o sobrenome do diretor? ");
		d2.sobrenome = leitor.nextLine();
		System.out.print("Quantos prêmios o diretor possui? ");
		d2.numeroPremios = Integer.parseInt(leitor.nextLine());

		Cidade c2 = new Cidade();
		System.out.print("Qual o nome da cidade? ");
		c2.nome = leitor.nextLine();
		System.out.print("Qual o nome do estado? ");
		c2.estado = leitor.nextLine();
		System.out.print("Qual o nome do pais? ");
		c2.pais = leitor.nextLine();
		System.out.print("Quantos habitantes a cidade possui? ");
		c2.numeroHabitantes = Integer.parseInt(leitor.nextLine());

		f2.diretor = d2;
		f2.cidade = c2;



		// OBJETO f3
		System.out.println("---------------------------");
		System.out.println("Informe os dados do filme 3");

		Filme f3 = new Filme();
		System.out.print("Qual o nome do filme? ");
		f3.nome = leitor.nextLine();

		Diretor d3 = new Diretor();
		System.out.print("Qual o nome do diretor? ");
		d3.nome = leitor.nextLine();
		System.out.print("Qual o sobrenome do diretor? ");
		d3.sobrenome = leitor.nextLine();
		System.out.print("Quantos prêmios o diretor possui? ");
		d3.numeroPremios = Integer.parseInt(leitor.nextLine());

		Cidade c3 = new Cidade();
		System.out.print("Qual o nome da cidade? ");
		c3.nome = leitor.nextLine();
		System.out.print("Qual o nome do estado? ");
		c3.estado = leitor.nextLine();
		System.out.print("Qual o nome do pais? ");
		c3.pais = leitor.nextLine();
		System.out.print("Quantos habitantes a cidade possui? ");
		c3.numeroHabitantes = Integer.parseInt(leitor.nextLine());

		f3.diretor = d3;
		f3.cidade = c3;

		
		
		leitor.close();
	}

}