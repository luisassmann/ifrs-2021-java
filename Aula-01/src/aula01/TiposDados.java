package aula01;

public class TiposDados {

	public static void main(String[] args) {
		// Variáveis são posições na memória do computador
		// Que podem armazenar dados. Variáveis possuem nome,
		// tipo, tamanho e valor.
		
		// byte (8 bits), short (16), int (32), long (64).
		byte b1 = 127;
		short s1 = 200;
		int i1 = 50;
		long l1 = 10000;
		
		b1 = (byte)(b1 + 1);
		
		System.out.println(b1);
		System.out.println(s1);
		System.out.println(i1);
		System.out.println(l1);
		System.out.println("---------------------");
		System.out.println("Min Byte: "+ Byte.MIN_VALUE);
		System.out.println("Max Byte: "+ Byte.MAX_VALUE);
		
		float f1 = 10.6f; // 32 bits
		double d1 = 123.45; // 64 bits
		
		System.out.println("---------------------");
		System.out.println(f1);
		System.out.println(d1);
		
		char c1 = 'a'; // um único caractere, aspas simples -> '';
		boolean bool1 = true;
		
		System.out.println("---------------------");
		System.out.println(c1);
		System.out.println(bool1);
	}

}
