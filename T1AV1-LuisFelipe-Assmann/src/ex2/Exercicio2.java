package ex2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Informe x: ");
		double x = leitor.nextDouble();
		System.out.print("Informe y: ");
		double y = leitor.nextDouble();
		
		if ((x >= 0 && y >= 0) &&
			((x*x + y*y) <= 1))
		{
			System.out.println("O ponto real ("+x+", "+y+") pertence a H.");
		} else {
			System.out.println("O ponto real ("+x+", "+y+") n�o pertence a H.");
		}
		
		leitor.close();

	}

}
