package aula;

public class Teste2 {

	public static void main(String[] args) {
		
		Prefeito p1 = new Prefeito();
		p1.nome = "João";
		p1.partido = "ABC";
		p1.idade = 55;
		
		Cidade c1 = new Cidade();
		c1.nome = "New York";
		c1.prefeito = p1;
		
		System.out.println(c1.nome + " tem como prefeito(a) " + c1.prefeito.nome);
		
	}

}
