package slidesArrayLists;

import java.util.ArrayList;

public class TesteAddSizeEGet {

	public static void main(String[] args) {
		
		ArrayList<String> itens = new ArrayList<String>();
		
		// Adiciona 'red' na última posição;
		itens.add("red");
		
		// Adiciona 'yellow' na primeira posição;
		itens.add(0, "yellow");
		
		// Adiciona 'blue' na segunda posição;
		itens.add(1, "blue");
		
		// Percorre todos os itens, imprimindo eles na tela;
		for (int i = 0; i < itens.size(); i++) {
			System.out.println(itens.get(i));
		}

	}

}
