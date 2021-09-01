package ex4;

public class Equipe {
	public String nome;
	public Cidade cidade;
	public int vitorias;
	public int empates;
	public int derrotas;
	
	public int calcularPontos() {
		return (this.vitorias*3 + this.empates);
	}
}