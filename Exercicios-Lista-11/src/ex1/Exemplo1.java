package ex1;

import java.util.Scanner;

public class Exemplo1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Monitor");
		System.out.print("Fabricante: ");
		String fabMon = scan.nextLine();
		
		System.out.print("Modelo: ");
		String modeloMon = scan.nextLine();
		
		System.out.print("Resolução: ");
		String resMon = scan.nextLine();

		
		
		System.out.println("\nDisco Rigido");
		System.out.print("Fabricante: ");
		String fabDisk = scan.nextLine();
		
		System.out.print("Modelo: ");
		String modeloDisk = scan.nextLine();
		
		System.out.print("Capacidade: ");
		int capDisk = Integer.parseInt(scan.nextLine());
		
		scan.close();
		
		Monitor monitor = new Monitor(fabMon, modeloMon, resMon);
		DiscoRigido discoRigido = new DiscoRigido(fabDisk, modeloDisk, capDisk);
		
		System.out.println("\nModelo do monitor: " + monitor.getModelo());
		System.out.println("Capacidade do disco rigido: " + discoRigido.getCapacidade());
	}

}
