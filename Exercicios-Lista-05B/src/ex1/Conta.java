package ex1;

public class Conta {
	
	// atributos
	public double saldo;
	
	// métodos
	
	// (a) 
	public void imprimir() {
		System.out.println(this.saldo);
	}
	
	// (b)
	public boolean sacar(double quantia) {
		if(quantia > this.saldo) {
			return false;
		}
		
		this.saldo -= quantia;
		return true;
	}
	
	// (c)
	public boolean transferir(Conta conta, double quantia) {
		if(sacar(quantia)) {
			conta.saldo += quantia;
			return true;
		}
				
		return false;
	}
	
	
}