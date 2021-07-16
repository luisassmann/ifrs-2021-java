package aula;

public class Pessoa {
	
	// Atributos
	public String nome;
	public int idade;
	
	
	// M�todos
	
	// M�todo sem par�metro. 
	// void significa que o m�todo n�o retorna nada.
	public void nascer() {
		nome = "Luke Skywalker";
		idade = 20;
	}
	
	// M�todo com par�metro.
	// Tamb�m n�o retorna nada.
	public void falar(String frase) {
		System.out.println(nome + " diz: " + frase);
	}
	
	// M�todo sem par�metro.
	// Retorna o atributo idade.
	public int getIdade() {
		return idade;
		// o que vier depois nunca � executado.
	}
	
	public void setIdade(int novaIdade) {
		if (novaIdade >= 18) {
			idade = novaIdade;
		}
	}
}
