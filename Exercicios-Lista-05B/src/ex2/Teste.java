package ex2;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		// OBJETO c1
		System.out.println("---------------------------");
		System.out.println("Informe os dados do carro 1");

		Motor m1 = new Motor();

		System.out.print("Quantos cilindros tem o motor? ");
		m1.numeroCilindros = Integer.parseInt(leitor.nextLine());

		System.out.print("Qual a potência do motor? ");
		m1.potencia = Double.parseDouble(leitor.nextLine());

		System.out.print("Qual o tamanho da roda? ");
		int t1 = Integer.parseInt(leitor.nextLine());

		Roda rde1 = new Roda();
		rde1.tamanho = t1;

		Roda rdd1 = new Roda();
		rdd1.tamanho = t1;

		Roda rte1 = new Roda();
		rte1.tamanho = t1;

		Roda rtd1 = new Roda();
		rtd1.tamanho = t1;

		Carro c1 = new Carro();
		c1.motor = m1;
		c1.rodaDD = rdd1;
		c1.rodaDE = rde1;
		c1.rodaTD = rtd1;
		c1.rodaTE = rte1;





		// OBJETO c2
		System.out.println("---------------------------");
		System.out.println("Informe os dados do carro 2");

		Motor m2 = new Motor();

		System.out.print("Quantos cilindros tem o motor? ");
		m2.numeroCilindros = Integer.parseInt(leitor.nextLine());

		System.out.print("Qual a potência do motor? ");
		m2.potencia = Double.parseDouble(leitor.nextLine());

		System.out.print("Qual o tamanho da roda? ");
		int t2 = Integer.parseInt(leitor.nextLine());

		Roda rde2 = new Roda();
		rde2.tamanho = t2;

		Roda rdd2 = new Roda();
		rdd2.tamanho = t2;

		Roda rte2 = new Roda();
		rte2.tamanho = t2;

		Roda rtd2 = new Roda();
		rtd2.tamanho = t2;

		Carro c2 = new Carro();
		c2.motor = m2;
		c2.rodaDD = rdd2;
		c2.rodaDE = rde2;
		c2.rodaTD = rtd2;
		c2.rodaTE = rte2;



		// OBJETO c3
		System.out.println("---------------------------");
		System.out.println("Informe os dados do carro 3");

		Motor m3 = new Motor();

		System.out.print("Quantos cilindros tem o motor? ");
		m3.numeroCilindros = Integer.parseInt(leitor.nextLine());

		System.out.print("Qual a potência do motor? ");
		m3.potencia = Double.parseDouble(leitor.nextLine());

		System.out.print("Qual o tamanho da roda? ");
		int t3 = Integer.parseInt(leitor.nextLine());

		Roda rde3 = new Roda();
		rde3.tamanho = t3;

		Roda rdd3 = new Roda();
		rdd3.tamanho = t3;

		Roda rte3 = new Roda();
		rte3.tamanho = t3;

		Roda rtd3 = new Roda();
		rtd3.tamanho = t3;

		Carro c3 = new Carro();
		c3.motor = m3;
		c3.rodaDD = rdd3;
		c3.rodaDE = rde3;
		c3.rodaTD = rtd3;
		c3.rodaTE = rte3;

		leitor.close();
	}

}