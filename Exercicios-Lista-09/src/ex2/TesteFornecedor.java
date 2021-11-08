package ex2;

public class TesteFornecedor {

	public static void main(String[] args) {
		
		Fornecedor f1 = new Fornecedor();
		f1.setNome("Joao");
		f1.setEmail("joao@email.com");
		f1.setTelefone("333444222");
		f1.setValorCredito(200);
		f1.setValorDivida(50);
		
		System.out.println("Fornecedor: " + f1.getNome());
		System.out.println("Telef.: " + f1.getTelefone());
		System.out.printf("\nSaldo: R$ %.2f", f1.obterSaldo());

	}

}
