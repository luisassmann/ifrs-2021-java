package aula03;

public class TesteTypecast2 {

	public static void main(String[] args) {
		
		// Se tivermos um dado float ou double
		// podemos converter ele para um int 
		// usando o operador de conversao (int).

		float f = 1.5f;
		double d = 2.7;
		int i1 = (int) f;
		int i2 = (int) d;
		
		System.out.println(f);
		System.out.println(d);
		
		// Os numeros armazenados nas variaveis
		// f e d perderam a parte fracionaria
		// apos o typecast para int.
		
		System.out.println(i1);
		System.out.println(i2);	
	}

}
