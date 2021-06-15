package exemplos;

public class TesteFor {

	public static void main(String[] args) {
		
		for(int i=0; i<10; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		for(int i=-6; i<=10; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		for(int i=-6; i<=6; i+=2) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println();
		
		for (int i=10; i>=0; i--) {
			System.out.print(i + " ");
		}
	}

}
