package slides;

public class ContaPoupanca extends Conta {
	private double taxaJuros;
	
	public void atualizaSaldo() {
		double p = 1 + (taxaJuros / 100);
		this.setSaldo((this.getSaldo() * p));
	}

	public double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	
	
}
