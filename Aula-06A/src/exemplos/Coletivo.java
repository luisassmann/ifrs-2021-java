package exemplos;

public class Coletivo {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		p1.setNome("Luis");
		p1.setIdade(16);
		p1.setCidadeNascimento("Bom Principio");
		
		String n = p1.getNome();
		
		System.out.println("Nome: "+p1.getNome());
		System.out.println("Idade: "+p1.getIdade());
		System.out.println("Cidade: "+p1.getCidadeNascimento());
		
		// p1.imprimirDados();

	}
}
