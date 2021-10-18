package slides;

public class TesteFormatNumero {

	public static void main(String[] args) {
		
		// utilizando o format para formatacao de numeros
		
		String t1 = String.format("%-15s %-15s", "Coluna 1", "Coluna 2");
		String t2 = String.format("%-15.3f %-15.8f", 666.23429837482, 9.99);
		
		System.out.println(t1);
		System.out.println(t2);
	}

}
