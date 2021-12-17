package exemplos2;

public class Caneta extends Produto {
	
	private String cor;
	
	public Caneta(int codigo, String cor) {
		super(codigo);
		this.cor = cor;
	}
	
	@Override
	public void imprimir() {
		System.out.println("\n-----------------------");
		System.out.println("Caneta");
		System.out.println("  - Código: " + this.getCodigo());
		System.out.println("  - Cor: " + this.cor);
		System.out.println("-----------------------");
	}
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

}
