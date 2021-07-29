package ex2;

public class Calculadora {
	public int x;
	public int y;
	
	public void soma(int x, int y) {
		int soma = x + y;
		System.out.printf("A soma é %d + %d = %d\n", x,y,soma);
	}
	
	public void subtracao(int x, int y) {
		int subtracao = x - y;
		System.out.printf("A subtração é %d - %d = %d\n", x,y,subtracao);
	}
	
	public void multiplicacao(int x, int y) {
		int multiplicacao = x * y;
		System.out.printf("A multiplicação é %d x %d = %d\n", x,y,multiplicacao);
	}
	
	public void divisao(int x, int y) {
		double divisao = x / y;
		System.out.printf("A divisão é %d ÷ %d = %.2f\n", x,y,divisao);
	}
	
	public void media(int[] x) {
		int somaTotal = 0;
		for (int numero : x) {
			somaTotal += numero;
		}
		
		double media = somaTotal / x.length;
		
		System.out.printf("A média da lista é de %.2f\n", media);
	}
}
