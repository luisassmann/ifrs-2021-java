package ex1;

public class Endereco {
	public String rua;
	public String cidade;
	public String estado;
	public String pais;
	
	public void imprimirEndereco() {
		System.out.print("Rua: "+rua);
		System.out.print(", cidade: "+cidade);
		System.out.print(", Estado: "+estado);
		System.out.println(", pais: "+pais);
	}
}
