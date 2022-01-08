package ex2;

public class Caminhao extends Veiculo {
	private int capCacamba; // capacidade da caçamba em metros cúbicos.

	public Caminhao(String marca, String modelo, int capCacamba) {
		super(marca, modelo);
		this.capCacamba = capCacamba;
	}
	
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("Capacidade da caçamba: " + this.capCacamba + " m3.\n\n");
	}

	public int getCapCacamba() {
		return capCacamba;
	}

	public void setCapCacamba(int capCacamba) {
		this.capCacamba = capCacamba;
	}
	
}
