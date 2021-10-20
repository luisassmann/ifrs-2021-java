package videoaula;

public class TestePessoa {

	public static void main(String[] args) {
		
		// Criando o array, nao as pessoas
		Pessoa[] pessoas = new Pessoa[3];
		// Agora sim, criando um objeto Pessoa dentro do array, na posicao 0
		pessoas[0] = new Pessoa("Maria", 30);
		pessoas[1] = new Pessoa("Lucas", 45);
		pessoas[2] = new Pessoa("Mario", 15);
		
		pessoas[0].setNome("Mary");
		// Percorrendo o array
		for (Pessoa p : pessoas) {
			System.out.print(p.getNome() + " ");
			System.out.println(p.getIdade());
		}
	}

}
