package ex3;

public class TesteInterface {

	public static void main(String[] args) {
		
		
		Gerente g = new Gerente("Marcos Mattos", 1000, "Vendas");
		g.setPorcAumentoMes(10);
		
		g.imprimir();
		g.consultaAumento();
		g.calculaSalario();
		System.out.println();
		g.imprimir();

	}

}
