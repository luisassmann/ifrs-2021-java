package ex1;

public class FoneOuvido {
	private String modelo;
	private Fabricante fabricante;
	
	public FoneOuvido(String modelo, Fabricante fabricante) {
		super();
		this.modelo = modelo;
		this.fabricante = fabricante;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public Fabricante getFabricante() {
		return fabricante;
	}
	
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	
	
}
