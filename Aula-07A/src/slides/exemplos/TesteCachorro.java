package slides.exemplos;

public class TesteCachorro {

	public static void main(String[] args) {		
		// Umas das maiores vantagens de se usar construtores,
		// eh trocar esse codigo
		Cachorro c1 = new Cachorro();
		c1.nome = "Rex";
		c1.idade = 3;
		
		// por esse codigo
		Cachorro c2 = new Cachorro("Lessie", 8);
		
		
		System.out.println(c1.nome + "\n" + c2.nome);

	}

}
