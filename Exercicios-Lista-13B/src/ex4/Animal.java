package ex4;

public abstract class Animal {
	private String especie;
	private int idade;
	
	
	public Animal(String especie, int idade) {
		super();
		this.especie = especie;
		this.idade = idade;
	}
	
	public void imprimir() {
		System.out.println("Espécie: " + this.especie);
		System.out.println("Idade " + this.idade);
	}
	
	public String getEspecie() {
		return especie;
	}
	
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
