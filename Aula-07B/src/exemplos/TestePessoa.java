package exemplos;

public class TestePessoa {

	public static void main(String[] args) {
		
		// um construtor e um metodo especial usado para criar,
		// construir e inicializar um objeto.
		
		Pessoa p1 = new Pessoa("Maria", "Smith", "Caxias do Sul");
		
		p1.setIdade(40);
		p1.setNumeroFilhos(2);
		
		System.out.println(p1.getNome());
		System.out.println(p1.getSobrenome());
		System.out.println(p1.getIdade());
		System.out.println(p1.getCidadeNascimento())	;
		System.out.println(p1.getNumeroFilhos());
		
		System.out.println("-------------------");
		
		Pessoa p2 = new Pessoa("José", "Silva", 20, "Alto Feliz", 0);
		
		System.out.println(p2.getNome());

	}

}
