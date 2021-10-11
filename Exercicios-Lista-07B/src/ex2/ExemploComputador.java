package ex2;

import java.util.Scanner;

public class ExemploComputador {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o processador do computador: ");
		String processador = scan.nextLine();
		
		System.out.print("Informe o armazenamento do computador [MB]: ");
		String armazenamento = scan.nextLine();
		
		System.out.print("Informe a memoria do computador [GB]: ");
		String memoria = scan.nextLine();
		
		
		Computador pc1 = new Computador();
		
		Computador pc2 = new Computador(processador, armazenamento, memoria);
		
		System.out.println("Specs de um computador padrao: ");
		System.out.println("Processador: "+pc1.processador);
		System.out.println("Armazenamento: "+pc1.armazenamento);
		System.out.println("Memoria: "+pc1.memoria);
		
		System.out.println("Specs do computador informado: ");
		System.out.println("Processador: "+pc2.processador);
		System.out.println("Armazenamento: "+pc2.armazenamento);
		System.out.println("Memoria: "+pc2.memoria);
		
		scan.close();

	}

}
