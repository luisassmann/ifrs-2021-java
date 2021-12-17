package exemplos2;

public class Exemplo2 {

	public static void main(String[] args) {
		
		/*
		 * O instanciamento abaixo retornar� um erro por conta
		 * do atributo abstract, que marca a classe como sendo
		 * abstrata, a qual � imposs�vel criar objetos.
		 * 
		 * Ela serve de molde para a cria��o de outras subclasses,
		 * tendo essa como superclasse.
		 */
		// Produto p = new Produto();
		
		Caneta pen = new Caneta(124, "Azul");
		pen.imprimir();
		
		Caderno notebook = new Caderno(458, 200, "Credeal");
		notebook.imprimir();
		
	}

}
