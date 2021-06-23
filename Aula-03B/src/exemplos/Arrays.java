package exemplos;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		int[] a1 = {2,4,6,8};
		a1[0] = 1;
		
		for (int i = 0; i < a1.length; i++) {
			System.out.println(a1[i]);
		}
		
		System.out.println("---------------------");
		
		int[] a2 = new int[3];
		
		Scanner leitor = new Scanner(System.in);
		int j = 0;
		while (j < a2.length) {
			System.out.print("Informe um número: ");
			a2[j] = leitor.nextInt();
			System.out.println("O usuário inseriu " + a2[j] + " no array.");
			j++;
		}
		leitor.close();
		
		System.out.println("----------------------");
		String[] nomes = { "Luiz","Amanda","Maria" };
		
		for (int i=0; i<nomes.length; i++) {
			System.out.println(nomes[i]);
		}
	}

}
