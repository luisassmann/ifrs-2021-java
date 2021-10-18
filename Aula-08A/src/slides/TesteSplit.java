package slides;

public class TesteSplit {

	public static void main(String[] args) {
		// O método split cria um array de Strings com base no 
		// “caractere divisor” passado como argumento
		
		String teste = "IFRS-Campus-Feliz";
		String[] testeSplit = teste.split("-");
		
		for (String s : testeSplit) {
			System.out.println(s);
		}
	}

}
