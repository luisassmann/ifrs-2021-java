package ex3.pessoas;

public class Musico {
	private String nome;
	private String sobrenome;
	private String instrumento;
	
	public Musico(String nome, String sobrenome, String instrumento) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.instrumento = instrumento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getInstrumento() {
		return instrumento;
	}

	public void setInstrumento(String instrumento) {
		this.instrumento = instrumento;
	}
	
	
}
