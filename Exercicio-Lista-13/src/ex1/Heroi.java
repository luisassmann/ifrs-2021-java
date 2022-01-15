package ex1;

public class Heroi {
	private String nome;
	private String poder;
	private int idade;
	private String nomeUniverso;
	
	public Heroi(String nome, String poder, int idade, String nomeUniverso) {
		super();
		this.nome = nome;
		this.poder = poder;
		this.idade = idade;
		this.nomeUniverso = nomeUniverso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPoder() {
		return poder;
	}

	public void setPoder(String poder) {
		this.poder = poder;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNomeUniverso() {
		return nomeUniverso;
	}

	public void setNomeUniverso(String nomeUniverso) {
		this.nomeUniverso = nomeUniverso;
	}
}
