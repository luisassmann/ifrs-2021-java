package exemplos;

public class Casa {

	public String cor;	
	public Endereco endereco;
	
	public void imprimir() {
		System.out.println("Cor: " + this.cor);
		this.endereco.imprimir();
	}
	
}
