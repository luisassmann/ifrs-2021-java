package slides;

public class Exemplo {

	public static void main(String[] args) {
		
		ContaPoupanca cp = new ContaPoupanca();
		cp.setCorrentista("Bob Esponja");
		cp.setSaldo(1000);
		cp.setTaxaJuros(5); // Taxa de juros em porcentagem (Ex: 5%)
		cp.atualizaSaldo();
		double saldo = cp.obterSaldo();
		
		System.out.printf("Saldo da conta: R$ %.2f\n", saldo);

	}

}
