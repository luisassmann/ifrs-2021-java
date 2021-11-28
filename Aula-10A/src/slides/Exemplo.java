package slides;

public class Exemplo {

	public static void main(String[] args) {
		
		ContaPoupanca cp = new ContaPoupanca();
		cp.setCorrentista("Bob Esponja");
		cp.setSaldo(1000);
		cp.setTaxaJuros(5);  // Taxa de juros em porcentagem (Ex: 5%)
		cp.atualizaSaldo();
		double saldo = cp.obterSaldo();
		
		System.out.printf("Saldo da conta poupanca: R$ %.2f\n", saldo);


		ContaCorrente cc = new ContaCorrente();
		cc.setCorrentista("Patrick Estrela");
		cc.setSaldo(350);
		cc.setLimite(100);
		// cc.cancelarLimite();
		double limite = cc.getLimite();
		
		Conta c = new Conta();
		c.setSaldo(300);
		c.setCorrentista("Juquinha");
		
		System.out.printf("Saldo da conta poupanca: R$ %.2f\n", limite);
		

	}

}
