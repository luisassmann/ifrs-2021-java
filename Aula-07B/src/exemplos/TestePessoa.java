package exemplos;

public class TestePessoa {

	public static void main(String[] args) {
		
		// um construtor e um metodo especial usado para criar,
		// construir e inicializar um objeto.
		
		Pessoa p1 = new Pessoa("Maria", "Smith");
		
		System.out.println(p1.getNome());
		System.out.println(p1.getSobrenome());
		System.out.println(p1.getIdade());
		System.out.println(p1.getCidadeNascimento());
		System.out.println(p1.getNumeroFilhos());
		
		// p1.setNome("Maria");
		// p1.setSobrenome("Silva");
		// p1.setIdade(20);
		// p1.setCidadeNascimento("Porto Alegre");
		// p1.setNumeroFilhos(0);
		
		

	}

}
