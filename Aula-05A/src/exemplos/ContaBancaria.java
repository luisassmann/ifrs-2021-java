package exemplos;

public class ContaBancaria {
	public String nomeDoCorrentista;
	public double saldo;
	public boolean especial;
	
	public void abreConta(String nome, double deposito, boolean ehespecial) {
		this.nomeDoCorrentista = nome;
		this.saldo = deposito;
		this.especial = ehespecial;
	}
	
	public void abreContaSimples(String nome) {
		this.nomeDoCorrentista = nome;
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public void retira(double valor) {
		this.saldo -= valor;
	}
	
	public void mostraDados() {
		System.out.printf("\n\nNome: %s\n", this.nomeDoCorrentista);
		System.out.printf("Saldo: R$ %.2f\n", this.saldo);
		if (this.especial) {
			System.out.println("Conta Especial: Sim.");
		} else {
			System.out.printf("Conta Especial: Não.");
		}
	}
}
