package jogo.pessoas;

public class Juiz {
	private String nome;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Juiz(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}
}
