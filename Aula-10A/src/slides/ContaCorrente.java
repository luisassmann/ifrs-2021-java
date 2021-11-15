package slides;

public class ContaCorrente extends Conta {
	private double limite;
	
	public void cancelarLimite() {
		this.limite = 0;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

}
