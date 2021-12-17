package ex1;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Circulo c = new Circulo("Circulo", 4);
		Retangulo r = new Retangulo("Retangulo", 6, 8);
		
		double areaC = c.calculaArea();
		double perC = c.calculaPerimetro();
		
		double areaR = r.calculaArea();
		double perR = r.calculaPerimetro();
		
		System.out.println(c.getNome());
		System.out.printf("Área de %s: %.1f\n", c.getNome(), areaC);
		System.out.printf("Perímetro de %s: %.1f\n", c.getNome(), perC);
		
		System.out.println();
		
		System.out.println(r.getNome());
		System.out.printf("Área de %s: %.1f\n", r.getNome(), areaR);
		System.out.printf("Perímetro de %s: %.1f\n", r.getNome(), perR);

	}

}
