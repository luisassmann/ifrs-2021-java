package exemplos;

public class TesteMath {

	public static void main(String[] args) {
		
		// Usar os métodos da classe Math;
		
		double n1 = Math.sqrt(900);
		System.out.println("Raiz quadrada de 900 é " + n1);
		
		double n2 = Math.pow(2, 3);
		System.out.println("Base 2 na potência 3 é " + n2);
		
		double n3 = Math.ceil(23.3);
		System.out.println("Arrendondamento para cima: " + n3);
		
		double n4 = Math.floor(35.9);
		System.out.println("Arredondamento para baixo: " + n4);
		
		double m1 = Math.min(2.3, 1000);
		System.out.println("Mínimo: " + m1);
		
		double m2 = Math.max(2.3, 1000.1);
		System.out.println("Máximo: " + m2);
		
		double a1 = Math.abs(-10);
		System.out.println("Absoluto: " + a1);
		
		double r1 = Math.round(3.5);
		System.out.println("Arrendondamento: " + r1);

	}

}
