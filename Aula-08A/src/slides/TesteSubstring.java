package slides;

public class TesteSubstring {

	public static void main(String[] args) {
		// O método substring retorna uma parte especifica de uma 
		// determinada String delimitada pelo índice dos caracteres 
		// inicial (inclusive) e final (exclusivo).
		
		String teste = "Programacao em Java";
		
		System.out.println(teste.substring(15, teste.length()));
		System.out.println(teste.substring(12, 14));
		System.out.println(teste.substring(0, 11));
	}

}
