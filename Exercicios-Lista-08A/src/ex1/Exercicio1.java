package ex1;

public class Exercicio1 {

	public static void main(String[] args) {
		
		String s = "mostra-tecnica-ifrs-feliz";
		String[] sArray = s.split("-");
		
		for (int i = 0; i < sArray.length; i++) {
			if (i % 2 == 0) {
				System.out.println(sArray[i].toUpperCase());
			} else {
				System.out.println(sArray[i]);
			}
		}
		
	}

}
