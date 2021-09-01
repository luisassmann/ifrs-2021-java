package ex5;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		// OBJETO c1
		System.out.println("---------------------------");
		System.out.println("Informe os dados do curso 1");


		// Curso 1
		Curso c1 = new Curso();
		System.out.print("Qual o nome do curso? ");
		c1.nome = leitor.nextLine();
		
		Disciplina d1 = new Disciplina();
		System.out.print("Qual o nome da primeira disciplina? ");
		d1.nome = leitor.nextLine();
		
		Professor pd1 = new Professor();
		System.out.print("Qual o nome do professor da primeira disciplina? ");
		pd1.nome = leitor.nextLine();
		
		d1.professor = pd1;
		
		Disciplina d2 = new Disciplina();
		System.out.print("Qual o nome da segunda disciplina? ");
		d2.nome = leitor.nextLine();
		
		Professor pd2 = new Professor();
		System.out.print("Qual o nome do professor da segunda disciplina? ");
		pd2.nome = leitor.nextLine();
		
		d2.professor = pd2;
		
		c1.disciplina1 = d1;
		c1.disciplina2 = d2;
		
		// Aqui termina o código de c1 (primeiro objeto Curso)
		// Crie abaixo o código para c2 (outro objeto representando um Curso).
		
		Curso c2 = new Curso();
		System.out.print("Qual o nome do curso? ");
		c2.nome = leitor.nextLine();
		
		Disciplina d4 = new Disciplina();
		System.out.print("Qual o nome da primeira disciplina? ");
		d4.nome = leitor.nextLine();
		
		Professor pd4 = new Professor();
		System.out.print("Qual o nome do professor da primeira disciplina? ");
		pd4.nome = leitor.nextLine();
		
		d4.professor = pd4;
		
		Disciplina d3 = new Disciplina();
		System.out.print("Qual o nome da segunda disciplina? ");
		d3.nome = leitor.nextLine();
		
		Professor pd3 = new Professor();
		System.out.print("Qual o nome do professor da segunda disciplina? ");
		pd3.nome = leitor.nextLine();
		
		d3.professor = pd3;
		
		c2.disciplina1 = d1;
		c2.disciplina2 = d2;
		
		leitor.close();
	}

}