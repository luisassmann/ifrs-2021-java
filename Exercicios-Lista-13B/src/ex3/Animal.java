package ex3;

abstract public class Animal {
	private String nomeCientifico;
	private String filo;
	
	public Animal(String nomeCientifico, String filo) {
		super();
		this.nomeCientifico = nomeCientifico;
		this.filo = filo;
	}

	public void imprimir() {
		System.out.println("Nome científico: " + this.nomeCientifico);
		System.out.println("Filo: " + this.filo);
	}
	
	public String getNomeCientifico() {
		return nomeCientifico;
	}
	public void setNomeCientifico(String nomeCientifico) {
		this.nomeCientifico = nomeCientifico;
	}
	public String getFilo() {
		return filo;
	}
	public void setFilo(String filo) {
		this.filo = filo;
	}
	
	
}
