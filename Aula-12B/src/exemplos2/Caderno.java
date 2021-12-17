package exemplos2;

public class Caderno extends Produto {

	private int numPaginas;
	private String marca;
	
	public Caderno(int codigo, int numPaginas, String marca) {
		super(codigo);
		this.numPaginas = numPaginas;
		this.marca = marca;
	}
	
	@Override
	public void imprimir() {
		System.out.println("\n-----------------------");
		System.out.println("Caderno");
		System.out.println("  - Código: " + this.getCodigo());
		System.out.println("  - N° de páginas: " + this.numPaginas);
		System.out.println("  - Marca: " + this.marca);
		System.out.println("-----------------------");
	}
	
	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
}
