package aula01;

public class Operadores2 {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		
		if (y >= x) {
			System.out.println("Y maior ou igual a X");
		} else {
			System.out.println("Y menor que X.");
		}
		
		// and => &&
		if ((x == 10) && (y == 10)) {
			System.out.println("X e Y são iguais a 10.");
		}
		
		// or => ||
		if ((x > 0) || (y < 0)) {
			System.out.println("Uma das condições é verdadeira.");
		}
		
		// negação => !
		boolean b1 = false;
		if (!b1) {
			System.out.println("Entrou no IF (boolean).");
		}
	}

}
