package aula;

public class Carro {
	
	// Os atributos s�o acess�veis de qualquer lugar
	// dentro da classe.
	public String modelo = "Civic";
	public String marca = "Honda";
	
	public void imprimir() {
		System.out.println(modelo + " da " + marca);
	}

	public void andar() {
		// As vari�veis s�o acess�veis somente dentro do m�todo
		String ruido = "Vrummmm!";
		System.out.println(ruido);
	}
}
