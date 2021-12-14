package ex2;

public class Camiseta extends Produto {
	
	private String tamanho;
	
	
	public Camiseta(String nome, double valor, String tamanho) {
		super(nome, valor);
		this.tamanho = tamanho;
	}

	public void imprimir() {
		super.imprimir();
		System.out.println("Tamanho: "+this.tamanho);
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	
}
