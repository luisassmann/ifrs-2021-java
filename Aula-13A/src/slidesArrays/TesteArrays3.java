package slidesArrays;

import java.util.Arrays;

public class TesteArrays3 {
	
	public static void main(String[] args) {
		
		int[] intArray1 = {7,7,7,7,7};
		int[] intArray2 = {7,7,7,7,7};
		int[] intArray3 = {7,7,7,7};
		int[] intArray4 = {7,7,7,7,7};
		
		// compara��o entre arrays
		boolean c1c2 = Arrays.equals(intArray1, intArray2);
		boolean c1c3 = Arrays.equals(intArray1, intArray3);
		boolean c1c4 = Arrays.equals(intArray1, intArray4);
		
		System.out.println(c1c2);
		System.out.println(c1c3);
		System.out.println(c1c4);
	
	}

}
