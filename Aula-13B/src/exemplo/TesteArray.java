package exemplo;

import java.util.ArrayList;

public class TesteArray {

	public static void main(String[] args) {
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		for (int i=0; i <= 10; i++) {
			numeros.add(i);
		}
		
		for ( int numero : numeros ) {
			System.out.print(numero + " ");
		}

	}

}
