package ex3.pessoas;

public class Organizador {
	private String nome;
	private String sobrenome;
	private String empresa;
	
	public Organizador(String nome, String sobrenome, String empresa) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.empresa = empresa;
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

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
	
}
