package ex1;

public class Teste {

	public static void main(String[] args) {
		Conta c1 = new Conta();
		c1.saldo = 1000;
		c1.imprimir();

		if(c1.sacar(500)) {
			System.out.println("Saque realizado com sucesso.");
		} else {
			System.out.println("Saldo insuficiente.");
		}
		c1.imprimir();
		
		if(c1.sacar(600)) {
			System.out.println("Saque realizado com sucesso.");
		} else {
			System.out.println("Saldo insuficiente.");
		}
		c1.imprimir();
		
		
		Conta c2 = new Conta();
		c2.saldo = 0;
		c1.transferir(c2,450);
		
		System.out.println("-----------");
		c1.imprimir();
		c2.imprimir();
		
	}

}