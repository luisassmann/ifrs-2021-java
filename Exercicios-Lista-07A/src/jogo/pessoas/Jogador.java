package jogo.pessoas;

public class Jogador {
	private String nome;
	
	
	// Source -> Generate Constructor using Fields -> Marcar Atributos
	public Jogador(String nome) {
		super();
		this.nome = nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
}
