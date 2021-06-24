package ex2;

import java.util.Random;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random r = new Random();
		
		System.out.print("Vezes a lancar uma moeda: ");
		int xlan = scan.nextInt();
		scan.close();
		
		int[] jogo = new int[xlan];
		int cara = 0;
		int coroa = 0;
		
		for (int i = 0; i < jogo.length; i++) {
			jogo[i] = r.nextInt(2);
			if (jogo[i] == 0) {
				cara += 1;
			} else {
				coroa += 1;
			}
		}
		
		double percCara = (cara * 100) / jogo.length;
		double percCoroa = (coroa * 100) / jogo.length;
		System.out.println("Percentual Cara: " + percCara + "%");
		System.out.println("Percentual Coroa: " + percCoroa + "%");
		
	}

}
