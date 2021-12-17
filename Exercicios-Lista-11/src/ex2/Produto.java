package ex2;

public class Produto {

	private String nome;
	private double valor;
	
	public Produto(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
	}


	public void imprimir() {
		System.out.println("\nNome: "+this.nome);
		System.out.printf("Valor: R$ %.2f\n", this.valor);
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	
}
