package exemplos;

public class TesteBreakContinue {

	public static void main(String[] args) {
		
		for (int i=0; i<9; i++) {
			if (i == 5) {
				break;
			}
			System.out.println(i);
		}
		
		System.out.println("Saiu do for!");

	}

}
