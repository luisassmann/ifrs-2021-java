package ex2;

public class Calculadora {
	public int x;
	public int y;
	
	public void soma(int x, int y) {
		int soma = x + y;
		System.out.printf("A soma � %d + %d = %d\n", x,y,soma);
	}
	
	public void subtracao(int x, int y) {
		int subtracao = x - y;
		System.out.printf("A subtra��o � %d - %d = %d\n", x,y,subtracao);
	}
	
	public void multiplicacao(int x, int y) {
		int multiplicacao = x * y;
		System.out.printf("A multiplica��o � %d x %d = %d\n", x,y,multiplicacao);
	}
	
	public void divisao(int x, int y) {
		double divisao = x / y;
		System.out.printf("A divis�o � %d � %d = %.2f\n", x,y,divisao);
	}
	
	public void media(int[] x) {
		int somaTotal = 0;
		for (int numero : x) {
			somaTotal += numero;
		}
		
		double media = somaTotal / x.length;
		
		System.out.printf("A m�dia da lista � de %.2f\n", media);
	}
}
