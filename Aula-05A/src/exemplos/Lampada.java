package exemplos;

public class Lampada {
	
	public boolean estadoDaLâmpada;
	
	
	public void acende() {
		this.estadoDaLâmpada = true;
	}
	
	public void apaga() {
		this.estadoDaLâmpada = false;
	}
	
	public void mostraEstado() {
		if (this.estadoDaLâmpada == true) {
			System.out.println("Lampada acesa.");
		} else {
			System.out.println("Lampada apagada.");
		}
	}
}
