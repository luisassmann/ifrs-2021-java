package slides;

public class TesteFormat {
	public static void main(String[] args) {
		
		// Formatacoes de String usando o format
		
		// formatacao de string a direita
		String t1 = String.format("%15s %15s %15s", "Coluna 1", "Coluna 2", "Coluna 3");
		String t2 = String.format("%15s %15s %15s", "Hello", "World", "Again");
		
		System.out.println(t1);
		System.out.println(t2);
		
		// formatacao de string a esquerda
		String t3 = String.format("%-15s %-15s %-15s", "Coluna 1", "Coluna 2", "Coluna 3");
		String t4 = String.format("%-15s %-15s %-15s", "Hello", "World", "Again");
		
		System.out.println(t3);
		System.out.println(t4);
	}
}
