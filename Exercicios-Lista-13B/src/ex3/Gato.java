package ex3;

public class Gato extends Animal {
	private String nomeDomestico;
	private int idade;
	private String raca;

	public Gato(String nomeCientifico, String filo, String nomeDomestico, int idade, String raca) {
		super(nomeCientifico, filo);
		this.nomeDomestico = nomeDomestico;
		this.idade = idade;
		this.raca = raca;
	}


	public void imprimir() {
		System.out.println(this.getClass().getSimpleName() + "--------------");
		System.out.println("Nome: " + this.nomeDomestico);
		System.out.println("Idade: " + this.idade);
		System.out.println("Raça: " + this.raca);
		super.imprimir();
	}


	public String getNomeDomestico() {
		return nomeDomestico;
	}

	public void setNomeDomestico(String nomeDomestico) {
		this.nomeDomestico = nomeDomestico;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	
}
