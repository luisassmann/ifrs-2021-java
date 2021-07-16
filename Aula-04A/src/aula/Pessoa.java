package aula;

public class Pessoa {
	
	// Atributos
	public String nome;
	public int idade;
	
	
	// Métodos
	
	// Método sem parâmetro. 
	// void significa que o método não retorna nada.
	public void nascer() {
		nome = "Luke Skywalker";
		idade = 20;
	}
	
	// Método com parâmetro.
	// Também não retorna nada.
	public void falar(String frase) {
		System.out.println(nome + " diz: " + frase);
	}
	
	// Método sem parâmetro.
	// Retorna o atributo idade.
	public int getIdade() {
		return idade;
		// o que vier depois nunca é executado.
	}
	
	public void setIdade(int novaIdade) {
		if (novaIdade >= 18) {
			idade = novaIdade;
		}
	}
}
