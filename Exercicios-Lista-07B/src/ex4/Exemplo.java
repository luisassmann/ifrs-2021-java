package ex4;

import java.util.Scanner;

public class Exemplo {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Populacao A: ");
		double populacaoA = Double.parseDouble(scan.nextLine());
		System.out.print("Populacao B: ");
		double populacaoB = Double.parseDouble(scan.nextLine());
		
		System.out.print("Taxa Cresc. A: ");
		double taxaA = Double.parseDouble(scan.nextLine());
		System.out.print("Taxa Cresc. B: ");
		double taxaB = Double.parseDouble(scan.nextLine());
		
		CrescimentoPopulacional cr = new CrescimentoPopulacional(populacaoA, populacaoB, taxaA, taxaB);
		
		int anos = cr.calculaAnos();
		
		if (anos == 0) {
			if (cr.getPopulacaoA() > cr.getPopulacaoB()) {
				System.out.println("A populacao A ja passou a B.");
			} else {
				System.out.println("A populacao A nao ira passar a B.");
			}
		} else {
			System.out.printf("Serao necessarios %d anos para a populacao A ser maior que a B.\n", anos);
		}
		
		scan.close();

	}

}
