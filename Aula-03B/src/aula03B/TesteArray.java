package aula03B;

public class TesteArray {

	public static void main(String[] args) {
		// Um array e um grupo de variaveis
		// do mesmo tipo que sao referenciadas
		// por um mesmo nome.
		
		// Declarcao do vetor com valores iniciais:
		int[] valores = { 44,12,23,12,17,81,4,9 }; // Cria um array com vetores iniciais;
		
		// Usando alguns elementos do vetor:
		System.out.println(valores[0]);
		
		// Podemos modificar valores conforme a necessidade:
		valores[0] = 666;
		System.out.println(valores[0]);
	}

}
