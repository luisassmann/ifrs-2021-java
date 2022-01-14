package exemplo;

import java.util.ArrayList;
import java.util.Scanner;

public class Exemplo02 {

	public static void main(String[] args) {
		
		ArrayList<String> cidades = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		
		String c=null;
		do {
			System.out.print("Informe o nome de uma cidade: ");
			c = scan.nextLine();
			
			if (!c.isEmpty()) {
				cidades.add(c);
				System.out.println(c + " foi adicionada.");
			}
			
		} while (!c.isEmpty()); // estrutura somente será parada se `c` estiver vazio;
		
		scan.close();
		
		System.out.println("\nCidades informadas:");
		
		for ( String cidade : cidades ) {
			System.out.println(" - " + cidade);
		}
		
		System.out.println("\nPrograma finalizado.");

	}

}
