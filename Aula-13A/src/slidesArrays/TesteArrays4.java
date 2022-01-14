package slidesArrays;

import java.util.Arrays;

public class TesteArrays4 {

	public static void main(String[] args) {
		
		int[] intArray = {1,2,5,67,800,2112};
		
		// Faz uma busca por um elemento e retorna o 
		// �ndice do elemento no Array. Se o elemento
		// n�o estiver no Array, retorna um valor negativo.
		// Importante: O Array deve estar ordenado!
		int posicao1 = Arrays.binarySearch(intArray, 80);
		
		if (posicao1 >= 0)
			System.out.println("80 encontrado na posi��o " + posicao1 + ".");
		else
			System.out.println("80 n�o encontrado.");
		
		int posicao2 = Arrays.binarySearch(intArray, 800);
		
		if (posicao2 >= 0)
			System.out.println("80 encontrado na posi��o " + posicao2 + ".");
		else
			System.out.println("80 n�o encontrado.");

	}

}
