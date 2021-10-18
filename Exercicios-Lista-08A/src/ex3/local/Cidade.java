package ex3.local;

public class Cidade {
	private String nome;
	private String estado;
	private String pais;
	
	public Cidade(String nome, String estado, String pais) {
		super();
		this.nome = nome;
		this.estado = estado;
		this.pais = pais;
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

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
	
	
}
