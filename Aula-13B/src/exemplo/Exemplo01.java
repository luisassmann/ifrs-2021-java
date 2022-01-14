package exemplo;

import java.util.ArrayList;
// import java.util.Collections;

public class Exemplo01 {

	public static void main(String[] args) {
		
		ArrayList<String> nomes = new ArrayList<String>();
		
		nomes.add("Maria");
		nomes.add("Marcos");
		nomes.add("Valentina");
		nomes.add("Joaquim");
		
		nomes.remove(1);
		
		// Collections.sort(nomes);
		
		for ( String nome : nomes ) {
			System.out.print(nome + " ");
		}

	}

}
