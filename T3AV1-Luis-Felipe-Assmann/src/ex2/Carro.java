package ex2;

public class Carro extends Veiculo {
	private int capacPortaMalas; // capacidade do porta malas em Litros;

	public Carro(String marca, String modelo, int capacPortaMalas) {
		super(marca, modelo);
		this.capacPortaMalas = capacPortaMalas;
	}
	
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("Capacidade do porta malas: " + this.capacPortaMalas + " L.\n\n");
	}

	public int getCapacPortaMalas() {
		return capacPortaMalas;
	}

	public void setCapacPortaMalas(int capacPortaMalas) {
		this.capacPortaMalas = capacPortaMalas;
	}
	
}
