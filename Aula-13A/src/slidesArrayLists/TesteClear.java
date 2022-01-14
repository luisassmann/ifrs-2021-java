package slidesArrayLists;

import java.util.ArrayList;

public class TesteClear {

	public static void main(String[] args) {
		
		ArrayList<String> itens = new ArrayList<String>();
		itens.add("red");
		itens.add("yellow");
		itens.add("blue");
		
		itens.clear();
		System.out.println(itens.size());

	}

}
