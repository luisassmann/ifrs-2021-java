package aula;

public class ContaPoupanca extends Conta {

	public double taxaJuros;
	
	public void atualizaSaldo() {
		saldo = saldo * taxaJuros;
	}
}
