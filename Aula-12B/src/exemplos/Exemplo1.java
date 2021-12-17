package exemplos;

public class Exemplo1 {

	public static void main(String[] args) {
		
		Bicho[] bichos = new Bicho[2];
		
		bichos[0] = new Cachorro("Spike", "Osso", "Bulldog");
		bichos[1] = new Gato("Sadan", "Branco");
		
		for (int i = 0; i < bichos.length; i++) {
			bichos[i].imprimir();
		}

	}

}
