package ex3;

public class CrescimentoPopulacional {
	private double populacaoA;
	private double populacaoB;
	private double taxaA;
	private double taxaB;
	
	public double getPopulacaoA() {
		return populacaoA;
	}
	
	public void setPopulacaoA(int populacaoA) {
		this.populacaoA = populacaoA;
	}
	
	public double getPopulacaoB() {
		return populacaoB;
	}
	
	public void setPopulacaoB(int populacaoB) {
		this.populacaoB = populacaoB;
	}
	
	public double getTaxaA() {
		return taxaA;
	}
	
	public void setTaxaA(double taxaA) {
		this.taxaA = taxaA;
	}
	
	public double getTaxaB() {
		return taxaB;
	}
	
	public void setTaxaB(double taxaB) {
		this.taxaB = taxaB;
	}
	
	// retorna o no. de anos para
	// que a pop. de A seja maior que B;
	public int calculaAnos() {
		if (populacaoA >= populacaoB) {
			return 0;
		} else if (taxaA <= taxaB) {
			return 0;
		}
		
		int anos;
		for (anos = 0; populacaoA<=populacaoB; anos++) {
			populacaoA = populacaoA * taxaA;
			populacaoB = populacaoB * taxaB;
		}
		
		return anos;
	}
	
}
