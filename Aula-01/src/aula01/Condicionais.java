package aula01;

public class Condicionais {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 10;
		int z = 15;
		
		if (z == 5) {
			System.out.println("Z é igual a 5.");
		}
		
		if (z != 10) {
			System.out.println("Z é diferente de 10.");
		}
		
		if (x == y) {
			System.out.println("X e Y são iguais.");
		}
		
		if (y == z) {
			System.out.println("Y é igual a Z.");
		} else 
			if (y > z) {
				System.out.println("Y é maior que Z.");
			} else {
				System.out.println("Y é menor que Z.");
			}

	}

}
