package slides;

public class TesteToCharArray {

	public static void main(String[] args) {
		
		// Este metodo converte uma String em um array de char, ou seja, uma 
		// String de 10 caracteres se converterá em um char[] de 10 elementos.

		String cidade = "Feliz";
		char[] cidadeCharArray = cidade.toCharArray();
		
		for (int i = 0; i < cidadeCharArray.length; i++) {
			System.out.println("Caractere: " + cidadeCharArray[i]);
		}
		
		System.out.println();
		
		for (char c : cidadeCharArray) {
			System.out.println("Caractere: " + c);
		}
	}

}
