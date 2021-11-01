package ex1;

public class Fazenda extends Imovel {
	public double areaAgropecuaria;
	public double areaResidencial;
	public String atividade;
	
	public void imprimir() {
		System.out.println("Nome: "+this.nome);
		System.out.println("Codigo: "+this.codigo);
		this.endereco.imprimirEndereco();
		System.out.println("Area: "+this.area+" m2");
		System.out.printf("Valor: R$ %.2f\n", this.valor);
		
		if (areaResidencial > 0)
			System.out.println("Area residencial: "+this.areaResidencial+" m2");
		System.out.println("Area Agropecuaria: "+this.areaAgropecuaria+" m2");
		System.out.println("Atividade: "+this.atividade);
	}
}
