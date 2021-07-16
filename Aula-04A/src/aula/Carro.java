package aula;

public class Carro {
	
	// Os atributos são acessíveis de qualquer lugar
	// dentro da classe.
	public String modelo = "Civic";
	public String marca = "Honda";
	
	public void imprimir() {
		System.out.println(modelo + " da " + marca);
	}

	public void andar() {
		// As variáveis são acessíveis somente dentro do método
		String ruido = "Vrummmm!";
		System.out.println(ruido);
	}
}
