package av;

public class Partida {
	private int[] placar;
	private Cidade cidade;
	private Equipe[] equipes;
	
	
	public Partida(int[] placar, Cidade cidade, Equipe[] equipes) {
		super();
		this.placar = placar;
		this.cidade = cidade;
		this.equipes = equipes;
	}

	public int[] getPlacar() {
		return placar;
	}
	
	public void setPlacar(int[] placar) {
		this.placar = placar;
	}
	
	public Cidade getCidade() {
		return cidade;
	}
	
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	
	public Equipe[] getEquipes() {
		return equipes;
	}
	
	public void setEquipes(Equipe[] equipes) {
		this.equipes = equipes;
	}
	
	
}
