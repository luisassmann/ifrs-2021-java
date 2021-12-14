package ex1;

public class Monitor extends Componente {
	
	private String resolucao;
	
	public Monitor(String fabricante, String modelo, String resolucao) {
		super(fabricante, modelo);
		this.resolucao = resolucao;
	}

	public String getResolucao() {
		return resolucao;
	}

	public void setResolucao(String resolucao) {
		this.resolucao = resolucao;
	}
	
	
}
