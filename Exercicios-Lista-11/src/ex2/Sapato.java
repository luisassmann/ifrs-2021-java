package ex2;

public class Sapato extends Produto {

	private String marca;
	
	public Sapato(String nome, double valor, String marca) {
		super(nome, valor);
		this.marca = marca;
	}

	public void imprimir() {
		super.imprimir();
		System.out.println("Marca: "+this.marca);
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
}
