package aula03;

public class TesteTypecast {

	public static void main(String[] args) {
		
		// Se tivermos um dado int,
		// podemos converter ele para um float
		// ou double diretamente.
		
		int i = 10;
		float f = i;
		double d = i;
		
		System.out.println(i);
		
		// O formato de impressao do float e do double
		// que possuem um ponto separando a parte
		// interna da fracionaria.
		
		System.out.println(f);
		System.out.println(d);

	}

}
