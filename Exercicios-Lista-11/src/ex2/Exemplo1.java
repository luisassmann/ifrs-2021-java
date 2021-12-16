package ex2;

import java.util.Scanner;

public class Exemplo1 {
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Camiseta");
		System.out.print("Nome: ");
		String nomeCam = scan.nextLine();
		
		System.out.print("Valor: ");
		double valorCam = Double.parseDouble(scan.nextLine());
		
		System.out.print("Tamanho: ");
		String tamCam = scan.nextLine();
		
		Camiseta camiseta = new Camiseta(nomeCam, valorCam, tamCam);
		
		
		System.out.println("\nSapato");
		System.out.print("Nome: ");
		String nomeSap = scan.nextLine();
		
		System.out.print("Valor: ");
		double valorSap = Double.parseDouble(scan.nextLine());
		
		System.out.print("Marca: ");
		String marcaSap = scan.nextLine();
		
		
		Sapato sapato = new Sapato(nomeSap, valorSap, marcaSap);
		
		scan.close();
		
		
		Comprador c = new Comprador();
		c.consulta(sapato);
		c.consulta(camiseta);
		
	}
}
