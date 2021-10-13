package exemplocall;

public class Pessoa {
	
	private String nome;
	private String sobrenome;
	private int idade;
	private String dataNascimento;
	
	public Pessoa() {
		this.nome = "Jose";
		this.sobrenome = "Gomes";
		this.idade = 20;
		this.dataNascimento = "01/01/2001";
	}
	
	public Pessoa(String nome, String sobrenome, int idade) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
		this.dataNascimento = "01/01/1970";	
	}
	
	public Pessoa(String nome, int idade, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
		this.dataNascimento = "01/01/2020";	
	}
	
	public Pessoa(String nome, String sobrenome, int idade, String dataNascimento) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
		this.dataNascimento = dataNascimento;	
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
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
		
}
