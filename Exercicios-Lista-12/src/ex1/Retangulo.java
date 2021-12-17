package ex1;

public class Retangulo extends FiguraGeometrica {
	
	private int ladoA;
	private int ladoB;
	
	public Retangulo(String nome, int ladoA, int ladoB) {
		super(nome);
		this.ladoA = ladoA;
		this.ladoB = ladoB;
	}
	
	public int getLadoA() {
		return ladoA;
	}
	public void setLadoA(int ladoA) {
		this.ladoA = ladoA;
	}
	public int getLadoB() {
		return ladoB;
	}
	public void setLadoB(int ladoB) {
		this.ladoB = ladoB;
	}



	@Override
	public double calculaPerimetro() {
		return (this.ladoA*2) + (this.ladoB*2);
	}



	@Override
	public double calculaArea() {
		return ladoA * ladoB;
	}
	
	
}
