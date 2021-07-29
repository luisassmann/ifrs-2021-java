package ex3;

public class ComparadorCelular {
	public boolean comparador(Celular c1, Celular c2) {
		boolean igual = false;
		
		if ((c1.marca == c2.marca) && (c1.modelo == c2.modelo)) {
			igual = true;
		}
		
		return igual;
	}
}
