package exemplos;

public class Endereco {
	
	public String rua;
	public String numero;
	public String cidade;
	public String estado;
	public String pais;
	
	public void imprimir() {
		System.out.println("Rua: "+this.rua);
		System.out.println("Número: "+this.numero);
		System.out.println("Cidade: "+this.cidade);
		System.out.println("Estado: "+this.estado);
		System.out.println("País: "+this.pais);
	}
}
