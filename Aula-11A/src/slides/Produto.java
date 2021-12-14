package slides;

public class Produto {
	
	private int codigo;
	
	public Produto(int codigo) {
		this.codigo = codigo;
	}
	
	public void imprimir() {
		System.out.println("Codigo: " + this.codigo);
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
}
