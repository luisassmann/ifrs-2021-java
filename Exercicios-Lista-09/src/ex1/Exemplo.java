package ex1;

public class Exemplo {

	public static void main(String[] args) {
		
		Casa c1 = new Casa();
		c1.nome = "Casa Magna";
		c1.codigo = "1030130";
		c1.valor = 1230000;
		c1.area = 230;
		c1.areaJardim = 0;
		c1.comodos = 10;
		
		c1.endereco = new Endereco();
		c1.endereco.rua = "Rua das Laranjeiras";
		c1.endereco.cidade = "POA";
		c1.endereco.estado = "RS";
		c1.endereco.pais = "Brasil";
		
		c1.imprimir();
		
		System.out.println("==========================================================================");
		
		Fazenda f1 = new Fazenda();
		f1.nome = "Fazenda Alegria";
		f1.codigo = "99221100";
		f1.valor = 4570000;
		f1.area = 2400;
		f1.areaResidencial = 900;
		f1.areaAgropecuaria = 1500;
		f1.atividade = "Criacao de gado e producao de leite";
		
		f1.endereco = new Endereco();
		f1.endereco.rua = "Rua das Laranjeiras";
		f1.endereco.cidade = "POA";
		f1.endereco.estado = "RS";
		f1.endereco.pais = "Brasil";
		
		f1.imprimir();
		
	}

}
