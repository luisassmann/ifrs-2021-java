package aula;

public class TesteCarro2 {

	public static void main(String[] args) {
		Carro c1 = new Carro();
		Carro c2 = new Carro();
		
		if (c1 == c2) {
			System.out.println("Iguais");
		} else {
			System.out.println("Diferentes");
		}
	}

}
