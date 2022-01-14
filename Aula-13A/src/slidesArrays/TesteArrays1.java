package slidesArrays;

import java.util.Arrays;

public class TesteArrays1 {
	
	public static void main(String[] args) {
		
		double[] doubleArray = {8.4, 9.3, 0.2, 7.9, 3.4};
		Arrays.sort(doubleArray);
		for ( double valor : doubleArray ) {
			System.out.print(valor+" ");
		}
		
		System.out.println();
		
		String[] stringArray = {"Maria","Lucas","Marcelo","Antonio"};
		Arrays.sort(stringArray);
		for ( String valor : stringArray ) {
			System.out.print(valor+" ");
		}
		
	}
	
}
