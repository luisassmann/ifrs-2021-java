package exemplos2;

 public abstract class Produto {
	
	private int codigo;
	
	public Produto(int codigo) {
		super();
		this.codigo = codigo;
	}
	
	abstract public void imprimir();

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
}
