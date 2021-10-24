package ex1;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// Input
		System.out.print("Lado 1 do retangulo [m]: ");
		double lado1 = Double.parseDouble(scan.nextLine());
		
		System.out.print("Lado 2 do retangulo [m]: ");
		double lado2 = Double.parseDouble(scan.nextLine());
		
		// Creating object
		Retangulo r1 = new Retangulo(lado1, lado2);
		
		double area = r1.calcArea();
		double perimetro = r1.calcPerimetro();
		
		// Output
		System.out.printf("Area do retangulo: %.2f m2\n", area);
		System.out.printf("Perimetro do retangulo: %.2f m\n", perimetro);
		
		scan.close();

	}

}
