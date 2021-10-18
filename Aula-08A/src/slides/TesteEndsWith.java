package slides;

public class TesteEndsWith {

	public static void main(String[] args) {
		
		// Com o startsWith / endsWith podemos verificar se uma 
		// String comeca / termina com uma determinada substring. 
		
		// Estes métodos retornam true ou false.
		
		String cidade = "IFRS-Campus-Feliz";
		
		System.out.println(cidade.endsWith("eliz"));
		System.out.println(cidade.endsWith("Fel"));
		System.out.println(cidade.startsWith("IFRS-Cam"));
		System.out.println(cidade.startsWith("RS-Campus"));
		System.out.println(cidade.startsWith("Campus", 5));
	}

}
