package exemplos;

public class Gato extends Bicho {
	
	private String bigode;
	
	public void imprimir() {
		super.imprimir();
		System.out.println("Bigode: " + this.bigode);
	}
	
	public Gato(String nome, String bigode) {
		super(nome);
		this.bigode = bigode;
	}

	public String getBigode() {
		return bigode;
	}

	public void setBigode(String bigode) {
		this.bigode = bigode;
	}
	
}
