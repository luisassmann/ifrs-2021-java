package ex4;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		System.out.println("-----Calculadora-de-Volume-de-Esfera-----\n");
		
		/*
		 	Programa que calcula o Volume de uma esfera.
		 	Para tal, o usuário informará o raio da esfera.
		 
		 	Levando em conta a fórmula para 
		 	calcular o volume da esfera:
		 			V = 4/3 πr³
		 */
		
		Scanner leitor = new Scanner(System.in);
		double pi = 3.14159; // número π
		
		System.out.print("Digite o raio da esfera: ");
		double raio = leitor.nextDouble();
		
		double volume = (4.0/3.0) * pi * Math.pow(3, raio);
		System.out.printf("O volume da esfera é %.3f", volume);
		
		leitor.close();

	}

}
