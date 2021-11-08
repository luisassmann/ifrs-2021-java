package ex2;

public class TesteEmpregado {

	public static void main(String[] args) {
		
		Empregado e1 = new Empregado();
		
		e1.setNome("Haroldo Cunha");
		e1.setTelefone("5499998888");
		e1.setEmail("haroldo.cunha@xmail.com");
		e1.setSalarioBase(5000);
		e1.setImposto(327.22);
		e1.setCodigoSetor(80);
		
		System.out.println("Nome: " + e1.getNome());
		System.out.println("Telefone: " + e1.getTelefone());
		System.out.println("Email: " + e1.getEmail());
		System.out.println("Código do Setor: " + e1.getCodigoSetor());
		System.out.printf("\nSalário Bruto: R$ %.2f\n", e1.getSalarioBase());
		System.out.printf("Salário Líquido: R$ %.2f", e1.calcularSalario());

	}

}
