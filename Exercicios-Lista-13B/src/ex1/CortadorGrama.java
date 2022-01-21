package ex1;

public class CortadorGrama extends Maquina {
	public String codigo;
	
	public CortadorGrama(String codigo) {
		this.codigo = codigo;
	}
	
	@Override
	public void ligar() {
		System.out.printf("A máquina <%s> foi ligada.\n", this.codigo);
	}

	@Override
	public void desligar() {
		System.out.printf("A máquina <%s> foi desligada.\n", this.codigo);
	}
	
}
