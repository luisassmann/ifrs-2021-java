package ex2;

public class Computador {
	public String processador;
	public String armazenamento;
	public String memoria;
	
	public Computador() {
		this.processador = "intel";
		this.armazenamento = "500 GB";
		this.memoria = "4 GB";
	}
	
	public Computador(String processador, String armazenamento, String memoria) {
		this.processador = processador;
		this.armazenamento = armazenamento;
		this.memoria = memoria;
	}
}