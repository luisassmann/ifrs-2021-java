
public class Lampada {
	public boolean estadoDaLampada;
	
	public void ascende() {
		this.estadoDaLampada = true;
	}
	
	public void apaga() {
		this.estadoDaLampada = false;
	}
	
	public void mostraEstado() {
		if (this.estadoDaLampada) {
			System.out.println("Lampada acesa.");
		} else {
			System.out.println("Lampada Apagada.");
		}
	}
}
