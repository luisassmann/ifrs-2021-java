package slidesArrays;

public class Exemplo01 {

	public static void main(String[] args) {
		
		Carro[] c = new Carro[2];
		
		c[0] = new Carro("Ford", "Maverick");
		c[1] = new Carro("Chevrolet", "Opala");
		
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i].getMarca());
			System.out.println(c[i].getModelo());
			System.out.println();
		}

	}

}
