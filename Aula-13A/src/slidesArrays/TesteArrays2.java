package slidesArrays;

import java.util.Arrays;

public class TesteArrays2 {

	public static void main(String[] args) {
		
		int[] intArray = new int[10];
		ArraysEx.fill(intArray, 7);
		
		for ( int valor : intArray ) {
			System.out.print(valor+" ");
		}

	}

}
