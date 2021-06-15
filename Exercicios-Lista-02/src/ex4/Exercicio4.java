package ex4;

public class Exercicio4 {

	public static void main(String[] args) {
		// Sequencia de Fibonacci;
		
		int proximo = 0, atual = 0, anterior = 1;
		
		System.out.print("Sequencia de Fibonacci\n0, ");
		
		while (proximo <= 500) {
			proximo = atual + anterior;
			
			System.out.printf("%d, ", proximo);
			
			anterior = atual;
			atual = proximo;
		}

	}

}
