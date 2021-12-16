package ex2;

public class Comprador {
	
	public void consulta(Produto p) {
		System.out.println("\n\nNome: " + p.getNome());
		System.out.printf("Valor: R$ %.2f\n", p.getValor());
	}
	
}
