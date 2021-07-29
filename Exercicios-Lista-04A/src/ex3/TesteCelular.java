package ex3;

public class TesteCelular {

	public static void main(String[] args) {
		
		Celular c1 = new Celular();
		c1.marca = "Xiaomi";
		c1.modelo = "Redmi Note";
		
		Celular c2 = new Celular();
		c2.marca = "Xiaomi";
		c2.modelo = "Redmi Note";
		
		
		ComparadorCelular compa = new ComparadorCelular();
		
		if (compa.comparador(c1, c2)) {
			System.out.println("Os celulares são iguais.");
		} else {
			System.out.println("Os celulares são diferentes.");
		}
		
	}

}
