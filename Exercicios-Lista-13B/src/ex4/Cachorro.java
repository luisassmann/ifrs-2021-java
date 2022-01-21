package ex4;

public class Cachorro extends Animal {
	private String nome;
	private String raca;
	private String brinquedoFav;
	
	public Cachorro(String especie, int idade, String nome, String raca, String brinquedoFav) {
		super(especie, idade);
		this.nome = nome;
		this.raca = raca;
		this.brinquedoFav = brinquedoFav;
	}
	
	public void imprimir() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Raça: " + this.raca);
		System.out.println("Brinquedo Favorito: " + this.brinquedoFav);
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

	public String getBrinquedoFav() {
		return brinquedoFav;
	}

	public void setBrinquedoFav(String brinquedoFav) {
		this.brinquedoFav = brinquedoFav;
	}
	
}
