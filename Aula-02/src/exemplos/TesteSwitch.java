package exemplos;

public class TesteSwitch {

	public static void main(String[] args) {
		
		char i = 'a';
		
		switch (i) {
			case 'a':
				System.out.println("Letra a!");
				break;
			case 'b':
				System.out.println("Letra b!");
				break;
			case 'c':
				System.out.println("Letra c!");
				break;
			default:
				System.out.println("Outra letra!");
		}

	}

}
