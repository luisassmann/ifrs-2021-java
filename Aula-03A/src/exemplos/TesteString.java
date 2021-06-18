package exemplos;

public class TesteString {

	public static void main(String[] args) {
		
		// String e uma classe.
		// String nao e um tipo de dado primitivo como,
		// 
		// Tipo ------- Tamanho (bits)
		//
		// byte.........8
		// short........16
		// int..........32
		// long.........64
		//
		// float........32
		// double.......64
		//
		// char.........16
		// boolean......1
		
		String banda = "Rush";
		System.out.println(banda);
		
		// Imprimir apenas caracteres especificados.
		
		System.out.println(banda.charAt(0));
		System.out.println(banda.charAt(2));
		System.out.println(banda.charAt(3));
		
		// Verificar o tamanho da String.
		
		int tamanho = banda.length();
		System.out.println("A String tem tamanho " + tamanho);
		
		// Percorrer a String.
		
		String cidade = "Feliz";
		for (int i=0; i<cidade.length(); i++) {
			System.out.println(cidade.charAt(i));
		}
		
	}

}
