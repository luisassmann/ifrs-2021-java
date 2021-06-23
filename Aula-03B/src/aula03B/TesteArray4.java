package aula03B;

public class TesteArray4 {

	public static void main(String[] args) {
		// Percorrendo array's com o for;
		
		int[] valores = new int[3];
		
		valores[0] = 100;
		valores[1] = 200;
		valores[2] = 300;
		
		// Usando o for para percorrer um array;
		for(int i=0; i<valores.length; i++) {
			System.out.println(valores[i]);
		}
	}

}
