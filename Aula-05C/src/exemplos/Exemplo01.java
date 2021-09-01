package exemplos;

public class Exemplo01 {

	public static void main(String[] args) {
				
		Endereco end1 = new Endereco();
		
		end1.rua = "Rua ABC";
		end1.numero = "123";
		end1.cidade = "Feliz";
		end1.estado = "RS";
		end1.pais = "Brasil";
		
		Casa c1 = new Casa();
		
		c1.endereco = end1;
		c1.cor = "Branco";
		
		System.out.println("Casa 1 ¬");
		c1.imprimir();
		System.out.println();
		
		/*System.out.println(c1.cor);
		System.out.println(c1.endereco.rua);
		System.out.println(c1.endereco.numero);
		System.out.println(c1.endereco.cidade);
		System.out.println(c1.endereco.estado);
		System.out.println(c1.endereco.pais);*/
		
		
		Casa casa2 = new Casa();
		casa2.cor = "Cinza";
		
		casa2.endereco = new Endereco();
		casa2.endereco.rua = "Rua das Oliveiras";
		casa2.endereco.numero = "456";
		casa2.endereco.cidade = "Carlos Barbosa";
		casa2.endereco.estado = "RS";
		casa2.endereco.pais = "Brasil";
		
		System.out.println("Casa 2 ¬");
		casa2.imprimir();
		
		
		/*System.out.println(casa2.cor);
		System.out.println(casa2.endereco.rua);
		System.out.println(casa2.endereco.numero);
		System.out.println(casa2.endereco.cidade);
		System.out.println(casa2.endereco.estado);
		System.out.println(casa2.endereco.pais);*/
		
	}

}
