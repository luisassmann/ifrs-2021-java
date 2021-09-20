package ex3;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		CrescimentoPopulacional cp = new CrescimentoPopulacional();
		
		cp.setPopulacaoA(1500000);
		cp.setPopulacaoB(2800000);
		cp.setTaxaA(1.20); // crescimento de 20% ano;
		cp.setTaxaB(1.10); // crescimento de 10% ano;
		
		int anos = cp.calculaAnos();
		
		System.out.printf("A população da cidade A terá maior população que a cidade B em %d anos.\n", anos);
		
		scan.close();
	}
}
