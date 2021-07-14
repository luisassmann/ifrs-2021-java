package exemplos;

public class Teste1 {

	public static void main(String[] args) {
		String nome1 = "Fulano";
		int idade1 = 30;
		
		String nome2 = "Ciclano";
		int idade2 = 23;
		
		String nome3 = "Beltrano";
		int idade3 = 17;
		
		/*
		 * Aqui temos um problema onde a repeticao de codigo torna
		 * o programa desnecessariamente extenso, algo que utilizando-se
		 * de orientacao a objeto poderia ser contornado.
		 */
		
		if (idade1 > 18) {
			System.out.println("Maior");
		}
		
		if (idade2 > 18) {
			System.out.println("Maior");
		}
		
		if (idade3 > 18) {
			System.out.println("Maior");
		}

	}

}
