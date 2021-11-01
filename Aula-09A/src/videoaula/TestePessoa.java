package videoaula;

public class TestePessoa {

	public static void main(String[] args) {
		Cliente c = new Cliente();
		c.nome = "Fulano";
		c.sobrenome = "Smith";
		c.cpf = "000111222-33";
		c.imprimirDadosCompletos();
	}

}
