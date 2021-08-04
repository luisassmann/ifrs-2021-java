package ex2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		Bicicleta b1 = new Bicicleta();
		
		System.out.print("Informe a marca da bicicleta: ");
		b1.marca = leitor.nextLine();
		System.out.print("Informe o modelo da bicicleta: ");
		b1.modelo = leitor.nextLine();
		System.out.print("Informe o número de marchas: ");
		b1.marchas = Integer.parseInt(leitor.nextLine());
		
		leitor.close();
		
		
		b1.imprimirInformacoes();
	}

}
