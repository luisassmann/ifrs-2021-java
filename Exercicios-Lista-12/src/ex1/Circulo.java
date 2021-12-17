package ex1;

public class Circulo extends FiguraGeometrica {
	
	private int raio;
	
	public Circulo(String nome, int raio) {
		super(nome);
		this.raio = raio;
	}

	public int getRaio() {
		return raio;
	}

	public void setRaio(int raio) {
		this.raio = raio;
	}

	@Override
	public double calculaPerimetro() {
		return 2*Math.PI*this.raio;
	}

	@Override
	public double calculaArea() {
		return Math.PI*(Math.pow(this.raio, 2));
	}

	
	
}
