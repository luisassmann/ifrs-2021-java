package exemplos;

public class Pessoa {
	
	// atributos
	private String nome;
	private String sobrenome;
	private int idade;
	private String cidadeNascimento;
	private int numeroFilhos;
	
	// construtores
	
	public Pessoa() {
		this.nome = "Adao";
		this.sobrenome = "Silva";
		this.idade = 0;
		this.cidadeNascimento = "Porto Alegre";
		this.numeroFilhos = 0;
	}
	
	public Pessoa(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = 0;
		this.cidadeNascimento = "New York";
		this.numeroFilhos = 0;
	}
	
	public Pessoa(String nome, String sobrenome, String cidadeNascimento) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cidadeNascimento = cidadeNascimento;
		this.idade = 1;
		this.numeroFilhos = 0;
	}
	
	public Pessoa(String nome, String sobrenome, int idade, String cidadeNascimento, int numeroFilhos) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
		this.cidadeNascimento = cidadeNascimento;
		this.numeroFilhos = numeroFilhos;
	}
	
	// metodos get/set
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
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCidadeNascimento() {
		return cidadeNascimento;
	}
	public void setCidadeNascimento(String cidadeNascimento) {
		this.cidadeNascimento = cidadeNascimento;
	}
	public int getNumeroFilhos() {
		return numeroFilhos;
	}
	public void setNumeroFilhos(int numeroFilhos) {
		this.numeroFilhos = numeroFilhos;
	}

	
}
