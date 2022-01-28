package ex1;

public class Banda {
	private String nomeBanda;
	private Musico vocalista;
	private Musico baterista;
	private Musico guitarrista;
	
	public Banda(String nomeBanda, Musico vocalista, Musico baterista, Musico guitarrista) {
		super();
		this.nomeBanda = nomeBanda;
		this.vocalista = vocalista;
		this.baterista = baterista;
		this.guitarrista = guitarrista;
	}

	public String getNomeBanda() {
		return nomeBanda;
	}

	public void setNomeBanda(String nomeBanda) {
		this.nomeBanda = nomeBanda;
	}

	public Musico getVocalista() {
		return vocalista;
	}

	public void setVocalista(Musico vocalista) {
		this.vocalista = vocalista;
	}

	public Musico getBaterista() {
		return baterista;
	}

	public void setBaterista(Musico baterista) {
		this.baterista = baterista;
	}

	public Musico getGuitarrista() {
		return guitarrista;
	}

	public void setGuitarrista(Musico guitarrista) {
		this.guitarrista = guitarrista;
	}
}
