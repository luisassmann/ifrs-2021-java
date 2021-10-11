package ex3;

public class Correntista {
	private String nome;
	private double saldo;
	
	public Correntista() {
		this.nome = "Indefinido";
		this.saldo = 0;
	}
	
	public Correntista(String nome, double saldo) {
		this.nome = nome;
		this.saldo = saldo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
}
