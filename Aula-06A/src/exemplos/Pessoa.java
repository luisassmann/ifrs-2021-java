package exemplos;

public class Pessoa {
	
	// atributos e mehtodos podem conter tipos diferentes
	// como o public e o private, um atributo public significa que
	// ele poderah ser acessado por amplamente pelo codigo.
	// Um atributo private significa que ele soh poderah ser acessado
	// dentro do objeto no qual ele esta declarado.
	// O atributo private nao poderah ser acessado por
	// nenhum outro objeto (sem visibilidade externa).
	private String nome;
	private int idade;
	private String cidadeNascimento;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setIdade(int idade) {
		if (idade < 0) {
			System.out.println("Valor Invalido.");
		} else {
			this.idade = idade;
		}
	}
	
	public void setCidadeNascimento(String cidadeNascimento) {
		this.cidadeNascimento = cidadeNascimento;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public String getCidadeNascimento() {
		return this.cidadeNascimento;
	}
	
	public void imprimirDados() {
		System.out.println(this.nome);
		System.out.println(this.idade);
		System.out.println(this.cidadeNascimento);
	}
	
	
}