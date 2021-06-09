package exemplos;

public class TesteBreakContinue {

	public static void main(String[] args) {
		
		for (int i=0; i<9; i++) {
			if (i == 5) {
				continue; // pula para a próxima interação;
			}
			System.out.print(i + " ");
		}
		
		System.out.println("Saiu do for!");

	}

}
