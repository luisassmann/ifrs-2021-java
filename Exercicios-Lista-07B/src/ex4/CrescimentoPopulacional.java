package ex4;

public class CrescimentoPopulacional {
	private double populacaoA;
	private double populacaoB;
	private double taxaA;
	private double taxaB;
	
	public CrescimentoPopulacional(double populacaoA, double populacaoB, double taxaA, double taxaB) {
		this.populacaoA = populacaoA;
		this.populacaoB = populacaoB;
		this.taxaA = taxaA;
		this.taxaB = taxaB;
	}
	
	public double getPopulacaoA() {
		return populacaoA;
	}
	
	public void setPopulacaoA(double populacaoA) {
		this.populacaoA = populacaoA;
	}
	
	public double getPopulacaoB() {
		return populacaoB;
	}
	
	public void setPopulacaoB(double populacaoB) {
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
