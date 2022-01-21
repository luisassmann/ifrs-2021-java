package ex4;

public class Gato extends Animal {
	private String nome;
	private String raca;
	private String corPelo;
	
	public Gato(String especie, int idade, String nome, String raca, String corPelo) {
		super(especie, idade);
		this.nome = nome;
		this.raca = raca;
		this.corPelo = corPelo;
	}
	
	public void imprimir() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Raça: " + this.raca);
		System.out.println("Cor do Pelo: " + this.corPelo);
		super.imprimir();
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}
	
}
