package ex3;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Area a ser pintada [m2]: ");
		double areaPintura = leitor.nextDouble();
		
		// Pintura cobre 1 litro para cada 3 m2;
		// A tinta é vendida em latas de 10 litros;
		// A lata custa R$50,00;
		int latas = 0;
		
		while (areaPintura > 0) {
			areaPintura -= 10;
			latas += 1;
		}
		
		double custoTotal = latas * 50;
		System.out.printf("Serao necessarias %d latas, e custara R$%.2f.\n",
				latas,
				custoTotal);
		
		leitor.close();
	}

}
