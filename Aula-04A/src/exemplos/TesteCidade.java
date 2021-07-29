package exemplos;

import java.util.Scanner;

public class TesteCidade {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		Cidade c1 = new Cidade();
		
		
		System.out.print("Cidade: ");
		c1.nome = leitor.nextLine();
		
		System.out.print("Habitantes: ");
		c1.habitantes = Integer.parseInt(leitor.nextLine());
		
		System.out.print("PIB: R$");
		c1.pib = Double.parseDouble(leitor.nextLine());
		
		System.out.print("Estado: ");
		c1.estado = leitor.nextLine();
		
		System.out.print("País: ");
		c1.pais = leitor.nextLine();
		
		leitor.close();
		
		
		System.out.println();
		c1.informacoes();
		c1.pibPerCapita();
	}

}
