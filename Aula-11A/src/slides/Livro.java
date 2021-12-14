package slides;

public class Livro extends Produto {
	
	private String titulo;
	
	public Livro(int codigo, String titulo) {
		// O super busca o proprio construtor da superclasse
		super(codigo);
		this.titulo = titulo;
	}
	
	public void imprimir() {
		// Busca o método imprimir na superclasse, e executa;
		super.imprimir();
		
		System.out.println("Titulo: " + this.titulo);
	}
	
	public void imprimir(String p) {
		System.out.println(p + " falou " + this.titulo);
	}
	
	public void testar(int i, String a) {
		
	}
	
	public void testar(String a, int i) {
		
	}
	
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
}
