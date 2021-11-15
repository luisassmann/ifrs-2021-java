package slides;

public class Conta {
	private String correntista;
	private double saldo;
	
	public void depositar(double quantia) {
		this.saldo += quantia;
	}
	
	public void retirar(double quantia) {
		this.saldo -= quantia;
	}
	
	public double obterSaldo() {
		return this.saldo;
	}

	public String getCorrentista() {
		return correntista;
	}

	public void setCorrentista(String correntista) {
		this.correntista = correntista;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}
