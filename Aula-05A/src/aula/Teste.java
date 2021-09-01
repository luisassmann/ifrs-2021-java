package aula;

public class Teste {

	public static void main(String[] args) {
		
		Cachorro c1 = new Cachorro();
		c1.nome = "Guapa";
		c1.raca = "Whippet";
		
		Dono d1 = new Dono();
		d1.nome = "Carlos";
		d1.cachorro = c1;
		
		System.out.println(d1.nome + " tem um cachorro chamado " + d1.cachorro.nome);
		System.out.println(d1.cachorro.nome + " é da raça " + d1.cachorro.raca);

	}

}
