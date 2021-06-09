package exercicios01;

import java.util.Scanner;

public class CarroCombustivel {

	public static void main(String[] args) {
		// Exercicio 6
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Calculador de consumo\n");
		
		System.out.print("Quilometragem inicial do carro: ");
		double kmAntes = leitor.nextDouble();
		
		System.out.print("Quilometragem pós viagem: ");
		double kmDepois = leitor.nextDouble();
		
		System.out.print("Quantidade de gasolina consumido: ");
		double gasolina = leitor.nextDouble();
		
		double distanciaViagem = kmDepois - kmAntes;
		double mediaConsumo = gasolina / distanciaViagem;
		
		System.out.printf("\n\nO carro consumiu %.2f litros por quilômetro.", mediaConsumo);
		leitor.close();
	}

}
