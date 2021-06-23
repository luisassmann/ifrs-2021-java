package exemplos;

public class TesteConversao {

	public static void main(String[] args) {
		int i = 10;
		
		float f = i;
		double d = i;
		
		System.out.println(i);
		System.out.println(f);
		System.out.println(d);
		
		float f2 = 3.14f;
		double d2 = 6.28;
		
		int i2 = (int) f2;
		int i3 = (int) d2;
		
		System.out.println(i2);
		System.out.println(i3);
		
	}

}
