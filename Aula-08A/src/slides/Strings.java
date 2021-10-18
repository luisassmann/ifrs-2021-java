package slides;

public class Strings {
	
	public static void main(String[] args) {
		
		// String eh uma sequencia de caracteres imutaveis;
		// Maneiras para criar uma String:
		
		String cidade = "Feliz";
		
		String estado = new String(" RS ");
		
		char letrasPais[] = {'B', 'r', 'a', 's', 'i', 'l'};
		String pais = new String(letrasPais);
		
		System.out.println(cidade + estado + pais);
	}
}
