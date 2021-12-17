package exemplos;

public class Cachorro extends Bicho {

	private String brinquedoFavorito;
	private String raca;
	
	public void imprimir() {
		super.imprimir();
		System.out.println("Brinquedo favorito: " + this.brinquedoFavorito);
		System.out.println("Raça: " + this.raca);
	}
	
	public Cachorro(String nome, String brinquedoFavorito, String raca) {
		super(nome);
		this.brinquedoFavorito = brinquedoFavorito;
		this.raca = raca;
	}
	
	public String getBrinquedoFavorito() {
		return brinquedoFavorito;
	}

	public void setBrinquedoFavorito(String brinquedoFavorito) {
		this.brinquedoFavorito = brinquedoFavorito;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

}
