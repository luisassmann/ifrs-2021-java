package exemplos;

public class Bicho {

	private String nome;
	
	public void imprimir() {
		System.out.println("\nNome: " + this.nome);
	}

	public Bicho(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
