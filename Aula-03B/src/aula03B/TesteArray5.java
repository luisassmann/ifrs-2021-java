package aula03B;

public class TesteArray5 {

	public static void main(String[] args) {
		// Percorrendo array's como o while;
		
		int[] valores = new int[3];
		valores[0] = 100;
		valores[1] = 200;
		valores[2] = 300;
		
		int i=0;
		while(i < valores.length) {
			System.out.println(valores[i]);
			i++;
		}

	}

}
