package slidesArrayLists;

import java.util.ArrayList;

public class TesteAddSizeEGet {

	public static void main(String[] args) {
		
		ArrayList<String> itens = new ArrayList<String>();
		
		// Adiciona 'red' na �ltima posi��o;
		itens.add("red");
		
		// Adiciona 'yellow' na primeira posi��o;
		itens.add(0, "yellow");
		
		// Adiciona 'blue' na segunda posi��o;
		itens.add(1, "blue");
		
		// Percorre todos os itens, imprimindo eles na tela;
		for (int i = 0; i < itens.size(); i++) {
			System.out.println(itens.get(i));
		}

	}

}
