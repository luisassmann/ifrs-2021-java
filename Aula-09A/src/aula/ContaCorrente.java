
// Neste exemplo, a classe ContaCorrente herda
// da classe Conta. Ou seja, Conta é superclasse,
// enquanto ContaCorrente é subclasse.

package aula;

public class ContaCorrente extends Conta {
	
	public double limite;
	
	public void cancelarLimite() {
		limite = 0;
	}
}
