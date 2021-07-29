package aula;

public class TesteCarro {

	public static void main(String[] args) {
		Carro c1 = new Carro();
		c1.andar();
		c1.imprimir();
		
		Carro c2 = new Carro();
		c2.modelo = "S10";
		c2.marca = "GM";
		c2.andar();
		c2.imprimir();
	}

}
