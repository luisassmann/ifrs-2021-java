package ex2;

public class Veiculo {
	private String marca;
	private String modelo;
	
	public Veiculo(String marca, String modelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
	}

	public void imprimirDados() {
		System.out.println("Marca: " + this.marca + ".");
		System.out.println("Modelo: " + this.modelo + ".");
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

}
