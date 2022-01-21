package ex2;

public class Cidade {
	private String nome;
	private String estado;
	private Prefeito prefeito;
	
	public Cidade(String nome, String estado, Prefeito prefeito) {
		super();
		this.nome = nome;
		this.estado = estado;
		this.prefeito = prefeito;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Prefeito getPrefeito() {
		return prefeito;
	}

	public void setPrefeito(Prefeito prefeito) {
		this.prefeito = prefeito;
	}
}
