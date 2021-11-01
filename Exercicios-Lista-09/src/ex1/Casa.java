package ex1;

public class Casa extends Imovel {
	public double areaJardim;
	public int comodos;
	
	public void imprimir() {
		System.out.println("Nome: "+this.nome);
		System.out.println("Codigo: "+this.codigo);
		this.endereco.imprimirEndereco();
		System.out.println("Area: "+this.area+" m2");
		System.out.printf("Valor: R$ %.2f\n", this.valor);
		
		if (areaJardim > 0) 
			System.out.println("Area do Jardim: "+this.areaJardim+" m2");
		System.out.println("Qtde. de comodos: "+this.comodos);
		
	}
}
