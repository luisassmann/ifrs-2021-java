package slidesArrayLists;

import java.util.ArrayList;

public class TesteRemove {

	public static void main(String[] args) {
		
		ArrayList<String> itens = new ArrayList<String>();
		itens.add("red");
		itens.add("yellow");
		itens.add("blue");
		itens.add("white");
		
		// Podemos remover o item tanto pelo índice
		// como pelo objeto.
		itens.remove(1);
		itens.remove("blue");
		
		for (int i=0; i < itens.size(); i++) {
			System.out.println(itens.get(i));
		}

	}

}
