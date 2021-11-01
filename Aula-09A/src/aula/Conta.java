package aula;

public class Conta {
	
	public String correntista;
	public double saldo;
	
	public void retirar(double quantia) {
		saldo = saldo - quantia;
	}
	
	public void depositar(double quantia) {
		saldo = saldo + quantia;
	}
	
	public double obterSaldo() {
		return saldo;
	}
}
