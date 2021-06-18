package aula03;

public class TestePercorre {

	public static void main(String[] args) {
		
		// Usando metodos length() e charAt() podemos
		// percorrer todos os caracteres de uma String.
		
		String banda = "Black Sabbath";
		for (int i=0; i < banda.length(); i++) {
			System.out.println(banda.charAt(i));
		}

	}

}
