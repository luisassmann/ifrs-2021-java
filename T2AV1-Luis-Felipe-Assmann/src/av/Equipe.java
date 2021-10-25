package av;

public class Equipe {
	private String nome;
	private Cidade cidadeOrigem;
	
	private int vitorias;
	private int derrotas;
	private int empates;
	
	private int pontuacao;
	
	
	public Equipe(String nome, Cidade cidadeOrigem, int vitorias, int derrotas, int empates) {
		super();
		this.nome = nome;
		this.cidadeOrigem = cidadeOrigem;
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}
	
	public void calcPontuacao() {
		this.setPontuacao((this.vitorias * 3) + this.empates);
	}
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Cidade getCidadeOrigem() {
		return cidadeOrigem;
	}
	
	public void setCidadeOrigem(Cidade cidadeOrigem) {
		this.cidadeOrigem = cidadeOrigem;
	}
	
	public int getVitorias() {
		return vitorias;
	}
	
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	
	public int getDerrotas() {
		return derrotas;
	}
	
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	
	public int getEmpates() {
		return empates;
	}
	
	public void setEmpates(int empates) {
		this.empates = empates;
	}

	public int getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}
	
	
}
