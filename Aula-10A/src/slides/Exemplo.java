package slides;

public class Exemplo {

	public static void main(String[] args) {
		
		ContaPoupanca cp = new ContaPoupanca();
		cp.setCorrentista("Bob Esponja");
		cp.setSaldo(1000);
		cp.setTaxaJuros(5); // Taxa de juros em porcentagem (Ex: 5%)
		cp.atualizaSaldo();
		double saldo = cp.obterSaldo();
		
		System.out.printf("Saldo da conta poupanca: R$ %.2f\n", saldo);


		ContaCorrente cc = new ContaCorrente();
		cp.setCorrentista("Patrick Estrela");
		cp.setSaldo(350);
		cp.setLimite(100);
		cp.cancelarLimite();
		double limite = cp.getLimite();
		

	}

}
