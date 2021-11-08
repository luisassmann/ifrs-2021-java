package ex2;

public class TesteAdministrador {

	public static void main(String[] args) {
		
		Administrador a1 = new Administrador();
		
		a1.setNome("Marco Aurelio");
		a1.setEmail("marco@xmail.com");
		a1.setTelefone("5180809090");
		
		a1.setSalarioBase(10000);
		a1.setImposto(359.98);
		a1.setCodigoSetor(10);
		
		a1.setAjudaDeCusto(1200);
		
		
		System.out.println("Nome: " + a1.getNome());
		System.out.println("Email: " + a1.getEmail());
		System.out.println("Telefone: " + a1.getTelefone());
		
		System.out.println("Código do setor: " + a1.getCodigoSetor());
		System.out.printf("\nSalário Bruto: R$ %.2f\n", a1.getSalarioBase());
		System.out.printf("Salário Líquido: R$ %.2f", a1.calcularSalario());
		
		System.out.printf("\n\nAjuda de custo: R$ %.2f", a1.getAjudaDeCusto());
	}

}
